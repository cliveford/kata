# Roman Numerals Kata  

I became so involved in solving the kata using TDD that I completely forgot to create a repo and make commits.  
I've outlined the steps and thought processes below.

1. Read the assignment brief.
2. Created Maven project in itelliJ.
3. Wrote simple failing test adhering to triple A methodology to check for 1 = I.
4. Wrote hard coded method to pass test.
5. Began to refactor method.
6. Started thinking about the overall solution.
7. Realised 4 and 9 were special cases.
8. Wrote  parameterised test to check if input number contained a 4 or 9. 
9. Test failed.
10. Wrote boolean method to check if input number contained 4 or 9.
11. Test passed. 
12. Started to refactor code.
13. Disappeared down a java rabbit hole.
14. Created lots of methods to handle: number of digits in input number, does it contain 4 or 9 etc.
15. My code was becoming convoluted.
16. Realised I was using a sledgehammer to crack a nut.  
17. Applied KISS
18. Considered how would I would solve the problem using javaScript - create key/value pair object.
19. Disappeared down a java rabbit hole again.  
20. Learnt about java hash maps.
21. Refactored code.
22. Realised I couldn't control how the hash map was sorting so started to use stream to sort.
23. Found myself back at steps 15 - 18.
24. Refactored code to use 2 arrays and wrote a simple method to solve the kata.
25. Wrote tests to test for various input numbers.
26. Tests passed.
27. Created git repo and committed.