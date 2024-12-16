import javax.swing.*;
import java.awt.*;

public class Animasi extends JPanel{
	private int panjang_baris = 0;
    private int panjang_kolom = 0;
    private static final int UKURAN_CELL = 100;
    private int currentRow = 0;
    private int currentCol = 0;

    private int[][] matrix = {
   		{10, 20, 30, 44},
        {40, 50, 60, 44},
        {70, 80, 90, 44}
    };

    Font font = null;

    public Animasi(){
    	this.font = new Font("Arial", Font.PLAIN, 40);
    }

    public static void main(String[]args){
    	JFrame frame = new JFrame("Simulai Array dengan Animasi");

    	Animasi animasi = new Animasi();

    	frame.add(animasi);
    	
    	frame.setSize(700, 700);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
		frame.setLocationRelativeTo(null);
    	
    	animasi.panjang_baris = animasi.matrix.length;
    	animasi.panjang_kolom = animasi.matrix[0].length;

    	animasi.updateKoordinatPengindeks();
    }

    @Override
    public void paint(Graphics g){
    	super.paint(g);

    	drawGrid(g);
    	drawTraversal(g);
    }

    private void drawGrid(Graphics g) {
        g.setFont(font);
        Graphics2D g2d = (Graphics2D) g;
        for (int row = 0; row < this.panjang_baris; row++) {
            for (int col = 0; col < this.panjang_kolom; col++) {
            	g.setColor(Color.GRAY);
            	g2d.setStroke(new BasicStroke(5)); // 5 pixels thick border
                g2d.drawRect(
                	col * UKURAN_CELL + 10, 
                	row * UKURAN_CELL + 10, 
                	UKURAN_CELL - 5, 
                	UKURAN_CELL - 5
                );

                g.setColor(Color.GREEN);
                
                String text = String.valueOf(this.matrix[row][col]);
                int textWidth = g.getFontMetrics().stringWidth(text);
                int textHeight = g.getFontMetrics().getAscent();
                
                g.drawString(
                    text,
                    col * UKURAN_CELL + 10 + (UKURAN_CELL - 5) / 2 - textWidth / 2,
                    row * UKURAN_CELL + 10 + (UKURAN_CELL - 5) / 2 + textHeight / 4
                );
                
            }
        }
    }

    private void drawTraversal(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(
        	currentCol * UKURAN_CELL + 10, 
        	currentRow * UKURAN_CELL + 10, 
        	UKURAN_CELL - 5, 
        	UKURAN_CELL - 5
        );
    }

    public void updateKoordinatPengindeks(){

    	new Thread(()->{
    		try{
    			
    			for (int i = 0;i < this.panjang_baris;i++){
    				for (int j = 0; j< this.panjang_kolom;j++){
    					currentRow = i;
                        currentCol = j;
                        repaint();
                        Thread.sleep(500); 
    				}
    			}
    		}

    		catch(Exception e){
    			e.printStackTrace();
    		}
    	}).start();
    }

}