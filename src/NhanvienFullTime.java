public class NhanvienFullTime extends NhanVien {
    private float tienThuong;
    private float tienPhat;
    private float luongCung;

    public NhanvienFullTime() {
    }

    public NhanvienFullTime(int id, String name, int age, int phone,
                            String email, float tienThuong, float tienPhat,
                            float luongCung) {
        super(id, name, age, phone, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public float getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(float tienThuong) {
        this.tienThuong = tienThuong;
    }

    public float getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(float tienPhat) {
        this.tienPhat = tienPhat;
    }

    public float getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(float luongCung) {
        this.luongCung = luongCung;
    }
    public float luongThucLinh(){
        return getLuongCung()+(getTienThuong()-getTienPhat());
    }

    @Override
    public String toString() {

        return "NhanvienFullTime{" + "name= " + getName() + ", id= " + getId() + ",age= " + getAge() + ",email= " + getEmail() + ",phone= " + getPhone() +
                "tienThuong=" + tienThuong +
                ", tienPhat=" + tienPhat +
                ", luongCung=" + luongCung +",luong thuc linh= "+(getTienThuong()-getTienPhat()+getLuongCung())+
                '}';
    }
}
