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

// checks if the AdGroupAudienceSizingResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AdGroupAudienceSizingResponse{}

// AdGroupAudienceSizingResponse struct for AdGroupAudienceSizingResponse
type AdGroupAudienceSizingResponse struct {
	// The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	AudienceSizeLowerBound *float32 `json:"audience_size_lower_bound,omitempty"`
	// The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	AudienceSizeUpperBound *float32 `json:"audience_size_upper_bound,omitempty"`
}

// NewAdGroupAudienceSizingResponse instantiates a new AdGroupAudienceSizingResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdGroupAudienceSizingResponse() *AdGroupAudienceSizingResponse {
	this := AdGroupAudienceSizingResponse{}
	return &this
}

// NewAdGroupAudienceSizingResponseWithDefaults instantiates a new AdGroupAudienceSizingResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdGroupAudienceSizingResponseWithDefaults() *AdGroupAudienceSizingResponse {
	this := AdGroupAudienceSizingResponse{}
	return &this
}

// GetAudienceSizeLowerBound returns the AudienceSizeLowerBound field value if set, zero value otherwise.
func (o *AdGroupAudienceSizingResponse) GetAudienceSizeLowerBound() float32 {
	if o == nil || IsNil(o.AudienceSizeLowerBound) {
		var ret float32
		return ret
	}
	return *o.AudienceSizeLowerBound
}

// GetAudienceSizeLowerBoundOk returns a tuple with the AudienceSizeLowerBound field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdGroupAudienceSizingResponse) GetAudienceSizeLowerBoundOk() (*float32, bool) {
	if o == nil || IsNil(o.AudienceSizeLowerBound) {
		return nil, false
	}
	return o.AudienceSizeLowerBound, true
}

// HasAudienceSizeLowerBound returns a boolean if a field has been set.
func (o *AdGroupAudienceSizingResponse) HasAudienceSizeLowerBound() bool {
	if o != nil && !IsNil(o.AudienceSizeLowerBound) {
		return true
	}

	return false
}

// SetAudienceSizeLowerBound gets a reference to the given float32 and assigns it to the AudienceSizeLowerBound field.
func (o *AdGroupAudienceSizingResponse) SetAudienceSizeLowerBound(v float32) {
	o.AudienceSizeLowerBound = &v
}

// GetAudienceSizeUpperBound returns the AudienceSizeUpperBound field value if set, zero value otherwise.
func (o *AdGroupAudienceSizingResponse) GetAudienceSizeUpperBound() float32 {
	if o == nil || IsNil(o.AudienceSizeUpperBound) {
		var ret float32
		return ret
	}
	return *o.AudienceSizeUpperBound
}

// GetAudienceSizeUpperBoundOk returns a tuple with the AudienceSizeUpperBound field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdGroupAudienceSizingResponse) GetAudienceSizeUpperBoundOk() (*float32, bool) {
	if o == nil || IsNil(o.AudienceSizeUpperBound) {
		return nil, false
	}
	return o.AudienceSizeUpperBound, true
}

// HasAudienceSizeUpperBound returns a boolean if a field has been set.
func (o *AdGroupAudienceSizingResponse) HasAudienceSizeUpperBound() bool {
	if o != nil && !IsNil(o.AudienceSizeUpperBound) {
		return true
	}

	return false
}

// SetAudienceSizeUpperBound gets a reference to the given float32 and assigns it to the AudienceSizeUpperBound field.
func (o *AdGroupAudienceSizingResponse) SetAudienceSizeUpperBound(v float32) {
	o.AudienceSizeUpperBound = &v
}

func (o AdGroupAudienceSizingResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AdGroupAudienceSizingResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.AudienceSizeLowerBound) {
		toSerialize["audience_size_lower_bound"] = o.AudienceSizeLowerBound
	}
	if !IsNil(o.AudienceSizeUpperBound) {
		toSerialize["audience_size_upper_bound"] = o.AudienceSizeUpperBound
	}
	return toSerialize, nil
}

type NullableAdGroupAudienceSizingResponse struct {
	value *AdGroupAudienceSizingResponse
	isSet bool
}

func (v NullableAdGroupAudienceSizingResponse) Get() *AdGroupAudienceSizingResponse {
	return v.value
}

func (v *NullableAdGroupAudienceSizingResponse) Set(val *AdGroupAudienceSizingResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableAdGroupAudienceSizingResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableAdGroupAudienceSizingResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdGroupAudienceSizingResponse(val *AdGroupAudienceSizingResponse) *NullableAdGroupAudienceSizingResponse {
	return &NullableAdGroupAudienceSizingResponse{value: val, isSet: true}
}

func (v NullableAdGroupAudienceSizingResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdGroupAudienceSizingResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


