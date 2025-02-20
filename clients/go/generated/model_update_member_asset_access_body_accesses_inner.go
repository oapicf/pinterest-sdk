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

// checks if the UpdateMemberAssetAccessBodyAccessesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UpdateMemberAssetAccessBodyAccessesInner{}

// UpdateMemberAssetAccessBodyAccessesInner struct for UpdateMemberAssetAccessBodyAccessesInner
type UpdateMemberAssetAccessBodyAccessesInner struct {
	// Id of the asset to update.
	AssetId string `json:"asset_id" validate:"regexp=^\\\\d+$"`
	// Unique identifier of the member on which to perform the update
	MemberId string `json:"member_id" validate:"regexp=^\\\\d+$"`
	// A non-empty array of permissions to assign to the member.
	Permissions []Permissions `json:"permissions"`
}

type _UpdateMemberAssetAccessBodyAccessesInner UpdateMemberAssetAccessBodyAccessesInner

// NewUpdateMemberAssetAccessBodyAccessesInner instantiates a new UpdateMemberAssetAccessBodyAccessesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateMemberAssetAccessBodyAccessesInner(assetId string, memberId string, permissions []Permissions) *UpdateMemberAssetAccessBodyAccessesInner {
	this := UpdateMemberAssetAccessBodyAccessesInner{}
	this.AssetId = assetId
	this.MemberId = memberId
	this.Permissions = permissions
	return &this
}

// NewUpdateMemberAssetAccessBodyAccessesInnerWithDefaults instantiates a new UpdateMemberAssetAccessBodyAccessesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateMemberAssetAccessBodyAccessesInnerWithDefaults() *UpdateMemberAssetAccessBodyAccessesInner {
	this := UpdateMemberAssetAccessBodyAccessesInner{}
	return &this
}

// GetAssetId returns the AssetId field value
func (o *UpdateMemberAssetAccessBodyAccessesInner) GetAssetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AssetId
}

// GetAssetIdOk returns a tuple with the AssetId field value
// and a boolean to check if the value has been set.
func (o *UpdateMemberAssetAccessBodyAccessesInner) GetAssetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AssetId, true
}

// SetAssetId sets field value
func (o *UpdateMemberAssetAccessBodyAccessesInner) SetAssetId(v string) {
	o.AssetId = v
}

// GetMemberId returns the MemberId field value
func (o *UpdateMemberAssetAccessBodyAccessesInner) GetMemberId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MemberId
}

// GetMemberIdOk returns a tuple with the MemberId field value
// and a boolean to check if the value has been set.
func (o *UpdateMemberAssetAccessBodyAccessesInner) GetMemberIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MemberId, true
}

// SetMemberId sets field value
func (o *UpdateMemberAssetAccessBodyAccessesInner) SetMemberId(v string) {
	o.MemberId = v
}

// GetPermissions returns the Permissions field value
func (o *UpdateMemberAssetAccessBodyAccessesInner) GetPermissions() []Permissions {
	if o == nil {
		var ret []Permissions
		return ret
	}

	return o.Permissions
}

// GetPermissionsOk returns a tuple with the Permissions field value
// and a boolean to check if the value has been set.
func (o *UpdateMemberAssetAccessBodyAccessesInner) GetPermissionsOk() ([]Permissions, bool) {
	if o == nil {
		return nil, false
	}
	return o.Permissions, true
}

// SetPermissions sets field value
func (o *UpdateMemberAssetAccessBodyAccessesInner) SetPermissions(v []Permissions) {
	o.Permissions = v
}

func (o UpdateMemberAssetAccessBodyAccessesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UpdateMemberAssetAccessBodyAccessesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["asset_id"] = o.AssetId
	toSerialize["member_id"] = o.MemberId
	toSerialize["permissions"] = o.Permissions
	return toSerialize, nil
}

func (o *UpdateMemberAssetAccessBodyAccessesInner) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"asset_id",
		"member_id",
		"permissions",
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

	varUpdateMemberAssetAccessBodyAccessesInner := _UpdateMemberAssetAccessBodyAccessesInner{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varUpdateMemberAssetAccessBodyAccessesInner)

	if err != nil {
		return err
	}

	*o = UpdateMemberAssetAccessBodyAccessesInner(varUpdateMemberAssetAccessBodyAccessesInner)

	return err
}

type NullableUpdateMemberAssetAccessBodyAccessesInner struct {
	value *UpdateMemberAssetAccessBodyAccessesInner
	isSet bool
}

func (v NullableUpdateMemberAssetAccessBodyAccessesInner) Get() *UpdateMemberAssetAccessBodyAccessesInner {
	return v.value
}

func (v *NullableUpdateMemberAssetAccessBodyAccessesInner) Set(val *UpdateMemberAssetAccessBodyAccessesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateMemberAssetAccessBodyAccessesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateMemberAssetAccessBodyAccessesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateMemberAssetAccessBodyAccessesInner(val *UpdateMemberAssetAccessBodyAccessesInner) *NullableUpdateMemberAssetAccessBodyAccessesInner {
	return &NullableUpdateMemberAssetAccessBodyAccessesInner{value: val, isSet: true}
}

func (v NullableUpdateMemberAssetAccessBodyAccessesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateMemberAssetAccessBodyAccessesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


