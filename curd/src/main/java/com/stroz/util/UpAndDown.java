package com.stroz.util;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("UAD")
public class UpAndDown {
	/**
	 * �ϴ���ʹ��ע��
	 * @param desc
	 * @param file
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/fileUp")
	public String fileUp(@RequestParam String desc,@RequestParam MultipartFile file) throws IOException{
		System.out.println(desc);
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getInputStream());
		System.out.println(file.getSize());
		return "success";
	}
	
	/**���أ�ʹ��ResponseEntity<?>��ͨ��HttpMessageConverterʵ������ת��
	 * 
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/fileDownbyEntity")
	public ResponseEntity<byte[]> fileDown(HttpSession session) throws IOException{
		byte [] body = null;
		ServletContext servletContext = session.getServletContext();
		InputStream in = servletContext.getResourceAsStream("/files/�½��ı��ĵ�.txt");
		body = new byte[in.available()];
		in.read(body);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=abc.txt");
		
		HttpStatus statusCode = HttpStatus.OK;
		
		ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
		return response;
	}
	
	/**���أ�ʹ��ע�⣬ͨ��HttpMessageConverterʵ������ת��
	 * 
	 * @param response
	 * @param session
	 * @return
	 * @throws IOException
	 */
    @ResponseBody  
    @RequestMapping(value = "/fileDownbyAnno")  
    public byte[] downloadFile( HttpServletResponse response,HttpSession session)  
            throws IOException {  
		ServletContext servletContext = session.getServletContext();
		InputStream in = servletContext.getResourceAsStream("/files/�½��ı��ĵ�.txt");
		byte[] bytes = new byte[in.available()];
		in.read(bytes);
		response.addHeader("Content-Disposition", "attachment;filename=abc.txt");
		response.setContentType("application/x-msdownload");
		return bytes;
  
    }  
}
