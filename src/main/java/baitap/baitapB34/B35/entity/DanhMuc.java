package baitap.baitapB34.B35.entity;

import java.util.List;

public class DanhMuc {
    private String tieuDe;
    private List<SanPham> sanPham;

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public List<SanPham> getSanPham() {
        return sanPham;
    }

    public void setSanPham(List<SanPham> sanPham) {
        this.sanPham = sanPham;
    }
}
