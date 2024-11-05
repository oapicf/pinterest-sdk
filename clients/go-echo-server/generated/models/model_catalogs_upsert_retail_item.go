package models

// CatalogsUpsertRetailItem - An item to be upserted
type CatalogsUpsertRetailItem struct {

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	Operation string `json:"operation"`

	Attributes ItemAttributesRequest `json:"attributes"`
}
