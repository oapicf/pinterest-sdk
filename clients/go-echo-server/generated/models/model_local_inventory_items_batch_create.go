package models

// LocalInventoryItemsBatchCreate - Resource create operation model.
type LocalInventoryItemsBatchCreate struct {

	// Array of inventory operations. Up to 1000 items per request.
	Operations []LocalInventoryOperation `json:"operations"`
}
