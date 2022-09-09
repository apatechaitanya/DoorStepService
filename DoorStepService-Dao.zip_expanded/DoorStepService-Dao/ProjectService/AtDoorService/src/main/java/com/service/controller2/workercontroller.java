package com.service.controller2;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.DoorStepService.model.Customers;
import com.DoorStepService.model.Workers;
@Controller
public class workercontroller {
	@RequestMapping(value="/login2", method = RequestMethod.GET)
	public String loginpage() 
	{
		return "login2";
		
	}
	@RequestMapping(value="/login2", method = RequestMethod.POST)
	public String welcomepage(ModelMap model,@RequestParam String userid,@RequestParam String password) 
	{
		if (userid.equals("admin2")&& password.equals("root2"))
		{
			return "welcome2";
			
		}
		model.put("errorMsg", "please provide the correct useid and password");
		
		return "login2";
		
	}
	@RequestMapping(value="/WorkerRegistration", method = RequestMethod.GET)
	
	
	public String addWorker(HttpServletRequest request, Map model){
		 System.out.println("ENtered worker ");
	
	/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("first.xml");
		LocationManagement locmnt = (LocationManagement) ctx.getBean("LocationManagement");	
		DepartmentManagement deptm = (DepartmentManagement) ctx.getBean("DeptManagement");
		EmployeeManagement emn = (EmployeeManagement) ctx.getBean("EmpManagement");
*/
			
		//------------Add new worker-------------------------	
		 Workers workeraddress=workeraddressmanage.fetchaddress(request.getParameter("address_id"));         //fetching location
			
		Workers worker=new Workers();
		worker.setFirst_name(request.getParameter("firstName"));
		worker.setLast_name(request.getParameter("lastName"));
		worker.setEmailId(request.getParameter("EmailId"));
		worker.setMobile(Long.parseLong(request.getParameter("MobileNo")));
		worker.setAddress(customeraddress);
		worker.setProfession(workerprofession);
		worker.setVerified(false);
		
		
	
}





           //--------------update worker---------------------
@RequestMapping(value="/Updateworker", method = RequestMethod.GET)


public String Updatecustomer(HttpServletRequest request, Map model){
 System.out.println(" updateworker");

/*	ApplicationContext ctx = new ClassPathXmlApplicationContext("first.xml");
LocationManagement locmnt = (LocationManagement) ctx.getBean("LocationManagement");	
DepartmentManagement deptm = (DepartmentManagement) ctx.getBean("DeptManagement");
EmployeeManagement emn = (EmployeeManagement) ctx.getBean("EmpManagement");
*/
	

Workers workeraddress=workeraddressmanage.fetchaddress(request.getParameter("address_id"));         //fetching location
	
	Workers worker=new Workers();
	worker.setFirst_name(request.getParameter("firstName"));
	worker.setLast_name(request.getParameter("lastName"));
	worker.setEmailId(request.getParameter("EmailId"));
	worker.setMobile(Long.parseLong(request.getParameter("MobileNo")));
	worker.setAddress(customeraddress);
	worker.setProfession(workerprofession);
	worker.setVerified(false);
	



}



//-------------------------------delte worker----------------------------

@RequestMapping("/Deleteworker")
public String DeleteCustomer(HttpServletRequest request, Map <String ,Object>model){
 System.out.println("ENtered Emp delete main class");
 Workers worker=new Workers();
try {
	Workers worker1=workerManage.fetchEmployeebyID(Integer.parseInt(request.getParameter("emp_id")));         //fetching location
	
	System.out.println("Entered try block");
	workerManage.removeEmployee(worker1);
	
}

	catch (Exception e) {
System.out.println("Entered catch block");
		}


}


}


	





