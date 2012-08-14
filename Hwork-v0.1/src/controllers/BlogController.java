package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hwork.annotation.ViewsPackage;
import org.hwork.db.DbConnectionManager;
import org.hwork.db.ProxyConnection;
import org.hwork.web.Controller;

/**
 * @Description: TODO
 * @author heng.ai@chinacache.com  
 * @date 2012-8-9 上午1:08:33 
 * @version V0.1  
 */

@ViewsPackage("index")
public class BlogController extends Controller {
	private DbConnectionManager dbManager;
	
	@Override
	public void init() throws Exception {
		dbManager = DbConnectionManager.newInstance();
		System.out.println("每一次请求，都会执行这个!");
	}

	public void list() throws Exception{
		render("list.jsp");
	}
	
	public void index() throws Exception{
		assign("name", params.get("name")[0]);
		render("list");
	}
	
	public void test() throws Exception{
		Connection conn = dbManager.getConnection();
		conn.close();
	}

}
