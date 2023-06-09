
package GUI;

import BUS.ChucVu_BUS;
import DTO.NhanVien.ChucVu_DTO;
import DTO.NhanVien.CreateChucVu_DTO;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class QuanLyChucVu_GUI extends javax.swing.JFrame {
    
    private final ChucVu_BUS chucVu_BUS;
    private boolean dangThemChucVu = true;

    
    private ArrayList<ChucVu_DTO> listChucVu;

    public QuanLyChucVu_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        chucVu_BUS = new ChucVu_BUS();
        
        
        loadTableChucVu();
     
    }
    
    private void loadTableChucVu(){
        ArrayList<ChucVu_DTO> listChucVu = chucVu_BUS.getAllChucVu();
        String col[] = {"ID", "Chức vụ"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        tblDanhSachChucVu.setModel(tableModel);
        for(ChucVu_DTO row : listChucVu){
            Object[] data = {row.getId(), row.getTen()};
            tableModel.addRow(data);
        }
        
    }
    
    
    private void clearTextChucVu(){
        txtIDChucVu.setText("");
        txtChucVu.setText("");

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachChucVu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        pnlQuanLyChucVu = new javax.swing.JPanel();
        btnThemChucVu = new javax.swing.JButton();
        btnSuaChucVu = new javax.swing.JButton();
        btnXoaChucVu = new javax.swing.JButton();
        pnlThemSuaChucVu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnResetChucVu = new javax.swing.JButton();
        btnLuuChucVu = new javax.swing.JButton();
        txtIDChucVu = new javax.swing.JTextField();
        txtChucVu = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 150), new java.awt.Dimension(0, 150), new java.awt.Dimension(32767, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lý chức vụ");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách chức vụ"));

        tblDanhSachChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Chức vụ"
            }
        ));
        tblDanhSachChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachChucVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachChucVu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Quản lý chức vụ"));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        pnlQuanLyChucVu.setMinimumSize(new java.awt.Dimension(300, 40));
        pnlQuanLyChucVu.setPreferredSize(new java.awt.Dimension(300, 40));
        pnlQuanLyChucVu.setLayout(new java.awt.GridBagLayout());

        btnThemChucVu.setText("Thêm");
        btnThemChucVu.setEnabled(false);
        btnThemChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemChucVuMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlQuanLyChucVu.add(btnThemChucVu, gridBagConstraints);

        btnSuaChucVu.setText("Sửa");
        btnSuaChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaChucVuMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlQuanLyChucVu.add(btnSuaChucVu, gridBagConstraints);

        btnXoaChucVu.setText("Xoá");
        btnXoaChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaChucVuMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlQuanLyChucVu.add(btnXoaChucVu, gridBagConstraints);

        jPanel3.add(pnlQuanLyChucVu);

        pnlThemSuaChucVu.setBorder(javax.swing.BorderFactory.createTitledBorder("Thêm Chức Vụ Mới"));
        pnlThemSuaChucVu.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlThemSuaChucVu.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Chức vụ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlThemSuaChucVu.add(jLabel2, gridBagConstraints);

        btnResetChucVu.setText("Reset");
        btnResetChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetChucVuMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlThemSuaChucVu.add(btnResetChucVu, gridBagConstraints);

        btnLuuChucVu.setText("Lưu");
        btnLuuChucVu.setMaximumSize(new java.awt.Dimension(90, 23));
        btnLuuChucVu.setMinimumSize(new java.awt.Dimension(90, 23));
        btnLuuChucVu.setPreferredSize(new java.awt.Dimension(90, 23));
        btnLuuChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuChucVuMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pnlThemSuaChucVu.add(btnLuuChucVu, gridBagConstraints);

        txtIDChucVu.setEnabled(false);
        txtIDChucVu.setMinimumSize(new java.awt.Dimension(80, 22));
        txtIDChucVu.setPreferredSize(new java.awt.Dimension(80, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pnlThemSuaChucVu.add(txtIDChucVu, gridBagConstraints);
        txtIDChucVu.getAccessibleContext().setAccessibleParent(pnlQuanLyChucVu);

        txtChucVu.setMinimumSize(new java.awt.Dimension(100, 22));
        txtChucVu.setPreferredSize(new java.awt.Dimension(100, 22));
        txtChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChucVuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pnlThemSuaChucVu.add(txtChucVu, gridBagConstraints);

        jPanel3.add(pnlThemSuaChucVu);
        jPanel3.add(filler1);

        getContentPane().add(jPanel3);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhSachChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachChucVuMouseClicked
        if(dangThemChucVu)
            return;
        
        int index = tblDanhSachChucVu.getSelectedRow();
        TableModel model = tblDanhSachChucVu.getModel();
        
        int id = Integer.parseInt(model.getValueAt(index, 0).toString());
        ChucVu_DTO result = chucVu_BUS.getChucVuByID(id);
        
        if(result == null){
            JOptionPane.showMessageDialog(this, "Không tìm thấy dữ liệu","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
   
        txtIDChucVu.setText(Integer.toString(result.getId()));
        txtChucVu.setText(result.getTen());
    }//GEN-LAST:event_tblDanhSachChucVuMouseClicked

    private void btnLuuChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuChucVuMouseClicked
        // TODO add your handling code here:
        String tenChucVu = txtChucVu.getText().trim();
        if(tenChucVu.isBlank())
            JOptionPane.showMessageDialog(this, "Tên chức vụ không được để trống","Error", JOptionPane.ERROR_MESSAGE);
        
        
        if(dangThemChucVu){
            CreateChucVu_DTO data = new CreateChucVu_DTO(tenChucVu);

            boolean result = chucVu_BUS.createChucVu(data);
            if(result){
                JOptionPane.showMessageDialog(this, "Thêm chức vụ mới thành công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                clearTextChucVu();            
            }            
            else
                JOptionPane.showMessageDialog(this, "Thêm chức vụ mới thất bại","Error", JOptionPane.ERROR_MESSAGE);

        } else {
            int id = Integer.parseInt(txtIDChucVu.getText());
            
            ChucVu_DTO data = new ChucVu_DTO(id, tenChucVu);
            
            boolean result = chucVu_BUS.updateChucVu(data);
            if(result){
                JOptionPane.showMessageDialog(this, "Sửa chức vụ thành công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                clearTextChucVu();            
            }            
            else
                JOptionPane.showMessageDialog(this, "Sửa chức vụ thất bại","Error", JOptionPane.ERROR_MESSAGE);
        }
        loadTableChucVu();
    }//GEN-LAST:event_btnLuuChucVuMouseClicked

    private void btnThemChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemChucVuMouseClicked
        // TODO add your handling code here:
        btnThemChucVu.setEnabled(false);
        btnSuaChucVu.setEnabled(true);
        dangThemChucVu = true;
        pnlThemSuaChucVu.setBorder(BorderFactory.createTitledBorder("Thêm chức vụ mới"));
        pnlThemSuaChucVu.repaint();
        clearTextChucVu();
    }//GEN-LAST:event_btnThemChucVuMouseClicked

    private void btnSuaChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaChucVuMouseClicked
        // TODO add your handling code here:
        btnThemChucVu.setEnabled(true);
        btnSuaChucVu.setEnabled(false);
        dangThemChucVu = false;
        pnlThemSuaChucVu.setBorder(BorderFactory.createTitledBorder("Sửa chức vụ "));
        pnlThemSuaChucVu.repaint();
       clearTextChucVu();
    }//GEN-LAST:event_btnSuaChucVuMouseClicked

    private void txtChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChucVuActionPerformed

    private void btnResetChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetChucVuMouseClicked
        // TODO add your handling code here:
         if(dangThemChucVu)
            clearTextChucVu();
        else {
            int id = Integer.parseInt(txtIDChucVu.getText());
            ChucVu_DTO result = chucVu_BUS.getChucVuByID(id);
        
            if(result == null){
                JOptionPane.showMessageDialog(this, "Không tìm thấy dữ liệu","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            txtChucVu.setText(result.getTen());
        }        
    }//GEN-LAST:event_btnResetChucVuMouseClicked

    private void btnXoaChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaChucVuMouseClicked
        // TODO add your handling code here:
         int total = tblDanhSachChucVu.getSelectedRowCount();
        TableModel model = tblDanhSachChucVu.getModel();
        if(total < 1)
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn chức vụ muốn xóa","Error", JOptionPane.ERROR_MESSAGE);
        
        int confirm = JOptionPane.showConfirmDialog(null, 
                "Bạn có chắc chắn muốn xóa " + total + " chức vụ không ?", "Xóa dữ liệu chức vụ!", JOptionPane.OK_CANCEL_OPTION);
        
        if(confirm == JOptionPane.CANCEL_OPTION)
            return;
        
        if(total == 1){
            int index = tblDanhSachChucVu.getSelectedRow();

            int id = Integer.parseInt(model.getValueAt(index, 0).toString());

            boolean result = chucVu_BUS.deleteChucVuById(id);
            if(result){
                JOptionPane.showMessageDialog(this, "Xóa 1 chức vụ thành công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }            
            else
                JOptionPane.showMessageDialog(this, "Xóa thất bại","Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int[] listIndex = tblDanhSachChucVu.getSelectedRows();
            ArrayList<Integer> listID = new ArrayList<>();
            
            for(int index : listIndex) {
                listID.add(Integer.valueOf(model.getValueAt(index, 0).toString()));
            }
            int result = chucVu_BUS.deletenhieuChucVu(listID);
            if(result == listID.size())
                JOptionPane.showMessageDialog(this, "Xóa " + total + " loại chức vụ thành công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
            else if(result > 0)
                JOptionPane.showMessageDialog(this, "Xóa thất bại, chỉ xóa được " + total + " chức vụ","Error", JOptionPane.ERROR_MESSAGE);
            else 
                JOptionPane.showMessageDialog(this, "Xóa thất bại, không chức vụ nào được xóa","Error", JOptionPane.ERROR_MESSAGE);  
                     
                
        }
        clearTextChucVu();  
        loadTableChucVu();
    }//GEN-LAST:event_btnXoaChucVuMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuanLyChucVu_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuuChucVu;
    private javax.swing.JButton btnResetChucVu;
    private javax.swing.JButton btnSuaChucVu;
    private javax.swing.JButton btnThemChucVu;
    private javax.swing.JButton btnXoaChucVu;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlQuanLyChucVu;
    private javax.swing.JPanel pnlThemSuaChucVu;
    private javax.swing.JTable tblDanhSachChucVu;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtIDChucVu;
    // End of variables declaration//GEN-END:variables
}
