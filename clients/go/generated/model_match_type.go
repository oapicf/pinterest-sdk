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

// MatchType Keyword match type
type MatchType string

// List of MatchType
const (
	BROAD MatchType = "BROAD"
	PHRASE MatchType = "PHRASE"
	EXACT MatchType = "EXACT"
	EXACT_NEGATIVE MatchType = "EXACT_NEGATIVE"
	PHRASE_NEGATIVE MatchType = "PHRASE_NEGATIVE"
)

// All allowed values of MatchType enum
var AllowedMatchTypeEnumValues = []MatchType{
	"BROAD",
	"PHRASE",
	"EXACT",
	"EXACT_NEGATIVE",
	"PHRASE_NEGATIVE",
}

func (v *MatchType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := MatchType(value)
	for _, existing := range AllowedMatchTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid MatchType", value)
}

// NewMatchTypeFromValue returns a pointer to a valid MatchType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewMatchTypeFromValue(v string) (*MatchType, error) {
	ev := MatchType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for MatchType: valid values are %v", v, AllowedMatchTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v MatchType) IsValid() bool {
	for _, existing := range AllowedMatchTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to MatchType value
func (v MatchType) Ptr() *MatchType {
	return &v
}

type NullableMatchType struct {
	value *MatchType
	isSet bool
}

func (v NullableMatchType) Get() *MatchType {
	return v.value
}

func (v *NullableMatchType) Set(val *MatchType) {
	v.value = val
	v.isSet = true
}

func (v NullableMatchType) IsSet() bool {
	return v.isSet
}

func (v *NullableMatchType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMatchType(val *MatchType) *NullableMatchType {
	return &NullableMatchType{value: val, isSet: true}
}

func (v NullableMatchType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMatchType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

