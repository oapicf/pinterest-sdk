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

// checks if the TargetingTypeFilter type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TargetingTypeFilter{}

// TargetingTypeFilter struct for TargetingTypeFilter
type TargetingTypeFilter struct {
	// List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
	TargetingTypes []AdsAnalyticsTargetingType `json:"targeting_types,omitempty"`
}

// NewTargetingTypeFilter instantiates a new TargetingTypeFilter object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTargetingTypeFilter() *TargetingTypeFilter {
	this := TargetingTypeFilter{}
	return &this
}

// NewTargetingTypeFilterWithDefaults instantiates a new TargetingTypeFilter object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTargetingTypeFilterWithDefaults() *TargetingTypeFilter {
	this := TargetingTypeFilter{}
	return &this
}

// GetTargetingTypes returns the TargetingTypes field value if set, zero value otherwise.
func (o *TargetingTypeFilter) GetTargetingTypes() []AdsAnalyticsTargetingType {
	if o == nil || IsNil(o.TargetingTypes) {
		var ret []AdsAnalyticsTargetingType
		return ret
	}
	return o.TargetingTypes
}

// GetTargetingTypesOk returns a tuple with the TargetingTypes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TargetingTypeFilter) GetTargetingTypesOk() ([]AdsAnalyticsTargetingType, bool) {
	if o == nil || IsNil(o.TargetingTypes) {
		return nil, false
	}
	return o.TargetingTypes, true
}

// HasTargetingTypes returns a boolean if a field has been set.
func (o *TargetingTypeFilter) HasTargetingTypes() bool {
	if o != nil && !IsNil(o.TargetingTypes) {
		return true
	}

	return false
}

// SetTargetingTypes gets a reference to the given []AdsAnalyticsTargetingType and assigns it to the TargetingTypes field.
func (o *TargetingTypeFilter) SetTargetingTypes(v []AdsAnalyticsTargetingType) {
	o.TargetingTypes = v
}

func (o TargetingTypeFilter) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TargetingTypeFilter) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.TargetingTypes) {
		toSerialize["targeting_types"] = o.TargetingTypes
	}
	return toSerialize, nil
}

type NullableTargetingTypeFilter struct {
	value *TargetingTypeFilter
	isSet bool
}

func (v NullableTargetingTypeFilter) Get() *TargetingTypeFilter {
	return v.value
}

func (v *NullableTargetingTypeFilter) Set(val *TargetingTypeFilter) {
	v.value = val
	v.isSet = true
}

func (v NullableTargetingTypeFilter) IsSet() bool {
	return v.isSet
}

func (v *NullableTargetingTypeFilter) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTargetingTypeFilter(val *TargetingTypeFilter) *NullableTargetingTypeFilter {
	return &NullableTargetingTypeFilter{value: val, isSet: true}
}

func (v NullableTargetingTypeFilter) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTargetingTypeFilter) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


