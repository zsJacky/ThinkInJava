package generics;

interface Payable<T> {}

class Employee implements Payable<Employee> {}
class Hourly extends Employee implements Payable<Hourly> {}

public class MultipleInterfaceVariants {

}
