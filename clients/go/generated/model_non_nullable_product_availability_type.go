/*
Pinterest REST API

Pinterest's REST API

API version: 5.12.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// NonNullableProductAvailabilityType Product availability.
type NonNullableProductAvailabilityType string

// List of NonNullableProductAvailabilityType
const (
	IN_STOCK NonNullableProductAvailabilityType = "IN_STOCK"
	OUT_OF_STOCK NonNullableProductAvailabilityType = "OUT_OF_STOCK"
	PREORDER NonNullableProductAvailabilityType = "PREORDER"
)

// All allowed values of NonNullableProductAvailabilityType enum
var AllowedNonNullableProductAvailabilityTypeEnumValues = []NonNullableProductAvailabilityType{
	"IN_STOCK",
	"OUT_OF_STOCK",
	"PREORDER",
}

func (v *NonNullableProductAvailabilityType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := NonNullableProductAvailabilityType(value)
	for _, existing := range AllowedNonNullableProductAvailabilityTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid NonNullableProductAvailabilityType", value)
}

// NewNonNullableProductAvailabilityTypeFromValue returns a pointer to a valid NonNullableProductAvailabilityType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewNonNullableProductAvailabilityTypeFromValue(v string) (*NonNullableProductAvailabilityType, error) {
	ev := NonNullableProductAvailabilityType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for NonNullableProductAvailabilityType: valid values are %v", v, AllowedNonNullableProductAvailabilityTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v NonNullableProductAvailabilityType) IsValid() bool {
	for _, existing := range AllowedNonNullableProductAvailabilityTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to NonNullableProductAvailabilityType value
func (v NonNullableProductAvailabilityType) Ptr() *NonNullableProductAvailabilityType {
	return &v
}

type NullableNonNullableProductAvailabilityType struct {
	value *NonNullableProductAvailabilityType
	isSet bool
}

func (v NullableNonNullableProductAvailabilityType) Get() *NonNullableProductAvailabilityType {
	return v.value
}

func (v *NullableNonNullableProductAvailabilityType) Set(val *NonNullableProductAvailabilityType) {
	v.value = val
	v.isSet = true
}

func (v NullableNonNullableProductAvailabilityType) IsSet() bool {
	return v.isSet
}

func (v *NullableNonNullableProductAvailabilityType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNonNullableProductAvailabilityType(val *NonNullableProductAvailabilityType) *NullableNonNullableProductAvailabilityType {
	return &NullableNonNullableProductAvailabilityType{value: val, isSet: true}
}

func (v NullableNonNullableProductAvailabilityType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNonNullableProductAvailabilityType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
