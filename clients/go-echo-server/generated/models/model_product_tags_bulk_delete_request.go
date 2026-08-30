package models

// ProductTagsBulkDeleteRequest - Request body for bulk deleting product tags from a pin.
type ProductTagsBulkDeleteRequest struct {

	// List of product tags to delete.
	ProductTags []ProductTagItem `json:"product_tags"`
}
