>input {8,4,23,42,16,15}

when insertionSort function called on above array:

-start from second index 

-check if the current index less than the previous ,
4 <8 

- replace 4 with 8 ,{4,8,23,42,16,15}

-move to next index and check if 23 less than 8 ? no

-move to next index and check if 42 less than 23 ? no

-move to next index and check if 16 less than 42? yes

-are also less than 23 ?yes , less than 4 ? no

-will move 16 value after 4 value which less than 16

- array will be like this for now {4,8,16,23,42,15}

-now move to next index which the last one , 15

-are 15 less than 42 ?yes  , less than 23?yes  less than 16? yes , less than 4 ?no

-will move 15 value after 4 value 

-the final array will be like this:

>output {4,8,15,16,23,42}