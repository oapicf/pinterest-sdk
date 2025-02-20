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

// checks if the AdGroupArrayResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AdGroupArrayResponse{}

// AdGroupArrayResponse struct for AdGroupArrayResponse
type AdGroupArrayResponse struct {
	Items []AdGroupArrayResponseElement `json:"items,omitempty"`
}

// NewAdGroupArrayResponse instantiates a new AdGroupArrayResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdGroupArrayResponse() *AdGroupArrayResponse {
	this := AdGroupArrayResponse{}
	return &this
}

// NewAdGroupArrayResponseWithDefaults instantiates a new AdGroupArrayResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdGroupArrayResponseWithDefaults() *AdGroupArrayResponse {
	this := AdGroupArrayResponse{}
	return &this
}

// GetItems returns the Items field value if set, zero value otherwise.
func (o *AdGroupArrayResponse) GetItems() []AdGroupArrayResponseElement {
	if o == nil || IsNil(o.Items) {
		var ret []AdGroupArrayResponseElement
		return ret
	}
	return o.Items
}

// GetItemsOk returns a tuple with the Items field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdGroupArrayResponse) GetItemsOk() ([]AdGroupArrayResponseElement, bool) {
	if o == nil || IsNil(o.Items) {
		return nil, false
	}
	return o.Items, true
}

// HasItems returns a boolean if a field has been set.
func (o *AdGroupArrayResponse) HasItems() bool {
	if o != nil && !IsNil(o.Items) {
		return true
	}

	return false
}

// SetItems gets a reference to the given []AdGroupArrayResponseElement and assigns it to the Items field.
func (o *AdGroupArrayResponse) SetItems(v []AdGroupArrayResponseElement) {
	o.Items = v
}

func (o AdGroupArrayResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AdGroupArrayResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Items) {
		toSerialize["items"] = o.Items
	}
	return toSerialize, nil
}

type NullableAdGroupArrayResponse struct {
	value *AdGroupArrayResponse
	isSet bool
}

func (v NullableAdGroupArrayResponse) Get() *AdGroupArrayResponse {
	return v.value
}

func (v *NullableAdGroupArrayResponse) Set(val *AdGroupArrayResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableAdGroupArrayResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableAdGroupArrayResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdGroupArrayResponse(val *AdGroupArrayResponse) *NullableAdGroupArrayResponse {
	return &NullableAdGroupArrayResponse{value: val, isSet: true}
}

func (v NullableAdGroupArrayResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdGroupArrayResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


