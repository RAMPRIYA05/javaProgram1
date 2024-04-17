package com.chainsys.encapsulation;

public class Student {
    public Student() {
    	
    }
	
		public String name;
		public String id;
		
		public String address;
		public String emailId;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		
		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
	}


