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

// CatalogsItemsDeleteBatchRequest - Request object to delete catalogs items
type CatalogsItemsDeleteBatchRequest struct {

	Country Country `json:"country"`

	Language CatalogsItemsRequestLanguage `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemDeleteBatchRecord `json:"items"`
}
