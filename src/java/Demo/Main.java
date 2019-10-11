/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import Models.ExcelRestClient;
import org.springframework.http.ResponseEntity;
/**
 *
 * @author Femi
 */
public class Main {
    
    public static void main(String args[])
    {
        ExcelRestClient client = new ExcelRestClient();
       ResponseEntity<String>response =client.upload("C:\\data\\Customer.xls");
       System.out.println("Status:"+response.getStatusCode());
    }
    
}
