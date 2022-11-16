public class Employee {

    String name;
    double salary;
    double workHoursPerWeek;
    int hireYear;

    Employee(String name,double salary,double workHoursPerWeek,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHoursPerWeek=workHoursPerWeek;
        this.hireYear=hireYear;
    }

    double tax(){
        if (this.salary<1000){
            return 0;
        }else{
            return this.salary*3/100;
        }
    }

    double bonus(){
        if(this.workHoursPerWeek>40){
            return (workHoursPerWeek-40)*30;
        }else{
            return 0;
        }

    }

    double raiseSalary(){
        if((2022-hireYear)<10){
            return salary*5/100;
        }else if(((2022-hireYear)>=10)&&((2022-hireYear)<20)){
            return salary*10/100;
        }else{
            return salary*15/100;
        }
    }



        public String toString() {

        double totalSalary = salary - tax() + bonus() + raiseSalary();
        double salaryCwTaxnBonus       = salary - tax() + bonus();

        return  "Adı : " + name + '\n' +
                "Maaşı : " + salary +" TL"+ '\n' +
                "Çalışma Saati : " + workHoursPerWeek +" hours"+ '\n' +
                "Başlangıç Yılı : " + hireYear + '\n' +
                "Vergi : " + tax() +" TL"+ '\n' +
                "Bonus : " + bonus() +" TL"+ '\n' +
                "Maaş Artışı : " + raiseSalary() +" TL"+ '\n' +
                "Vergi ve Bonuslar ile Birlikte Maaş : " + salaryCwTaxnBonus +" TL"+ '\n' +
                "Toplam Maaş : " + totalSalary+" TL";
    }
}
