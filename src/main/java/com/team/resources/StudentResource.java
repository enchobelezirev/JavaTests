package com.team.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.team.dao.StudentDao;
import com.team.model.Student;

@Path("student")
public class StudentResource {
	private StudentDao dao = new StudentDao();
	
	
	@GET
	public Response get(@PathParam("id") int id) {
		return Response.ok(dao.get(id).toString()).build();
	}
	
	@POST
	public Response post(){
		try{
			dao.add(new Student(0, 45106, "Encho", "Belezirev"));
			return Response.ok("ss").status(Status.OK).build();
		}catch(Exception e){
			return Response.status(500).build();
		}
	}

}
