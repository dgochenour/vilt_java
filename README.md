# vilt_java
Demonstration code examples - Virtual Instructor Led Training (Java)

This repo contains labs used in your VILT (Java version.) Before any given lab 
can be compiled and run, rtiddsgen should be run on the \*.idl file in each 
directory. When performing this step, be sure to set the following values in the
rtiddsgen tool:

- Generation: Example Files = "<disable>"
- Generation: Type files = "update"
- Generation: Makefiles = "create"
- Language = "Java"

Session #1

  - Run rtiddesgen as described at the top of this document
  - In the publisher code
    - Decrease the DataWriter wait time from 4s to 2s
    - Give the sample members some values, just so we aren't writing empty data
    - Change the Topic name to "Square"
  - In the subscriber code
    - Change the Topic name to "Square"

Session #2a

  - In USER_QOS_PROFILES.xml, note the added QoS for
    - Reliability
    - Durability
    - Deadline
    - Time-based filter
    
Session #2b

  - We added the file MY_QOS_PROFILES.xml by:
    - Copying USER_QOS_PROFILES.xml
    - Re-naming the qos_library and qos_profile to "My_*"
    - removing the inheritance and is_default_qos from the profile in both QoS files
  - Modify the publisher and subscriber to create DDS entities from a QoS profile