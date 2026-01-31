package models

// CatalogsCreateRetailItem - An item to be created
type CatalogsCreateRetailItem struct {

	Attributes ItemAttributesRequest `json:"attributes"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	Operation string `json:"operation"`
}
