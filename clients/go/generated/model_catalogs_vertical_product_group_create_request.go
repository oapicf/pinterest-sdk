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

// CatalogsVerticalProductGroupCreateRequest - Request object for creating a catalog based product group.
type CatalogsVerticalProductGroupCreateRequest struct {
	CatalogsCreativeAssetsProductGroupCreateRequest *CatalogsCreativeAssetsProductGroupCreateRequest
	CatalogsHotelProductGroupCreateRequest *CatalogsHotelProductGroupCreateRequest
	CatalogsRetailProductGroupCreateRequest *CatalogsRetailProductGroupCreateRequest
}

// CatalogsCreativeAssetsProductGroupCreateRequestAsCatalogsVerticalProductGroupCreateRequest is a convenience function that returns CatalogsCreativeAssetsProductGroupCreateRequest wrapped in CatalogsVerticalProductGroupCreateRequest
func CatalogsCreativeAssetsProductGroupCreateRequestAsCatalogsVerticalProductGroupCreateRequest(v *CatalogsCreativeAssetsProductGroupCreateRequest) CatalogsVerticalProductGroupCreateRequest {
	return CatalogsVerticalProductGroupCreateRequest{
		CatalogsCreativeAssetsProductGroupCreateRequest: v,
	}
}

// CatalogsHotelProductGroupCreateRequestAsCatalogsVerticalProductGroupCreateRequest is a convenience function that returns CatalogsHotelProductGroupCreateRequest wrapped in CatalogsVerticalProductGroupCreateRequest
func CatalogsHotelProductGroupCreateRequestAsCatalogsVerticalProductGroupCreateRequest(v *CatalogsHotelProductGroupCreateRequest) CatalogsVerticalProductGroupCreateRequest {
	return CatalogsVerticalProductGroupCreateRequest{
		CatalogsHotelProductGroupCreateRequest: v,
	}
}

// CatalogsRetailProductGroupCreateRequestAsCatalogsVerticalProductGroupCreateRequest is a convenience function that returns CatalogsRetailProductGroupCreateRequest wrapped in CatalogsVerticalProductGroupCreateRequest
func CatalogsRetailProductGroupCreateRequestAsCatalogsVerticalProductGroupCreateRequest(v *CatalogsRetailProductGroupCreateRequest) CatalogsVerticalProductGroupCreateRequest {
	return CatalogsVerticalProductGroupCreateRequest{
		CatalogsRetailProductGroupCreateRequest: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *CatalogsVerticalProductGroupCreateRequest) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into CatalogsCreativeAssetsProductGroupCreateRequest
	err = newStrictDecoder(data).Decode(&dst.CatalogsCreativeAssetsProductGroupCreateRequest)
	if err == nil {
		jsonCatalogsCreativeAssetsProductGroupCreateRequest, _ := json.Marshal(dst.CatalogsCreativeAssetsProductGroupCreateRequest)
		if string(jsonCatalogsCreativeAssetsProductGroupCreateRequest) == "{}" { // empty struct
			dst.CatalogsCreativeAssetsProductGroupCreateRequest = nil
		} else {
			if err = validator.Validate(dst.CatalogsCreativeAssetsProductGroupCreateRequest); err != nil {
				dst.CatalogsCreativeAssetsProductGroupCreateRequest = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsCreativeAssetsProductGroupCreateRequest = nil
	}

	// try to unmarshal data into CatalogsHotelProductGroupCreateRequest
	err = newStrictDecoder(data).Decode(&dst.CatalogsHotelProductGroupCreateRequest)
	if err == nil {
		jsonCatalogsHotelProductGroupCreateRequest, _ := json.Marshal(dst.CatalogsHotelProductGroupCreateRequest)
		if string(jsonCatalogsHotelProductGroupCreateRequest) == "{}" { // empty struct
			dst.CatalogsHotelProductGroupCreateRequest = nil
		} else {
			if err = validator.Validate(dst.CatalogsHotelProductGroupCreateRequest); err != nil {
				dst.CatalogsHotelProductGroupCreateRequest = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsHotelProductGroupCreateRequest = nil
	}

	// try to unmarshal data into CatalogsRetailProductGroupCreateRequest
	err = newStrictDecoder(data).Decode(&dst.CatalogsRetailProductGroupCreateRequest)
	if err == nil {
		jsonCatalogsRetailProductGroupCreateRequest, _ := json.Marshal(dst.CatalogsRetailProductGroupCreateRequest)
		if string(jsonCatalogsRetailProductGroupCreateRequest) == "{}" { // empty struct
			dst.CatalogsRetailProductGroupCreateRequest = nil
		} else {
			if err = validator.Validate(dst.CatalogsRetailProductGroupCreateRequest); err != nil {
				dst.CatalogsRetailProductGroupCreateRequest = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsRetailProductGroupCreateRequest = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.CatalogsCreativeAssetsProductGroupCreateRequest = nil
		dst.CatalogsHotelProductGroupCreateRequest = nil
		dst.CatalogsRetailProductGroupCreateRequest = nil

		return fmt.Errorf("data matches more than one schema in oneOf(CatalogsVerticalProductGroupCreateRequest)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(CatalogsVerticalProductGroupCreateRequest)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src CatalogsVerticalProductGroupCreateRequest) MarshalJSON() ([]byte, error) {
	if src.CatalogsCreativeAssetsProductGroupCreateRequest != nil {
		return json.Marshal(&src.CatalogsCreativeAssetsProductGroupCreateRequest)
	}

	if src.CatalogsHotelProductGroupCreateRequest != nil {
		return json.Marshal(&src.CatalogsHotelProductGroupCreateRequest)
	}

	if src.CatalogsRetailProductGroupCreateRequest != nil {
		return json.Marshal(&src.CatalogsRetailProductGroupCreateRequest)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *CatalogsVerticalProductGroupCreateRequest) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.CatalogsCreativeAssetsProductGroupCreateRequest != nil {
		return obj.CatalogsCreativeAssetsProductGroupCreateRequest
	}

	if obj.CatalogsHotelProductGroupCreateRequest != nil {
		return obj.CatalogsHotelProductGroupCreateRequest
	}

	if obj.CatalogsRetailProductGroupCreateRequest != nil {
		return obj.CatalogsRetailProductGroupCreateRequest
	}

	// all schemas are nil
	return nil
}

type NullableCatalogsVerticalProductGroupCreateRequest struct {
	value *CatalogsVerticalProductGroupCreateRequest
	isSet bool
}

func (v NullableCatalogsVerticalProductGroupCreateRequest) Get() *CatalogsVerticalProductGroupCreateRequest {
	return v.value
}

func (v *NullableCatalogsVerticalProductGroupCreateRequest) Set(val *CatalogsVerticalProductGroupCreateRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsVerticalProductGroupCreateRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsVerticalProductGroupCreateRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsVerticalProductGroupCreateRequest(val *CatalogsVerticalProductGroupCreateRequest) *NullableCatalogsVerticalProductGroupCreateRequest {
	return &NullableCatalogsVerticalProductGroupCreateRequest{value: val, isSet: true}
}

func (v NullableCatalogsVerticalProductGroupCreateRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsVerticalProductGroupCreateRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


