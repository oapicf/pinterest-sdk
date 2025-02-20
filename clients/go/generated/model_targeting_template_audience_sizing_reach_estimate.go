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

// checks if the TargetingTemplateAudienceSizingReachEstimate type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TargetingTemplateAudienceSizingReachEstimate{}

// TargetingTemplateAudienceSizingReachEstimate struct for TargetingTemplateAudienceSizingReachEstimate
type TargetingTemplateAudienceSizingReachEstimate struct {
	Estimate *int64 `json:"estimate,omitempty"`
	LowerBound *int64 `json:"lower_bound,omitempty"`
	UpperBound *int64 `json:"upper_bound,omitempty"`
}

// NewTargetingTemplateAudienceSizingReachEstimate instantiates a new TargetingTemplateAudienceSizingReachEstimate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTargetingTemplateAudienceSizingReachEstimate() *TargetingTemplateAudienceSizingReachEstimate {
	this := TargetingTemplateAudienceSizingReachEstimate{}
	return &this
}

// NewTargetingTemplateAudienceSizingReachEstimateWithDefaults instantiates a new TargetingTemplateAudienceSizingReachEstimate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTargetingTemplateAudienceSizingReachEstimateWithDefaults() *TargetingTemplateAudienceSizingReachEstimate {
	this := TargetingTemplateAudienceSizingReachEstimate{}
	return &this
}

// GetEstimate returns the Estimate field value if set, zero value otherwise.
func (o *TargetingTemplateAudienceSizingReachEstimate) GetEstimate() int64 {
	if o == nil || IsNil(o.Estimate) {
		var ret int64
		return ret
	}
	return *o.Estimate
}

// GetEstimateOk returns a tuple with the Estimate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TargetingTemplateAudienceSizingReachEstimate) GetEstimateOk() (*int64, bool) {
	if o == nil || IsNil(o.Estimate) {
		return nil, false
	}
	return o.Estimate, true
}

// HasEstimate returns a boolean if a field has been set.
func (o *TargetingTemplateAudienceSizingReachEstimate) HasEstimate() bool {
	if o != nil && !IsNil(o.Estimate) {
		return true
	}

	return false
}

// SetEstimate gets a reference to the given int64 and assigns it to the Estimate field.
func (o *TargetingTemplateAudienceSizingReachEstimate) SetEstimate(v int64) {
	o.Estimate = &v
}

// GetLowerBound returns the LowerBound field value if set, zero value otherwise.
func (o *TargetingTemplateAudienceSizingReachEstimate) GetLowerBound() int64 {
	if o == nil || IsNil(o.LowerBound) {
		var ret int64
		return ret
	}
	return *o.LowerBound
}

// GetLowerBoundOk returns a tuple with the LowerBound field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TargetingTemplateAudienceSizingReachEstimate) GetLowerBoundOk() (*int64, bool) {
	if o == nil || IsNil(o.LowerBound) {
		return nil, false
	}
	return o.LowerBound, true
}

// HasLowerBound returns a boolean if a field has been set.
func (o *TargetingTemplateAudienceSizingReachEstimate) HasLowerBound() bool {
	if o != nil && !IsNil(o.LowerBound) {
		return true
	}

	return false
}

// SetLowerBound gets a reference to the given int64 and assigns it to the LowerBound field.
func (o *TargetingTemplateAudienceSizingReachEstimate) SetLowerBound(v int64) {
	o.LowerBound = &v
}

// GetUpperBound returns the UpperBound field value if set, zero value otherwise.
func (o *TargetingTemplateAudienceSizingReachEstimate) GetUpperBound() int64 {
	if o == nil || IsNil(o.UpperBound) {
		var ret int64
		return ret
	}
	return *o.UpperBound
}

// GetUpperBoundOk returns a tuple with the UpperBound field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TargetingTemplateAudienceSizingReachEstimate) GetUpperBoundOk() (*int64, bool) {
	if o == nil || IsNil(o.UpperBound) {
		return nil, false
	}
	return o.UpperBound, true
}

// HasUpperBound returns a boolean if a field has been set.
func (o *TargetingTemplateAudienceSizingReachEstimate) HasUpperBound() bool {
	if o != nil && !IsNil(o.UpperBound) {
		return true
	}

	return false
}

// SetUpperBound gets a reference to the given int64 and assigns it to the UpperBound field.
func (o *TargetingTemplateAudienceSizingReachEstimate) SetUpperBound(v int64) {
	o.UpperBound = &v
}

func (o TargetingTemplateAudienceSizingReachEstimate) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TargetingTemplateAudienceSizingReachEstimate) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Estimate) {
		toSerialize["estimate"] = o.Estimate
	}
	if !IsNil(o.LowerBound) {
		toSerialize["lower_bound"] = o.LowerBound
	}
	if !IsNil(o.UpperBound) {
		toSerialize["upper_bound"] = o.UpperBound
	}
	return toSerialize, nil
}

type NullableTargetingTemplateAudienceSizingReachEstimate struct {
	value *TargetingTemplateAudienceSizingReachEstimate
	isSet bool
}

func (v NullableTargetingTemplateAudienceSizingReachEstimate) Get() *TargetingTemplateAudienceSizingReachEstimate {
	return v.value
}

func (v *NullableTargetingTemplateAudienceSizingReachEstimate) Set(val *TargetingTemplateAudienceSizingReachEstimate) {
	v.value = val
	v.isSet = true
}

func (v NullableTargetingTemplateAudienceSizingReachEstimate) IsSet() bool {
	return v.isSet
}

func (v *NullableTargetingTemplateAudienceSizingReachEstimate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTargetingTemplateAudienceSizingReachEstimate(val *TargetingTemplateAudienceSizingReachEstimate) *NullableTargetingTemplateAudienceSizingReachEstimate {
	return &NullableTargetingTemplateAudienceSizingReachEstimate{value: val, isSet: true}
}

func (v NullableTargetingTemplateAudienceSizingReachEstimate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTargetingTemplateAudienceSizingReachEstimate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


