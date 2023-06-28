package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("total avg");
		System.out.printf("%3d %3.2f",exam.total(),exam.avg());
	}

}
