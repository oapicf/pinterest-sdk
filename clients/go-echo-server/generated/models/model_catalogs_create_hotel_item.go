package models

// CatalogsCreateHotelItem - A hotel item to be created.
type CatalogsCreateHotelItem struct {

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id"`

	Operation string `json:"operation"`

	Attributes CatalogsHotelAttributes `json:"attributes"`
}
