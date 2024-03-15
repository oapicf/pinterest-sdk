package models

// ItemDeleteDiscontinuedBatchRecord - Object describing an item batch record to discontinue items
type ItemDeleteDiscontinuedBatchRecord struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`
}
