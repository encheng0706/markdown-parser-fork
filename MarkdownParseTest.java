import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*; 
public class MarkdownParseTest {

    @Test  
    public void addition() { 
        assertEquals(2, 1 + 1);  
    }

    @Test 
    public void testGetLinksfile() throws IOException{
        Path fileName = Path.of("C:/GitHub/cse15l-lab-reports/markdown-parser-new/test-file.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("https://something.com","some-thing.html"), links);
    }

    @Test 
    public void testGetLinksinfile2() throws IOException{
        Path fileName = Path.of("C:/GitHub/cse15l-lab-reports/markdown-parser-new/test-file2.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("https://something.com","some-page.html"), links);
    }

    @Test 
    public void testGetLinksinfile3() throws IOException{
        Path fileName = Path.of("C:/GitHub/cse15l-lab-reports/markdown-parser-new/test-file3.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile4() throws IOException{
        Path fileName = Path.of("C:/GitHub/cse15l-lab-reports/markdown-parser-new/test-file4.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile5() throws IOException{
        Path fileName = Path.of("C:/GitHub/cse15l-lab-reports/markdown-parser-new/test-file5.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile6() throws IOException{
        Path fileName = Path.of("C:/GitHub/cse15l-lab-reports/markdown-parser-new/test-file6.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile7() throws IOException{
        Path fileName = Path.of("C:/GitHub/cse15l-lab-reports/markdown-parser-new/test-file7.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile8() throws IOException{
        Path fileName = Path.of("C:/GitHub/cse15l-lab-reports/markdown-parser-new/test-file8.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

}