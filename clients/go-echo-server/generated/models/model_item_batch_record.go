package models

// ItemBatchRecord - Object describing an item batch record
type ItemBatchRecord struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	Attributes ItemAttributes `json:"attributes,omitempty"`
}
