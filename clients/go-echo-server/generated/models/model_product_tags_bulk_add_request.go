package models

// ProductTagsBulkAddRequest - Request body for bulk adding product tags to a pin.
type ProductTagsBulkAddRequest struct {

	// List of product tags to add. Maximum 24 items allowed.
	ProductTags []ProductTagItem `json:"product_tags"`
}
