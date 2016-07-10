package com.ttnd.reap.dao;
/*
@Author: Deepak Kumar
Check more tutorials at http://www.roseindia.net
*/
import com.ttnd.reap.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
}