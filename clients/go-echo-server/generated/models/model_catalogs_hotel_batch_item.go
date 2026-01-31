package models

// CatalogsHotelBatchItem - Hotel batch item
type CatalogsHotelBatchItem struct {

	Attributes CatalogsUpdatableHotelAttributes `json:"attributes"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id"`

	Operation string `json:"operation"`
}
