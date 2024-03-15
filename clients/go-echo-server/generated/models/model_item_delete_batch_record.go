package models

// ItemDeleteBatchRecord - Object describing an item batch record to delete items
type ItemDeleteBatchRecord struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`
}
