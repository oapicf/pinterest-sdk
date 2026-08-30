package models

type CatalogsHotelAttributes struct {

	// Hotel address
	Address CatalogsHotelAddress `json:"address,omitempty"`

	// Base price of the hotel room per night followed by the ISO currency code
	BasePrice *string `json:"base_price,omitempty"`

	// The brand to which this hotel belongs to.
	Brand *string `json:"brand,omitempty"`

	// The type of property. The category can be any type of internal description desired.
	Category *string `json:"category,omitempty"`

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

	// Brief description of the hotel.
	Description *string `json:"description,omitempty"`

	// If specified, you must provide all properties
	GuestRatings CatalogsHotelGuestRatings `json:"guest_ratings,omitempty"`

	// Latitude of the hotel.
	Latitude float32 `json:"latitude,omitempty"`

	// Link to the product page
	Link *string `json:"link,omitempty"`

	// Longitude of the hotel.
	Longitude *float32 `json:"longitude,omitempty"`

	// The hotel's name.
	Name *string `json:"name,omitempty"`

	// A list of neighborhoods where the hotel is located
	Neighborhood *[]string `json:"neighborhood,omitempty"`

	// Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
	SalePrice *string `json:"sale_price,omitempty"`

	// <= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.
	AdditionalImageLink *[]string `json:"additional_image_link,omitempty"`

	// AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL.
	AiDisclosures []CatalogsAiContentDisclosure `json:"ai_disclosures,omitempty"`

	// The main hotel image
	MainImage CatalogsHotelMainImage `json:"main_image,omitempty"`
}
