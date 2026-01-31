package models

// ItemUpsertBatchRecord - Object describing an item batch record to upsert items
type ItemUpsertBatchRecord struct {

	Attributes ItemAttributesRequest `json:"attributes,omitempty"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`
}
