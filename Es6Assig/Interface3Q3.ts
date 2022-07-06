
interface printable {
    name: string;
    display():void;
}
class Employee implements printable {
    name: string;
    constructor( name:string) {
        this.name = name;
    }
    display(): void {
        console.log("Name =  this.name  ");
    }
}
let per:printable = new Employee("Bill");
per.display(); // Name = Bill, Employee Code = 100

