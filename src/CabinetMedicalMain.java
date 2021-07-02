import Dao.MedicDao;
import Dao.PacientDao;
import Dao.UserDao;
import Model.Medic;
import Model.Pacient;
import Model.User;

import java.util.Date;
import java.util.List;

public class CabinetMedicalMain {
    public static void main(String[]args){
        System.out.println("Cautare dupa username si parola");
        UserDao userDao= new UserDao();

        User user= userDao.findByUsernameAndParola("Daniel.Muntean", "3capre2vaci");

        System.out.println(user);

        System.out.println("Cautare dupa username");

        User user2=userDao.findByUsername("medic");

        System.out.println(user2);

        System.out.println("Utilizator nou");

        User utilizator1=new User();
        utilizator1.setId(6);
       utilizator1.setUsername("Maria");
        utilizator1.setParola("123654");
        utilizator1.setTip_user("pacient");
        //userDao.save(utilizator1);

        System.out.println(utilizator1);


        System.out.println("Medic nou");

        MedicDao medicDao=new MedicDao();
        Medic medic= new Medic();
        medic.setId(2);
        medic.setNume("Ioan");
        medic.setPrenume("Dumbo");
        medic.setData_nastere(new Date(2000-12-12));
        medic.setSpecializare("Stomatologie");
        medic.setId_user(new User(7, "ioan.dumbo","parolameeea","medic"));
        //medicDao.save(medic);

        System.out.println(medic);

        System.out.println("Pacient nou");


        PacientDao pacientDao=new PacientDao();
        Pacient pacient=new Pacient();
        pacient.setId(4);
        pacient.setNume("Marius");
        pacient.setPrenume("Petrovan");
        Date date=new Date();

        pacient.setData_nastere(date);
        pacient.setId_utiliz(new User(8, "Marius.P","maramuresplaicuflori","pacient"));
        //pacientDao.save(pacient);
        System.out.println(pacient);

        System.out.println("Lista pacienti");

        PacientDao pacientDao1=new PacientDao();
        List<Pacient>pacientList=pacientDao.getall();
        System.out.println(pacientList);









    }







}
