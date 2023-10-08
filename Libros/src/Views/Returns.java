package Views;

import Principal.DAOBooksImpl;
import Principal.DAOLendingsImpl;
import Principal.DAOUsersImpl;
import Interfaces.DAOBooks;
import Interfaces.DAOLendings;
import Interfaces.DAOUsers;
import Utils.Utils;
import java.awt.Color;
import java.util.Date;

public class Returns extends javax.swing.JPanel {

    private final int MAX_DAYS_RETURN = 5;
    private final int COST_DAY_SANC = 10;
    
    public Returns() {
        initComponents();
        InitStyles();
    }
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        title.setForeground(Color.WHITE);
        folioLbl.putClientProperty("FlatLaf.styleClass", "large");
        folioLbl.setForeground(Color.WHITE);
        libroIdLbl.putClientProperty("FlatLaf.styleClass", "large");
        libroIdLbl.setForeground(Color.WHITE);
        folioTxt.putClientProperty("JTextField.placeholderText", "Ingrese el folio del usuario.");
        libroIdTxt.putClientProperty("JTextField.placeholderText", "Ingrese el ID del Libro a devolver.");
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        folioLbl = new javax.swing.JLabel();
        folioTxt = new javax.swing.JTextField();
        libroIdLbl = new javax.swing.JLabel();
        libroIdTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(51, 51, 51));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        title.setText("Devolución de Libro");

        folioLbl.setText("Folio Usuario");

        libroIdLbl.setText("Libro ID");

        button.setBackground(new java.awt.Color(153, 0, 255));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Devolver");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        image.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mi proyecto (3).png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(199, 199, 199))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(167, 167, 167))
                    .addComponent(folioTxt)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(libroIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(223, 223, 223))
                    .addComponent(libroIdTxt)
                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(63, 63, 63)
                                .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(folioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(libroIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(libroIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String folio = folioTxt.getText();
        String bookId = libroIdTxt.getText();

        // Validaciones para los campos
        if (folio.isEmpty() || bookId.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(folio) || !Utils.isNumeric(bookId)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        } else if (Integer.parseInt(folio) <= 0 || Integer.parseInt(bookId) <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Los campos Folio y el ID del libro deben ser mayor que 0. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            folioTxt.requestFocus();
            return;
        }

        try {
            DAOUsers daoUsers = new DAOUsersImpl();
            
            // Validamos existencia del usuario
            Models.Users currentUser = daoUsers.getUserById(Integer.parseInt(folio));
            if (currentUser == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún usuario con ese folio. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                folioTxt.requestFocus();
                return;
            }
            
            DAOBooks daoBooks = new DAOBooksImpl();
            
            // Validamos existencia del libro
            Models.Books currentBook = daoBooks.getBookById(Integer.parseInt(bookId));
            if (currentBook == null){
                javax.swing.JOptionPane.showMessageDialog(this, "No se encontró ningún libro con ese ID. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }
            
            DAOLendings daoLendings = new DAOLendingsImpl();
            
            // Validamos que el usuario tenga ese libro prestado.
            Models.Lendings currentLending = daoLendings.getLending(currentUser, currentBook);
            if (currentLending == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se ha podido encontrar el préstamo correspiendote a los datos ingresados. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                libroIdTxt.requestFocus();
                return;
            }

            // Todo OK: Devolvemos libro.
            currentLending.setDate_return(Utils.getFechaActual());
            daoLendings.modificar(currentLending);
            
            // Modificamos el libro sumandole 1 en disponibilidad.
            currentBook.setAvailable(currentBook.getAvailable() + 1);
            daoBooks.modificar(currentBook);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Libro ID: " + currentBook.getId() + " devuelto exitosamente por " + currentUser.getName() + ".\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            folioTxt.setText("");
            libroIdTxt.setText("");
            
            // Verificamos sanciones
            int days = Utils.diferenciasDeFechas(Utils.stringToDate(currentLending.getDate_out()), new Date());
            if (days > MAX_DAYS_RETURN) {
                int daysDelayed = days - MAX_DAYS_RETURN;
                int sancMoney = daysDelayed * COST_DAY_SANC;
                
                // Aumentamos sanción del usuario y en dinero.
                currentUser.setSanctions(currentUser.getSanctions() + 1);
                currentUser.setSanc_money(currentUser.getSanc_money() + sancMoney);
                daoUsers.sancionar(currentUser);
                javax.swing.JOptionPane.showMessageDialog(this, "¡USUARIO SANCIONADO POR ENTREGA A DESTIEMPO! ($" + sancMoney + ") \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al prestar el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel folioLbl;
    private javax.swing.JTextField folioTxt;
    private javax.swing.JLabel image;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel libroIdLbl;
    private javax.swing.JTextField libroIdTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
