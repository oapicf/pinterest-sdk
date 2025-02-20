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

// checks if the DeleteMemberAccessResult type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &DeleteMemberAccessResult{}

// DeleteMemberAccessResult The terminated asset access.
type DeleteMemberAccessResult struct {
	// Unique identifier of the business asset.
	AssetId *string `json:"asset_id,omitempty" validate:"regexp=^\\\\d+$"`
	// Unique identifier of the business member.
	MemberId *string `json:"member_id,omitempty" validate:"regexp=^\\\\d+$"`
}

// NewDeleteMemberAccessResult instantiates a new DeleteMemberAccessResult object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDeleteMemberAccessResult() *DeleteMemberAccessResult {
	this := DeleteMemberAccessResult{}
	return &this
}

// NewDeleteMemberAccessResultWithDefaults instantiates a new DeleteMemberAccessResult object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDeleteMemberAccessResultWithDefaults() *DeleteMemberAccessResult {
	this := DeleteMemberAccessResult{}
	return &this
}

// GetAssetId returns the AssetId field value if set, zero value otherwise.
func (o *DeleteMemberAccessResult) GetAssetId() string {
	if o == nil || IsNil(o.AssetId) {
		var ret string
		return ret
	}
	return *o.AssetId
}

// GetAssetIdOk returns a tuple with the AssetId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeleteMemberAccessResult) GetAssetIdOk() (*string, bool) {
	if o == nil || IsNil(o.AssetId) {
		return nil, false
	}
	return o.AssetId, true
}

// HasAssetId returns a boolean if a field has been set.
func (o *DeleteMemberAccessResult) HasAssetId() bool {
	if o != nil && !IsNil(o.AssetId) {
		return true
	}

	return false
}

// SetAssetId gets a reference to the given string and assigns it to the AssetId field.
func (o *DeleteMemberAccessResult) SetAssetId(v string) {
	o.AssetId = &v
}

// GetMemberId returns the MemberId field value if set, zero value otherwise.
func (o *DeleteMemberAccessResult) GetMemberId() string {
	if o == nil || IsNil(o.MemberId) {
		var ret string
		return ret
	}
	return *o.MemberId
}

// GetMemberIdOk returns a tuple with the MemberId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeleteMemberAccessResult) GetMemberIdOk() (*string, bool) {
	if o == nil || IsNil(o.MemberId) {
		return nil, false
	}
	return o.MemberId, true
}

// HasMemberId returns a boolean if a field has been set.
func (o *DeleteMemberAccessResult) HasMemberId() bool {
	if o != nil && !IsNil(o.MemberId) {
		return true
	}

	return false
}

// SetMemberId gets a reference to the given string and assigns it to the MemberId field.
func (o *DeleteMemberAccessResult) SetMemberId(v string) {
	o.MemberId = &v
}

func (o DeleteMemberAccessResult) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DeleteMemberAccessResult) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.AssetId) {
		toSerialize["asset_id"] = o.AssetId
	}
	if !IsNil(o.MemberId) {
		toSerialize["member_id"] = o.MemberId
	}
	return toSerialize, nil
}

type NullableDeleteMemberAccessResult struct {
	value *DeleteMemberAccessResult
	isSet bool
}

func (v NullableDeleteMemberAccessResult) Get() *DeleteMemberAccessResult {
	return v.value
}

func (v *NullableDeleteMemberAccessResult) Set(val *DeleteMemberAccessResult) {
	v.value = val
	v.isSet = true
}

func (v NullableDeleteMemberAccessResult) IsSet() bool {
	return v.isSet
}

func (v *NullableDeleteMemberAccessResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDeleteMemberAccessResult(val *DeleteMemberAccessResult) *NullableDeleteMemberAccessResult {
	return &NullableDeleteMemberAccessResult{value: val, isSet: true}
}

func (v NullableDeleteMemberAccessResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDeleteMemberAccessResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


