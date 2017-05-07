#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: This feature file consists of all kind of sortings

Scenario Outline: Title of your scenario outline  #this is mainly used for Parameterisation
Given I want to write a step with <name> #things under < > will be considered as Parameterised Variables
When I check for the <value> in step
Then I verify the <status> in step

Examples:  # we have to supply the data under Examples section in the below fashion
    | name  |value | status |
    | name1 |  5   | success|
    | name2 |  7   | Fail   |
    
@tag1
Scenario: Bubble Sort
Given An array of 10 integers
When Bubble sorting is applied 
Then Array will be sorted in ascending order

@MergeSort
Scenario: Merge Sort
Given An array of 10 integers
When Merge sorting is applied 
Then Array will be sorted in ascending order

@InsertionSort
Scenario: Insertion Sort
Given An array of 10 integers
When Insertion sorting is applied 
Then Array will be sorted in ascending order

@SelectionSort
Scenario: Selection Sort
Given An array of 10 integers
When Selection sorting is applied 
Then Array will be sorted in ascending order

