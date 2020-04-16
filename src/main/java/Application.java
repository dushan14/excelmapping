import excelmapper.ExcelMapper;
import model.Employee;
import org.apache.log4j.BasicConfigurator;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        BasicConfigurator.configure();

        List<Employee> employees = Arrays.asList(
                new Employee("Sirimath Magesaki", "1989/01/12", 10000.0, 1000.0),
                new Employee("Yahapath Lamayeki", "1968/11/20", 20000.0, 2000.0),
                new Employee("Nuwanath Atteki ", "1970/10/25", 12000.0, 1020.0),
                new Employee("Vedatath Samatheki", "1975/06/24", 13000.0, 1050.0),
                new Employee("Udayama Pubudi", "1980/04/12", 15000.0, 1200.0),
                new Employee("Muhunata Diyadi", "1988/02/03", 14000.0, 1100.0),
                new Employee("Kuladevi Namadi", "1999/03/19", 9000.0, 900.0),
                new Employee("Gedora Amadi", "1991/08/14", 8500.0, 860.0)
        );

        ExcelMapper.generate("../employees_template.xlsx", "generated_file.xlsx", "employees", employees);
    }
}
