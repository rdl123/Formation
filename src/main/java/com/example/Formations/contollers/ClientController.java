package com.example.Formations.contollers;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Formations.Services.CategorieService;
import com.example.Formations.Services.ClientService;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RequestMapping(value = "Client")
@AllArgsConstructor
@RestController
public class ClientController {
	
	private  ClientService clientService;
	
	 @GetMapping(value = "/find/all")
	    public List<Client> findAll( ){
	        return clientService.findAll();
	    }
	 @PostMapping(value = "/add_Client")
	    public void save(@RequestBody Client client){
		 clientService.save(client);
	    }
}