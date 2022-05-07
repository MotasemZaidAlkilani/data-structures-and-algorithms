>Input ARRAY ->[8,4,23,42,16,15]

when quicksort is called the following happen :

15 will be pivot and anything less than it will be in left split array{8,4}
otherwise in right split array{23,42,16}

for (8,4)left splited array 4 is pivot and will split and sorted to {4} {8}

for right splited array 16 is pivot and will split and sorted to {16} {23,42}

{23,42} will split to {23} and {42}(pivot) , and will stay in same order


>Output [4,8,15,16,23,42]