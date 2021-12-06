# 202 Individual Project


### How to run?

 - command to run 
 ```java -jar 202IndividualProject.jar`pathToDataset.csv pathToCards.csv pathToInput.csv outputDirPath```
 
 eg:
 
   ![](202IndividualProject/src/screenshots/cli.PNG)
 
 

Note: the jar is preset in the root director of the project

### Ouput?

 - Output for Input1
   
   ![](202IndividualProject/src/screenshots/out1.PNG)
  
   ![](202IndividualProject/src/screenshots/Card1.PNG)
   
   ![](202IndividualProject/src/screenshots/out1_cli.PNG)




- Output for Input2

  ![](202IndividualProject/src/screenshots/output2.PNG)

  ![](202IndividualProject/src/screenshots/out2_cli.PNG)

- Output for Input3

  ![](202IndividualProject/src/screenshots/out3.PNG)
  
  ![](202IndividualProject/src/screenshots/out3_cli_1.PNG)
  
### Patterns

- State Pattern

  ![](202IndividualProject/src/screenshots/State.PNG)
  
  Have used the state pattern to move between various states of the order such as billing, valid and invalid order state which gives 
  flexibilty in handling functionality such as output for each state and also gives flexibilty to add more states in the future to handle 
  more functionality in the future.

- Facade Pattern

  ![](202IndividualProject/src/screenshots/Facade.PNG)
  
  Have used the facade pattern to encapulate the complexity of file reading and writing from the rest of the code. Which alloows the business logic to
  be much cleaner and gives flexibilty to modify I/O in the future. 

  
  
  
  
  
  
 
  
