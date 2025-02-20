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
	"bytes"
	"fmt"
)

// checks if the UpdatePartnerAssetAccessBody type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UpdatePartnerAssetAccessBody{}

// UpdatePartnerAssetAccessBody struct for UpdatePartnerAssetAccessBody
type UpdatePartnerAssetAccessBody struct {
	Accesses []UpdatePartnerAssetAccessBodyAccessesInner `json:"accesses"`
}

type _UpdatePartnerAssetAccessBody UpdatePartnerAssetAccessBody

// NewUpdatePartnerAssetAccessBody instantiates a new UpdatePartnerAssetAccessBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdatePartnerAssetAccessBody(accesses []UpdatePartnerAssetAccessBodyAccessesInner) *UpdatePartnerAssetAccessBody {
	this := UpdatePartnerAssetAccessBody{}
	this.Accesses = accesses
	return &this
}

// NewUpdatePartnerAssetAccessBodyWithDefaults instantiates a new UpdatePartnerAssetAccessBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdatePartnerAssetAccessBodyWithDefaults() *UpdatePartnerAssetAccessBody {
	this := UpdatePartnerAssetAccessBody{}
	return &this
}

// GetAccesses returns the Accesses field value
func (o *UpdatePartnerAssetAccessBody) GetAccesses() []UpdatePartnerAssetAccessBodyAccessesInner {
	if o == nil {
		var ret []UpdatePartnerAssetAccessBodyAccessesInner
		return ret
	}

	return o.Accesses
}

// GetAccessesOk returns a tuple with the Accesses field value
// and a boolean to check if the value has been set.
func (o *UpdatePartnerAssetAccessBody) GetAccessesOk() ([]UpdatePartnerAssetAccessBodyAccessesInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Accesses, true
}

// SetAccesses sets field value
func (o *UpdatePartnerAssetAccessBody) SetAccesses(v []UpdatePartnerAssetAccessBodyAccessesInner) {
	o.Accesses = v
}

func (o UpdatePartnerAssetAccessBody) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UpdatePartnerAssetAccessBody) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["accesses"] = o.Accesses
	return toSerialize, nil
}

func (o *UpdatePartnerAssetAccessBody) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"accesses",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varUpdatePartnerAssetAccessBody := _UpdatePartnerAssetAccessBody{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varUpdatePartnerAssetAccessBody)

	if err != nil {
		return err
	}

	*o = UpdatePartnerAssetAccessBody(varUpdatePartnerAssetAccessBody)

	return err
}

type NullableUpdatePartnerAssetAccessBody struct {
	value *UpdatePartnerAssetAccessBody
	isSet bool
}

func (v NullableUpdatePartnerAssetAccessBody) Get() *UpdatePartnerAssetAccessBody {
	return v.value
}

func (v *NullableUpdatePartnerAssetAccessBody) Set(val *UpdatePartnerAssetAccessBody) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdatePartnerAssetAccessBody) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdatePartnerAssetAccessBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdatePartnerAssetAccessBody(val *UpdatePartnerAssetAccessBody) *NullableUpdatePartnerAssetAccessBody {
	return &NullableUpdatePartnerAssetAccessBody{value: val, isSet: true}
}

func (v NullableUpdatePartnerAssetAccessBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdatePartnerAssetAccessBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


