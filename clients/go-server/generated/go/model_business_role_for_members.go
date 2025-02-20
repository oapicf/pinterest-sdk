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


// BusinessRoleForMembers : The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
type BusinessRoleForMembers string

// List of BusinessRoleForMembers
const (
	EMPLOYEE BusinessRoleForMembers = "EMPLOYEE"
	BIZ_ADMIN BusinessRoleForMembers = "BIZ_ADMIN"
)

// AllowedBusinessRoleForMembersEnumValues is all the allowed values of BusinessRoleForMembers enum
var AllowedBusinessRoleForMembersEnumValues = []BusinessRoleForMembers{
	"EMPLOYEE",
	"BIZ_ADMIN",
}

// validBusinessRoleForMembersEnumValue provides a map of BusinessRoleForMemberss for fast verification of use input
var validBusinessRoleForMembersEnumValues = map[BusinessRoleForMembers]struct{}{
	"EMPLOYEE": {},
	"BIZ_ADMIN": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v BusinessRoleForMembers) IsValid() bool {
	_, ok := validBusinessRoleForMembersEnumValues[v]
	return ok
}

// NewBusinessRoleForMembersFromValue returns a pointer to a valid BusinessRoleForMembers
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewBusinessRoleForMembersFromValue(v string) (BusinessRoleForMembers, error) {
	ev := BusinessRoleForMembers(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for BusinessRoleForMembers: valid values are %v", v, AllowedBusinessRoleForMembersEnumValues)
}



// AssertBusinessRoleForMembersRequired checks if the required fields are not zero-ed
func AssertBusinessRoleForMembersRequired(obj BusinessRoleForMembers) error {
	return nil
}

// AssertBusinessRoleForMembersConstraints checks if the values respects the defined constraints
func AssertBusinessRoleForMembersConstraints(obj BusinessRoleForMembers) error {
	return nil
}
