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

// checks if the BusinessMemberAssetsSummaryProfilesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BusinessMemberAssetsSummaryProfilesInner{}

// BusinessMemberAssetsSummaryProfilesInner struct for BusinessMemberAssetsSummaryProfilesInner
type BusinessMemberAssetsSummaryProfilesInner struct {
	// Unique identifier of a business profile.
	Id *string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`
	// Permission levels member or partner has on an asset.
	Permissions []string `json:"permissions,omitempty"`
}

// NewBusinessMemberAssetsSummaryProfilesInner instantiates a new BusinessMemberAssetsSummaryProfilesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBusinessMemberAssetsSummaryProfilesInner() *BusinessMemberAssetsSummaryProfilesInner {
	this := BusinessMemberAssetsSummaryProfilesInner{}
	return &this
}

// NewBusinessMemberAssetsSummaryProfilesInnerWithDefaults instantiates a new BusinessMemberAssetsSummaryProfilesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBusinessMemberAssetsSummaryProfilesInnerWithDefaults() *BusinessMemberAssetsSummaryProfilesInner {
	this := BusinessMemberAssetsSummaryProfilesInner{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *BusinessMemberAssetsSummaryProfilesInner) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BusinessMemberAssetsSummaryProfilesInner) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *BusinessMemberAssetsSummaryProfilesInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *BusinessMemberAssetsSummaryProfilesInner) SetId(v string) {
	o.Id = &v
}

// GetPermissions returns the Permissions field value if set, zero value otherwise.
func (o *BusinessMemberAssetsSummaryProfilesInner) GetPermissions() []string {
	if o == nil || IsNil(o.Permissions) {
		var ret []string
		return ret
	}
	return o.Permissions
}

// GetPermissionsOk returns a tuple with the Permissions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BusinessMemberAssetsSummaryProfilesInner) GetPermissionsOk() ([]string, bool) {
	if o == nil || IsNil(o.Permissions) {
		return nil, false
	}
	return o.Permissions, true
}

// HasPermissions returns a boolean if a field has been set.
func (o *BusinessMemberAssetsSummaryProfilesInner) HasPermissions() bool {
	if o != nil && !IsNil(o.Permissions) {
		return true
	}

	return false
}

// SetPermissions gets a reference to the given []string and assigns it to the Permissions field.
func (o *BusinessMemberAssetsSummaryProfilesInner) SetPermissions(v []string) {
	o.Permissions = v
}

func (o BusinessMemberAssetsSummaryProfilesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BusinessMemberAssetsSummaryProfilesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Permissions) {
		toSerialize["permissions"] = o.Permissions
	}
	return toSerialize, nil
}

type NullableBusinessMemberAssetsSummaryProfilesInner struct {
	value *BusinessMemberAssetsSummaryProfilesInner
	isSet bool
}

func (v NullableBusinessMemberAssetsSummaryProfilesInner) Get() *BusinessMemberAssetsSummaryProfilesInner {
	return v.value
}

func (v *NullableBusinessMemberAssetsSummaryProfilesInner) Set(val *BusinessMemberAssetsSummaryProfilesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableBusinessMemberAssetsSummaryProfilesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableBusinessMemberAssetsSummaryProfilesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBusinessMemberAssetsSummaryProfilesInner(val *BusinessMemberAssetsSummaryProfilesInner) *NullableBusinessMemberAssetsSummaryProfilesInner {
	return &NullableBusinessMemberAssetsSummaryProfilesInner{value: val, isSet: true}
}

func (v NullableBusinessMemberAssetsSummaryProfilesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBusinessMemberAssetsSummaryProfilesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


