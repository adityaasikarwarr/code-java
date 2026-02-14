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

// let numbers = [1, 2, 3, 4, 5, 6];
// numbers.forEach(function (num) {
//   console.log(num * 2);
// });

// numbers.forEach((num) => console.log(num * num));
// foreach() function do something for each element of the array

//map() function creates a new array and transform all the elements
// let numbers = [5, 6, 4, 3, 5, 3];
// let doubled = numbers.map((num) => num * 2);
// console.log(doubled);
// let failed = numbers.map(function (num) {
//   return num * num;
// });
// console.log(failed)

// let users = [
//   { name: "Aditya", age: 22 },
//   { name: "Rahul", age: 17 },
// ];
// let names = users.map(function (users) {
//   return users.name;
// });
// let namess = users.map((users) => users.name);
// console.log(namess);
// console.log(names);

// filter() function only selects the elemts with special conditions
// let users = [
//   { name: "Aditya", age: 22 },
//   { name: "Rahul", age: 17 },
//   { name: "keshar", age: 25 },
// ];
// let names = users.filter(function (users) {
//   return users.age > 20;
// });
// let namess = users.filter((users) => users.name === "Aditya");
// console.log(namess);
// console.log(names);

// find() returns only the first matching item. if nothing found i returns undefined

// const products = [
//   { name: "lenovo", price: 50000 },
//   { name: "hp", price: 10000 },
//   { name: "dell", price: 20000 },
// ];

// let find = products.map(function (products) {
//   return products.name;
// });
// const updateProducts = products.map((products) => {
//   return {
//     ...products, //keep the other elemnts same do not change anything
//     price: products.price + 10000,
//   };
// });
// console.log(updateProducts);

// const updateProductss = products.map((products) => {
//   if (products.price > 10000) {
//     return {
//       ...products,
//       name: "heheh",
//     };
//   }
// });
// console.log(updateProductss);

// let price = products.filter((products) => products.price > 20000);
// let finds = products.find((products) => products.price === 10000);
// console.log(find);
// console.log(finds);
// console.log(price);

// let users = {
//   name: "Aditya",
//   age: 21,
//   isactive: true,
//   address: {
//     city: "Dehri on sone",
//     pinCode: 821307,
//   },
// };
// users.name += " CEO";
// console.log(users.name);
// console.log(users.address.city);

// const users = [
//   { name: "Aditya", age: 22 },
//   { name: "Rahul", age: 17 },
// ];
// for (let i = 0; i < users.length; i++) {
//   console.log(users[i]);
// }
// users.forEach((users) => {
//   console.log(users);
// });
// for (let key in users) {
//   console.log(key, users[key]);
// }
// const updateUser = (users) => {
//   return {
//     ...users,
//     age: 56,
//   };
// };
// console.log(updateUser(users));

//destructuring - what it does like it look at the object and make a new variable from the object or array and assigns the value to the new variable
// const user = {
//   name: " Aditya ",
//   age: 10,
//   address: {
//     city: "Dehri on sone",
//     pinCode: 821307,
//   },
// };
// const { name, age } = user;
// console.log(name);
// console.log(age);
// const { name: userName, age: newAge } = user;
// console.log(userName);
// console.log(newAge);
//now two variables exist for the same value of the object
// const {
//   address: { city, pinCode },
// } = user;
// console.log(city, pinCode);

//array destructing
// const numbers = [1, 3, 4, 5, 6, 67];
// const [first, second] = numbers;
// console.log(first, second);
