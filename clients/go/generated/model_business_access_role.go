/*
Pinterest REST API

Pinterest's REST API

API version: 5.14.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// BusinessAccessRole Permission role for business access.
type BusinessAccessRole string

// List of BusinessAccessRole
const (
	OWNER BusinessAccessRole = "OWNER"
	ADMIN BusinessAccessRole = "ADMIN"
	ANALYST BusinessAccessRole = "ANALYST"
	SOS_READER BusinessAccessRole = "SOS_READER"
	FINANCE_MANAGER BusinessAccessRole = "FINANCE_MANAGER"
	AUDIENCE_MANAGER BusinessAccessRole = "AUDIENCE_MANAGER"
	CAMPAIGN_MANAGER BusinessAccessRole = "CAMPAIGN_MANAGER"
	CATALOGS_MANAGER BusinessAccessRole = "CATALOGS_MANAGER"
	RESTRICTED_OWNER BusinessAccessRole = "RESTRICTED_OWNER"
	PROFILE_MANAGER BusinessAccessRole = "PROFILE_MANAGER"
	PROFILE_PUBLISHER BusinessAccessRole = "PROFILE_PUBLISHER"
	RESOURCE_PINNER_LIST_OWNER BusinessAccessRole = "RESOURCE_PINNER_LIST_OWNER"
	RESOURCE_PINNER_LIST_READER BusinessAccessRole = "RESOURCE_PINNER_LIST_READER"
	BIZ_PINNER_LIST_SHARER BusinessAccessRole = "BIZ_PINNER_LIST_SHARER"
	RESOURCE_CONVERSION_TAGS_READER BusinessAccessRole = "RESOURCE_CONVERSION_TAGS_READER"
)

// All allowed values of BusinessAccessRole enum
var AllowedBusinessAccessRoleEnumValues = []BusinessAccessRole{
	"OWNER",
	"ADMIN",
	"ANALYST",
	"SOS_READER",
	"FINANCE_MANAGER",
	"AUDIENCE_MANAGER",
	"CAMPAIGN_MANAGER",
	"CATALOGS_MANAGER",
	"RESTRICTED_OWNER",
	"PROFILE_MANAGER",
	"PROFILE_PUBLISHER",
	"RESOURCE_PINNER_LIST_OWNER",
	"RESOURCE_PINNER_LIST_READER",
	"BIZ_PINNER_LIST_SHARER",
	"RESOURCE_CONVERSION_TAGS_READER",
}

func (v *BusinessAccessRole) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := BusinessAccessRole(value)
	for _, existing := range AllowedBusinessAccessRoleEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid BusinessAccessRole", value)
}

// NewBusinessAccessRoleFromValue returns a pointer to a valid BusinessAccessRole
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewBusinessAccessRoleFromValue(v string) (*BusinessAccessRole, error) {
	ev := BusinessAccessRole(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for BusinessAccessRole: valid values are %v", v, AllowedBusinessAccessRoleEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v BusinessAccessRole) IsValid() bool {
	for _, existing := range AllowedBusinessAccessRoleEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to BusinessAccessRole value
func (v BusinessAccessRole) Ptr() *BusinessAccessRole {
	return &v
}

type NullableBusinessAccessRole struct {
	value *BusinessAccessRole
	isSet bool
}

func (v NullableBusinessAccessRole) Get() *BusinessAccessRole {
	return v.value
}

func (v *NullableBusinessAccessRole) Set(val *BusinessAccessRole) {
	v.value = val
	v.isSet = true
}

func (v NullableBusinessAccessRole) IsSet() bool {
	return v.isSet
}

func (v *NullableBusinessAccessRole) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBusinessAccessRole(val *BusinessAccessRole) *NullableBusinessAccessRole {
	return &NullableBusinessAccessRole{value: val, isSet: true}
}

func (v NullableBusinessAccessRole) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBusinessAccessRole) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

