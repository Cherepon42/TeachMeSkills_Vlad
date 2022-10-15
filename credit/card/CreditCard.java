package credit.card;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
public class CreditCard {
    int accountNumber;
    float balance;

    public CreditCard(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    void deposit(float amount) {
        balance = balance + amount;
    }

    // Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    void withdraw(float amount) {
        balance = balance - amount;
    }

    // Добавьте метод, который выводит текущую информацию о карточке.
    void printInfo() {
        System.out.println("Account number = " + accountNumber);
        System.out.println("Balance = " + balance);
    }
}