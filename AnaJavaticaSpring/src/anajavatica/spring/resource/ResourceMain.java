package anajavatica.spring.resource;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

@SuppressWarnings("javadoc")
public class ResourceMain {

	public static void main(String[] args) throws IOException {

		ResourceMain.executeUrlResource();
		ResourceMain.executeFileResource();

	}

	private static void executeUrlResource() throws IOException {
		Resource urlResoource = new UrlResource("http://www.farukbozan.com/feed");
		InputStream is = urlResoource.getInputStream();
		if (urlResoource.exists()) {
			if (is.available() <= 0)
				System.out.println("Nothing to read");
			else
				System.out.println(urlResoource.getDescription());
			is.close();
		}
	}

	private static void executeFileResource() throws IOException {
		Resource fileResource = new FileSystemResource("fileResource.txt");
		InputStream is = fileResource.getInputStream();
		if (fileResource.exists()) {
			byte[] cache = new byte[50];
			is.read(cache);
			System.out.println(new String(cache));
			is.close();
		}
	}

}
