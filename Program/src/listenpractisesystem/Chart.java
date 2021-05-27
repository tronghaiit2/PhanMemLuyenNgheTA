package listenpractisesystem;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.*;
public class Chart {
	ChartPanel chartPanel = new ChartPanel(createChart());
	JFrame f9 = new JFrame("History Chart");
	JButton b = new JButton("BACK");
	
	public Chart() throws InterruptedException {
        
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        
        b.setMnemonic(KeyEvent.VK_B);
        b.setBounds(0, 635, 70, 25);
        b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f9.dispose();
				new MainMenu();
				
			}
		});
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));

        f9.add(b);
        f9.add(chartPanel);
        f9.setSize(1000, 700);
        f9.setLocationRelativeTo(null);
        f9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f9.setResizable(true);
        f9.setVisible(true);
	}
	public static JFreeChart createChart() throws InterruptedException {
        JFreeChart barChart = ChartFactory.createBarChart(
                "PRACTISE HISTORY CHART",
                "SYSTEM TIME", "SCORE",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }
 
    private static CategoryDataset createDataset() throws InterruptedException {
    	 int[] getScore = GetScore.getScore10times();
    	 String[] getDate = GetScore.getDate();
    	final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    	for(int i = 1; i < 11; i++)
    	{
    		dataset.addValue(getScore[i],"SCORE",getDate[i]);   		
    	}
        return dataset;
    }
    public static void main(String[] args) throws InterruptedException {
    	new Chart();
    }
}

