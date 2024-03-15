package models

// CatalogsDeleteHotelItem - A hotel item to be deleted
type CatalogsDeleteHotelItem struct {

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id"`

	Operation string `json:"operation"`
}
