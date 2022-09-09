package com.service.controller;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.DoorStepService.model.Address;
import com.DoorStepService.model.Customers;
@Controller
public class customercontroller {
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginpage() 
	{
		return "login";
		
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String welcomepage(ModelMap model,@RequestParam String userid,@RequestParam String password) 
	{
		if (userid.equals("admin")&& password.equals("root"))
		{
			return "welcome";
			
		}
		model.put("errorMsg", "please provide the correct useid and password");
		
		return "login";
		
	}
	
	@RequestMapping(value="/Registration", method = RequestMethod.GET)
	
	
		public String addcustomer(HttpServletRequest request, Map model){
			 System.out.println("ENtered locadd");
		
		/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("first.xml");
			LocationManagement locmnt = (LocationManagement) ctx.getBean("LocationManagement");	
			DepartmentManagement deptm = (DepartmentManagement) ctx.getBean("DeptManagement");
			EmployeeManagement emn = (EmployeeManagement) ctx.getBean("EmpManagement");
	*/
				
			//------------Add new customer-------------------------	
			 Customers customeraddress=addressmanage.fetchaddress(request.getParameter("address_id"));         //fetching location
				
			Customers customer=new Customers();
			customer.setFirst_name(request.getParameter("firstName"));
			customer.setLast_name(request.getParameter("lastName"));
			customer.setEmailId(request.getParameter("EmailId"));
			customer.setMobile(Long.parseLong(request.getParameter("MobileNo")));
			customer.setPassword(request.getParameter("Password"));
			customer.setAddress(customeraddress);
			
			
			
		
	}
	
	
	
	

               //--------------update customer---------------------
@RequestMapping(value="/Updatecustomer", method = RequestMethod.GET)


public String Updatecustomer(HttpServletRequest request, Map model){
	 System.out.println("ENtered updatecustomer");

/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("first.xml");
	LocationManagement locmnt = (LocationManagement) ctx.getBean("LocationManagement");	
	DepartmentManagement deptm = (DepartmentManagement) ctx.getBean("DeptManagement");
	EmployeeManagement emn = (EmployeeManagement) ctx.getBean("EmpManagement");
*/
		
	//------------Add new customer-------------------------	
	 Customers customeraddress=addressmanage.fetchaddress(request.getParameter("address_id"));         //fetching location
		
	Customers customer=new Customers();
	customer.setFirst_name(request.getParameter("firstName"));
	customer.setLast_name(request.getParameter("lastName"));
	customer.setEmailId(request.getParameter("EmailId"));
	customer.setMobile(Long.parseLong(request.getParameter("MobileNo")));
	customer.setPassword(request.getParameter("Password"));
	customer.setAddress(customeraddress);
	
	
	

}






//-------------------------------delte customer----------------------------

@RequestMapping("/Deletecustomer")
 public String DeleteCustomer(HttpServletRequest request, Map <String ,Object>model){
	 System.out.println("ENtered Emp delete main class");
	 Customers customer=new Customers();
	try {
	 Customers customer1=customerManage.fetchEmployeebyID(Integer.parseInt(request.getParameter("emp_id")));         //fetching location
		
		System.out.println("Entered try block");
		customerManage.removeEmployee(customer1);
		
	}
	
		catch (Exception e) {
	System.out.println("Entered catch block");
			}
	
 
 }


}

