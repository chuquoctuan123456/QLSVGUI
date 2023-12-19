package model;

import java.util.ArrayList;
import java.util.List;

public class QLSVModel {
    private List<ThiSinh> dsThiSinh;


    public QLSVModel(List<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    public QLSVModel() {
        this.dsThiSinh = new ArrayList<>();
    }

    public List<ThiSinh> getDsThiSinh() {
        return dsThiSinh;
    }

    public void setDsThiSinh(List<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }
    public void insert(ThiSinh thiSinh) {
        // Kiểm tra xem mã sinh viên đã tồn tại trong danh sách chưa
        if (!isMaSinhVienExist(thiSinh.getMaThiSinh())) {
            dsThiSinh.add(thiSinh);
        } else {
            System.out.println("Mã sinh viên đã tồn tại. Không thêm vào danh sách.");
        }
    }

    // Hàm kiểm tra xem mã sinh viên đã tồn tại trong danh sách chưa
    private boolean isMaSinhVienExist(int maSinhVien) {
        for (ThiSinh ts : dsThiSinh) {
            if (ts.getMaThiSinh()== maSinhVien) {
                return true; // Mã sinh viên đã tồn tại
            }
        }
        return false; // Mã sinh viên chưa tồn tại
    }

    public static void main(String[] args) {
        ThiSinh t1 = new ThiSinh(1);
        ThiSinh t2 = new ThiSinh(2);
        ThiSinh t3 = new ThiSinh(1);
        ThiSinh t4 = new ThiSinh(3);
        QLSVModel q = new QLSVModel();

        q.setDsThiSinh(new ArrayList<>());
        q.insert(t1);
        q.insert(t2);
        q.insert(t3);
        q.insert(t4);
        for (int i = 0; i < q.size(); i++) {
            System.out.println(q.dsThiSinh.get(i).getMaThiSinh());
        }
    }

    public void delete(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
    }
    public void update(ThiSinh thiSinh){
        delete(thiSinh);
        insert(thiSinh);
    }
    public int size(){
        return dsThiSinh.size();
    }


}
