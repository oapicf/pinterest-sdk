package models

// CatalogsDeleteRetailItem - An item to be deleted
type CatalogsDeleteRetailItem struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	// The millisecond timestamp when the item was lastly modified by the merchant.
	LastUpdatedTime int64 `json:"last_updated_time,omitempty"`

	Operation string `json:"operation"`
}
