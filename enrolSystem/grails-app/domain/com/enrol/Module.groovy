package com.enrol

class Module {
	String module_title
	String module_code
	int credits
	String lecturer
	String course
	String description
	

    static constraints = {
	module_title nullable:false, blank:false
	module_code nullable:false, blank:false
	credits nullable:false, blank:false, minSize:20, maxSize:120
	lecturer nullable:false, blank:false
	description nullable:false, blank:false, maxLength:5000, widget:'textarea'
	


    }
}
