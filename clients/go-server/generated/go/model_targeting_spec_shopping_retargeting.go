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




type TargetingSpecShoppingRetargeting struct {

	// Number of days ago to start lookback timeframe for dynamic retargeting
	LookbackWindow int32 `json:"lookback_window,omitempty"`

	// Event types to target for dynamic retargeting
	TagTypes []int32 `json:"tag_types,omitempty"`

	// Number of days ago to stop lookback timeframe for dynamic retargeting
	ExclusionWindow int32 `json:"exclusion_window,omitempty"`
}

// AssertTargetingSpecShoppingRetargetingRequired checks if the required fields are not zero-ed
func AssertTargetingSpecShoppingRetargetingRequired(obj TargetingSpecShoppingRetargeting) error {
	return nil
}

// AssertTargetingSpecShoppingRetargetingConstraints checks if the values respects the defined constraints
func AssertTargetingSpecShoppingRetargetingConstraints(obj TargetingSpecShoppingRetargeting) error {
	return nil
}
