package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import entitites.Comment;
import entitites.Post;

public class ProgramP {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD/mm/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome");
		Comment c3 = new Comment("laalalalalalal");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to new Zealand",
				"I'm going to visit this wonderful country! ", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		p1.addComment(c3);
		
		System.out.println(p1.toString());
		
	}

}
