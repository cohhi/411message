import java.util.file;
public class java{
	public static void main(String[] args) {
		File file=new file("one.html");
		file.writer=new OutputStreamWriter(new fileOutputStream(file), "UTF-8");
		file.write("" +
				"<!Doctype html>\n" +
				"<html lang=\"zh\">\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    <title>one</title>\n" +
				"    <link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\">\n" +
				"</head>\n" +
				"<body>\n" +
				"<div>\n" +
				"    <div>" +
				"		<p>标题</p>\n" +
				"		<h3>正文</h3>" +
				"\n" +
				"    </div>\n" +
				"    <div>\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
				"    </div>\n" +
				"</div>\n" +
				"</body>\n" +
				"</html>");
		file.close();
	}
}