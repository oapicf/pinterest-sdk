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


// MmmReportingTargetingType : Ad targeting types for MMM report
type MmmReportingTargetingType string

// List of MmmReportingTargetingType
const (
	APPTYPE MmmReportingTargetingType = "APPTYPE"
	COUNTRY MmmReportingTargetingType = "COUNTRY"
	CREATIVE_TYPE MmmReportingTargetingType = "CREATIVE_TYPE"
	GENDER MmmReportingTargetingType = "GENDER"
	LOCATION MmmReportingTargetingType = "LOCATION"
)

// AllowedMmmReportingTargetingTypeEnumValues is all the allowed values of MmmReportingTargetingType enum
var AllowedMmmReportingTargetingTypeEnumValues = []MmmReportingTargetingType{
	"APPTYPE",
	"COUNTRY",
	"CREATIVE_TYPE",
	"GENDER",
	"LOCATION",
}

// validMmmReportingTargetingTypeEnumValue provides a map of MmmReportingTargetingTypes for fast verification of use input
var validMmmReportingTargetingTypeEnumValues = map[MmmReportingTargetingType]struct{}{
	"APPTYPE": {},
	"COUNTRY": {},
	"CREATIVE_TYPE": {},
	"GENDER": {},
	"LOCATION": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v MmmReportingTargetingType) IsValid() bool {
	_, ok := validMmmReportingTargetingTypeEnumValues[v]
	return ok
}

// NewMmmReportingTargetingTypeFromValue returns a pointer to a valid MmmReportingTargetingType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewMmmReportingTargetingTypeFromValue(v string) (MmmReportingTargetingType, error) {
	ev := MmmReportingTargetingType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for MmmReportingTargetingType: valid values are %v", v, AllowedMmmReportingTargetingTypeEnumValues)
}



// AssertMmmReportingTargetingTypeRequired checks if the required fields are not zero-ed
func AssertMmmReportingTargetingTypeRequired(obj MmmReportingTargetingType) error {
	return nil
}

// AssertMmmReportingTargetingTypeConstraints checks if the values respects the defined constraints
func AssertMmmReportingTargetingTypeConstraints(obj MmmReportingTargetingType) error {
	return nil
}
