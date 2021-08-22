# Challenge Summary
<!-- Description of the challenge -->

function called repeated word that finds the first word to occur more than once in a string
Arguments: string
Return: string


## Whiteboard Process
<!-- Embedded whiteboard image -->
![](CC31.PNG)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Big O(n)

## Solution
<!-- Show how to run your code, and examples of it in action -->

```
String test ="Once upon a time, there was a brave princess who...";
        System.out.println("The Repeated Woed Is ---> "+salary.repeatedWord(test.toLowerCase()));
```

- result:
```
The Repeated Woed Is ---> a
```

## Test
```
 @Test
    public void testRepeatedWord(){

        String test ="Once upon a time, there was a brave princess who...";
        assertEquals(salary.repeatedWord(test.toLowerCase()),"a");
    }
    @Test
    public void testRepeatedWordRegardlessLowerOrUpperCase()
    {
        String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assertEquals(salary.repeatedWord(test.toLowerCase()),"it");
    }
    @Test
    public void testReapeatedWordWithSymbol(){
        String test = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn't know what I was doing in New York...";
        assertEquals(salary.repeatedWord(test.toLowerCase()),"summer");
    }
```