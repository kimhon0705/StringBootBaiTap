package baitap.baitapB34.B35.controller;

import baitap.baitapB34.B35.entity.DanhMuc;
import baitap.baitapB34.B35.entity.SanPham;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sanpham")
public class SanPhamController {
    private final Map<String, List<SanPham>> danhSach = new LinkedHashMap<>();

    @PostMapping("/them")
    public ResponseEntity<?> themSanPham(@RequestBody DanhMuc danhMuc) {
        danhSach.putIfAbsent(danhMuc.getTieuDe(), new ArrayList<>());
        danhSach.get(danhMuc.getTieuDe()).addAll(danhMuc.getSanPham());

        return ResponseEntity.ok("Thêm sản phẩm thành công" + danhMuc.getTieuDe());
    }

    @GetMapping("/danhsach")
    public List<Map<String, Object>> layDanhSach() {
        List<Map<String, Object>> response = new ArrayList<>();
        for (Map.Entry<String, List<SanPham>> entry : danhSach.entrySet()) {
            Map<String, Object> danhMuc = new LinkedHashMap<>();
            danhMuc.put("tieuDe", entry.getKey());
            danhMuc.put("sanPham", entry.getValue());
            response.add(danhMuc);
        }
        return response;
    }
}
