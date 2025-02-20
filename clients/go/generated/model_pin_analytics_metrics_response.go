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

// checks if the PinAnalyticsMetricsResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PinAnalyticsMetricsResponse{}

// PinAnalyticsMetricsResponse struct for PinAnalyticsMetricsResponse
type PinAnalyticsMetricsResponse struct {
	// The lifetime metric name and value.
	LifetimeMetrics *map[string]int32 `json:"lifetime_metrics,omitempty"`
	// Array with the requested daily metric records
	DailyMetrics []PinAnalyticsMetricsResponseDailyMetricsInner `json:"daily_metrics,omitempty"`
	// The metric name and value over the requested period for each requested metric
	SummaryMetrics *map[string]float32 `json:"summary_metrics,omitempty"`
}

// NewPinAnalyticsMetricsResponse instantiates a new PinAnalyticsMetricsResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPinAnalyticsMetricsResponse() *PinAnalyticsMetricsResponse {
	this := PinAnalyticsMetricsResponse{}
	return &this
}

// NewPinAnalyticsMetricsResponseWithDefaults instantiates a new PinAnalyticsMetricsResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPinAnalyticsMetricsResponseWithDefaults() *PinAnalyticsMetricsResponse {
	this := PinAnalyticsMetricsResponse{}
	return &this
}

// GetLifetimeMetrics returns the LifetimeMetrics field value if set, zero value otherwise.
func (o *PinAnalyticsMetricsResponse) GetLifetimeMetrics() map[string]int32 {
	if o == nil || IsNil(o.LifetimeMetrics) {
		var ret map[string]int32
		return ret
	}
	return *o.LifetimeMetrics
}

// GetLifetimeMetricsOk returns a tuple with the LifetimeMetrics field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinAnalyticsMetricsResponse) GetLifetimeMetricsOk() (*map[string]int32, bool) {
	if o == nil || IsNil(o.LifetimeMetrics) {
		return nil, false
	}
	return o.LifetimeMetrics, true
}

// HasLifetimeMetrics returns a boolean if a field has been set.
func (o *PinAnalyticsMetricsResponse) HasLifetimeMetrics() bool {
	if o != nil && !IsNil(o.LifetimeMetrics) {
		return true
	}

	return false
}

// SetLifetimeMetrics gets a reference to the given map[string]int32 and assigns it to the LifetimeMetrics field.
func (o *PinAnalyticsMetricsResponse) SetLifetimeMetrics(v map[string]int32) {
	o.LifetimeMetrics = &v
}

// GetDailyMetrics returns the DailyMetrics field value if set, zero value otherwise.
func (o *PinAnalyticsMetricsResponse) GetDailyMetrics() []PinAnalyticsMetricsResponseDailyMetricsInner {
	if o == nil || IsNil(o.DailyMetrics) {
		var ret []PinAnalyticsMetricsResponseDailyMetricsInner
		return ret
	}
	return o.DailyMetrics
}

// GetDailyMetricsOk returns a tuple with the DailyMetrics field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinAnalyticsMetricsResponse) GetDailyMetricsOk() ([]PinAnalyticsMetricsResponseDailyMetricsInner, bool) {
	if o == nil || IsNil(o.DailyMetrics) {
		return nil, false
	}
	return o.DailyMetrics, true
}

// HasDailyMetrics returns a boolean if a field has been set.
func (o *PinAnalyticsMetricsResponse) HasDailyMetrics() bool {
	if o != nil && !IsNil(o.DailyMetrics) {
		return true
	}

	return false
}

// SetDailyMetrics gets a reference to the given []PinAnalyticsMetricsResponseDailyMetricsInner and assigns it to the DailyMetrics field.
func (o *PinAnalyticsMetricsResponse) SetDailyMetrics(v []PinAnalyticsMetricsResponseDailyMetricsInner) {
	o.DailyMetrics = v
}

// GetSummaryMetrics returns the SummaryMetrics field value if set, zero value otherwise.
func (o *PinAnalyticsMetricsResponse) GetSummaryMetrics() map[string]float32 {
	if o == nil || IsNil(o.SummaryMetrics) {
		var ret map[string]float32
		return ret
	}
	return *o.SummaryMetrics
}

// GetSummaryMetricsOk returns a tuple with the SummaryMetrics field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinAnalyticsMetricsResponse) GetSummaryMetricsOk() (*map[string]float32, bool) {
	if o == nil || IsNil(o.SummaryMetrics) {
		return nil, false
	}
	return o.SummaryMetrics, true
}

// HasSummaryMetrics returns a boolean if a field has been set.
func (o *PinAnalyticsMetricsResponse) HasSummaryMetrics() bool {
	if o != nil && !IsNil(o.SummaryMetrics) {
		return true
	}

	return false
}

// SetSummaryMetrics gets a reference to the given map[string]float32 and assigns it to the SummaryMetrics field.
func (o *PinAnalyticsMetricsResponse) SetSummaryMetrics(v map[string]float32) {
	o.SummaryMetrics = &v
}

func (o PinAnalyticsMetricsResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PinAnalyticsMetricsResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.LifetimeMetrics) {
		toSerialize["lifetime_metrics"] = o.LifetimeMetrics
	}
	if !IsNil(o.DailyMetrics) {
		toSerialize["daily_metrics"] = o.DailyMetrics
	}
	if !IsNil(o.SummaryMetrics) {
		toSerialize["summary_metrics"] = o.SummaryMetrics
	}
	return toSerialize, nil
}

type NullablePinAnalyticsMetricsResponse struct {
	value *PinAnalyticsMetricsResponse
	isSet bool
}

func (v NullablePinAnalyticsMetricsResponse) Get() *PinAnalyticsMetricsResponse {
	return v.value
}

func (v *NullablePinAnalyticsMetricsResponse) Set(val *PinAnalyticsMetricsResponse) {
	v.value = val
	v.isSet = true
}

func (v NullablePinAnalyticsMetricsResponse) IsSet() bool {
	return v.isSet
}

func (v *NullablePinAnalyticsMetricsResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePinAnalyticsMetricsResponse(val *PinAnalyticsMetricsResponse) *NullablePinAnalyticsMetricsResponse {
	return &NullablePinAnalyticsMetricsResponse{value: val, isSet: true}
}

func (v NullablePinAnalyticsMetricsResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePinAnalyticsMetricsResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


