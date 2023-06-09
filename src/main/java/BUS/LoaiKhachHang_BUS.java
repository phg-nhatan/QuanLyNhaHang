/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import Constraints.LoaiKhachHangConstraints;
import DAO.LoaiKhachHang_DAO;
import DTO.KhachHang.CreateLoaiKhachHang_DTO;
import DTO.KhachHang.LoaiKhachHang_DTO;
import DTO.KhachHang.UpdateLoaiKhachHang_DTO;
import java.util.ArrayList;

/**
 *
 * @author tuant
 */
public class LoaiKhachHang_BUS {
    public ArrayList<LoaiKhachHang_DTO> getAllLoaiKhachHang(){
        LoaiKhachHang_DAO loaiKhachHang_DAO = new LoaiKhachHang_DAO();
        ArrayList<LoaiKhachHang_DTO> result = loaiKhachHang_DAO.getAllLoaiKhachHang();
        
        return result;
    }
    
    public LoaiKhachHang_DTO getLoaiKhachHangById(int id){
        LoaiKhachHang_DAO loaiKhachHang_DAO = new LoaiKhachHang_DAO();
        LoaiKhachHang_DTO result = loaiKhachHang_DAO.getLoaiKhachHangById(id);
        
        return result;
    }
    
    public boolean createLoaiKhachHang(CreateLoaiKhachHang_DTO data){
        LoaiKhachHang_DAO loaiKhachHang_DAO = new LoaiKhachHang_DAO();
        
        if(loaiKhachHang_DAO.hasLoaiKHOrDiemToiThieuOrMucUuDai(data.getTen(), data.getDiemToiThieu(), data.getMucUuDai()))
            return false;
        
        boolean result = loaiKhachHang_DAO.createLoaiKhachHang(data);
        
        return result;
    }
    
    public boolean updateLoaiKhachHang(UpdateLoaiKhachHang_DTO data){
        LoaiKhachHang_DAO loaiKhachHang_DAO = new LoaiKhachHang_DAO();
        
        if(data.getId() == LoaiKhachHangConstraints.LOAI_KHACH_HANG_LOCKED && data.getDiemToiThieu() != 0)
            return false;
        if(loaiKhachHang_DAO.hasLoaiKHOrDiemToiThieuOrMucUuDai(data.getId(), data.getTen(), data.getDiemToiThieu(), data.getMucUuDai()))
            return false;
        
        boolean result = loaiKhachHang_DAO.updateLoaiKhachHang(data);
    
        return result;
    }
    
    public boolean deleteLoaiKhachHang(int idLoaiKhachHang){
        LoaiKhachHang_DAO loaiKhachHang_DAO = new LoaiKhachHang_DAO();
        KhachHang_BUS khachHang_BUS = new KhachHang_BUS();
        
        boolean result = khachHang_BUS.capNhatLoaiKhachHangSauXoa(idLoaiKhachHang);
        if(!result)
            return result;
        
        result = loaiKhachHang_DAO.deleteLoaiKhachHang(idLoaiKhachHang);
        return result;
    }
}
