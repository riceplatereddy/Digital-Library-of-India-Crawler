/**
 * This program is written to crawl and dowload books form Drigital Library of India, since its a pain in the *** to do so, manually
 * This uses apache commons io libraries. Feel free to tweak around
 * @author  Dilip Mandadi
 * @version 1.0
 */

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class Crawler2 {

	private static final String MAIN_PATH = "C:\\Users\\Dilip\\Desktop\\Download2\\";

	public static void main(String[] args) throws Exception {
		try {
			File file;
			URL url;
			//i represents page number to crawl. Logic should change based on URL
			for (int i = 1; i < 37; i++) {
				file = FileUtils.getFile(MAIN_PATH + i + ".tif");
				if(i<10)
					url = new URL("http://ia902702.us.archive.org/BookReader/BookReaderImages.php?zip=/0/items/lifeandworksirj00geddgoog/lifeandworksirj00geddgoog_tif.zip&file=lifeandworksirj00geddgoog_tif/lifeandworksirj00geddgoog_000" + i + ".tif&scale=1.3101604278074865&rotate=0");
				else if (i<100)
					url = new URL("http://ia902702.us.archive.org/BookReader/BookReaderImages.php?zip=/0/items/lifeandworksirj00geddgoog/lifeandworksirj00geddgoog_tif.zip&file=lifeandworksirj00geddgoog_tif/lifeandworksirj00geddgoog_00" + i + ".tif&scale=1.3101604278074865&rotate=0");
				else
					url = new URL("http://ia902702.us.archive.org/BookReader/BookReaderImages.php?zip=/0/items/lifeandworksirj00geddgoog/lifeandworksirj00geddgoog_tif.zip&file=lifeandworksirj00geddgoog_tif/lifeandworksirj00geddgoog_0" + i + ".tif&scale=1.3101604278074865&rotate=0");
				
				//
				// Copy bytes from the URL to the destination file.
				//
				System.out.println(url);
				FileUtils.copyURLToFile(url, file);
				//Thread.sleep(5000);      
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}