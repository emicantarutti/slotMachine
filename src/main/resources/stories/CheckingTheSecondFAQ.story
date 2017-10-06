Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  The purpose of this test is to change the background and then to click on the spin button.

Given I open the url slotmachinescript.com/
When I click on the FAQ that says: 'Can I customize the odds of winning / the game's payout / my profit margin?'
Then I verify that the text: 'Yes, all the probabilities are 100% configurable when setting up the prizes for the game. This is explained in detail in the documentation, including examples to make it as easy as possible.' is displayed on screen
