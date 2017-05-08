//
// AutoDetectEncoding.java
//
package rgqancy;

import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.xml.sax.SAXException;

import oracle.xml.parser.v2.*;

public class AutoDetectEncoding
{
	 public static void main(String[] args) {
		 try {
			System.out.println(getDomainTitle("https://www.baidu.com"));
//			System.out.println(getDomainTitle("http://www.beijing.gov.cn/")); //charset=gb2312
//			System.out.println(getDomainTitle("https://item.taobao.com/item.htm?spm=a219r.lm0.14.7.v1QXMx&id=43065701312&ns=1&abbucket=5#detail")); //charset="gbk"
//			System.out.println(getDomainTitle("http://item.jd.com/10002419449.html")); //charset=gbk"
//			System.out.println(getDomainTitle("http://www.w3school.com.cn/tags/html_ref_charactersets.asp"));
//			System.out.println(getDomainTitle("http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html"));
//			System.out.println(getDomainTitle("https://item.taobao.com/item.htm?id=521802441196&ali_refid=a3_430584_1006:1104518782:N:%E5%AE%B6%E5%85%B7:83a33c9f7dd55f1efb40051cfb164d62&ali_trackid=1_83a33c9f7dd55f1efb40051cfb164d62&spm=a219r.lm5704.14.17.cr3q7H#detail&qq-pf-to=pcqq.temporaryc2c"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //charset=utf-8"
	}

   public static String getDomainTitle(String path)  throws Exception
   {
	  path = "D:\\work\\互联网证据存证系统\\html\\index.html";
      // create an instance of the xml file, for example, myfile.xml
      File file = new File(path);
      // create a binary input stream
      FileInputStream fis = new FileInputStream(file);
      // buffering for efficiency
      BufferedInputStream in = new BufferedInputStream(fis);
      // get an instance of the parser
      DOMParser parser = new DOMParser();
      // parse the xml file
      parser.parse(in);
      // get the document
      XMLDocument doc = parser.getDocument();
      System.out.println("Encoding is " + doc.getEncoding());
      return doc.getEncoding();
   }
}

