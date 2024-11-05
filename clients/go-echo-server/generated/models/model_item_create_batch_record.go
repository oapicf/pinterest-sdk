package models

// ItemCreateBatchRecord - Object describing an item batch record to create items
type ItemCreateBatchRecord struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	Attributes ItemAttributesRequest `json:"attributes,omitempty"`
}
