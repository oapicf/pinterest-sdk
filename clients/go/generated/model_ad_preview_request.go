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

// AdPreviewRequest - struct for AdPreviewRequest
type AdPreviewRequest struct {
	AdPreviewCreateFromImage *AdPreviewCreateFromImage
	AdPreviewCreateFromPin *AdPreviewCreateFromPin
}

// AdPreviewCreateFromImageAsAdPreviewRequest is a convenience function that returns AdPreviewCreateFromImage wrapped in AdPreviewRequest
func AdPreviewCreateFromImageAsAdPreviewRequest(v *AdPreviewCreateFromImage) AdPreviewRequest {
	return AdPreviewRequest{
		AdPreviewCreateFromImage: v,
	}
}

// AdPreviewCreateFromPinAsAdPreviewRequest is a convenience function that returns AdPreviewCreateFromPin wrapped in AdPreviewRequest
func AdPreviewCreateFromPinAsAdPreviewRequest(v *AdPreviewCreateFromPin) AdPreviewRequest {
	return AdPreviewRequest{
		AdPreviewCreateFromPin: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *AdPreviewRequest) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into AdPreviewCreateFromImage
	err = newStrictDecoder(data).Decode(&dst.AdPreviewCreateFromImage)
	if err == nil {
		jsonAdPreviewCreateFromImage, _ := json.Marshal(dst.AdPreviewCreateFromImage)
		if string(jsonAdPreviewCreateFromImage) == "{}" { // empty struct
			dst.AdPreviewCreateFromImage = nil
		} else {
			if err = validator.Validate(dst.AdPreviewCreateFromImage); err != nil {
				dst.AdPreviewCreateFromImage = nil
			} else {
				match++
			}
		}
	} else {
		dst.AdPreviewCreateFromImage = nil
	}

	// try to unmarshal data into AdPreviewCreateFromPin
	err = newStrictDecoder(data).Decode(&dst.AdPreviewCreateFromPin)
	if err == nil {
		jsonAdPreviewCreateFromPin, _ := json.Marshal(dst.AdPreviewCreateFromPin)
		if string(jsonAdPreviewCreateFromPin) == "{}" { // empty struct
			dst.AdPreviewCreateFromPin = nil
		} else {
			if err = validator.Validate(dst.AdPreviewCreateFromPin); err != nil {
				dst.AdPreviewCreateFromPin = nil
			} else {
				match++
			}
		}
	} else {
		dst.AdPreviewCreateFromPin = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.AdPreviewCreateFromImage = nil
		dst.AdPreviewCreateFromPin = nil

		return fmt.Errorf("data matches more than one schema in oneOf(AdPreviewRequest)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(AdPreviewRequest)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src AdPreviewRequest) MarshalJSON() ([]byte, error) {
	if src.AdPreviewCreateFromImage != nil {
		return json.Marshal(&src.AdPreviewCreateFromImage)
	}

	if src.AdPreviewCreateFromPin != nil {
		return json.Marshal(&src.AdPreviewCreateFromPin)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *AdPreviewRequest) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.AdPreviewCreateFromImage != nil {
		return obj.AdPreviewCreateFromImage
	}

	if obj.AdPreviewCreateFromPin != nil {
		return obj.AdPreviewCreateFromPin
	}

	// all schemas are nil
	return nil
}

type NullableAdPreviewRequest struct {
	value *AdPreviewRequest
	isSet bool
}

func (v NullableAdPreviewRequest) Get() *AdPreviewRequest {
	return v.value
}

func (v *NullableAdPreviewRequest) Set(val *AdPreviewRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableAdPreviewRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableAdPreviewRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdPreviewRequest(val *AdPreviewRequest) *NullableAdPreviewRequest {
	return &NullableAdPreviewRequest{value: val, isSet: true}
}

func (v NullableAdPreviewRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdPreviewRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


