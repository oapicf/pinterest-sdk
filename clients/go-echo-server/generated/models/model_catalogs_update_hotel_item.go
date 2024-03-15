package models

// CatalogsUpdateHotelItem - Object describing an hotel item batch record
type CatalogsUpdateHotelItem struct {

	// The catalog hotel item id in the merchant namespace
	HotelId string `json:"hotel_id"`

	Operation string `json:"operation"`

	Attributes CatalogsUpdatableHotelAttributes `json:"attributes"`
}
