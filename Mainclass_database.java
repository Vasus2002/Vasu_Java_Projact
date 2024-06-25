package democonnection;

public class Mainclass_database {
		public static void main(String a[]) {
			crudoperation_database crud = new crudoperation_database();
//			crud.createtable();
			
			Empdata_database e1 = new Empdata_database(1,"vasu",21);
			Empdata_database e2 = new Empdata_database(2,"raj",21);
			
//			crud.insertdata(e1);
//			crud.insertdata(e2);
			
			crud.updatedata(1,"rohan", 21);
		}
}
