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


// CatalogsProductGroupFilters Object holding a group of filters for a catalog product group
type CatalogsProductGroupFilters struct {
	CatalogsProductGroupFiltersAllOf *CatalogsProductGroupFiltersAllOf
	CatalogsProductGroupFiltersAnyOf *CatalogsProductGroupFiltersAnyOf
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *CatalogsProductGroupFilters) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into CatalogsProductGroupFiltersAllOf
	err = json.Unmarshal(data, &dst.CatalogsProductGroupFiltersAllOf);
	if err == nil {
		jsonCatalogsProductGroupFiltersAllOf, _ := json.Marshal(dst.CatalogsProductGroupFiltersAllOf)
		if string(jsonCatalogsProductGroupFiltersAllOf) == "{}" { // empty struct
			dst.CatalogsProductGroupFiltersAllOf = nil
		} else {
			return nil // data stored in dst.CatalogsProductGroupFiltersAllOf, return on the first match
		}
	} else {
		dst.CatalogsProductGroupFiltersAllOf = nil
	}

	// try to unmarshal JSON data into CatalogsProductGroupFiltersAnyOf
	err = json.Unmarshal(data, &dst.CatalogsProductGroupFiltersAnyOf);
	if err == nil {
		jsonCatalogsProductGroupFiltersAnyOf, _ := json.Marshal(dst.CatalogsProductGroupFiltersAnyOf)
		if string(jsonCatalogsProductGroupFiltersAnyOf) == "{}" { // empty struct
			dst.CatalogsProductGroupFiltersAnyOf = nil
		} else {
			return nil // data stored in dst.CatalogsProductGroupFiltersAnyOf, return on the first match
		}
	} else {
		dst.CatalogsProductGroupFiltersAnyOf = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(CatalogsProductGroupFilters)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *CatalogsProductGroupFilters) MarshalJSON() ([]byte, error) {
	if src.CatalogsProductGroupFiltersAllOf != nil {
		return json.Marshal(&src.CatalogsProductGroupFiltersAllOf)
	}

	if src.CatalogsProductGroupFiltersAnyOf != nil {
		return json.Marshal(&src.CatalogsProductGroupFiltersAnyOf)
	}

	return nil, nil // no data in anyOf schemas
}


type NullableCatalogsProductGroupFilters struct {
	value *CatalogsProductGroupFilters
	isSet bool
}

func (v NullableCatalogsProductGroupFilters) Get() *CatalogsProductGroupFilters {
	return v.value
}

func (v *NullableCatalogsProductGroupFilters) Set(val *CatalogsProductGroupFilters) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsProductGroupFilters) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsProductGroupFilters) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsProductGroupFilters(val *CatalogsProductGroupFilters) *NullableCatalogsProductGroupFilters {
	return &NullableCatalogsProductGroupFilters{value: val, isSet: true}
}

func (v NullableCatalogsProductGroupFilters) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsProductGroupFilters) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


