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

// LeadFormQuestionFieldType Lead form question field type
type LeadFormQuestionFieldType string

// List of LeadFormQuestionFieldType
const (
	TEXT_FIELD LeadFormQuestionFieldType = "TEXT_FIELD"
	TEXT_AREA LeadFormQuestionFieldType = "TEXT_AREA"
	RADIO_LIST LeadFormQuestionFieldType = "RADIO_LIST"
	CHECKBOX LeadFormQuestionFieldType = "CHECKBOX"
)

// All allowed values of LeadFormQuestionFieldType enum
var AllowedLeadFormQuestionFieldTypeEnumValues = []LeadFormQuestionFieldType{
	"TEXT_FIELD",
	"TEXT_AREA",
	"RADIO_LIST",
	"CHECKBOX",
}

func (v *LeadFormQuestionFieldType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := LeadFormQuestionFieldType(value)
	for _, existing := range AllowedLeadFormQuestionFieldTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid LeadFormQuestionFieldType", value)
}

// NewLeadFormQuestionFieldTypeFromValue returns a pointer to a valid LeadFormQuestionFieldType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewLeadFormQuestionFieldTypeFromValue(v string) (*LeadFormQuestionFieldType, error) {
	ev := LeadFormQuestionFieldType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for LeadFormQuestionFieldType: valid values are %v", v, AllowedLeadFormQuestionFieldTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v LeadFormQuestionFieldType) IsValid() bool {
	for _, existing := range AllowedLeadFormQuestionFieldTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to LeadFormQuestionFieldType value
func (v LeadFormQuestionFieldType) Ptr() *LeadFormQuestionFieldType {
	return &v
}

type NullableLeadFormQuestionFieldType struct {
	value *LeadFormQuestionFieldType
	isSet bool
}

func (v NullableLeadFormQuestionFieldType) Get() *LeadFormQuestionFieldType {
	return v.value
}

func (v *NullableLeadFormQuestionFieldType) Set(val *LeadFormQuestionFieldType) {
	v.value = val
	v.isSet = true
}

func (v NullableLeadFormQuestionFieldType) IsSet() bool {
	return v.isSet
}

func (v *NullableLeadFormQuestionFieldType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLeadFormQuestionFieldType(val *LeadFormQuestionFieldType) *NullableLeadFormQuestionFieldType {
	return &NullableLeadFormQuestionFieldType{value: val, isSet: true}
}

func (v NullableLeadFormQuestionFieldType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLeadFormQuestionFieldType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

