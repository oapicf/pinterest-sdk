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



type PermissionsWithOwner string

// List of PermissionsWithOwner
const (
	ADMIN PermissionsWithOwner = "ADMIN"
	ANALYST PermissionsWithOwner = "ANALYST"
	FINANCE_MANAGER PermissionsWithOwner = "FINANCE_MANAGER"
	AUDIENCE_MANAGER PermissionsWithOwner = "AUDIENCE_MANAGER"
	CAMPAIGN_MANAGER PermissionsWithOwner = "CAMPAIGN_MANAGER"
	CATALOGS_MANAGER PermissionsWithOwner = "CATALOGS_MANAGER"
	CATALOGS_VIEWER PermissionsWithOwner = "CATALOGS_VIEWER"
	PROFILE_PUBLISHER PermissionsWithOwner = "PROFILE_PUBLISHER"
	OWNER PermissionsWithOwner = "OWNER"
)

// AllowedPermissionsWithOwnerEnumValues is all the allowed values of PermissionsWithOwner enum
var AllowedPermissionsWithOwnerEnumValues = []PermissionsWithOwner{
	"ADMIN",
	"ANALYST",
	"FINANCE_MANAGER",
	"AUDIENCE_MANAGER",
	"CAMPAIGN_MANAGER",
	"CATALOGS_MANAGER",
	"CATALOGS_VIEWER",
	"PROFILE_PUBLISHER",
	"OWNER",
}

// validPermissionsWithOwnerEnumValue provides a map of PermissionsWithOwners for fast verification of use input
var validPermissionsWithOwnerEnumValues = map[PermissionsWithOwner]struct{}{
	"ADMIN": {},
	"ANALYST": {},
	"FINANCE_MANAGER": {},
	"AUDIENCE_MANAGER": {},
	"CAMPAIGN_MANAGER": {},
	"CATALOGS_MANAGER": {},
	"CATALOGS_VIEWER": {},
	"PROFILE_PUBLISHER": {},
	"OWNER": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v PermissionsWithOwner) IsValid() bool {
	_, ok := validPermissionsWithOwnerEnumValues[v]
	return ok
}

// NewPermissionsWithOwnerFromValue returns a pointer to a valid PermissionsWithOwner
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewPermissionsWithOwnerFromValue(v string) (PermissionsWithOwner, error) {
	ev := PermissionsWithOwner(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for PermissionsWithOwner: valid values are %v", v, AllowedPermissionsWithOwnerEnumValues)
}



// AssertPermissionsWithOwnerRequired checks if the required fields are not zero-ed
func AssertPermissionsWithOwnerRequired(obj PermissionsWithOwner) error {
	return nil
}

// AssertPermissionsWithOwnerConstraints checks if the values respects the defined constraints
func AssertPermissionsWithOwnerConstraints(obj PermissionsWithOwner) error {
	return nil
}
