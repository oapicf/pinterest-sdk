package models

// CatalogsHotelBatchItem - Hotel batch item
type CatalogsHotelBatchItem struct {

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id"`

	Operation string `json:"operation"`

	Attributes CatalogsUpdatableHotelAttributes `json:"attributes"`
}
