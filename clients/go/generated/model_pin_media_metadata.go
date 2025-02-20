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


// PinMediaMetadata struct for PinMediaMetadata
type PinMediaMetadata struct {
	ImageMetadata *ImageMetadata
	VideoMetadata *VideoMetadata
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *PinMediaMetadata) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into ImageMetadata
	err = json.Unmarshal(data, &dst.ImageMetadata);
	if err == nil {
		jsonImageMetadata, _ := json.Marshal(dst.ImageMetadata)
		if string(jsonImageMetadata) == "{}" { // empty struct
			dst.ImageMetadata = nil
		} else {
			return nil // data stored in dst.ImageMetadata, return on the first match
		}
	} else {
		dst.ImageMetadata = nil
	}

	// try to unmarshal JSON data into VideoMetadata
	err = json.Unmarshal(data, &dst.VideoMetadata);
	if err == nil {
		jsonVideoMetadata, _ := json.Marshal(dst.VideoMetadata)
		if string(jsonVideoMetadata) == "{}" { // empty struct
			dst.VideoMetadata = nil
		} else {
			return nil // data stored in dst.VideoMetadata, return on the first match
		}
	} else {
		dst.VideoMetadata = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(PinMediaMetadata)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *PinMediaMetadata) MarshalJSON() ([]byte, error) {
	if src.ImageMetadata != nil {
		return json.Marshal(&src.ImageMetadata)
	}

	if src.VideoMetadata != nil {
		return json.Marshal(&src.VideoMetadata)
	}

	return nil, nil // no data in anyOf schemas
}


type NullablePinMediaMetadata struct {
	value *PinMediaMetadata
	isSet bool
}

func (v NullablePinMediaMetadata) Get() *PinMediaMetadata {
	return v.value
}

func (v *NullablePinMediaMetadata) Set(val *PinMediaMetadata) {
	v.value = val
	v.isSet = true
}

func (v NullablePinMediaMetadata) IsSet() bool {
	return v.isSet
}

func (v *NullablePinMediaMetadata) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePinMediaMetadata(val *PinMediaMetadata) *NullablePinMediaMetadata {
	return &NullablePinMediaMetadata{value: val, isSet: true}
}

func (v NullablePinMediaMetadata) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePinMediaMetadata) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


