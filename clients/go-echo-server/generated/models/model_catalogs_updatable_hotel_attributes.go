package models

type CatalogsUpdatableHotelAttributes struct {

	// The hotel's name.
	Name *string `json:"name,omitempty"`

	// Link to the product page
	Link *string `json:"link,omitempty"`

	// Brief description of the hotel.
	Description *string `json:"description,omitempty"`

	// The brand to which this hotel belongs to.
	Brand *string `json:"brand,omitempty"`

	// Latitude of the hotel.
	Latitude float32 `json:"latitude,omitempty"`

	// Longitude of the hotel.
	Longitude *float32 `json:"longitude,omitempty"`

	// A list of neighborhoods where the hotel is located
	Neighborhood *[]string `json:"neighborhood,omitempty"`

	Address CatalogsHotelAddress `json:"address,omitempty"`

	// Custom grouping of hotels
	CustomLabel0 *string `json:"custom_label_0,omitempty"`

	// Custom grouping of hotels
	CustomLabel1 *string `json:"custom_label_1,omitempty"`

	// Custom grouping of hotels
	CustomLabel2 *string `json:"custom_label_2,omitempty"`

	// Custom grouping of hotels
	CustomLabel3 *string `json:"custom_label_3,omitempty"`

	// Custom grouping of hotels
	CustomLabel4 *string `json:"custom_label_4,omitempty"`

	// The type of property. The category can be any type of internal description desired.
	Category *string `json:"category,omitempty"`

	// Base price of the hotel room per night followed by the ISO currency code
	BasePrice *string `json:"base_price,omitempty"`

	// Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
	SalePrice *string `json:"sale_price,omitempty"`

	GuestRatings CatalogsHotelGuestRatings `json:"guest_ratings,omitempty"`
}
