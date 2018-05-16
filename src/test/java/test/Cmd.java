package test;

import java.io.IOException;

public class Cmd {

	public static void main(String[] args) throws IOException {
		String userDir = System.getProperty("user.dir");//用户的当前工作目录
		 System.out.println("userDir="+userDir);
//		Runtime.getRuntime().exec(cmd);
		//获取运行时
		Runtime rt = Runtime.getRuntime();
		//获取进程
		String cmd = "cmd /k start md d:\\file\\ak";// /k不关闭dos窗口
//		String cmd = "cmd /c start md d:\\file\\ak";// /c关闭(关闭不了)
		
//		String cmd = "cmd /c start shutdown -s -t 00";// 立即关机
		System.out.println("cmd="+cmd);
		Process p = rt.exec(cmd);
//		Process p = rt.exec("cmd /k start echo hello");
		
		
		
	}

}
