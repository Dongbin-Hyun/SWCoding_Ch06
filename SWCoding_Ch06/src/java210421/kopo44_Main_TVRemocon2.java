package java210421;

public class kopo44_Main_TVRemocon2 {
	
	static kopo44_Process_TvRemocon2 tvRemocon;

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	tvRemocon = new kopo44_Process_TvRemocon2();
	System.out.println("---------------");
	tvRemocon.channelUp();
	System.out.println("---------------");
	tvRemocon.channelDown();
	System.out.println("---------------");
	tvRemocon.volumeUp();
	System.out.println("---------------");
	tvRemocon.volumeDown();

}

}
