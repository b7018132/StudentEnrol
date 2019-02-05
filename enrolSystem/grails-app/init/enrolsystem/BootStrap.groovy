package com.enrol

class BootStrap {

    def init = { servletContext ->
	def computing=new Course(
	department:'Computing',
	courseTitle:'BSc Hons Computing',
	courseLeader:'Dr Michelle Murphy',
	courseCode:'CS123',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	description:'loren upseyguhigrtfh',
	numberOfStudents:55,
	tuitionFees:9000.60,
	studyMode:'Fulltime').save()

	def maths=new Course(
	department:'Mathematics',
	courseTitle:'BSc Hons Mathematics',
	courseLeader:'Dr Maths',
	courseCode:'M123',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	description:'loren upseyguhigrtfh',
	numberOfStudents:55,
	tuitionFees:9000.60,
	studyMode:'Fulltime').save()

	def Physics=new Course(
	department:'Physics',
	courseTitle:'BSc Hons Physics',
	courseLeader:'Dr Physics',
	courseCode:'P123',
	startDate:new Date('09/09/2019'),
	endDate:new Date('07/07/2023'),
	description:'loren upseyguhigrtfh',
	numberOfStudents:55,
	tuitionFees:9000.60,
	studyMode:'Fulltime').save()

	def Lynne=new Lecture(
	fullName:'Lynne Dawson',
	post:'This is the post',
	subject:'Computing',
	lecturerEmail:'lynne@email.com',
	office:'cantor 122',
	bio:'this is the bio').save()
	
	def BigMike=new Lecture(
	fullName:'Big Mike',
	post:'This is the post',
	subject:'Drinking',
	lecturerEmail:'bigMike@email.com',
	office:'cantor 132',
	bio:'this is the bio').save()
	
	def writting=new Module(
	module_title:'Bryn',
	module_code:'986',
	credits:100,
	lecturer:'ed bee',
	course:'testing',
	description:'this is the bio').save()
	
	def speaking=new Module(
	module_title:'Joe',
	module_code:'9116',
	credits:80,
	lecturer:'dawn',
	course:'testing',
	description:'this is the bio').save()

	def JoeG=new Student(
	studentName:'joey',	
	studentID:'b1010',
	dob:new Date('09/09/1999'),
	isFundingAvailable:true,
	studentEmail:'dawn@email.com',
	studentUsername:'joeeey',	
	studentPassword:'testing',
	course:'computing').save()
	
	def Bryn=new Student(
	studentName:'bryn',	
	studentID:'b1010',
	dob:new Date('09/09/1999'),
	isFundingAvailable:true,
	studentEmail:'dawn@email.com',
	studentUsername:'joeeey',	
	studentPassword:'testing',
	course:'computing').save()

	


	
    }
    def destroy = {
    }
}
