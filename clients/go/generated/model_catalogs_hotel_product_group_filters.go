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


// CatalogsHotelProductGroupFilters Object holding a group of filters for a hotel product group
type CatalogsHotelProductGroupFilters struct {
	CatalogsHotelProductGroupFiltersAllOf *CatalogsHotelProductGroupFiltersAllOf
	CatalogsHotelProductGroupFiltersAnyOf *CatalogsHotelProductGroupFiltersAnyOf
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *CatalogsHotelProductGroupFilters) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into CatalogsHotelProductGroupFiltersAllOf
	err = json.Unmarshal(data, &dst.CatalogsHotelProductGroupFiltersAllOf);
	if err == nil {
		jsonCatalogsHotelProductGroupFiltersAllOf, _ := json.Marshal(dst.CatalogsHotelProductGroupFiltersAllOf)
		if string(jsonCatalogsHotelProductGroupFiltersAllOf) == "{}" { // empty struct
			dst.CatalogsHotelProductGroupFiltersAllOf = nil
		} else {
			return nil // data stored in dst.CatalogsHotelProductGroupFiltersAllOf, return on the first match
		}
	} else {
		dst.CatalogsHotelProductGroupFiltersAllOf = nil
	}

	// try to unmarshal JSON data into CatalogsHotelProductGroupFiltersAnyOf
	err = json.Unmarshal(data, &dst.CatalogsHotelProductGroupFiltersAnyOf);
	if err == nil {
		jsonCatalogsHotelProductGroupFiltersAnyOf, _ := json.Marshal(dst.CatalogsHotelProductGroupFiltersAnyOf)
		if string(jsonCatalogsHotelProductGroupFiltersAnyOf) == "{}" { // empty struct
			dst.CatalogsHotelProductGroupFiltersAnyOf = nil
		} else {
			return nil // data stored in dst.CatalogsHotelProductGroupFiltersAnyOf, return on the first match
		}
	} else {
		dst.CatalogsHotelProductGroupFiltersAnyOf = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(CatalogsHotelProductGroupFilters)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *CatalogsHotelProductGroupFilters) MarshalJSON() ([]byte, error) {
	if src.CatalogsHotelProductGroupFiltersAllOf != nil {
		return json.Marshal(&src.CatalogsHotelProductGroupFiltersAllOf)
	}

	if src.CatalogsHotelProductGroupFiltersAnyOf != nil {
		return json.Marshal(&src.CatalogsHotelProductGroupFiltersAnyOf)
	}

	return nil, nil // no data in anyOf schemas
}


type NullableCatalogsHotelProductGroupFilters struct {
	value *CatalogsHotelProductGroupFilters
	isSet bool
}

func (v NullableCatalogsHotelProductGroupFilters) Get() *CatalogsHotelProductGroupFilters {
	return v.value
}

func (v *NullableCatalogsHotelProductGroupFilters) Set(val *CatalogsHotelProductGroupFilters) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsHotelProductGroupFilters) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsHotelProductGroupFilters) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsHotelProductGroupFilters(val *CatalogsHotelProductGroupFilters) *NullableCatalogsHotelProductGroupFilters {
	return &NullableCatalogsHotelProductGroupFilters{value: val, isSet: true}
}

func (v NullableCatalogsHotelProductGroupFilters) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsHotelProductGroupFilters) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


