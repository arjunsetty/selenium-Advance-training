'''
Created on May 19, 2018

@author: Training_B7A.03.26
'''
import unittest
from selenium import webdriver


class Test(unittest.TestCase):


    def testName(self):
        driver=webdriver.Chrome("C:\\Users\\training_b7a.03.26\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe")
        driver.get("http://newtours.demoaut.com/")
        driver.maximize_window()
        driver.implicitly_wait(20)
        driver.find_element_by_name("userName").send_keys("mercury")
        driver.find_element_by_name("password").send_keys("mercury")
        driver.find_element_by_name("login").click()
        self.assertEqual(driver.title, "Find a Flight: Mercury Tours:")
        
        pass


if __name__ == "__main__":
    #import sys;sys.argv = ['', 'Test.testName']
    unittest.main()