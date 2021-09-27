package com.org.moglix.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Catalog {
	private Long productId;
	private Long categoryId;
	private String productName;
	private String productDescription;
	private String productImage;

}
