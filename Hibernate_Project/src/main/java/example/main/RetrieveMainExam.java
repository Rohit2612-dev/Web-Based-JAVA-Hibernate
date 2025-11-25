package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.entity.Exam;
import example.utils.HibernateUtils;

public class RetrieveMainExam {

	public static void main(String[] args) {
		
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession()
				){
			Class <Exam> examClassType = Exam.class;
			Object examCode = "E04";
			Exam foundExam = sessionObj.find(examClassType, examCode);
			if(foundExam != null)
				System.out.println(foundExam);
			else
				System.out.println("Exam with given id does not exist..");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
