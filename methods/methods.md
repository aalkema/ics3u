---
marp: true
theme: uncover
class:
    - invert
---

## Who is code for?

<!--
Code is for humans, computers don't need it.  Computers read machine code/binary.  Java specifically becomes JVM byte code - sometimes interpreted, sometimes compiled
-->

---

## Developers Relationship with Code

<!--
Developers spend much more time reading code than writing it.  A developers day isn't hammering away at keys - it's thinking about problems and understanding context, and a bit of typing.  You don't need to type fast to be a developer!

What are good aspects of code?
Readability, simplicity, standardized, verbosity

Comments - why not what
-->

---


> “My working habits are simple: 
long periods of thinking,
short periods of writing.”

###### Earnest Hemmingway

---
> Programming is like sex:
one mistake and you're providing support for a lifetime.

###### Michael Sinz

---

# Methods

<!--
Have you heard of them?  May have heard of subroutines or functions

A program in a program, delegation

It would get unwieldy quickly to have every piece of code in that main block

You've probably seen some code already - they don't have everything in one file in one main method.

-->

---

## `main(string[] args)`

<!--
Demo - main method, change name, mention public
-->

--- 

## Built in Methods

<!--
Can you think of some?  What makes it a method?
System.out.println(string text);
Math.Random();
compareTo()
-->

---

### Let's Try Stuff

<!--
main method, define method to print "header"
Put it below, above, don't call it
Invoke method
Use a variable, scan it in, try to use it in header()

Where to declare them - Anywhere
Calling inside another method - Can call methods inside methods
Order - Doesn't matter
Scope - Variables exist inside {} brackets they're defined in
Runs to completion then continues

Definition - The code that defines and implements the method
Invocation - Calling the method
Encapsulation - Hiding details to simplify what the process is
Single Responsiblity Principle - Methods should be responsible for one thing

Real life - this is the big jump into real programs, methods are everywhere.  Games - events reacting to buttons
-->

--- 

### Parameters

<!--
Demo - What if we want to use that name?  Pass it as a parameter

Define type, can do multiple if we want!

Makes sense - can't do much without passing the program values!

Let's try changing the parameter - does it mess it up?  No, passed a copy
-->

---

### `return`

<!--
How do we get values back from a method?  It's Java - have to say what we want!

Method can be treated as if it "is" that type.

"Practical example" - Break up Bubblesort Methods program, make a new repl, try it out.  

Reduce duplication and improve readability by hiding details
-->

---

### Putting it together

<!--
Two types of methods
Procedures/Functions
Commands/Queries

Do something vs. Get me some data
The line here is blurry, but most methods are one or the other
-->