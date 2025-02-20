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

// AdsAnalyticsTargetingType Reporting targeting type
type AdsAnalyticsTargetingType string

// List of AdsAnalyticsTargetingType
const (
	KEYWORD AdsAnalyticsTargetingType = "KEYWORD"
	APPTYPE AdsAnalyticsTargetingType = "APPTYPE"
	GENDER AdsAnalyticsTargetingType = "GENDER"
	LOCATION AdsAnalyticsTargetingType = "LOCATION"
	PLACEMENT AdsAnalyticsTargetingType = "PLACEMENT"
	COUNTRY AdsAnalyticsTargetingType = "COUNTRY"
	TARGETED_INTEREST AdsAnalyticsTargetingType = "TARGETED_INTEREST"
	PINNER_INTEREST AdsAnalyticsTargetingType = "PINNER_INTEREST"
	AUDIENCE_INCLUDE AdsAnalyticsTargetingType = "AUDIENCE_INCLUDE"
	GEO AdsAnalyticsTargetingType = "GEO"
	AGE_BUCKET AdsAnalyticsTargetingType = "AGE_BUCKET"
	REGION AdsAnalyticsTargetingType = "REGION"
	AGE_BUCKET_AND_GENDER AdsAnalyticsTargetingType = "AGE_BUCKET_AND_GENDER"
)

// All allowed values of AdsAnalyticsTargetingType enum
var AllowedAdsAnalyticsTargetingTypeEnumValues = []AdsAnalyticsTargetingType{
	"KEYWORD",
	"APPTYPE",
	"GENDER",
	"LOCATION",
	"PLACEMENT",
	"COUNTRY",
	"TARGETED_INTEREST",
	"PINNER_INTEREST",
	"AUDIENCE_INCLUDE",
	"GEO",
	"AGE_BUCKET",
	"REGION",
	"AGE_BUCKET_AND_GENDER",
}

func (v *AdsAnalyticsTargetingType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := AdsAnalyticsTargetingType(value)
	for _, existing := range AllowedAdsAnalyticsTargetingTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid AdsAnalyticsTargetingType", value)
}

// NewAdsAnalyticsTargetingTypeFromValue returns a pointer to a valid AdsAnalyticsTargetingType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewAdsAnalyticsTargetingTypeFromValue(v string) (*AdsAnalyticsTargetingType, error) {
	ev := AdsAnalyticsTargetingType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for AdsAnalyticsTargetingType: valid values are %v", v, AllowedAdsAnalyticsTargetingTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v AdsAnalyticsTargetingType) IsValid() bool {
	for _, existing := range AllowedAdsAnalyticsTargetingTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to AdsAnalyticsTargetingType value
func (v AdsAnalyticsTargetingType) Ptr() *AdsAnalyticsTargetingType {
	return &v
}

type NullableAdsAnalyticsTargetingType struct {
	value *AdsAnalyticsTargetingType
	isSet bool
}

func (v NullableAdsAnalyticsTargetingType) Get() *AdsAnalyticsTargetingType {
	return v.value
}

func (v *NullableAdsAnalyticsTargetingType) Set(val *AdsAnalyticsTargetingType) {
	v.value = val
	v.isSet = true
}

func (v NullableAdsAnalyticsTargetingType) IsSet() bool {
	return v.isSet
}

func (v *NullableAdsAnalyticsTargetingType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdsAnalyticsTargetingType(val *AdsAnalyticsTargetingType) *NullableAdsAnalyticsTargetingType {
	return &NullableAdsAnalyticsTargetingType{value: val, isSet: true}
}

func (v NullableAdsAnalyticsTargetingType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdsAnalyticsTargetingType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

