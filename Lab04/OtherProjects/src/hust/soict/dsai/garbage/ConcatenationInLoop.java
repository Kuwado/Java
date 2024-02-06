package hust.soict.dsai.garbage;
import java.util.Random;
// Lưu Việt Hoàn - 20215054
public class ConcatenationInLoop {
    public static void main(String[] args) {
        // Tạo một đối tượng Random với seed là 123
        Random r = new Random(123);
        // Đo thời gian bắt đầu
        long start = System.currentTimeMillis();
        // Sử dụng chuỗi thông thường với toán tử += trong vòng lặp
        String s = "";
        for (int i = 0; i < 65536; i++) 
            s += r.nextInt(2);
        // In ra thời gian thực hiện và kết quả
        System.out.println("Thời gian sử dụng chuỗi: " + (System.currentTimeMillis() - start));

        // Reset lại đối tượng Random với seed là 123
        r = new Random(123);
        // Đo thời gian bắt đầu
        start = System.currentTimeMillis();
        // Sử dụng StringBuilder để tối ưu hóa trong vòng lặp
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++)
            sb.append(r.nextInt(2));
        s = sb.toString();
        // In ra thời gian thực hiện và kết quả
        System.out.println("Thời gian sử dụng StringBuilder: " + (System.currentTimeMillis() - start));
    }
}