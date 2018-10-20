package cn.wolfcode.crud.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private Long id;
	private String productName;
	private Long dirId;
	private Double salePrice;
	private String supplier;
	private String brand;
	private Double cutoff;
	private Double costPrice;
}
