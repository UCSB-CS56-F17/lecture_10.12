This is code for a follow up question.

The difference between this code and the code from
lecture is that we commented out all of the lines
that set various things to null AND this line:

// resetDogOfTheWeek();

And we want to see how the output changes.

The theory is that since all of the other references go out
of scope when main terminates, they will all be eligible for
garbage collection then.

There is one flaw however: will we see it?

That is, unless we call gc() again after main
terminates, they might become eligible for
garbage collection, but we would never know.

How can we address this?

We do it by making a second class with its own main:

```
public class TryIt {


       public static void main(String [] args) {

       	      Dog.main(args);
	      Dog.gc(0);
       
       }

}

```