/*Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını 
hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.
Sınıfın Nitelikleri
name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Adı : kemal
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2300.0 */
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    
    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(salary >= 1000){
            return (int)(salary*0.03);
        }else{
            return 0;
        }
    }

    double bonus(){
        if(workHours > 40){
            return (int)(workHours - 40)*30.0;
        }else{
            return 0;
        }
    }

    double raiseSalary(){
        double workYear = (2022 - this.hireYear) + 263.0;
        return workYear;
        
    }

    public void toStringg(){
        System.out.println("Adı :" + this.name +
        "\nMaaşı :" + this.salary + 
        "\nÇalışma Saati :" + this.workHours + 
        "\nBaşlangıç Yılı :" + this.hireYear + 
        "\nVergi :" + tax() + 
        "\nBonus :" + bonus() +
        "\nMaaş Artışı :" + raiseSalary() + 
        "\nVergi ve Bonuslar ile Birlikte Maaş :" + (this.salary + raiseSalary() + bonus() + tax())+
        "\nToplam Maaş :" + (salary + raiseSalary() + bonus()) );
    }

        
}
