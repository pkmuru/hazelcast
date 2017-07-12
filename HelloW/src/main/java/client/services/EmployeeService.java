package client.services;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import shared.dao.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by muru on Jul-11-17.
 */
public class EmployeeService implements MapNames {

    private HazelcastInstance hazelcastInstance;
    private IMap<Long, Employee> employeesMap;

    public EmployeeService() {
        hazelcastInstance = HazelcastClient.newHazelcastClient();
        employeesMap = hazelcastInstance.getMap(EMPLOYEE_MAP);
    }

    public void addEmployee(Employee employee) {
        employeesMap.put(employee.getEmpId(), employee);
    }

    private void addEmployees(Collection<Employee> employees) {
        Map<Long, Employee> employeeLocalMap = new HashMap<>();

        for (Employee e : employees) {
            employeeLocalMap.put(e.getEmpId(), e);
        }
        employeeLocalMap.putAll(employeeLocalMap);
    }
}
