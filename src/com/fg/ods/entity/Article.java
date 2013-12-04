package com.fg.ods.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="article")
@NamedQueries({@NamedQuery(name="articleByName",query="select distinct a from Article a where a.articleCode=:artCode"),
		@NamedQuery(name="allArticle",query="select distinct a from Article a")})
@XmlRootElement
public class Article {

	@Id
	@Column(name="ART_CODE")
	private String articleCode;
	
	@Column(name="ART_DESC")
	private String articleDesc;
	
	@Column(name="BRAND_CODE")
	private String brandCode;
	
	@Column(name="MC_CODE")
	private String mcCode;
	
	public String getArticleCode() {
		return articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getArticleDesc() {
		return articleDesc;
	}

	public void setArticleDesc(String articleDesc) {
		this.articleDesc = articleDesc;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getMcCode() {
		return mcCode;
	}

	public void setMcCode(String mcCode) {
		this.mcCode = mcCode;
	}	
	
}
