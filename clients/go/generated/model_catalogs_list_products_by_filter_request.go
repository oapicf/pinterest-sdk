/*
Pinterest REST API

Pinterest's REST API

API version: 5.12.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// CatalogsListProductsByFilterRequest - Request object to list products for a given product group filter.
type CatalogsListProductsByFilterRequest struct {
	CatalogsListProductsByFilterRequestOneOf *CatalogsListProductsByFilterRequestOneOf
}

// CatalogsListProductsByFilterRequestOneOfAsCatalogsListProductsByFilterRequest is a convenience function that returns CatalogsListProductsByFilterRequestOneOf wrapped in CatalogsListProductsByFilterRequest
func CatalogsListProductsByFilterRequestOneOfAsCatalogsListProductsByFilterRequest(v *CatalogsListProductsByFilterRequestOneOf) CatalogsListProductsByFilterRequest {
	return CatalogsListProductsByFilterRequest{
		CatalogsListProductsByFilterRequestOneOf: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CatalogsListProductsByFilterRequest) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into CatalogsListProductsByFilterRequestOneOf
	err = newStrictDecoder(data).Decode(&dst.CatalogsListProductsByFilterRequestOneOf)
	if err == nil {
		jsonCatalogsListProductsByFilterRequestOneOf, _ := json.Marshal(dst.CatalogsListProductsByFilterRequestOneOf)
		if string(jsonCatalogsListProductsByFilterRequestOneOf) == "{}" { // empty struct
			dst.CatalogsListProductsByFilterRequestOneOf = nil
		} else {
			match++
		}
	} else {
		dst.CatalogsListProductsByFilterRequestOneOf = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.CatalogsListProductsByFilterRequestOneOf = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CatalogsListProductsByFilterRequest)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CatalogsListProductsByFilterRequest)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CatalogsListProductsByFilterRequest) MarshalJSON() ([]byte, error) {
	if src.CatalogsListProductsByFilterRequestOneOf != nil {
		return json.Marshal(&src.CatalogsListProductsByFilterRequestOneOf)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CatalogsListProductsByFilterRequest) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.CatalogsListProductsByFilterRequestOneOf != nil {
		return obj.CatalogsListProductsByFilterRequestOneOf
	}

	// all schemas are nil
	return nil
}

type NullableCatalogsListProductsByFilterRequest struct {
	value *CatalogsListProductsByFilterRequest
	isSet bool
}

func (v NullableCatalogsListProductsByFilterRequest) Get() *CatalogsListProductsByFilterRequest {
	return v.value
}

func (v *NullableCatalogsListProductsByFilterRequest) Set(val *CatalogsListProductsByFilterRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsListProductsByFilterRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsListProductsByFilterRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsListProductsByFilterRequest(val *CatalogsListProductsByFilterRequest) *NullableCatalogsListProductsByFilterRequest {
	return &NullableCatalogsListProductsByFilterRequest{value: val, isSet: true}
}

func (v NullableCatalogsListProductsByFilterRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsListProductsByFilterRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

