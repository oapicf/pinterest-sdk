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
	"gopkg.in/validator.v2"
	"fmt"
)

// CatalogsHotelReportParametersReport - struct for CatalogsHotelReportParametersReport
type CatalogsHotelReportParametersReport struct {
	CatalogsReportDistributionIssueFilter *CatalogsReportDistributionIssueFilter
	CatalogsReportFeedIngestionFilter *CatalogsReportFeedIngestionFilter
}

// CatalogsReportDistributionIssueFilterAsCatalogsHotelReportParametersReport is a convenience function that returns CatalogsReportDistributionIssueFilter wrapped in CatalogsHotelReportParametersReport
func CatalogsReportDistributionIssueFilterAsCatalogsHotelReportParametersReport(v *CatalogsReportDistributionIssueFilter) CatalogsHotelReportParametersReport {
	return CatalogsHotelReportParametersReport{
		CatalogsReportDistributionIssueFilter: v,
	}
}

// CatalogsReportFeedIngestionFilterAsCatalogsHotelReportParametersReport is a convenience function that returns CatalogsReportFeedIngestionFilter wrapped in CatalogsHotelReportParametersReport
func CatalogsReportFeedIngestionFilterAsCatalogsHotelReportParametersReport(v *CatalogsReportFeedIngestionFilter) CatalogsHotelReportParametersReport {
	return CatalogsHotelReportParametersReport{
		CatalogsReportFeedIngestionFilter: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CatalogsHotelReportParametersReport) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into CatalogsReportDistributionIssueFilter
	err = newStrictDecoder(data).Decode(&dst.CatalogsReportDistributionIssueFilter)
	if err == nil {
		jsonCatalogsReportDistributionIssueFilter, _ := json.Marshal(dst.CatalogsReportDistributionIssueFilter)
		if string(jsonCatalogsReportDistributionIssueFilter) == "{}" { // empty struct
			dst.CatalogsReportDistributionIssueFilter = nil
		} else {
			if err = validator.Validate(dst.CatalogsReportDistributionIssueFilter); err != nil {
				dst.CatalogsReportDistributionIssueFilter = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsReportDistributionIssueFilter = nil
	}

	// try to unmarshal data into CatalogsReportFeedIngestionFilter
	err = newStrictDecoder(data).Decode(&dst.CatalogsReportFeedIngestionFilter)
	if err == nil {
		jsonCatalogsReportFeedIngestionFilter, _ := json.Marshal(dst.CatalogsReportFeedIngestionFilter)
		if string(jsonCatalogsReportFeedIngestionFilter) == "{}" { // empty struct
			dst.CatalogsReportFeedIngestionFilter = nil
		} else {
			if err = validator.Validate(dst.CatalogsReportFeedIngestionFilter); err != nil {
				dst.CatalogsReportFeedIngestionFilter = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsReportFeedIngestionFilter = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.CatalogsReportDistributionIssueFilter = nil
		dst.CatalogsReportFeedIngestionFilter = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CatalogsHotelReportParametersReport)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CatalogsHotelReportParametersReport)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CatalogsHotelReportParametersReport) MarshalJSON() ([]byte, error) {
	if src.CatalogsReportDistributionIssueFilter != nil {
		return json.Marshal(&src.CatalogsReportDistributionIssueFilter)
	}

	if src.CatalogsReportFeedIngestionFilter != nil {
		return json.Marshal(&src.CatalogsReportFeedIngestionFilter)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CatalogsHotelReportParametersReport) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.CatalogsReportDistributionIssueFilter != nil {
		return obj.CatalogsReportDistributionIssueFilter
	}

	if obj.CatalogsReportFeedIngestionFilter != nil {
		return obj.CatalogsReportFeedIngestionFilter
	}

	// all schemas are nil
	return nil
}

type NullableCatalogsHotelReportParametersReport struct {
	value *CatalogsHotelReportParametersReport
	isSet bool
}

func (v NullableCatalogsHotelReportParametersReport) Get() *CatalogsHotelReportParametersReport {
	return v.value
}

func (v *NullableCatalogsHotelReportParametersReport) Set(val *CatalogsHotelReportParametersReport) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsHotelReportParametersReport) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsHotelReportParametersReport) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsHotelReportParametersReport(val *CatalogsHotelReportParametersReport) *NullableCatalogsHotelReportParametersReport {
	return &NullableCatalogsHotelReportParametersReport{value: val, isSet: true}
}

func (v NullableCatalogsHotelReportParametersReport) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsHotelReportParametersReport) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


