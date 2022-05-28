# Graphs
is non-linear data structure . contains vertics and edges . vertics are nodes
and edges connect the vertics to each others.

## Challenge
in this challenge , wha require is to make graph class , and make methods to 
add nodes , connect them to each other , return nodes or neighbors nodes.

## Approach & Efficiency
time o(n)

space o(n)
## API
add node : add new node/vertic as key in map

add edge : add  each arguments to other one value in map, so first key will 
added as value in other argument key , the same for the other.

get nodes :get all keys from the map 

get neighbors : get list of values of the specific key

size : return the size of keys inside map