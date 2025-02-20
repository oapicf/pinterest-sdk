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




type AdsAnalyticsMetricsFilter struct {

	Field AdsAnalyticsFilterColumn `json:"field"`

	Operator AdsAnalyticsFilterOperator `json:"operator"`

	// List of values for filtering
	Values []float32 `json:"values"`
}

// AssertAdsAnalyticsMetricsFilterRequired checks if the required fields are not zero-ed
func AssertAdsAnalyticsMetricsFilterRequired(obj AdsAnalyticsMetricsFilter) error {
	elements := map[string]interface{}{
		"field": obj.Field,
		"operator": obj.Operator,
		"values": obj.Values,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertAdsAnalyticsMetricsFilterConstraints checks if the values respects the defined constraints
func AssertAdsAnalyticsMetricsFilterConstraints(obj AdsAnalyticsMetricsFilter) error {
	return nil
}
