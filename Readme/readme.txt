


Session -25
---------------
Xpath axes
---------
Self 
Parent
chaild
ancestor
descendent
following
preceding
following-sibling
preceding-sibling





Session- 28

*Navigation commands * 
--------------------

Interview que 
driver.get() --> //accepts URL only in the string format 
navigation().to(url) -->// accepts URL in the string formatand URL object format 


navigation.back()
navigation.forword()
navigation.refresh()


getWindowHandle() / / returns id of current browser window

getWindowHandles() // returns id's of multiple browser window



Driver.switchTo().window(window) --->switch to window 

Assignment 
https://testautomationpractice.blogspot.com/
1) provide some string search for it
2) count number of links
3) click on each link using for loop
4) get window ID's for every browser window
5) close specific browser window



Session - 29
Handle Check boxes  
handle alert /

driver.switchTo().alert().accept();// close aler using OK button
driver.switchTo().alert().dismiss();//close alert using Cancel button 
driver.switchTo().alert().getTest();
	myalert.sendKeys("Welcome");
----------------
handle alert using ExplicitWait

Authenticated popup
http://the-internet.herokuapp.com/basic_auth

http://Username:password@the-internet.herokuapp.com/basic_auth





Session 30
-------------

frames/iframes

driver.switchTo().frame(name)
driver.switchTo().frame(id)
driver.switchTo().frame(WebElement)
driver.switchTo().frame(index)

driver.switchTo().defaultContent();

3)type of switching methods
---------- 

1)browser windows
driver.switchTo().window(windowID/Window handle)   
2) alerts
driver.switchTo().alert().accept();// close aler using OK button
driver.switchTo().alert().dismiss();//close alert using Cancel button 
driver.switchTo().alert().getTest();

3)frames 
driver.switchTo().frame(name)
driver.switchTo().frame(id)
driver.switchTo().frame(WebElement)
driver.switchTo().frame(index


Assignment
go to frame 5 and intract with input 
 click link and do operations 
 switch to inner frame 
 check logo presence in the inner frame 

 
 
 
 
 
 
 
 
 
 
 Session 31
 -------------
 Dropdown box
 --------------
 1)select dropdown 
 
 selectByVisibleText()
 selectByValue()
 selectByIndex()
 
<select id"country">
<options value="in"> India<option

getOptions() --> returns all the optinons from dropdown as a web element.
 2)Bootstrap dropdown


 3)hidden drop down
 
 
 Session 32
 ----------------
 Web Tables
 ----------------
 1) Static web table
 2)Dynamic table
 3) Pagination Table
 
 
 
 
 Passing variables in XPath
 r=3
 c=2
 	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
 
Assignment
blazedemo.com
1)chose departure city
2)select destination 
3)Find lowest price and select that destination
5) book ticket and validate succsessfull masesgae

Session 33
------------
Dynamic table with pagination
------------------------------


Session 35- 
-------------
Mouse Action 
-------------

Mouse hover---moveToElement(element)
Right click --contextClick(element)
Double click---DoubleClick(element)
Drag and drop -- dragAndDrop(Source,target)




Actions - pre defined class provided in in Selenium

build() - create an action
perform() - complete an action 

getText() vs getAttribute(attribute)
---------------------------------------
 getText() - returns the inner text  --> welcome
 getAttribute("id") -- returns the value of attribute --> xyz
 
 
 <input value ="welcome"></input>
 getAttribute("value") ---> Welcome
 
 getText() ---> returns inner text of the web element
 getAttribute(attribute)--->> returns value of attribute 
 
 
 
 Actions -- class, will be used to perform mouse actions,
 Action -- interface,will be used to store created actions 
 
 Session 36
 ------------
Slider

 dragAnd DropBy(Element, x , y)
 Keyboard Actions
 
 
 KeyDown()
 KeyUp()
 
 //Ctrl + Shift+  A
  act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").KeyUp(Kesy.SHIFT).keyUp(Keys.CONTROL).perform();	
 
 Session 37
 ------------
 
 Javascript Executor-its interface
 -------------------
 
 executeScript()-we can execute javascript statements.

why we need javascript execute 
ex.ehen we perform click button internally it uses java scrip to perform action ,ther are some elements on which that click acation is not able to do execute javascript directly ,
so click method not able to execute java script ithis cases it throw element intercepted exception

so as work arround  we will directly use javascript stement using execute scipt method 

Action methods 
click()
sendKeys()

Scrolling bar 
----------

Upload files
-----------




 Session 38
 -----------
 How to capture screen shots
 ------------
 1)Full page
 2)Specific area of the page 
 3)Web element
 
 Use of Options class
 --------------------
 ChromeOptions
 EdgeOptions
 FirefoxOptions
 etc
 
  ChromeOptions
  -----------------
  1)Headless Testing
 ChromeOptions options = new ChromeOptions();
 options.addArguments("--headless=new");
 
 Advantages
 ------------
 1)we can do multiple tasks(since execution happend backend)
 2)faster execution
 
 Disadvantage
-------------
1) user cannot see the action on the page.so he can not understand flow / functionality of the test

2)HandleSSL
-----------
ChromeOptions options = new ChromeOptions();
options.setAcceptInsecureCerts(true);


3) to remove "Chrome is being controlled by automated test software "
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

4)Run testcase in incognito mode 
--------------------------------
ChromeOptions options = new ChromeOptions();
options.addArguments("--incognito");

5)Enable extensions in browser
--------------------------------
Step1: Add CRX Extractor/Download to chrome Browser(manually)
Step2: Add Selector Hub plugin to chrome browser (manually)
Step 3: Capture crx file for selectorhub extension
Step 4: pass crx file path in automation script in chrome Options

6) Block adds in browser on the page
----

7) Open Browser with custome  size 
------------------------------------
options.addArguments("--window-size=" + "1820", "720");
