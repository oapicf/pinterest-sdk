/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type ItemResponseAnyOf struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	// The pins mapped to the item
	Pins *[]Pin `json:"pins,omitempty"`

	Attributes CatalogsHotelAttributes `json:"attributes,omitempty"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`
}