 package DTO.Ban;

/**
 *
 * @author LeAnhQuan
 */
public class Ban_DTO {
    private int id;
    private String tinhTrangBan;
    private String loaiBan;

    public Ban_DTO() {
    }

    public Ban_DTO(int id, String tinhTrangBan, String loaiBan) {
        this.id = id;
        this.tinhTrangBan = tinhTrangBan;
        this.loaiBan = loaiBan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTinhTrangBan() {
        return tinhTrangBan;
    }

    public void setTinhTrangBan(String tinhTrangBan) {
        this.tinhTrangBan = tinhTrangBan;
    }

    public String getLoaiBan() {
        return loaiBan;
    }

    public void setLoaiBan(String loaiBan) {
        this.loaiBan = loaiBan;
    }
}
