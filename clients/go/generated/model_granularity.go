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

// Granularity Granularity
type Granularity string

// List of Granularity
const (
	TOTAL Granularity = "TOTAL"
	DAY Granularity = "DAY"
	HOUR Granularity = "HOUR"
	WEEK Granularity = "WEEK"
	MONTH Granularity = "MONTH"
)

// All allowed values of Granularity enum
var AllowedGranularityEnumValues = []Granularity{
	"TOTAL",
	"DAY",
	"HOUR",
	"WEEK",
	"MONTH",
}

func (v *Granularity) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := Granularity(value)
	for _, existing := range AllowedGranularityEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid Granularity", value)
}

// NewGranularityFromValue returns a pointer to a valid Granularity
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewGranularityFromValue(v string) (*Granularity, error) {
	ev := Granularity(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for Granularity: valid values are %v", v, AllowedGranularityEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v Granularity) IsValid() bool {
	for _, existing := range AllowedGranularityEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to Granularity value
func (v Granularity) Ptr() *Granularity {
	return &v
}

type NullableGranularity struct {
	value *Granularity
	isSet bool
}

func (v NullableGranularity) Get() *Granularity {
	return v.value
}

func (v *NullableGranularity) Set(val *Granularity) {
	v.value = val
	v.isSet = true
}

func (v NullableGranularity) IsSet() bool {
	return v.isSet
}

func (v *NullableGranularity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGranularity(val *Granularity) *NullableGranularity {
	return &NullableGranularity{value: val, isSet: true}
}

func (v NullableGranularity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGranularity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
