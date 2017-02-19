# OptimizationGame
A power of 2 game

Currently, Monk is playing a unique kind of strategy game called optimistion game. 

In this game we are provided with an array containing integral numbers. Now all these numbers. Now all these numbers represent the count of theri respective index power of 2. 
The goal of the game is to minimize the total sum of the count of the array by converting lower powers of 2 into itheir higher powers.
i.e. (2)*2^1 = (1)*2^2

Note that we can extend the array beyoind the final index i.e. N-1 too in cas it optimizes our result. Please see the below example for more understanding. 


Let the number of elements given in the initial array be 3. Consider the array to be [1,2,0].It means that 2^0 has count = 1 2^1 has count 2 y 2^2 as count 0.
Now, we can convert (2)*2^1 into (1)*2^2 as 2^1*2 = 2^2. We get the new array as [1,0,1]. And now the total sum is 2.

Problem found in careercup.
