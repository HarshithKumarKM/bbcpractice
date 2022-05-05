Feature: Feature to verify text in search page

Scenario Outline: Check the text is same as searched page

Given click on search icon in home page
When user enters <search> search bar
And click search
Then in result page verify the text is present 
And navigate back

Examples:
| search |
| london |