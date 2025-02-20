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


// CatalogsProductGroupFiltersRequest Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
type CatalogsProductGroupFiltersRequest struct {
	CatalogsProductGroupFiltersRequestAnyOf *CatalogsProductGroupFiltersRequestAnyOf
	CatalogsProductGroupFiltersRequestAnyOf1 *CatalogsProductGroupFiltersRequestAnyOf1
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *CatalogsProductGroupFiltersRequest) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into CatalogsProductGroupFiltersRequestAnyOf
	err = json.Unmarshal(data, &dst.CatalogsProductGroupFiltersRequestAnyOf);
	if err == nil {
		jsonCatalogsProductGroupFiltersRequestAnyOf, _ := json.Marshal(dst.CatalogsProductGroupFiltersRequestAnyOf)
		if string(jsonCatalogsProductGroupFiltersRequestAnyOf) == "{}" { // empty struct
			dst.CatalogsProductGroupFiltersRequestAnyOf = nil
		} else {
			return nil // data stored in dst.CatalogsProductGroupFiltersRequestAnyOf, return on the first match
		}
	} else {
		dst.CatalogsProductGroupFiltersRequestAnyOf = nil
	}

	// try to unmarshal JSON data into CatalogsProductGroupFiltersRequestAnyOf1
	err = json.Unmarshal(data, &dst.CatalogsProductGroupFiltersRequestAnyOf1);
	if err == nil {
		jsonCatalogsProductGroupFiltersRequestAnyOf1, _ := json.Marshal(dst.CatalogsProductGroupFiltersRequestAnyOf1)
		if string(jsonCatalogsProductGroupFiltersRequestAnyOf1) == "{}" { // empty struct
			dst.CatalogsProductGroupFiltersRequestAnyOf1 = nil
		} else {
			return nil // data stored in dst.CatalogsProductGroupFiltersRequestAnyOf1, return on the first match
		}
	} else {
		dst.CatalogsProductGroupFiltersRequestAnyOf1 = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(CatalogsProductGroupFiltersRequest)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *CatalogsProductGroupFiltersRequest) MarshalJSON() ([]byte, error) {
	if src.CatalogsProductGroupFiltersRequestAnyOf != nil {
		return json.Marshal(&src.CatalogsProductGroupFiltersRequestAnyOf)
	}

	if src.CatalogsProductGroupFiltersRequestAnyOf1 != nil {
		return json.Marshal(&src.CatalogsProductGroupFiltersRequestAnyOf1)
	}

	return nil, nil // no data in anyOf schemas
}


type NullableCatalogsProductGroupFiltersRequest struct {
	value *CatalogsProductGroupFiltersRequest
	isSet bool
}

func (v NullableCatalogsProductGroupFiltersRequest) Get() *CatalogsProductGroupFiltersRequest {
	return v.value
}

func (v *NullableCatalogsProductGroupFiltersRequest) Set(val *CatalogsProductGroupFiltersRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsProductGroupFiltersRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsProductGroupFiltersRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsProductGroupFiltersRequest(val *CatalogsProductGroupFiltersRequest) *NullableCatalogsProductGroupFiltersRequest {
	return &NullableCatalogsProductGroupFiltersRequest{value: val, isSet: true}
}

func (v NullableCatalogsProductGroupFiltersRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsProductGroupFiltersRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


