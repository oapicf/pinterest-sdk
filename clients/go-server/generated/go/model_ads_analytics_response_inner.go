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




type AdsAnalyticsResponseInner struct {

	// The ID of the ad that this metrics belongs to.
	AD_ID string `json:"AD_ID"`

	// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	DATE string `json:"DATE,omitempty"`
}

// AssertAdsAnalyticsResponseInnerRequired checks if the required fields are not zero-ed
func AssertAdsAnalyticsResponseInnerRequired(obj AdsAnalyticsResponseInner) error {
	elements := map[string]interface{}{
		"AD_ID": obj.AD_ID,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertAdsAnalyticsResponseInnerConstraints checks if the values respects the defined constraints
func AssertAdsAnalyticsResponseInnerConstraints(obj AdsAnalyticsResponseInner) error {
	return nil
}