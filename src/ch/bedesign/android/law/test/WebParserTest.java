package ch.bedesign.android.law.test;
import java.io.IOException;

import junit.framework.TestCase;

import org.apache.http.client.ClientProtocolException;

import ch.bedesign.android.law.access.WebParser;
import ch.bedesign.android.law.log.Logger;

public class WebParserTest extends TestCase {

	public void testGetText() throws ClientProtocolException, IOException {
		String url = "http://www.admin.ch/ch/d/sr/220/index.html";

		// 	int level_id = 0;
		WebParser webParser = new WebParser();
		String resultAll = webParser.getText(url);
		Logger.i(resultAll);
		System.out.println(resultAll);
		assertNotNull(resultAll);
	}

}
