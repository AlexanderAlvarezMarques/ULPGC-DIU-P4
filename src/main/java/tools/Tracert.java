package tools;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JPanel;

/**
 * @author Alexander Álvarez Marques
 * @date 2020-10-28
 * @version 0.1
 */
public class Tracert extends JPanel {

    private final Queue<Point> trace = new LinkedList<>();
    
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
    }
    
    public void paintCircle (Graphics g, Point pos, Color color, int size) {
        
        trace.offer(pos);
        
        if (trace.size() >= 6) {
            repaint();
            trace.poll();
        }
                
        g.setColor(color);
        trace.forEach((point) -> {
            g.fillOval(point.x, point.y, size, size);
        });
    }
    
    public void clearQueue() {
        trace.clear();
    }
    
}
