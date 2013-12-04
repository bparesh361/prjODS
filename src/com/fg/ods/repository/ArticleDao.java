package com.fg.ods.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fg.ods.entity.Article;

@Repository
public class ArticleDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void createArticle(Article art){		
		em.persist(art);
		em.close();
	}
	
	public List<Article> searchByCode(String artCode){
		return em.createNamedQuery("articleByName").setParameter("artCode", artCode).getResultList();
	}
	
	public List<Article> searchAllArticles(){
		return em.createNamedQuery("allArticle").setFirstResult(0).setMaxResults(1).getResultList();
	}
	
}
