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


// EntityStatus : Entity status
type EntityStatus string

// List of EntityStatus
const (
	ACTIVE EntityStatus = "ACTIVE"
	PAUSED EntityStatus = "PAUSED"
	ARCHIVED EntityStatus = "ARCHIVED"
	DRAFT EntityStatus = "DRAFT"
	DELETED_DRAFT EntityStatus = "DELETED_DRAFT"
)

// AllowedEntityStatusEnumValues is all the allowed values of EntityStatus enum
var AllowedEntityStatusEnumValues = []EntityStatus{
	"ACTIVE",
	"PAUSED",
	"ARCHIVED",
	"DRAFT",
	"DELETED_DRAFT",
}

// validEntityStatusEnumValue provides a map of EntityStatuss for fast verification of use input
var validEntityStatusEnumValues = map[EntityStatus]struct{}{
	"ACTIVE": {},
	"PAUSED": {},
	"ARCHIVED": {},
	"DRAFT": {},
	"DELETED_DRAFT": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v EntityStatus) IsValid() bool {
	_, ok := validEntityStatusEnumValues[v]
	return ok
}

// NewEntityStatusFromValue returns a pointer to a valid EntityStatus
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewEntityStatusFromValue(v string) (EntityStatus, error) {
	ev := EntityStatus(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for EntityStatus: valid values are %v", v, AllowedEntityStatusEnumValues)
}



// AssertEntityStatusRequired checks if the required fields are not zero-ed
func AssertEntityStatusRequired(obj EntityStatus) error {
	return nil
}

// AssertEntityStatusConstraints checks if the values respects the defined constraints
func AssertEntityStatusConstraints(obj EntityStatus) error {
	return nil
}
