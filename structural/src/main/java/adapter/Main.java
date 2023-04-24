package adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        var businessCardDesigner = new BusinessCardDesigner();

        classAdapterTransformation(businessCardDesigner);
        objectAdapterTransformation(businessCardDesigner);
    }

    private static void classAdapterTransformation(BusinessCardDesigner businessCardDesigner) {
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        employeeClassAdapter.setFullName("John Doe");
        employeeClassAdapter.setJobTitle("Software Developer");
        employeeClassAdapter.setOfficeLocation("London, st. Avenue");

        log.info("Class adapter result: {}", businessCardDesigner.designCard(employeeClassAdapter));
    }

    private static void objectAdapterTransformation(BusinessCardDesigner businessCardDesigner) {
        Employee employee = new Employee();
        employee.setFullName("John Doe");
        employee.setJobTitle("Software Developer");
        employee.setOfficeLocation("London, st. Avenue");

        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);

        log.info("Object adapter result: {}", businessCardDesigner.designCard(employeeObjectAdapter));
     }
}
