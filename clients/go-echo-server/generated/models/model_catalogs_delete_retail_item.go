package models

// CatalogsDeleteRetailItem - An item to be deleted
type CatalogsDeleteRetailItem struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	Operation string `json:"operation"`
}
