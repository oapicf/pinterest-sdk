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


// BusinessRoleCheckMode : Specifies if the partner is internal or external.
type BusinessRoleCheckMode string

// List of BusinessRoleCheckMode
const (
	INTERNAL BusinessRoleCheckMode = "INTERNAL"
	EXTERNAL BusinessRoleCheckMode = "EXTERNAL"
)

// AllowedBusinessRoleCheckModeEnumValues is all the allowed values of BusinessRoleCheckMode enum
var AllowedBusinessRoleCheckModeEnumValues = []BusinessRoleCheckMode{
	"INTERNAL",
	"EXTERNAL",
}

// validBusinessRoleCheckModeEnumValue provides a map of BusinessRoleCheckModes for fast verification of use input
var validBusinessRoleCheckModeEnumValues = map[BusinessRoleCheckMode]struct{}{
	"INTERNAL": {},
	"EXTERNAL": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v BusinessRoleCheckMode) IsValid() bool {
	_, ok := validBusinessRoleCheckModeEnumValues[v]
	return ok
}

// NewBusinessRoleCheckModeFromValue returns a pointer to a valid BusinessRoleCheckMode
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewBusinessRoleCheckModeFromValue(v string) (BusinessRoleCheckMode, error) {
	ev := BusinessRoleCheckMode(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for BusinessRoleCheckMode: valid values are %v", v, AllowedBusinessRoleCheckModeEnumValues)
}



// AssertBusinessRoleCheckModeRequired checks if the required fields are not zero-ed
func AssertBusinessRoleCheckModeRequired(obj BusinessRoleCheckMode) error {
	return nil
}

// AssertBusinessRoleCheckModeConstraints checks if the values respects the defined constraints
func AssertBusinessRoleCheckModeConstraints(obj BusinessRoleCheckMode) error {
	return nil
}
