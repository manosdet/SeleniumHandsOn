Session 42
--------------
TestNG-Test New Generation
java based unit testing tool.

Advantages:
-----------
1)Test cases & testsuites
2)Grouping of test cases.
3Prioritize
4)parameterization
5)Parallel testing
6)Reports

TestNg configuration
----------------
 ways of adding TestNG in the Project(first install thru market place)
 1)by adding TestNG Libraries to build path
 2)By adding TestNG maven dependency in pom.

 
 @Test  -annotation

1)By Default TestNg execute test methods in alphabetical order
2)@Test(priority = num) controls the oder of execution.
3)once you provide priority to the test methods,then order of method is not considered.
4)priority can be random numbers(no need to have consecutive numbers) -nus to -lus
5)if you dont provide priority then default value is zero(0)
6)If the priorities are same then again execute methods in alphabetical order.
7)Negative values are supports in priority.
8)TestNg execute test methods only if they are having @Test annotation 



Execute test cases using testng xml file

text xml file
------------
1)generate automatically
2)manually

Test suite(Group of testcases) ------>test cases --->test steps
xml file -----> clasess ----->Test methods


2 things achived through xml
---------
1) executed group of testcases as a 1 suite
2) we can generate test report


Session 42
-----------
Annotations
-----------


@BeforeMethod
@AfterMethod

@BeforeClass
@AfterClass

@BeforeTest
@AfterTest


@BeforeSuite
@AfterSuite


TC1
----

1)Login --->@BeforeMethod
2)Search ---> @Test
3)Logout --->@AfterMethod
4)Login
5)Adv search --->@Test
6)Logout

TC2
----

1)Login --->@BeforeClass
2)Search ---> @Test
3)Adv search --->@Test
4)Logout--->@AfterClass



XML
------
<suite name="mysuite">
<test name="mytest1">
<classes>
<class name="session42.OrangeHRMTest"></class>
<class name="session42.FirstTestCase"></class>

</classes>
</test>
<test name="mytest2">
<classes>
<class name="session42.OrangeHRMTest"></class>
<class name="session42.FirstTestCase"></class>

</classes>
</test>

</suite



Assertion  -Validation point
-----------------------------
2 kinds of assertion
1)Hard assertions
2)Soft Assertions

Session 44
------------
Dependency method



openapp 
login
search
advsearch
logout

sysntax
@test(dependsOnMethods={"methodname"})


Grouping
---------

class1 --m1,m2,m3
class2 --m4,m5,m6
class3 --m7,m8,m8

----------
Sanity
regression
functional


loginByfacebook - sanity
loginbyemail -sanity
loginbytwitter-sanity


signupbyfacebook -regression
signupbytwitter  -regression
signupbyemail  - regression


paymentinrupees  -sanity, regression(functional)
paymentindollars -sanity,regression(functional)


1)All sanity tests
2)All regression tests
3)All sanity but not regression test
4)All regression but not sanity
5)All methods which are belongs to both sanity& regression



Session 45
------------
Parameterization
------------------

1)@DataProvider   --data driven testing

2)using xml file -- parallel testing

 Parallel testing using xml file
 -------------------------------
 1)Created test cases
 2)create xml file to run the testcase
 3)passed browser name parameter from xml file and received it in setup() method 
 4)execute test cases on chrome firefox& Edge(serial execution and parallel execution)


Session 46
----------
TestNg Listeners(Class)
--------------
1) Create test case
2)Create listener class
3)create xml file and include both cases & listener class 


2) Ways to implement listener class
--------------------------------------
Method1
-------
class myListner implements ITestListener
{
}


Method2
-------
class myListener extends TestListnerAdaptor
{ 
 
 }
 
 
 
 
 
 
 
 
 
 
 session 47
 -----------
 
 Page Object Model Pattern
 ------------------------%----
 
 Problems without POM
 1) Duplication of elements/Locators
 2) Uppdation
 
 2 approches to create page object classes
 -------------------------------------------
 1)Without using PageFactory
 2)Using Page Factory 
