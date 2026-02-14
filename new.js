// let age = 19;
// if (age <= 13) {
//   console.log("child");
// } else if (age >= 18 && age <= 19) {
//   console.log("Adult");
// } else if (age >= 20) {
//   console.log("adult");
// }

// let marks = 55;
// if (marks >= 90) {
//   console.log("a");
// } else if (marks >= 70 && marks <= 89) {
//   console.log("b");
// } else if (marks >= 50 || marks <= 69) {
//   console.log("c");
// } else {
//   console.log("fail");
// }

// function great(a, b) {
//   return a + b;
// }
// console.log(great(6, 7));

// const great = (name) => {};

// function isEven(age) {
//   if (age >= 18) {
//     return true;
//   } else if (age >= 21) {
//     return "adult";
//   } else if (age >= 25) {
//     return "teen";
//   }
// }
// console.log(isEven(50));

// function add(a, b) {
//   return a + b;
// }
// let result = add(5, 10);
// console.log(add( 4 ,5));

// let numbers = [5, 6, 4, 3, 5, 3];
// console.log(numbers[0]);
// let users = [
//   { name: "aditya", age: 56 },
//   { name: "ramesh", age: 56 },
// ];
// console.log(users)
// for (let i = 0 ; i < numbers.length ; i++){
//   console.log(numbers[i])
// }

let numbers = [5, 6, 4, 3, 5, 3];
numbers.forEach(function (num) {
  console.log(num * num);
});

numbers.forEach((num) => console.log(num * num));
// for each function do something for each element of the array
