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

// checks if the InviteAssetsSummary type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &InviteAssetsSummary{}

// InviteAssetsSummary Ad accounts and profiles the member/partner will be granted access to with this invite/request.
type InviteAssetsSummary struct {
	// List of ad account IDs and respective permission levels that will be assigned.
	AdAccounts []InviteAssetsSummaryAdAccountsInner `json:"ad_accounts,omitempty"`
	// List of profile IDs and respective permission levels that will be assigned.
	Profiles []InviteAssetsSummaryProfilesInner `json:"profiles,omitempty"`
}

// NewInviteAssetsSummary instantiates a new InviteAssetsSummary object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInviteAssetsSummary() *InviteAssetsSummary {
	this := InviteAssetsSummary{}
	return &this
}

// NewInviteAssetsSummaryWithDefaults instantiates a new InviteAssetsSummary object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInviteAssetsSummaryWithDefaults() *InviteAssetsSummary {
	this := InviteAssetsSummary{}
	return &this
}

// GetAdAccounts returns the AdAccounts field value if set, zero value otherwise.
func (o *InviteAssetsSummary) GetAdAccounts() []InviteAssetsSummaryAdAccountsInner {
	if o == nil || IsNil(o.AdAccounts) {
		var ret []InviteAssetsSummaryAdAccountsInner
		return ret
	}
	return o.AdAccounts
}

// GetAdAccountsOk returns a tuple with the AdAccounts field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InviteAssetsSummary) GetAdAccountsOk() ([]InviteAssetsSummaryAdAccountsInner, bool) {
	if o == nil || IsNil(o.AdAccounts) {
		return nil, false
	}
	return o.AdAccounts, true
}

// HasAdAccounts returns a boolean if a field has been set.
func (o *InviteAssetsSummary) HasAdAccounts() bool {
	if o != nil && !IsNil(o.AdAccounts) {
		return true
	}

	return false
}

// SetAdAccounts gets a reference to the given []InviteAssetsSummaryAdAccountsInner and assigns it to the AdAccounts field.
func (o *InviteAssetsSummary) SetAdAccounts(v []InviteAssetsSummaryAdAccountsInner) {
	o.AdAccounts = v
}

// GetProfiles returns the Profiles field value if set, zero value otherwise.
func (o *InviteAssetsSummary) GetProfiles() []InviteAssetsSummaryProfilesInner {
	if o == nil || IsNil(o.Profiles) {
		var ret []InviteAssetsSummaryProfilesInner
		return ret
	}
	return o.Profiles
}

// GetProfilesOk returns a tuple with the Profiles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InviteAssetsSummary) GetProfilesOk() ([]InviteAssetsSummaryProfilesInner, bool) {
	if o == nil || IsNil(o.Profiles) {
		return nil, false
	}
	return o.Profiles, true
}

// HasProfiles returns a boolean if a field has been set.
func (o *InviteAssetsSummary) HasProfiles() bool {
	if o != nil && !IsNil(o.Profiles) {
		return true
	}

	return false
}

// SetProfiles gets a reference to the given []InviteAssetsSummaryProfilesInner and assigns it to the Profiles field.
func (o *InviteAssetsSummary) SetProfiles(v []InviteAssetsSummaryProfilesInner) {
	o.Profiles = v
}

func (o InviteAssetsSummary) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o InviteAssetsSummary) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.AdAccounts) {
		toSerialize["ad_accounts"] = o.AdAccounts
	}
	if !IsNil(o.Profiles) {
		toSerialize["profiles"] = o.Profiles
	}
	return toSerialize, nil
}

type NullableInviteAssetsSummary struct {
	value *InviteAssetsSummary
	isSet bool
}

func (v NullableInviteAssetsSummary) Get() *InviteAssetsSummary {
	return v.value
}

func (v *NullableInviteAssetsSummary) Set(val *InviteAssetsSummary) {
	v.value = val
	v.isSet = true
}

func (v NullableInviteAssetsSummary) IsSet() bool {
	return v.isSet
}

func (v *NullableInviteAssetsSummary) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInviteAssetsSummary(val *InviteAssetsSummary) *NullableInviteAssetsSummary {
	return &NullableInviteAssetsSummary{value: val, isSet: true}
}

func (v NullableInviteAssetsSummary) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInviteAssetsSummary) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


