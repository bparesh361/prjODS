package com.fg.ods.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fg.ods.entity.Article;
import com.fg.ods.entity.Articles;
import com.fg.ods.entity.Resp;
import com.fg.ods.repository.ArticleDao;

@Controller
public class ArticleController {

	@Autowired
	private ArticleDao articleDao;
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public @ResponseBody Resp createArticle(@RequestBody Article article){
		System.out.println("Article Creation ");		
		articleDao.createArticle(article);
		System.out.println("Article Created Sucessfully.");	
		Resp resp = new Resp(1,"Article Created Successfully");
		return resp;
	}
	
	@RequestMapping(value="/search/{articleCode}")
	public @ResponseBody Article searchArticle(@PathVariable String articleCode){
		List<Article> list = articleDao.searchByCode(articleCode);
		System.out.println(list);
		return list.get(0);
	}
	
	@RequestMapping(value="/searchall")	
	public @ResponseBody Articles searchAllArticles(){
		System.out.println(" --- Getting All Articles --- ");
		Articles articles = new Articles();
		articles.setArticle(articleDao.searchAllArticles());
		return articles;
	}
	
}
