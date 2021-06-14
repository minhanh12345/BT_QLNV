import java.util.Scanner;

public class Manager {
    static int i = 1;
    static float SUMluongthuc;
    static float[] arrLuongThucFullTime = new float[10];
    static int number = 0;

    public static NhanvienFullTime[] createFullTime(NhanvienFullTime[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id");
        int id = scanner.nextInt();
        System.out.println("nhap name");
        String name = scanner.next();
        System.out.println("nhap age");
        int age = scanner.nextInt();
        System.out.println("nhap phone");
        int phone = scanner.nextInt();
        System.out.println("nhap email");
        String email = scanner.next();
        System.out.println("nhap tien thuong");
        float tienThuong = scanner.nextFloat();
        System.out.println("nhap tien phat");
        float tienPhat = scanner.nextFloat();
        System.out.println("nhap luong cung");
        float luongCung = scanner.nextFloat();
        float luongThucLinh = tienThuong - tienPhat + luongCung;
        arrLuongThucFullTime[number] = luongThucLinh;
        number++;
        SUMluongthuc += luongThucLinh;
        i++;

        NhanvienFullTime nhanvienFullTime = new NhanvienFullTime(id, name, age, phone, email, tienThuong, tienPhat,
                luongCung);
        NhanvienFullTime[] arrNew = new NhanvienFullTime[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = nhanvienFullTime;
        return arrNew;
    }

    public static NhanVienPartTime[] createPartTime(NhanVienPartTime[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id");
        int id = scanner.nextInt();
        System.out.println("nhap name");
        String name = scanner.next();
        System.out.println("nhap age");
        int age = scanner.nextInt();
        System.out.println("nhap phone");
        int phone = scanner.nextInt();
        System.out.println("nhap email");
        String email = scanner.next();
        System.out.println("nhap timeWork");
        float timeWork = scanner.nextFloat();
        float luongThucLinh = timeWork * 100000;
        SUMluongthuc += luongThucLinh;
        i++;
        NhanVienPartTime nhanvienPartTime = new NhanVienPartTime(id, name,
                age, phone, email, timeWork);
        NhanVienPartTime[] arrNew = new NhanVienPartTime[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = nhanvienPartTime;
        return arrNew;
    }


}
