import hibernate.DBInitService;
import hibernate.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        new DBInitService().initDB();
        //HibernateUtil hibernateUtil = HibernateUtil.getInstance();
    }
}
