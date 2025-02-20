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

// checks if the UpdateAssetGroupResponseExceptionsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UpdateAssetGroupResponseExceptionsInner{}

// UpdateAssetGroupResponseExceptionsInner struct for UpdateAssetGroupResponseExceptionsInner
type UpdateAssetGroupResponseExceptionsInner struct {
	// Error code associated with the error editing asset group.
	Code *int32 `json:"code,omitempty"`
	// Error message associated with the error editing asset group.
	Message *string `json:"message,omitempty"`
	// Asset group id of the exception.
	AssetGroupId *string `json:"asset_group_id,omitempty"`
}

// NewUpdateAssetGroupResponseExceptionsInner instantiates a new UpdateAssetGroupResponseExceptionsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateAssetGroupResponseExceptionsInner() *UpdateAssetGroupResponseExceptionsInner {
	this := UpdateAssetGroupResponseExceptionsInner{}
	return &this
}

// NewUpdateAssetGroupResponseExceptionsInnerWithDefaults instantiates a new UpdateAssetGroupResponseExceptionsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateAssetGroupResponseExceptionsInnerWithDefaults() *UpdateAssetGroupResponseExceptionsInner {
	this := UpdateAssetGroupResponseExceptionsInner{}
	return &this
}

// GetCode returns the Code field value if set, zero value otherwise.
func (o *UpdateAssetGroupResponseExceptionsInner) GetCode() int32 {
	if o == nil || IsNil(o.Code) {
		var ret int32
		return ret
	}
	return *o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateAssetGroupResponseExceptionsInner) GetCodeOk() (*int32, bool) {
	if o == nil || IsNil(o.Code) {
		return nil, false
	}
	return o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *UpdateAssetGroupResponseExceptionsInner) HasCode() bool {
	if o != nil && !IsNil(o.Code) {
		return true
	}

	return false
}

// SetCode gets a reference to the given int32 and assigns it to the Code field.
func (o *UpdateAssetGroupResponseExceptionsInner) SetCode(v int32) {
	o.Code = &v
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *UpdateAssetGroupResponseExceptionsInner) GetMessage() string {
	if o == nil || IsNil(o.Message) {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateAssetGroupResponseExceptionsInner) GetMessageOk() (*string, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *UpdateAssetGroupResponseExceptionsInner) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *UpdateAssetGroupResponseExceptionsInner) SetMessage(v string) {
	o.Message = &v
}

// GetAssetGroupId returns the AssetGroupId field value if set, zero value otherwise.
func (o *UpdateAssetGroupResponseExceptionsInner) GetAssetGroupId() string {
	if o == nil || IsNil(o.AssetGroupId) {
		var ret string
		return ret
	}
	return *o.AssetGroupId
}

// GetAssetGroupIdOk returns a tuple with the AssetGroupId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateAssetGroupResponseExceptionsInner) GetAssetGroupIdOk() (*string, bool) {
	if o == nil || IsNil(o.AssetGroupId) {
		return nil, false
	}
	return o.AssetGroupId, true
}

// HasAssetGroupId returns a boolean if a field has been set.
func (o *UpdateAssetGroupResponseExceptionsInner) HasAssetGroupId() bool {
	if o != nil && !IsNil(o.AssetGroupId) {
		return true
	}

	return false
}

// SetAssetGroupId gets a reference to the given string and assigns it to the AssetGroupId field.
func (o *UpdateAssetGroupResponseExceptionsInner) SetAssetGroupId(v string) {
	o.AssetGroupId = &v
}

func (o UpdateAssetGroupResponseExceptionsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UpdateAssetGroupResponseExceptionsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Code) {
		toSerialize["code"] = o.Code
	}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	if !IsNil(o.AssetGroupId) {
		toSerialize["asset_group_id"] = o.AssetGroupId
	}
	return toSerialize, nil
}

type NullableUpdateAssetGroupResponseExceptionsInner struct {
	value *UpdateAssetGroupResponseExceptionsInner
	isSet bool
}

func (v NullableUpdateAssetGroupResponseExceptionsInner) Get() *UpdateAssetGroupResponseExceptionsInner {
	return v.value
}

func (v *NullableUpdateAssetGroupResponseExceptionsInner) Set(val *UpdateAssetGroupResponseExceptionsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateAssetGroupResponseExceptionsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateAssetGroupResponseExceptionsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateAssetGroupResponseExceptionsInner(val *UpdateAssetGroupResponseExceptionsInner) *NullableUpdateAssetGroupResponseExceptionsInner {
	return &NullableUpdateAssetGroupResponseExceptionsInner{value: val, isSet: true}
}

func (v NullableUpdateAssetGroupResponseExceptionsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateAssetGroupResponseExceptionsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


