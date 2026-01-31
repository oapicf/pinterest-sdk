package models

// CatalogsUpsertRetailItem - An item to be upserted
type CatalogsUpsertRetailItem struct {

	Attributes ItemAttributesRequest `json:"attributes"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	Operation string `json:"operation"`
}
