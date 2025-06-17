class Student2{
	String Name;
	int id;
	double tenth;
	double inter;
	double degree;
	Student2 ob(String Name,int id,double tenth){
		this.Name=Name;
		this.id=id;
		this.tenth=tenth;
	}
	Student2 ob1(String Name,int id,double tenth,double inter){
		this.Name=Name;
		this.id=id;
		this.tenth=tenth;
		this.inter=inter;
	}
	Student2 ob2(String Name,int id,double tenth,double inter,double degree){
		this.Name=Name;
		this.id=id;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
	}
}