package models

type LineItem struct {

	// Product brand. For example, \"Parker\".
	ProductBrand string `json:"product_brand,omitempty"`

	// Product category. For example, \"Shoes\".
	ProductCategory string `json:"product_category,omitempty"`

	// Product ID. For example, 1414.
	ProductId int32 `json:"product_id,omitempty"`

	// Product name. For example, \"Parker Boots\".
	ProductName string `json:"product_name,omitempty"`

	// Product price. For example, \"99.99\".
	ProductPrice string `json:"product_price,omitempty"`

	// Product quantity. For example, 2.
	ProductQuantity int32 `json:"product_quantity,omitempty"`

	// Product variant. For example, \"Red\".
	ProductVariant string `json:"product_variant,omitempty"`

	// Product variant ID. For example, \"1414-34832\".
	ProductVariantId string `json:"product_variant_id,omitempty"`
}
