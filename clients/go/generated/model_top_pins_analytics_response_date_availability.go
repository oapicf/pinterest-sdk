/*
Pinterest REST API

Pinterest's REST API

API version: 5.12.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// checks if the TopPinsAnalyticsResponseDateAvailability type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TopPinsAnalyticsResponseDateAvailability{}

// TopPinsAnalyticsResponseDateAvailability struct for TopPinsAnalyticsResponseDateAvailability
type TopPinsAnalyticsResponseDateAvailability struct {
	LatestAvailableTimestamp *float32 `json:"latest_available_timestamp,omitempty"`
	IsRealtime *bool `json:"is_realtime,omitempty"`
}

// NewTopPinsAnalyticsResponseDateAvailability instantiates a new TopPinsAnalyticsResponseDateAvailability object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTopPinsAnalyticsResponseDateAvailability() *TopPinsAnalyticsResponseDateAvailability {
	this := TopPinsAnalyticsResponseDateAvailability{}
	return &this
}

// NewTopPinsAnalyticsResponseDateAvailabilityWithDefaults instantiates a new TopPinsAnalyticsResponseDateAvailability object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTopPinsAnalyticsResponseDateAvailabilityWithDefaults() *TopPinsAnalyticsResponseDateAvailability {
	this := TopPinsAnalyticsResponseDateAvailability{}
	return &this
}

// GetLatestAvailableTimestamp returns the LatestAvailableTimestamp field value if set, zero value otherwise.
func (o *TopPinsAnalyticsResponseDateAvailability) GetLatestAvailableTimestamp() float32 {
	if o == nil || IsNil(o.LatestAvailableTimestamp) {
		var ret float32
		return ret
	}
	return *o.LatestAvailableTimestamp
}

// GetLatestAvailableTimestampOk returns a tuple with the LatestAvailableTimestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TopPinsAnalyticsResponseDateAvailability) GetLatestAvailableTimestampOk() (*float32, bool) {
	if o == nil || IsNil(o.LatestAvailableTimestamp) {
		return nil, false
	}
	return o.LatestAvailableTimestamp, true
}

// HasLatestAvailableTimestamp returns a boolean if a field has been set.
func (o *TopPinsAnalyticsResponseDateAvailability) HasLatestAvailableTimestamp() bool {
	if o != nil && !IsNil(o.LatestAvailableTimestamp) {
		return true
	}

	return false
}

// SetLatestAvailableTimestamp gets a reference to the given float32 and assigns it to the LatestAvailableTimestamp field.
func (o *TopPinsAnalyticsResponseDateAvailability) SetLatestAvailableTimestamp(v float32) {
	o.LatestAvailableTimestamp = &v
}

// GetIsRealtime returns the IsRealtime field value if set, zero value otherwise.
func (o *TopPinsAnalyticsResponseDateAvailability) GetIsRealtime() bool {
	if o == nil || IsNil(o.IsRealtime) {
		var ret bool
		return ret
	}
	return *o.IsRealtime
}

// GetIsRealtimeOk returns a tuple with the IsRealtime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TopPinsAnalyticsResponseDateAvailability) GetIsRealtimeOk() (*bool, bool) {
	if o == nil || IsNil(o.IsRealtime) {
		return nil, false
	}
	return o.IsRealtime, true
}

// HasIsRealtime returns a boolean if a field has been set.
func (o *TopPinsAnalyticsResponseDateAvailability) HasIsRealtime() bool {
	if o != nil && !IsNil(o.IsRealtime) {
		return true
	}

	return false
}

// SetIsRealtime gets a reference to the given bool and assigns it to the IsRealtime field.
func (o *TopPinsAnalyticsResponseDateAvailability) SetIsRealtime(v bool) {
	o.IsRealtime = &v
}

func (o TopPinsAnalyticsResponseDateAvailability) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TopPinsAnalyticsResponseDateAvailability) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.LatestAvailableTimestamp) {
		toSerialize["latest_available_timestamp"] = o.LatestAvailableTimestamp
	}
	if !IsNil(o.IsRealtime) {
		toSerialize["is_realtime"] = o.IsRealtime
	}
	return toSerialize, nil
}

type NullableTopPinsAnalyticsResponseDateAvailability struct {
	value *TopPinsAnalyticsResponseDateAvailability
	isSet bool
}

func (v NullableTopPinsAnalyticsResponseDateAvailability) Get() *TopPinsAnalyticsResponseDateAvailability {
	return v.value
}

func (v *NullableTopPinsAnalyticsResponseDateAvailability) Set(val *TopPinsAnalyticsResponseDateAvailability) {
	v.value = val
	v.isSet = true
}

func (v NullableTopPinsAnalyticsResponseDateAvailability) IsSet() bool {
	return v.isSet
}

func (v *NullableTopPinsAnalyticsResponseDateAvailability) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTopPinsAnalyticsResponseDateAvailability(val *TopPinsAnalyticsResponseDateAvailability) *NullableTopPinsAnalyticsResponseDateAvailability {
	return &NullableTopPinsAnalyticsResponseDateAvailability{value: val, isSet: true}
}

func (v NullableTopPinsAnalyticsResponseDateAvailability) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTopPinsAnalyticsResponseDateAvailability) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

