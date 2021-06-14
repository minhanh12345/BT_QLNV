public class NhanVienPartTime extends  NhanVien{
    private float timeWorks;
    public NhanVienPartTime(){}

    public NhanVienPartTime(int id, String name, int age, int phone, String email, float timeWorks) {
        super(id, name, age, phone, email);
        this.timeWorks = timeWorks;
    }

    public float getTimeWorks() {
        return timeWorks;
    }

    public void setTimeWorks(float timeWorks) {
        this.timeWorks = timeWorks;
    }
    public float luongThucLinh(){
        return getTimeWorks()*100000;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" +"name= " + getName() + ",id= " + getId() + ",age= " + getAge() + ",email= " + getEmail() + ",phone= " + getPhone()+
                ",timeWorks= " + timeWorks +",luong thuc linh= "+(getTimeWorks()*100000)+
                '}';
    }
}
