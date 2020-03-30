import java.util.Date;
import java.util.Scanner;
import java.util.Random;


public class AI {
    public static void main(String[] args) {
        System.out.println("你好!");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str;
        while (1 > 0) {
            str = sc.next();
            if (str.indexOf("导航") != -1) {
                System.out.println("你自己不知道路吗?");
                continue;
            }
            if (str.indexOf("打开") != -1) {
                System.out.println("你自己不会打开吗?");
                continue;
            }
            if (str.indexOf("时间") != -1 || str.indexOf("几点") != -1) {
                Date date = new Date();
                String time = String.format("%tc", new Date());
                System.out.println("现在是" + time);
                continue;
            }
            if (str.indexOf("今日人品") != -1) {
                int luck = (int) (Math.random() * 100);
                System.out.println(luck);
                continue;
            }
/*			if(str.indexOf("")!=-1) {
				System.out.println();
				continue;
			}
			if(str.indexOf("")!=-1) {
				System.out.println();
				continue;
			}
			if(str.indexOf("")!=-1) {
				System.out.println();
				continue;
			}
			if(str.indexOf("")!=-1) {
				System.out.println();
				continue;
			}
			if(str.indexOf("")!=-1) {
				System.out.println();
				continue;
			}
			if(str.indexOf("")!=-1) {
				System.out.println();
				continue;
			}*/
            str = str.replace("吗", "");
            str = str.replace("?", "!");
            str = str.replace("？", "!");
            str = str.replace("我", "你");
            str = str.replace("你", "我");
            str = str.replace("我好", "你好");
            str = str.replace("不喜欢我", "不喜欢你");
            str = str.replace("我喜欢", "你喜欢");
            str = str.replace("我爱", "你不爱");
            str = str.replace("有", "没有");
            str = str.replace("相信", "不相信");
            str = str.replace("帮我", "你自己");
            str = str.replace("我是谁!", "我怎么知道?");
            str = str.replace("没没", "没");
            str = str.replace("", "");
            str = str.replace("", "");
            str = str.replace("", "");
            str = str.replace("", "");
            str = str.replace("", "");
            str = str.replace("", "");
            str = str.replace("", "");
            System.out.println(str);
        }

    }

}
