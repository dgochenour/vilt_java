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

Session #01

  - Run rtiddesgen as described at the top of this document
  - In the publisher code
    - Decrease the DataWriter wait time from 4s to 2s
    - Give the sample members some values, just so we aren't writing empty data
    - Change the Topic name to "Square"
  - In the subscriber code
    - Change the Topic name to "Square"

Session #02a

  - In USER_QOS_PROFILES.xml, note the added QoS for
    - Reliability
    - Durability
    - Deadline
    - Time-based filter
    
Session #02b

  - We added the file MY_QOS_PROFILES.xml by:
    - Copying USER_QOS_PROFILES.xml
    - Re-naming the qos_library and qos_profile to "My_*"
    - removing the inheritance and is_default_qos from the profile in both QoS files
  - Modify the publisher and subscriber to create DDS entities from a QoS profile
  - add a DataReader listener to alert us to missed deadline events

Session #03

  - In DomainParticipant QoS, modify so that only UDP is used (no SHMEM) 
    - capture discovery traffic with Wireshark and view
  -  Speed up the writer so that we are actually hitting the deadlines... 500ms
  -  Add code in publisher to wait for acknowledgements
    - discuss the delay and then fix in QoS

Session #04 

  - Modify the Subscriber-code listener ShapeTypeExtendedListener.on_data_available()
    - use shapes demo to publish a new instance (like BLUE squares)
        - the DataReader listener should report this 
    - subsequent samples from the same instance will not cause the banner to print, but new instnaces will

Session #05 

  - No changes

Session #06a

  - remove Deadline and Time Based Filter from MY_QOS_PROFILE.xml
  - implement sting-filtering and integer-filtering options of CFT in the subscriber
  - use a Shapes Demo instance to test that the filtering works

Session #06b

  - Modify the Subscriber code so imcoming data is handled with a WaitSet instead of a listener
  - use Shapes Demo to show that data is received properly (don't forget about the CFT!) 