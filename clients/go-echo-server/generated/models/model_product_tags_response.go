package models

// ProductTagsResponse - Response containing a list of product tags for a pin.
type ProductTagsResponse struct {

	// List of product tags on the pin.
	ProductTags []ProductTagItem `json:"product_tags"`
}
