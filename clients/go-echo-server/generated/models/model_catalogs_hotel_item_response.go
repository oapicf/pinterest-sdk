package models

// CatalogsHotelItemResponse - Object describing a hotel record
type CatalogsHotelItemResponse struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`

	// The pins mapped to the item
	Pins *[]Pin `json:"pins,omitempty"`

	Attributes CatalogsHotelAttributes `json:"attributes,omitempty"`
}
