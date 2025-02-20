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


// CreativeAssetsVisibilityType : Creative assets visibility.
type CreativeAssetsVisibilityType string

// List of CreativeAssetsVisibilityType
const (
	VISIBLE CreativeAssetsVisibilityType = "VISIBLE"
	HIDDEN CreativeAssetsVisibilityType = "HIDDEN"
)

// AllowedCreativeAssetsVisibilityTypeEnumValues is all the allowed values of CreativeAssetsVisibilityType enum
var AllowedCreativeAssetsVisibilityTypeEnumValues = []CreativeAssetsVisibilityType{
	"VISIBLE",
	"HIDDEN",
}

// validCreativeAssetsVisibilityTypeEnumValue provides a map of CreativeAssetsVisibilityTypes for fast verification of use input
var validCreativeAssetsVisibilityTypeEnumValues = map[CreativeAssetsVisibilityType]struct{}{
	"VISIBLE": {},
	"HIDDEN": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v CreativeAssetsVisibilityType) IsValid() bool {
	_, ok := validCreativeAssetsVisibilityTypeEnumValues[v]
	return ok
}

// NewCreativeAssetsVisibilityTypeFromValue returns a pointer to a valid CreativeAssetsVisibilityType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewCreativeAssetsVisibilityTypeFromValue(v string) (CreativeAssetsVisibilityType, error) {
	ev := CreativeAssetsVisibilityType(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for CreativeAssetsVisibilityType: valid values are %v", v, AllowedCreativeAssetsVisibilityTypeEnumValues)
}



// AssertCreativeAssetsVisibilityTypeRequired checks if the required fields are not zero-ed
func AssertCreativeAssetsVisibilityTypeRequired(obj CreativeAssetsVisibilityType) error {
	return nil
}

// AssertCreativeAssetsVisibilityTypeConstraints checks if the values respects the defined constraints
func AssertCreativeAssetsVisibilityTypeConstraints(obj CreativeAssetsVisibilityType) error {
	return nil
}
