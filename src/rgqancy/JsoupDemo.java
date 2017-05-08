package rgqancy;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupDemo {
	 public static void main(String[] args) {
		 System.out.println(getDomainTitle("https://www.baidu.com")); //charset=utf-8"
		 System.out.println(getDomainTitle("http://www.beijing.gov.cn/")); //charset=gb2312
		 System.out.println(getDomainTitle("https://item.taobao.com/item.htm?spm=a219r.lm0.14.7.v1QXMx&id=43065701312&ns=1&abbucket=5#detail")); //charset="gbk"
		 System.out.println(getDomainTitle("http://item.jd.com/10002419449.html")); //charset=gbk"
		 System.out.println(getDomainTitle("http://www.w3school.com.cn/tags/html_ref_charactersets.asp"));
		 System.out.println(getDomainTitle("http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html"));
		 System.out.println(getDomainTitle("https://item.taobao.com/item.htm?id=521802441196&ali_refid=a3_430584_1006:1104518782:N:%E5%AE%B6%E5%85%B7:83a33c9f7dd55f1efb40051cfb164d62&ali_trackid=1_83a33c9f7dd55f1efb40051cfb164d62&spm=a219r.lm5704.14.17.cr3q7H#detail&qq-pf-to=pcqq.temporaryc2c"));
	}

	// 使用Jsoup组件，HTML内meta元素编码的复杂问题，它能解决自动侦测网页编码问题。。
	public static String getDomainTitle(String url) {
		Document document = null;
		try {
			document = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String title = "";
		if (document != null) {
			title = document.text();
		}
		return title;
	}
}
