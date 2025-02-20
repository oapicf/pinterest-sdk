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

// MMMReportingColumn Marketing Mix Modeling (MMM) Reporting Columns
type MMMReportingColumn string

// List of MMMReportingColumn
const (
	SPEND_IN_DOLLAR MMMReportingColumn = "SPEND_IN_DOLLAR"
	SPEND_IN_MICRO_DOLLAR MMMReportingColumn = "SPEND_IN_MICRO_DOLLAR"
	ECPC_IN_DOLLAR MMMReportingColumn = "ECPC_IN_DOLLAR"
	ECTR MMMReportingColumn = "ECTR"
	CAMPAIGN_NAME MMMReportingColumn = "CAMPAIGN_NAME"
	TOTAL_ENGAGEMENT MMMReportingColumn = "TOTAL_ENGAGEMENT"
	EENGAGEMENT_RATE MMMReportingColumn = "EENGAGEMENT_RATE"
	ECPM_IN_DOLLAR MMMReportingColumn = "ECPM_IN_DOLLAR"
	CAMPAIGN_ID MMMReportingColumn = "CAMPAIGN_ID"
	ADVERTISER_ID MMMReportingColumn = "ADVERTISER_ID"
	AD_GROUP_ID MMMReportingColumn = "AD_GROUP_ID"
	AD_GROUP_NAME MMMReportingColumn = "AD_GROUP_NAME"
	CLICKTHROUGH_1 MMMReportingColumn = "CLICKTHROUGH_1"
	IMPRESSION_1 MMMReportingColumn = "IMPRESSION_1"
	CLICKTHROUGH_2 MMMReportingColumn = "CLICKTHROUGH_2"
	IMPRESSION_2 MMMReportingColumn = "IMPRESSION_2"
	TOTAL_CLICKTHROUGH MMMReportingColumn = "TOTAL_CLICKTHROUGH"
	TOTAL_IMPRESSION MMMReportingColumn = "TOTAL_IMPRESSION"
	ADVERTISER_NAME MMMReportingColumn = "ADVERTISER_NAME"
	SPEND_ORDER_LINE_PAID_TYPE MMMReportingColumn = "SPEND_ORDER_LINE_PAID_TYPE"
)

// All allowed values of MMMReportingColumn enum
var AllowedMMMReportingColumnEnumValues = []MMMReportingColumn{
	"SPEND_IN_DOLLAR",
	"SPEND_IN_MICRO_DOLLAR",
	"ECPC_IN_DOLLAR",
	"ECTR",
	"CAMPAIGN_NAME",
	"TOTAL_ENGAGEMENT",
	"EENGAGEMENT_RATE",
	"ECPM_IN_DOLLAR",
	"CAMPAIGN_ID",
	"ADVERTISER_ID",
	"AD_GROUP_ID",
	"AD_GROUP_NAME",
	"CLICKTHROUGH_1",
	"IMPRESSION_1",
	"CLICKTHROUGH_2",
	"IMPRESSION_2",
	"TOTAL_CLICKTHROUGH",
	"TOTAL_IMPRESSION",
	"ADVERTISER_NAME",
	"SPEND_ORDER_LINE_PAID_TYPE",
}

func (v *MMMReportingColumn) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := MMMReportingColumn(value)
	for _, existing := range AllowedMMMReportingColumnEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid MMMReportingColumn", value)
}

// NewMMMReportingColumnFromValue returns a pointer to a valid MMMReportingColumn
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewMMMReportingColumnFromValue(v string) (*MMMReportingColumn, error) {
	ev := MMMReportingColumn(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for MMMReportingColumn: valid values are %v", v, AllowedMMMReportingColumnEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v MMMReportingColumn) IsValid() bool {
	for _, existing := range AllowedMMMReportingColumnEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to MMMReportingColumn value
func (v MMMReportingColumn) Ptr() *MMMReportingColumn {
	return &v
}

type NullableMMMReportingColumn struct {
	value *MMMReportingColumn
	isSet bool
}

func (v NullableMMMReportingColumn) Get() *MMMReportingColumn {
	return v.value
}

func (v *NullableMMMReportingColumn) Set(val *MMMReportingColumn) {
	v.value = val
	v.isSet = true
}

func (v NullableMMMReportingColumn) IsSet() bool {
	return v.isSet
}

func (v *NullableMMMReportingColumn) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMMMReportingColumn(val *MMMReportingColumn) *NullableMMMReportingColumn {
	return &NullableMMMReportingColumn{value: val, isSet: true}
}

func (v NullableMMMReportingColumn) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMMMReportingColumn) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

