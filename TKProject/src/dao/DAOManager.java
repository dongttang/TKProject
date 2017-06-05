package dao;

import java.util.ArrayList;

/**
 *
 * DAOManager
 * Class to management and control dao classes.
 * All of accesses to database MUST through this class and it's methods.
 *
 * @author NekoToken
 * @version 1.0.0
 */
public class DAOManager {

    /**
     *
     * tryLogin
     * When failed login, exception is thrown to this method from
     * UserDAO.tryLogin method. by throwing the exception again to the servlet,
     * it predicate login failed and execute next process.
     *
     * @param id : get user id from user input on web.
     * @param password : get user password from user input on web.
     * @throws Exception :
     */
    public void tryLogin (String id, String password) throws Exception {

        UserDAO userDAO = new UserDAO();

        userDAO.tryLogin(id, password);

    }

    // TODO : add comment
    public ArrayList<EmployeeBean> getAllEmployees() throws Exception {

        EmployeeDAO employeeDao = new EmployeeDAO();

        return employeeDao.getAllEmployees();

    }

    // TODO : add comment
    public ArrayList<String> getDepartmentListFromMSectionTable() throws Exception {

        EmployeeDAO employeeDAO = new EmployeeDAO();

        return employeeDAO.getDepartmentListFromMSectionTable();

    }

    // TODO : add comment
    public void addEmployees (EmployeeBean employeeBean) throws Exception {

        EmployeeDAO employeeDao = new EmployeeDAO();

        employeeDao.addEmployee(employeeBean);

    }

    // TODO : add comment
    public void deleteEmployee (String code) throws Exception {

        EmployeeDAO employeeDao = new EmployeeDAO();

        employeeDao.deleteEmployee(code);

    }


}

