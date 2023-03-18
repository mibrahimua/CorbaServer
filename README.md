# CorbaClient
Code sample for CORBA server implementation.

## Instruction
* Create an IDL file. In this project we're using Hello.idl
* Generate IDL file using command in your terminal:
### `idlj -fall Hello.idl`  
This will created generated java code in your project.
* Write the server code. In this project we're using Server.java
* Activate the ORBD process using command below in your terminal :
### `orbd -ORBInitialPort 900 -ORBInitialHost localhost`
* Run your Server.java

## Available service 
* NameService



