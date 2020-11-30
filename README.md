# UpgradeTestChallenge
This project has two modules as describe below:
1. UpgradeAPIProj: Covers API test challenge
2. UpgradeGUIProj: Covers GUI test challenge

To run any of the project, navigate to base directory and open command prompt and run `mvn test` command.
For example to run UpgradeGUIProj:
Navigate to UpgradeGUIProj -> Open Command Prompt - > run `mvn test` command

There is no external file dependency for test data but you will need to download the driver binaries to
run the GUI test, once you download the driver binary, pass the path in TestNG xml suite file RunTest.xml for `driverPath` parameter
`<parameter name="driverPath" value=UPDATE_THE_DRIVER_PATH> /> ` test is configure to use only firefox browser.

##Test Scenarios
UpgradeGUIProj covers scenarios for given user story and field validation for Loan Requirement and Basic Information forms, there can be covered multiple scenarios but due to time limit other scenarios are not covered

UpgradeAPIProj covers login scenarios and also added few addition validation scenarios, one of the validation is failing when username and password is sent blank.
You will see more information in test result.
