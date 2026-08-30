package models

// LocalInventoryDeleteOperation - Delete operation for local inventory item
type LocalInventoryDeleteOperation struct {

	// Catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	Operation string `json:"operation"`

	// Store code for the local inventory item
	StoreCode string `json:"store_code"`
}
