package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import example.entity.Exam;
import example.utils.HibernateUtils;

public class UpdateExamMain {

	public static void main(String[] args) {
		
		try(
				SessionFactory sf = HibernateUtils.getSessionFactory();
				Session sessionObj = sf.openSession();
				)
		{
			 Exam foundExam = sessionObj.find(Exam.class, "E02");
			// Class<Exam> examClassType = Exam.class;
			// Object examObject = "E01";
			
			Transaction ts = sessionObj.beginTransaction();
			foundExam.setName("AWS");
			foundExam.setDuration(520);
			ts.commit();
			if(foundExam != null)
			{
			System.out.println("Found Exam " + foundExam);
			System.out.println("Transaction Successfull !");
			}
			else
			{
				System.out.println("Provided ID is not present in DB");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}