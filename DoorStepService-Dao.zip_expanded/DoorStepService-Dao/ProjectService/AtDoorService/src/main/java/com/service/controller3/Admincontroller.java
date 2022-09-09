package com.service.controller3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.DoorStepService.model.Admin;
import com.DoorStepService.model.Customers;

public class Admincontroller {
	@RequestMapping(value="/LoginAdmin", method = RequestMethod.GET)
	public String loginpage() 
	{
		return "LoginAdmin";
		
	}
	@RequestMapping(value="/LoginAdmin", method = RequestMethod.POST)
	public String welcomepage(ModelMap model,@RequestParam String userid,@RequestParam String password) 
	{
		if (userid.equals("admin")&& password.equals("root"))
		{
			return "welcome";
			
		}
		model.put("errorMsg", "please provide the correct useid and password");
		
		return "LoginAdmin";
		
	}
	@RequestMapping(value="/AdminRegistration", method = RequestMethod.GET)
	
	
	public String addAdmin(HttpServletRequest request, Map model){
		 System.out.println("Admin");
	
	/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("first.xml");
		LocationManagement locmnt = (LocationManagement) ctx.getBean("LocationManagement");	
		DepartmentManagement deptm = (DepartmentManagement) ctx.getBean("DeptManagement");
		EmployeeManagement emn = (EmployeeManagement) ctx.getBean("EmpManagement");
*/
			
		//------------Add new admin-------------------------	
		 Admin adminaddress=addressmanage.fetchaddress(request.getParameter("address_id"));         //fetching location
			
		Admin admin=new Admin();
	//	admin.setEmailId(request.getParameter("EmailId"));
	//	admin.setMobile(Long.parseLong(request.getParameter("MobileNo")));
		admin.setPassword(request.getParameter("Password"));
		admin.setUsername("admin");
		
		
		
	
}





           //--------------update admin---------------------
@RequestMapping(value="/Updateadmin", method = RequestMethod.GET)


public String Updatecustomer(HttpServletRequest request, Map model){
 System.out.println("ENtered updateadmin");

/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("first.xml");
LocationManagement locmnt = (LocationManagement) ctx.getBean("LocationManagement");	
DepartmentManagement deptm = (DepartmentManagement) ctx.getBean("DeptManagement");
EmployeeManagement emn = (EmployeeManagement) ctx.getBean("EmpManagement");
*/
	
//------------Add new customer-------------------------	
 Admin adminaddress=addressmanage.fetchaddress(request.getParameter("address_id"));         //fetching location
	
 Admin admin=new Admin();
 //admin.setFirst_name(request.getParameter("firstName"));
// admin.setLast_name(request.getParameter("lastName"));
 admin.setEmailId(request.getParameter("EmailId"));
 admin.setMobile(Long.parseLong(request.getParameter("MobileNo")));
 admin.setPassword(request.getParameter("Password"));
 




}






//-------------------------------delte admin----------------------------

@RequestMapping("/Deleteadmin")
public String DeleteCustomer(HttpServletRequest request, Map <String ,Object>model){
 System.out.println("ENtered Emp delete main class");
 Admin admin=new Admin();
try {
	Admin admin1=customerManage.fetchEmployeebyID(Integer.parseInt(request.getParameter("emp_id")));         //fetching location
	
	System.out.println("Entered try block");
	adminManage.removeEmployee(admin1);
	
}

	catch (Exception e) {
System.out.println("Entered catch block");
		}


}


}



