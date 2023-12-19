package model;

import java.util.ArrayList;
import java.util.Objects;

public class Tinh {
    private int maTinh;
    private String tenTinh;

    public Tinh(int maTinh, String tenTinh) {
        this.maTinh = maTinh;
        this.tenTinh = tenTinh;
    }

    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    @Override
    public String toString() {
        return "Tinh{" +
                "maTinh=" + maTinh +
                ", tenTinh='" + tenTinh + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tinh tinh = (Tinh) o;
        return maTinh == tinh.maTinh && Objects.equals(tenTinh, tinh.tenTinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTinh, tenTinh);
    }
    public static ArrayList<Tinh> getDSTinh(){
        String[] tenTinh = {"Hà Giang",
                "Cao Bằng",
                "Lào Cai",
                "Sơn La",
                "Lai Châu",
                "Bắc Kạn",
                "Lạng Sơn",
                "Tuyên Quang",
                "Yên Bái",
                "Thái Nguyên",
                "Điện Biên",
                "Phú Thọ",
                "Vĩnh Phúc",
                "Bắc Giang",
                "Bắc Ninh",
                "Hà Nội",
                "Quảng Ninh",
                "Hải Dương",
                "Hải Phòng",
                "Hòa Bình",
                "Hưng Yên",
                "Hà Nam",
                "Thái Bình",
                "Nam Định",
                "Ninh Bình",
                "Thanh Hóa",
                "Nghệ An",
                "Hà Tĩnh",
                "Quảng Bình",
                "Quảng Trị",
                "Thừa Thiên Huế",
                "Đà Nẵng",
                "Quảng Nam",
                "Quảng Ngãi",
                "Kon Tum",
                "Gia Lai",
                "Bình Định",
                "Phú Yên",
                "Đắk Lắk",
                "Khánh Hòa",
                "Đắk Nông",
                "Lâm Đồng",
                "Ninh Thuận",
                "Bình Phước",
                "Tây Ninh",
                "Bình Dương",
                "Đồng Nai",
                "Bình Thuận",
                "Thành phố Hồ Chí Minh",
                "Long An",
                "Bà Rịa – Vũng Tàu",
                "Đồng Tháp",
                "An Giang",
                "Tiền Giang",
                "Vĩnh Long",
                "Bến Tre",
                "Cần Thơ",
                "Kiên Giang",
                "Trà Vinh",
                "Hậu Giang",
                "Sóc Trăng",
                "Bạc Liêu",
                "Cà Mau"
        };

        ArrayList<Tinh> result = new ArrayList<>();
        for (int i = 0; i < tenTinh.length; i++) {
            Tinh tinh = new Tinh(i , tenTinh[i]);
            result.add(tinh);
        }
        return result;
    }
    public static Tinh getTinhById(int queQuan){
        return Tinh.getDSTinh().get(queQuan);
    }
    public static Tinh getTinhByTen(String queQuan){
        for (int i = 0; i < getDSTinh().size(); i++) {
            if(queQuan.equals(getDSTinh().get(i).getTenTinh())){
                return Tinh.getDSTinh().get(i);
            }
        }
        return null;

    }

}
