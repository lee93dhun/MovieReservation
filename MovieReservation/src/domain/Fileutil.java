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
	// ����Ʈ�� ���Ͽ� ����
	public static void writefile( String dir , String filename , List<ȸ��> ��ȭȸ����� ) throws Exception {
		
		File dirent = new File(dir);
		if(dirent.exists() ) {			// �ش���[����]������
			dirent.mkdir(); // ��������
		}
		// ���� ��üȭ
		File file = new File(dir , filename );
			OutputStream outputStream = new BufferedOutputStream( new FileOutputStream(file) );
			
			//���Ͼ���
			for( ȸ�� temp : ��ȭȸ����� ) {
				
				String outString = temp.getId() + "," + temp.getPassword() + ","+ temp.getName() +"\n" ;
				// 2. ȸ�� ���Ͼ���
				byte[] b = outString.getBytes(); //���ڿ� => ����Ʈ ����
				outputStream.write(b); //���� ����
				}
		outputStream.close();
	}
	// ���� �о�ͼ� ����Ʈ�� ����
	public static ArrayList<ȸ��> readReader(Reader reader) throws Exception{
		BufferedReader bufferedReader = new BufferedReader(reader);
		ArrayList<ȸ��> ��ȭȸ����� = new ArrayList<>();
		String line;
		// �о����
		while( ( line = bufferedReader.readLine() ) !=null ) {
			// �о���� ����
			String[] b = line.split(","); 
			// ��ü�� ���
			ȸ�� temp = new ȸ��(b[0], b[1], b[2], 0);
			// ��ü�� ����Ʈ�� ���
			��ȭȸ�����.add(temp);
		}
			bufferedReader.close(); // ���۴ݱ�
			return ��ȭȸ�����;
	
	}	
		// ���� �о���� �޼ҵ� 
	public static ArrayList<ȸ��>readfile(File file) throws Exception {
		
		FileReader fileReader = new FileReader(file);
		ArrayList<ȸ��>��ȭȸ����� = new ArrayList<>();
		
		��ȭȸ����� = readReader(fileReader);
		
		fileReader.close();
		return ��ȭȸ�����;
	}
		
		
		
		
	

}
