
import classes.Faculty;
import classes.Institute;
import classes.ResearchAssociate;


public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toizi = new Institute("Кафедра технологий обработки и защиты информации", "297");
        Institute is = new Institute("Кафедра информационных систем", "387");
        Institute tst = new Institute("Кафедра цифровых технологий", "311п");
        Institute itu = new Institute("Кафедра информационных технологий управления", "312п");
        Institute piit = new Institute("Кафедра программирования и информационных технологий", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Сирота Александр Анатольевич",
                "защита информации");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Борисов Дмитрий Николаевич",
                "теория информации");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Десятирикова  Елена Николаевна",
                "Теория информационных процессов и систем");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Киселев Евгений Александрович",
                "Механика и оптика");
        ResearchAssociate emp5 = new ResearchAssociate(1234, "Запрягаев  Сергей Анатольевич",
                "Электродинамика");
        toizi.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4, emp5});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] pivis_employees = toizi.getEmployees();
        System.out.println("Сотрудники кафедры " + toizi.getName() + ": \n");
        for (int i = 0; i < pivis_employees.length; i++) {
            System.out.println(pivis_employees[i].getName());
        }
        //System.out.println(Arrays.toString(fkn.getInstitutes()));
    }
}
