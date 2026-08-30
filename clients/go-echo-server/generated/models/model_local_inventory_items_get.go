package models

// LocalInventoryItemsGet - Model for getting local inventory items
type LocalInventoryItemsGet struct {

	// Array of local inventory items
	Items []LocalInventoryItemResponse `json:"items"`
}
