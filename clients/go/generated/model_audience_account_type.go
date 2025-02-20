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

// AudienceAccountType the model 'AudienceAccountType'
type AudienceAccountType string

// List of AudienceAccountType
const (
	AD_ACCOUNT AudienceAccountType = "AD_ACCOUNT"
	BUSINESS_ACCOUNT AudienceAccountType = "BUSINESS_ACCOUNT"
)

// All allowed values of AudienceAccountType enum
var AllowedAudienceAccountTypeEnumValues = []AudienceAccountType{
	"AD_ACCOUNT",
	"BUSINESS_ACCOUNT",
}

func (v *AudienceAccountType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := AudienceAccountType(value)
	for _, existing := range AllowedAudienceAccountTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid AudienceAccountType", value)
}

// NewAudienceAccountTypeFromValue returns a pointer to a valid AudienceAccountType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAudienceAccountTypeFromValue(v string) (*AudienceAccountType, error) {
	ev := AudienceAccountType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for AudienceAccountType: valid values are %v", v, AllowedAudienceAccountTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AudienceAccountType) IsValid() bool {
	for _, existing := range AllowedAudienceAccountTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to AudienceAccountType value
func (v AudienceAccountType) Ptr() *AudienceAccountType {
	return &v
}

type NullableAudienceAccountType struct {
	value *AudienceAccountType
	isSet bool
}

func (v NullableAudienceAccountType) Get() *AudienceAccountType {
	return v.value
}

func (v *NullableAudienceAccountType) Set(val *AudienceAccountType) {
	v.value = val
	v.isSet = true
}

func (v NullableAudienceAccountType) IsSet() bool {
	return v.isSet
}

func (v *NullableAudienceAccountType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAudienceAccountType(val *AudienceAccountType) *NullableAudienceAccountType {
	return &NullableAudienceAccountType{value: val, isSet: true}
}

func (v NullableAudienceAccountType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAudienceAccountType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

