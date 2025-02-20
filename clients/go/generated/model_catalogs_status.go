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

// CatalogsStatus Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
type CatalogsStatus string

// List of CatalogsStatus
const (
	ACTIVE CatalogsStatus = "ACTIVE"
	INACTIVE CatalogsStatus = "INACTIVE"
)

// All allowed values of CatalogsStatus enum
var AllowedCatalogsStatusEnumValues = []CatalogsStatus{
	"ACTIVE",
	"INACTIVE",
}

func (v *CatalogsStatus) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := CatalogsStatus(value)
	for _, existing := range AllowedCatalogsStatusEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid CatalogsStatus", value)
}

// NewCatalogsStatusFromValue returns a pointer to a valid CatalogsStatus
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewCatalogsStatusFromValue(v string) (*CatalogsStatus, error) {
	ev := CatalogsStatus(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for CatalogsStatus: valid values are %v", v, AllowedCatalogsStatusEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v CatalogsStatus) IsValid() bool {
	for _, existing := range AllowedCatalogsStatusEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to CatalogsStatus value
func (v CatalogsStatus) Ptr() *CatalogsStatus {
	return &v
}

type NullableCatalogsStatus struct {
	value *CatalogsStatus
	isSet bool
}

func (v NullableCatalogsStatus) Get() *CatalogsStatus {
	return v.value
}

func (v *NullableCatalogsStatus) Set(val *CatalogsStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsStatus(val *CatalogsStatus) *NullableCatalogsStatus {
	return &NullableCatalogsStatus{value: val, isSet: true}
}

func (v NullableCatalogsStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

