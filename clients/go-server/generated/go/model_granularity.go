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


import (
	"fmt"
)


// Granularity : Granularity
type Granularity string

// List of Granularity
const (
	TOTAL Granularity = "TOTAL"
	DAY Granularity = "DAY"
	HOUR Granularity = "HOUR"
	WEEK Granularity = "WEEK"
	MONTH Granularity = "MONTH"
)

// AllowedGranularityEnumValues is all the allowed values of Granularity enum
var AllowedGranularityEnumValues = []Granularity{
	"TOTAL",
	"DAY",
	"HOUR",
	"WEEK",
	"MONTH",
}

// validGranularityEnumValue provides a map of Granularitys for fast verification of use input
var validGranularityEnumValues = map[Granularity]struct{}{
	"TOTAL": {},
	"DAY": {},
	"HOUR": {},
	"WEEK": {},
	"MONTH": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v Granularity) IsValid() bool {
	_, ok := validGranularityEnumValues[v]
	return ok
}

// NewGranularityFromValue returns a pointer to a valid Granularity
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewGranularityFromValue(v string) (Granularity, error) {
	ev := Granularity(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for Granularity: valid values are %v", v, AllowedGranularityEnumValues)
}



// AssertGranularityRequired checks if the required fields are not zero-ed
func AssertGranularityRequired(obj Granularity) error {
	return nil
}

// AssertGranularityConstraints checks if the values respects the defined constraints
func AssertGranularityConstraints(obj Granularity) error {
	return nil
}
