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




type MetricsResponse struct {

	Data []map[string]interface{} `json:"data,omitempty"`
}

// AssertMetricsResponseRequired checks if the required fields are not zero-ed
func AssertMetricsResponseRequired(obj MetricsResponse) error {
	return nil
}

// AssertMetricsResponseConstraints checks if the values respects the defined constraints
func AssertMetricsResponseConstraints(obj MetricsResponse) error {
	return nil
}