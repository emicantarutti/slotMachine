# Slot Machine Project

# Test Suite

This tests are written in Java using 'Selenium' to automate the UI.
The selected framework was Jbehave, due to is an easy way for the tester to administrate the Test Cases, and it gives a quick feedback through the reports of the causes of the failures.
Also, The 'BDD' ('Behave Driven Development') approach, gives a cleaner and faster look to all of the stakeholders who want to understand quickly how the developed feature works.

### Jbehave Suite

The Jbehave Test Suite executes 13 (thirteen) tests to verify the behaviour of the Slot Machine Script site (http://slotmachinescript.com/).

## Test Suite

The suite has ten different test cases:

- ChangingTheBackgroundAndClickingTheSpinButton: This test enters to the main page, changes the background and hits on the spin button;
- CheckingTheBuyNowPage: This test enter to the main page, clicks on the 'Buy Now' hyperlink and verifies that the user is perfectly driven to that section;
- CheckingTheFirstFAQ: This test enter to the main page, clicks on the first question of the Frequently Asked Questions and checks that the proper response is displayed on screen;
- CheckingTheOverviewPage: This test enter to the main page, clicks on the 'Overview' hyperlink and verifies that the user is perfectly driven to that section;
- CheckingTheRighteousnessOfTheBlackJackLink: This test enter to the main page, clicks on the 'Black Jack' hyperlink and verifies that the user is perfectly driven to that site;
- CheckingTheRighteousnessOfTheScratchCardsLink: This test enter to the main page, clicks on the 'Scratch Cards' hyperlink and verifies that the user is perfectly driven to that site;
- CheckingTheRighteousnessOfTheWheelOfFortuneLink: This test enter to the main page, clicks on the 'Wheel of Fortune' hyperlink and verifies that the user is perfectly driven to that site;
- CheckingTheSecondFAQ: This test enter to the main page, clicks on the second question of the Frequently Asked Questions and checks that the proper response is displayed on screen;
- CheckingTheTestimonialsPage: This test enter to the main page, clicks on the 'Testimonials' hyperlink and verifies that the user is perfectly driven to that section;
- LoweringDownTheBetAndVerifyingTheMinimumAmount: This test enter to the main page, lowers down the bet many times and verifies that the bet cannot be less than 1 (one);
- RaisingTheBetAndSpinningTheWheel: This test enter to the main page, raises the bet twice and hits on the spin button;
- RaisingTheBetAndVerifyingTheMaxAmount: This test enter to the main page, raises the bet thirteen times and verifies that the bet has been raised actually 10 times and that the user cannot bet more than 10x;
- RaisingTheBetTenTimesAndVerifyingTheCorrectness: This test enter to the main page, raises the bet ten and verifies that the bet has been raised actually 10 times and that the first & second prizes increased their respective values as well;


### Maven Project

This is a maven project, so the test suite can be executed through command line. All you need to execute is:
```
    $mvn integration-test
```
and this will run the tests.

### Jbehave Tests

If you prefer to execute one test at a time, the command that you should execute is 
```
    $mvn test -Dtest='name of the test.
```
You can execute more than one test case separated by comma ','.

If you decide to import the whole maven project to an IDE (Eclipse, for instance), all you have to do, is to run the classes that are in the package 'mapper' as jUnit, and the test will start automatically.

### Structure
#### Story Files
All the story files are placed under 'src\main\resources\stories'.
Each story file holds a particular test case, following the structure 'Given', 'When', 'Then'.
The story files are simply plain text files that describe the actual test.
#### Steps classes
The Steps are written in Java, and this classes are located in: 'src\main\java\steps'.
Each and every method matches with the action phrases (sentences) described in the different story files.
#### Mapper files
The java classes that map the story files with the steps, are placed in: 'src\main\java\mapper'.
These classes call the '.story' file, reads it, and look for the steps in the defined steps classes.

## Preconditions

The only tools that you need to run these tests are:
- Maven 3.2;
- Java 8;
- Google Chrome.

