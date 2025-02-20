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
)

// checks if the AdPinId type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AdPinId{}

// AdPinId struct for AdPinId
type AdPinId struct {
	// Pin ID.
	PinId *string `json:"pin_id,omitempty" validate:"regexp=^\\\\d+$"`
}

// NewAdPinId instantiates a new AdPinId object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdPinId() *AdPinId {
	this := AdPinId{}
	return &this
}

// NewAdPinIdWithDefaults instantiates a new AdPinId object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdPinIdWithDefaults() *AdPinId {
	this := AdPinId{}
	return &this
}

// GetPinId returns the PinId field value if set, zero value otherwise.
func (o *AdPinId) GetPinId() string {
	if o == nil || IsNil(o.PinId) {
		var ret string
		return ret
	}
	return *o.PinId
}

// GetPinIdOk returns a tuple with the PinId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdPinId) GetPinIdOk() (*string, bool) {
	if o == nil || IsNil(o.PinId) {
		return nil, false
	}
	return o.PinId, true
}

// HasPinId returns a boolean if a field has been set.
func (o *AdPinId) HasPinId() bool {
	if o != nil && !IsNil(o.PinId) {
		return true
	}

	return false
}

// SetPinId gets a reference to the given string and assigns it to the PinId field.
func (o *AdPinId) SetPinId(v string) {
	o.PinId = &v
}

func (o AdPinId) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AdPinId) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.PinId) {
		toSerialize["pin_id"] = o.PinId
	}
	return toSerialize, nil
}

type NullableAdPinId struct {
	value *AdPinId
	isSet bool
}

func (v NullableAdPinId) Get() *AdPinId {
	return v.value
}

func (v *NullableAdPinId) Set(val *AdPinId) {
	v.value = val
	v.isSet = true
}

func (v NullableAdPinId) IsSet() bool {
	return v.isSet
}

func (v *NullableAdPinId) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdPinId(val *AdPinId) *NullableAdPinId {
	return &NullableAdPinId{value: val, isSet: true}
}

func (v NullableAdPinId) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdPinId) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


