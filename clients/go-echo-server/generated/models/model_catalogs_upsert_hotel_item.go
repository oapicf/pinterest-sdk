package models

// CatalogsUpsertHotelItem - A hotel item to be upserted.
type CatalogsUpsertHotelItem struct {

	Attributes CatalogsHotelAttributes `json:"attributes"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id"`

	Operation string `json:"operation"`
}
