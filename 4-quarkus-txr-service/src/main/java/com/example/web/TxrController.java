package com.example.web;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.service.TxrService;

@Path("/api/txr")
public class TxrController {

	@Inject
	TxrService txrService;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response doTxr(TxrRequest request) {
		txrService.doTxr(request.getAmount(), request.getFromAccountNumber(), request.getToAccountNumber());
		TxrResponse txrResponse = new TxrResponse();
		txrResponse.setMessage("transfer successfull");
		return Response.status(200).entity(txrResponse).build();
	}
}