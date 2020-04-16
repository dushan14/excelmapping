package excelmapper;


import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class ExcelMapper {

    public static OutputStream generate(String template, String output, String recordName, List<?> records) {
        try (InputStream templateInputStream = ExcelMapper.class.getResourceAsStream(template)) {
            try (OutputStream outputStream = new FileOutputStream(output)) {
                Context context = new Context();
                context.putVar(recordName, records);
                JxlsHelper instance = JxlsHelper.getInstance();
                instance.processTemplate(templateInputStream, outputStream, context);
                return outputStream;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
