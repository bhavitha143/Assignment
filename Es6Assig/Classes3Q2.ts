
class Bank {
    name: string;
    id:number;
    balance:number;
    constructor(name: string,id:number,balance:number) {
        this.name = name;
        this.id=id;
        this.balance=balance;
    }
     run(balance:number = 0) {
        console.log( this.balance );
    }
}
class savingAccount extends Bank {
    constructor(balance: number) {
        super(balance);
    }
    run(interest=5) {
        console.log('saving account');
        super.run(interest);
    }
}
class currentAccount extends Bank{
    constructor(balance: number) {
        super(balance);
    }
    run(debit = 1000) {
        console.log('current account')
        super.run(debit);
    }
}
let Obj1 = new savingAccount(10000);
let Obj2 = new currentAccount(20000)
Obj1.run(); 
Obj2.run(); //

