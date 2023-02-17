let number1 = 10
console.log(number1)

let student = {id:1,name:"ubo"}
console.log(student)

function save(student,grade = 10) 
{
    console.log(student.name + " : " + grade);
}

save(student,100)
save(student)
save(student,undefined)

let students = ["Engin Demirog","Halit Kalaycı","UBO"]

console.log(students)

let students2 = [students,{id:1,name:"Mehmet"},{city:"Istanbul"}]
console.log(students2)

//rest
//params
//varArgs

let showProducts = function(id,...products) 
{
    console.log(id)
    console.log(products)
}

showProducts(1,"apple","banana","pine")

//spread

let points = [1,21423,32,3353,2,5,235,24,532]

console.log(Math.max(...points))

//destructuring

let populations = [10000,20000,30000,[40000,100000]]
let [small,medium,high,[veryHigh,maximum]] = populations

console.log(small)
console.log(medium)
console.log(high)
console.log(veryHigh)
console.log(maximum)

let category = {id:1, name:"Drink"}
console.log(category.id)
console.log(category.name)

let {id,name} = category
console.log(id)
console.log(name)