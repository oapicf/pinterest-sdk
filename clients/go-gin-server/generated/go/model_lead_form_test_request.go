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

// LeadFormTestRequest - Request to create test data for lead data test API.
type LeadFormTestRequest struct {

	// Test lead answers. Should follow the creation order.
	Answers []string `json:"answers"`
}
