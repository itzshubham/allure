package my.company;

import io.qameta.allure.Attachment;
import io.qameta.allure.Issue;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.String.format;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.fail;


/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 24.11.13
 */
public class SimpleTest {
  
	@Test
	public void test1(){
		Assert.assertTrue(true,"m1");
	}
	
	@Test
	public void test2(){
		Assert.assertTrue(false,"m2");
	}
	
	@Test
	public void test3(){
		Assert.assertTrue(true,"m3");
	}
}

