package com.oreilly.api.mint;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



public class Identifier implements Serializable{
	private String type;
    private String value;
    private String entity;
     
     public String getType(){
         
         return this.type;
     }
     
     @XmlElement(required = true, nillable = true) 
     public void setType(String type){
         
         this.type=type;
     }
     
     public String getValue(){
         
         return this.value;
     }
     
     @XmlElement(required = true, nillable = true) 
     public void setValue(String value){
         
         this.value=value;
     }
     
     
     public String getEntity(){
          return this.entity;
     }
     @XmlElement(required = true, nillable = true) 
     public void setEntity(String entity){
         this.entity=entity;
     }
  
     public Identifier(String type,String value,String entity){
	   this.type = type;
	   this.value= value;
	   this.entity = entity;
	   
   }
}
