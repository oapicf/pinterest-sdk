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

// PlacementGroupType Campaign placement group type
type PlacementGroupType string

// List of PlacementGroupType
const (
	ALL PlacementGroupType = "ALL"
	SEARCH PlacementGroupType = "SEARCH"
	BROWSE PlacementGroupType = "BROWSE"
	OTHER PlacementGroupType = "OTHER"
)

// All allowed values of PlacementGroupType enum
var AllowedPlacementGroupTypeEnumValues = []PlacementGroupType{
	"ALL",
	"SEARCH",
	"BROWSE",
	"OTHER",
}

func (v *PlacementGroupType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := PlacementGroupType(value)
	for _, existing := range AllowedPlacementGroupTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid PlacementGroupType", value)
}

// NewPlacementGroupTypeFromValue returns a pointer to a valid PlacementGroupType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewPlacementGroupTypeFromValue(v string) (*PlacementGroupType, error) {
	ev := PlacementGroupType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for PlacementGroupType: valid values are %v", v, AllowedPlacementGroupTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v PlacementGroupType) IsValid() bool {
	for _, existing := range AllowedPlacementGroupTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to PlacementGroupType value
func (v PlacementGroupType) Ptr() *PlacementGroupType {
	return &v
}

type NullablePlacementGroupType struct {
	value *PlacementGroupType
	isSet bool
}

func (v NullablePlacementGroupType) Get() *PlacementGroupType {
	return v.value
}

func (v *NullablePlacementGroupType) Set(val *PlacementGroupType) {
	v.value = val
	v.isSet = true
}

func (v NullablePlacementGroupType) IsSet() bool {
	return v.isSet
}

func (v *NullablePlacementGroupType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePlacementGroupType(val *PlacementGroupType) *NullablePlacementGroupType {
	return &NullablePlacementGroupType{value: val, isSet: true}
}

func (v NullablePlacementGroupType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePlacementGroupType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

