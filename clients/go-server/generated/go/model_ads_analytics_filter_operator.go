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


import (
	"fmt"
)


// AdsAnalyticsFilterOperator : Filter operator for sync reporting
type AdsAnalyticsFilterOperator string

// List of AdsAnalyticsFilterOperator
const (
	LESS_THAN AdsAnalyticsFilterOperator = "LESS_THAN"
	GREATER_THAN AdsAnalyticsFilterOperator = "GREATER_THAN"
)

// AllowedAdsAnalyticsFilterOperatorEnumValues is all the allowed values of AdsAnalyticsFilterOperator enum
var AllowedAdsAnalyticsFilterOperatorEnumValues = []AdsAnalyticsFilterOperator{
	"LESS_THAN",
	"GREATER_THAN",
}

// validAdsAnalyticsFilterOperatorEnumValue provides a map of AdsAnalyticsFilterOperators for fast verification of use input
var validAdsAnalyticsFilterOperatorEnumValues = map[AdsAnalyticsFilterOperator]struct{}{
	"LESS_THAN": {},
	"GREATER_THAN": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AdsAnalyticsFilterOperator) IsValid() bool {
	_, ok := validAdsAnalyticsFilterOperatorEnumValues[v]
	return ok
}

// NewAdsAnalyticsFilterOperatorFromValue returns a pointer to a valid AdsAnalyticsFilterOperator
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAdsAnalyticsFilterOperatorFromValue(v string) (AdsAnalyticsFilterOperator, error) {
	ev := AdsAnalyticsFilterOperator(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for AdsAnalyticsFilterOperator: valid values are %v", v, AllowedAdsAnalyticsFilterOperatorEnumValues)
	}
}



// AssertAdsAnalyticsFilterOperatorRequired checks if the required fields are not zero-ed
func AssertAdsAnalyticsFilterOperatorRequired(obj AdsAnalyticsFilterOperator) error {
	return nil
}

// AssertAdsAnalyticsFilterOperatorConstraints checks if the values respects the defined constraints
func AssertAdsAnalyticsFilterOperatorConstraints(obj AdsAnalyticsFilterOperator) error {
	return nil
}