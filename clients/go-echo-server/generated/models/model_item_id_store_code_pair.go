package models

// ItemIdStoreCodePair - A pair of item_id and store_code that uniquely identifies a local inventory item
type ItemIdStoreCodePair struct {

	// Catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	// Store code for the local inventory item
	StoreCode string `json:"store_code"`
}
