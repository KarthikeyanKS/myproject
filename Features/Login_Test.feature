Feature: Random Action

  @p1 @regression
  Scenario Outline: Do some actions in multiple websites
    Given User is on Home Page "<url>"
    Then Title should match "<title>"
    
    Examples:
    |url											| title																																	|
    |https://stackoverflow.com| Stack Overflow - Where Developers Learn, Share, & Build Careers			|
    |https://leetcode.com			|	LeetCode - The World's Leading Online Programming Learning Platform	|
    
   