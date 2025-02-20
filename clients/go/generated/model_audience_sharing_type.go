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

// AudienceSharingType Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"]
type AudienceSharingType string

// List of AudienceSharingType
const (
	CUSTOM AudienceSharingType = "CUSTOM"
	SYNDICATED AudienceSharingType = "SYNDICATED"
)

// All allowed values of AudienceSharingType enum
var AllowedAudienceSharingTypeEnumValues = []AudienceSharingType{
	"CUSTOM",
	"SYNDICATED",
}

func (v *AudienceSharingType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := AudienceSharingType(value)
	for _, existing := range AllowedAudienceSharingTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid AudienceSharingType", value)
}

// NewAudienceSharingTypeFromValue returns a pointer to a valid AudienceSharingType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAudienceSharingTypeFromValue(v string) (*AudienceSharingType, error) {
	ev := AudienceSharingType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for AudienceSharingType: valid values are %v", v, AllowedAudienceSharingTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AudienceSharingType) IsValid() bool {
	for _, existing := range AllowedAudienceSharingTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to AudienceSharingType value
func (v AudienceSharingType) Ptr() *AudienceSharingType {
	return &v
}

type NullableAudienceSharingType struct {
	value *AudienceSharingType
	isSet bool
}

func (v NullableAudienceSharingType) Get() *AudienceSharingType {
	return v.value
}

func (v *NullableAudienceSharingType) Set(val *AudienceSharingType) {
	v.value = val
	v.isSet = true
}

func (v NullableAudienceSharingType) IsSet() bool {
	return v.isSet
}

func (v *NullableAudienceSharingType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAudienceSharingType(val *AudienceSharingType) *NullableAudienceSharingType {
	return &NullableAudienceSharingType{value: val, isSet: true}
}

func (v NullableAudienceSharingType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAudienceSharingType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

