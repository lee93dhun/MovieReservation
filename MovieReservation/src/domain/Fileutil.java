package domain;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class fileutil {
	// 리스트를 파일에 저장
	public static void writefile( String dir , String filename , List<회원> 영화회원목록 ) throws Exception {
		
		File dirent = new File(dir);
		if(dirent.exists() ) {			// 해당경로[폴더]없으면
			dirent.mkdir(); // 폴더생성
		}
		// 파일 객체화
		File file = new File(dir , filename );
			OutputStream outputStream = new BufferedOutputStream( new FileOutputStream(file) );
			
			//파일쓰기
			for( 회원 temp : 영화회원목록 ) {
				
				String outString = temp.getId() + "," + temp.getPassword() + ","+ temp.getName() +"\n" ;
				// 2. 회원 파일쓰기
				byte[] b = outString.getBytes(); //문자열 => 바이트 변경
				outputStream.write(b); //파일 쓰기
				}
		outputStream.close();
	}
	// 파일 읽어와서 리스트에 저장
	public static ArrayList<회원> readReader(Reader reader) throws Exception{
		BufferedReader bufferedReader = new BufferedReader(reader);
		ArrayList<회원> 영화회원목록 = new ArrayList<>();
		String line;
		// 읽어오기
		while( ( line = bufferedReader.readLine() ) !=null ) {
			// 읽어온줄 분해
			String[] b = line.split(","); 
			// 객체에 담기
			회원 temp = new 회원(b[0], b[1], b[2], 0);
			// 객체를 리스트에 담기
			영화회원목록.add(temp);
		}
			bufferedReader.close(); // 버퍼닫기
			return 영화회원목록;
	
	}	
		// 파일 읽어오는 메소드 
	public static ArrayList<회원>readfile(File file) throws Exception {
		
		FileReader fileReader = new FileReader(file);
		ArrayList<회원>영화회원목록 = new ArrayList<>();
		
		영화회원목록 = readReader(fileReader);
		
		fileReader.close();
		return 영화회원목록;
	}
		
		
		
		
	

}
