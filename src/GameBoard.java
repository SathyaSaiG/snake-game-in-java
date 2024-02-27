import javax.swing.JFrame;

public class GameBoard extends JFrame {
	GameBoard(){
		//GamePannel panel = new GamePannel();
		
		this.add(new GamePannel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
