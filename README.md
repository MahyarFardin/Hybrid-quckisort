# Report and answers to questions
I implemented quicksort and new quicksort methods as expected and every time I generated 500000 new random numbers and gave that particular set of numbers to both algorithms to evaluate them both with the same set of numbers each time (we could even generate this set previously and keep it the same for all k values to be even more accurate). Then I used two methods to find the best K value using multithreading methods:

1. I set k equal to all of the numbers between 0 and 299 two times (for more validation) and I plotted the results. As seen there is a negative correlation and as K grows the algorithm works better

    *BEST K*: 599
    *Ratio of quicksort to new algorithm*: 0.06225760359256991
    
![alt text](https://github.com/MahyarFardin/Hybrid-quckisort/blob/main/result1.png)

this means whit k of 599 new algorithm works almost ten times faster than typical quicksort

2. I set k as random values between 0 and 1000, 1500 times, and analysed the algorithm with bigger k's

    *BEST K*: 928
    *Ratio of quicksort to new algorithm*: 0.01945447252306458

![alt text](https://github.com/MahyarFardin/Hybrid-quckisort/blob/main/result2.png)

this means the algorithm worked 50 times faster when k is set to 928


**Results of both algorithms are plotted and documented in the files attached.**
