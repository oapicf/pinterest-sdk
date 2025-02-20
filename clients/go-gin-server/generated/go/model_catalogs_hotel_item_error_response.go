/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// CatalogsHotelItemErrorResponse - Object describing a hotel item error
type CatalogsHotelItemErrorResponse struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`

	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors,omitempty"`
}
