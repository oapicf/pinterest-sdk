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

// UserListType User list type
type UserListType string

// List of UserListType
const (
	EMAIL UserListType = "EMAIL"
	IDFA UserListType = "IDFA"
	MAID UserListType = "MAID"
	LR_ID UserListType = "LR_ID"
	DLX_ID UserListType = "DLX_ID"
	HASHED_PINNER_ID UserListType = "HASHED_PINNER_ID"
)

// All allowed values of UserListType enum
var AllowedUserListTypeEnumValues = []UserListType{
	"EMAIL",
	"IDFA",
	"MAID",
	"LR_ID",
	"DLX_ID",
	"HASHED_PINNER_ID",
}

func (v *UserListType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := UserListType(value)
	for _, existing := range AllowedUserListTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid UserListType", value)
}

// NewUserListTypeFromValue returns a pointer to a valid UserListType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewUserListTypeFromValue(v string) (*UserListType, error) {
	ev := UserListType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for UserListType: valid values are %v", v, AllowedUserListTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v UserListType) IsValid() bool {
	for _, existing := range AllowedUserListTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to UserListType value
func (v UserListType) Ptr() *UserListType {
	return &v
}

type NullableUserListType struct {
	value *UserListType
	isSet bool
}

func (v NullableUserListType) Get() *UserListType {
	return v.value
}

func (v *NullableUserListType) Set(val *UserListType) {
	v.value = val
	v.isSet = true
}

func (v NullableUserListType) IsSet() bool {
	return v.isSet
}

func (v *NullableUserListType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUserListType(val *UserListType) *NullableUserListType {
	return &NullableUserListType{value: val, isSet: true}
}

func (v NullableUserListType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUserListType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

