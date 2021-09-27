package com.org.moglix.dao.impl;

import java.util.List;

import com.org.moglix.dao.CatalogDao;
import com.org.moglix.domain.Catalog;

public class CatalogDaoImpl implements CatalogDao {
	private static int counter = 0;
	Catalog catalogs[] = new Catalog[10];
	@Override
	public String saveOrUpdate(Catalog catalog) {
	     
	    	Catalog catalogExist= this.getById(catalog.getProductId());
	    	if(catalogExist!=null) {
	    		//update catalog with this id
	    		for (Catalog cat : catalogs) {
					if(cat !=null &&cat.getProductId() ==catalogExist.getProductId())
					{
						cat.setCategoryId(catalog.getCategoryId());
						cat.setProductDescription(catalog.getProductDescription());
						cat.setProductImage(catalog.getProductImage());
						cat.setProductName(catalog.getProductName());
					}
				}
	    		
	    		return "Updated Successfully .. "+ catalog.getProductId() +"";
	    	}
	    	else {
	    		//insert new catalog
		    	if(counter<catalogs.length) {
		    		catalogs[counter++]=catalog;
		    	}	
	    	}
	    
		return "Inserted Successfully ..!";
	}

	@Override
	public Catalog getById(Long catelogId) {
		for (Catalog catalog : catalogs) {
		if(catalog!=null && (catalog.getProductId()== catelogId)) {
			return catalog;
		}
		}
		return null;
	}

	@Override
	public List<Catalog> getList() {
		return null;
	}

	@Override
	public String deleteById(Long catelogId) {
       this.counter=0;
       for (Catalog catalog : catalogs) {
  		    if(catalog!=null &&catalog.getProductId()==catelogId) {
  		    	this.catalogs[counter]=null;
  		    	return "Deleted succcessfully : catalogId : " +catelogId+"";
  		    }else {
  		    	counter ++;
  		    }
	      }
       return "Internal Server error OR catalogId may not exist";
	}

}
