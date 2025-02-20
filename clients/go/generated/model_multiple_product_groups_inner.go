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

// MultipleProductGroupsInner - struct for MultipleProductGroupsInner
type MultipleProductGroupsInner struct {
	CatalogsProductGroupCreateRequest *CatalogsProductGroupCreateRequest
	CatalogsVerticalProductGroupCreateRequest *CatalogsVerticalProductGroupCreateRequest
}

// CatalogsProductGroupCreateRequestAsMultipleProductGroupsInner is a convenience function that returns CatalogsProductGroupCreateRequest wrapped in MultipleProductGroupsInner
func CatalogsProductGroupCreateRequestAsMultipleProductGroupsInner(v *CatalogsProductGroupCreateRequest) MultipleProductGroupsInner {
	return MultipleProductGroupsInner{
		CatalogsProductGroupCreateRequest: v,
	}
}

// CatalogsVerticalProductGroupCreateRequestAsMultipleProductGroupsInner is a convenience function that returns CatalogsVerticalProductGroupCreateRequest wrapped in MultipleProductGroupsInner
func CatalogsVerticalProductGroupCreateRequestAsMultipleProductGroupsInner(v *CatalogsVerticalProductGroupCreateRequest) MultipleProductGroupsInner {
	return MultipleProductGroupsInner{
		CatalogsVerticalProductGroupCreateRequest: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *MultipleProductGroupsInner) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into CatalogsProductGroupCreateRequest
	err = newStrictDecoder(data).Decode(&dst.CatalogsProductGroupCreateRequest)
	if err == nil {
		jsonCatalogsProductGroupCreateRequest, _ := json.Marshal(dst.CatalogsProductGroupCreateRequest)
		if string(jsonCatalogsProductGroupCreateRequest) == "{}" { // empty struct
			dst.CatalogsProductGroupCreateRequest = nil
		} else {
			if err = validator.Validate(dst.CatalogsProductGroupCreateRequest); err != nil {
				dst.CatalogsProductGroupCreateRequest = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsProductGroupCreateRequest = nil
	}

	// try to unmarshal data into CatalogsVerticalProductGroupCreateRequest
	err = newStrictDecoder(data).Decode(&dst.CatalogsVerticalProductGroupCreateRequest)
	if err == nil {
		jsonCatalogsVerticalProductGroupCreateRequest, _ := json.Marshal(dst.CatalogsVerticalProductGroupCreateRequest)
		if string(jsonCatalogsVerticalProductGroupCreateRequest) == "{}" { // empty struct
			dst.CatalogsVerticalProductGroupCreateRequest = nil
		} else {
			if err = validator.Validate(dst.CatalogsVerticalProductGroupCreateRequest); err != nil {
				dst.CatalogsVerticalProductGroupCreateRequest = nil
			} else {
				match++
			}
		}
	} else {
		dst.CatalogsVerticalProductGroupCreateRequest = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.CatalogsProductGroupCreateRequest = nil
		dst.CatalogsVerticalProductGroupCreateRequest = nil

		return fmt.Errorf("data matches more than one schema in oneOf(MultipleProductGroupsInner)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(MultipleProductGroupsInner)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src MultipleProductGroupsInner) MarshalJSON() ([]byte, error) {
	if src.CatalogsProductGroupCreateRequest != nil {
		return json.Marshal(&src.CatalogsProductGroupCreateRequest)
	}

	if src.CatalogsVerticalProductGroupCreateRequest != nil {
		return json.Marshal(&src.CatalogsVerticalProductGroupCreateRequest)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *MultipleProductGroupsInner) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.CatalogsProductGroupCreateRequest != nil {
		return obj.CatalogsProductGroupCreateRequest
	}

	if obj.CatalogsVerticalProductGroupCreateRequest != nil {
		return obj.CatalogsVerticalProductGroupCreateRequest
	}

	// all schemas are nil
	return nil
}

type NullableMultipleProductGroupsInner struct {
	value *MultipleProductGroupsInner
	isSet bool
}

func (v NullableMultipleProductGroupsInner) Get() *MultipleProductGroupsInner {
	return v.value
}

func (v *NullableMultipleProductGroupsInner) Set(val *MultipleProductGroupsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableMultipleProductGroupsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableMultipleProductGroupsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMultipleProductGroupsInner(val *MultipleProductGroupsInner) *NullableMultipleProductGroupsInner {
	return &NullableMultipleProductGroupsInner{value: val, isSet: true}
}

func (v NullableMultipleProductGroupsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMultipleProductGroupsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


