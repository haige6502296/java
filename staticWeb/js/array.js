/*
Created: amau
Date: 2019-11-03
Time: 19:00
*/
/*let array=["Banana", "a", "Apple", "Mango", "Kiwi", "Papaya","bbb","ccc","ddd","xxx"];
let result=array.copyWithin(5,2,6);//start index 2th but not including index 6th element

console.log(result);*/


/*
let arr=["AngularJS","Node.js","JQuery","Bootstrap"];
// place at 0th position, the element between 1st and 2nd position.
let result=arr.copyWithin(3,0,1);
console.log(result);*/

/*let array1=["ax","b","android"];
let array2=array1.concat("mx","cc","yy");
console.log(array2);*/
var array1 = ["javascript","Core java","Advanced java"];
var iterator1 = array1.entries();
console.log(iterator1.next().value);
// expected output: Array [0, "javaTpoint"]
console.log(iterator1.next().value);
// expected output: Array [1, "Core java"]
console.log(iterator1.next().value);