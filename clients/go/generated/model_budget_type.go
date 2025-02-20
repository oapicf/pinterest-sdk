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

// BudgetType Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \"CBO_ADGROUP\" is allowed. For WEB_SESSIONS campaigns, only \"LIFETIME\" is allowed. For update, only draft ad groups may update budget type.
type BudgetType string

// List of BudgetType
const (
	DAILY BudgetType = "DAILY"
	LIFETIME BudgetType = "LIFETIME"
	CBO_ADGROUP BudgetType = "CBO_ADGROUP"
)

// All allowed values of BudgetType enum
var AllowedBudgetTypeEnumValues = []BudgetType{
	"DAILY",
	"LIFETIME",
	"CBO_ADGROUP",
}

func (v *BudgetType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := BudgetType(value)
	for _, existing := range AllowedBudgetTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid BudgetType", value)
}

// NewBudgetTypeFromValue returns a pointer to a valid BudgetType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewBudgetTypeFromValue(v string) (*BudgetType, error) {
	ev := BudgetType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for BudgetType: valid values are %v", v, AllowedBudgetTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v BudgetType) IsValid() bool {
	for _, existing := range AllowedBudgetTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to BudgetType value
func (v BudgetType) Ptr() *BudgetType {
	return &v
}

type NullableBudgetType struct {
	value *BudgetType
	isSet bool
}

func (v NullableBudgetType) Get() *BudgetType {
	return v.value
}

func (v *NullableBudgetType) Set(val *BudgetType) {
	v.value = val
	v.isSet = true
}

func (v NullableBudgetType) IsSet() bool {
	return v.isSet
}

func (v *NullableBudgetType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBudgetType(val *BudgetType) *NullableBudgetType {
	return &NullableBudgetType{value: val, isSet: true}
}

func (v NullableBudgetType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBudgetType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

