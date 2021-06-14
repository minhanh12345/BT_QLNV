import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanvienFullTime[] arrNhanvienFulltime = new NhanvienFullTime[0];
        NhanVienPartTime[] arrNhanVienPartTime = new NhanVienPartTime[0];
        do {
            System.out.println("1.Them moi");
            System.out.println("2.Hien thi");
            System.out.println("3.Exit");
            System.out.println("4.Hien thi DSNV Fulltime co muc luong thap hơn trung binh");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1.NV Fulltime");
                    System.out.println("2.NV Parttime");
                    int num = scanner.nextInt();
                    if (num == 1) {
                        arrNhanvienFulltime = Manager.createFullTime(arrNhanvienFulltime);
                    } else if (num == 2) {
                        arrNhanVienPartTime = Manager.createPartTime(arrNhanVienPartTime);
                    } else {
                        System.out.println("ko hieu ");
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrNhanvienFulltime.length; i++) {
                        if (arrNhanvienFulltime[i] != null) System.out.println(arrNhanvienFulltime[i]);
                    }
                    for (int i = 0; i < arrNhanVienPartTime.length; i++) {
                        if (arrNhanVienPartTime[i] != null) System.out.println(arrNhanVienPartTime[i]);
                    }

                    break;

                case 3:
                    System.exit(0);
                case 4:
                    float TBC = Manager.SUMluongthuc / Manager.i;
                    for(int i=0;i< arrNhanvienFulltime.length;i++){
                        if(Manager.arrLuongThucFullTime[i]<TBC){
                            System.out.println(arrNhanvienFulltime[i]);
                        }
                    }
                    break;
            }

        } while (true);

    }
}