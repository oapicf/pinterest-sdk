package models

// CatalogsRetailItemResponse - Object describing a retail item record
type CatalogsRetailItemResponse struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	// The pins mapped to the item
	Pins *[]Pin `json:"pins,omitempty"`

	Attributes ItemAttributes `json:"attributes,omitempty"`
}
