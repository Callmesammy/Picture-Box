
package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Picture_item extends javax.swing.JPanel {

 
    
    public Picture_item() {
        initComponents();
        init();
    }

    private void init(){
        setOpaque(false);
        setPreferredSize(new Dimension(350,200));
        setMinimumSize(new Dimension(350,200));
        setMaximumSize(new Dimension(350,200));
    }
    
    private Picture_Model data;
        public void setData(Picture_Model data) {
        this.data = data;
        ibiTitle.setText(data.getTitle());
        ibidescription.setText(data.getDescription());
        
        repaint();
    }

        
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibiTitle = new javax.swing.JLabel();
        ibidescription = new javax.swing.JLabel();

        ibiTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ibiTitle.setForeground(new java.awt.Color(36, 19, 40));
        ibiTitle.setText("Business Ideas");

        ibidescription.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ibidescription.setForeground(new java.awt.Color(36, 19, 40));
        ibidescription.setText("Business Ideas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ibiTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibidescription, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(ibiTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibidescription)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (data != null) {
            Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        Rectangle size = getAutoSize(data.getImage());
        g2.drawImage(toImage(data.getImage()),size.x,size.y,size.width,size.height, null); 
        }
       
        super.paintComponent(g); 
    }

    public Image toImage(Icon image){
        return ((ImageIcon)image).getImage();
    }
    
      private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibiTitle;
    private javax.swing.JLabel ibidescription;
    // End of variables declaration//GEN-END:variables
}
