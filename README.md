[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=19225438&assignment_repo_type=AssignmentRepo)
# About this Template
This Repo Template is designed to make it easy for students to move back and forth between VSCode on-line and VSCode on the desktop.  It also includes "Desktop-Lite" for the on-line VSCode deployment, which allows Java GUIs (or any other GUIs) to be displayed throught the browser event when they are being launched from a cloud VM. It also includes a handful of basic Java plugins for both VSCode on-line and VSCode desktop to help keep the environments consistent. Finially, it includes some .vscode setting to help hide some of this configuration noise from the students.

TODO: This template does not yet include a good example of a testing setup.

# About this README.md
This README.md includes an outline of the first several assignments that I think match reasonably with the AP College Board and emphasize the following principles:
* Abstraction, Encapsulation, Replacement
* Real-world examples
The idea is that students will build a SPAM email generator over the course of the semester that will grow in reach and sophistication until it is able to help Nigerian Princes all over the world.

## Replacement (with TYPES)
This assignment asks you to imagine that you need to send an email to a lot of different people.
For the most part, that email is the same for all the people, excpet for their name and a few other details that are specific to each person.
* Write a fictional email that may need to be sent to more than 10 people.
* Create at least 5 varriables that would be specific to each person getting the email.
  * At least one varrialbe should be a string
  * At least one varriable should be a double
  * At least one varriable should be an int
  * At least one varriable should be a boolean
* Create static final constant varriables for each of these for some specific person you invent.
* Make sure the code compiles, runs, and shows a visually satisfying email in the command console.
* Make the email as silly as you like, but it should be recognizable as a form (AKA:SPAM) email.


## Processing  (AP Unit 1)
Using the varriables you created preform at least one of the following operations:
* Addition
* Conditional check with a boolean
* Conditional check with a string
* String concatination with a string
* String concatination with a number


## Make a TargetCustomer "classification" (AP Unit 2)
This thing that is going to get emails is actually a brand new TYPE of thing you just invented. We will call it a "TargetCustomer" and it is a CLASS of OBJECT. This is not the same as an individual TargetCustomer. That would be an INSTANCE of that TYPE. Note that the CLASSIFICATION is not the same thing as the INSTANCE. A target customer might be named "Bill", but the CLASS is named "TargetCustomer". The CLASS might dictate that all target customers have an age. Bill's age is 7 and Sally's is 42. The CLASS acts as the recipet for making these things called TargetCustomers. The command ```new TargetCustomer("Bill");``` actually makes a perticular customer based in the instructions in the CLASS.

* Add a VOID method to your TargetCustomer that prints a mini bio of the customer based on their 5 PROPERTIES you created back in the REPLACEMENT excercise

Soon you will see that these types help quite a bit keeping our code from getting tangled.

## LoopIt!
Switch back to your PROCESSING code from AP Unit 1.
* Use a FOR LOOP to quickly generate 5 identical copies of this email.
* Use another FOR LOOP to create 5 instances of the TargetCustomer, "Sue" and ask Sue to say her bio.


## Loop and Process (AP Units 3 and 4)
Use the index counter in your FOR LOOP to do additional processing:
* Exclude certain sentences from your email, depending on whether it is the 2nd, 3rd, 4th (etc) in the loop.
* Do a math operation using one of the varriable numbers and you index counter
* Use the RANDOM object (requires an IMPORT statement) to change a string varriable in randomly selected emails generated by your loop.
* (Ignore your TargetCustomer class for the time being)

# CODE CLEAN-UP: Add Helper METHODS (AP Unit 5)
* Find each unique operation in your email and describe it as a METHOD
* Use PARAMETERS and RETURN statements in STATIC METHODS to make your code easier to read
* Can you add METHODS to your TargetCustomer CLASS to accomplish the same things?
* Can you use PRINTF to make your code even cleaner?

# Loop, Process, and Customize (with ITERATION)
Let's get a little more real now.
Of course you wouldn't want to send the same person the same email, instead you would want to send different people customized emails. To do that, we will need a list to keep track of all the people who we want to send the email to:
* Make a list of at least 6 unique names
* Use those unique names to generate your emails.
* Use the unique name for each email.


## Process 2 Dimensions
Instead of using the same PROPERTIES for each email recipient, let's make new properties for each person in your list. This will require a list-of-list or a 2 diemensional array of Strings.
```
String[][] targetCustomers = new String[][]{
  { "Tim Walker", "Capricorn", "6", "2.7", "false", "dog" },
  ...
};
```

# Processing from a FILE
Rather than process your contact list from a varriable inside your code, nomrally you would process your list from an external file, like a CSV or TSV. For this assignment, use the FILE object (requires IMPORT and ERROR HANDLING) to read your contact list from an external file.

# Process 3 Dimensions
Let's get even more real-world and imagine we want to market to all the freinds of each person in our list. To do so, we will need to add a element in the array that is itself a list!
```
String[][][] targetCustomers = new String[][][]{
  {
    {"Tim Walker"},
    {
      "Sue Smith", null, "Pisces", "5", "3.9", "true", "cat"
    },
    {"Capricorn"},
    {"6"},
    ...
  },
  ...
};
```
To make things a little less tedious, you now only need 5 contacts and only 3 of them need to have friends, but at least one of those should have at least 2 friends. The friends do not need freinds.

## Submission
Once you have completed the assignment, create a pull request to submit your code. Please ensure your code is well-documented and follows the coding standards discussed in class.

## Resources
- [Java Documentation](https://docs.oracle.com/en/java/)
- [GitHub Guide: Forking Projects](https://guides.github.com/activities/forking/)
