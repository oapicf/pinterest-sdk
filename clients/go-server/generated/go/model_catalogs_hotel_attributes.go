// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type CatalogsHotelAttributes struct {

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

	MainImage CatalogsHotelAttributesAllOfMainImage `json:"main_image,omitempty"`

	// <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
	AdditionalImageLink *[]string `json:"additional_image_link,omitempty"`
}

// AssertCatalogsHotelAttributesRequired checks if the required fields are not zero-ed
func AssertCatalogsHotelAttributesRequired(obj CatalogsHotelAttributes) error {
	if err := AssertCatalogsHotelAddressRequired(obj.Address); err != nil {
		return err
	}
	if err := AssertCatalogsHotelGuestRatingsRequired(obj.GuestRatings); err != nil {
		return err
	}
	if err := AssertCatalogsHotelAttributesAllOfMainImageRequired(obj.MainImage); err != nil {
		return err
	}
	return nil
}

// AssertCatalogsHotelAttributesConstraints checks if the values respects the defined constraints
func AssertCatalogsHotelAttributesConstraints(obj CatalogsHotelAttributes) error {
	if err := AssertCatalogsHotelAddressConstraints(obj.Address); err != nil {
		return err
	}
	if err := AssertCatalogsHotelGuestRatingsConstraints(obj.GuestRatings); err != nil {
		return err
	}
	if err := AssertCatalogsHotelAttributesAllOfMainImageConstraints(obj.MainImage); err != nil {
		return err
	}
	return nil
}
