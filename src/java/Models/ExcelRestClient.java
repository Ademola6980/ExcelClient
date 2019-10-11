/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Femi
 */

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
public class ExcelRestClient {
    
    public String BASE_URL="http://localhost:8080/ExcelApp/webresources/com.entities.customer";
    
    public ResponseEntity<String> upload(String path)
    {
    try
    {
        MultiValueMap<String, Object> bodyMap= new LinkedMultiValueMap<String,Object>();
        bodyMap.add("file", path);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String, Object>>resquestEntity = new HttpEntity<MultiValueMap<String, Object>>(bodyMap,headers);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(BASE_URL +"upload", HttpMethod.GET, resquestEntity, String.class);
    }
    catch(Exception e)
    {
       return null; 
    }

    }
   
}
    

