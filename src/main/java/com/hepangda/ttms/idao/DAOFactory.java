package com.hepangda.ttms.idao;

import com.hepangda.ttms.dao.EmployeeDAO;
import com.hepangda.ttms.dao.MovieDAO;
//import com.hepangda.ttms.dao.ScheduleDAO.java;
import com.hepangda.ttms.dao.StudioDAO;

public class DAOFactory {
    private DAOFactory() {}

    public static IEmployeeDAO createEmployeeDAO() {
        return new EmployeeDAO();
    }

    public static IMovieDAO createMovieDAO(){
        return new MovieDAO();
    }
//    public static IScheduleDAO.java createScheduleDAO(){
//        return new ScheduleDAO.java();
//    }
   public static IStudioDAO createStudioDAO() {
    return new StudioDAO();
}

}



