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

// checks if the AnalyticsDailyMetrics type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AnalyticsDailyMetrics{}

// AnalyticsDailyMetrics struct for AnalyticsDailyMetrics
type AnalyticsDailyMetrics struct {
	DataStatus *DataStatus `json:"data_status,omitempty"`
	// Metrics date (UTC): YYYY-MM-DD.
	Date *string `json:"date,omitempty"`
	// The metric name and daily value for each requested metric
	Metrics *map[string]float32 `json:"metrics,omitempty"`
}

// NewAnalyticsDailyMetrics instantiates a new AnalyticsDailyMetrics object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAnalyticsDailyMetrics() *AnalyticsDailyMetrics {
	this := AnalyticsDailyMetrics{}
	return &this
}

// NewAnalyticsDailyMetricsWithDefaults instantiates a new AnalyticsDailyMetrics object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAnalyticsDailyMetricsWithDefaults() *AnalyticsDailyMetrics {
	this := AnalyticsDailyMetrics{}
	return &this
}

// GetDataStatus returns the DataStatus field value if set, zero value otherwise.
func (o *AnalyticsDailyMetrics) GetDataStatus() DataStatus {
	if o == nil || IsNil(o.DataStatus) {
		var ret DataStatus
		return ret
	}
	return *o.DataStatus
}

// GetDataStatusOk returns a tuple with the DataStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyticsDailyMetrics) GetDataStatusOk() (*DataStatus, bool) {
	if o == nil || IsNil(o.DataStatus) {
		return nil, false
	}
	return o.DataStatus, true
}

// HasDataStatus returns a boolean if a field has been set.
func (o *AnalyticsDailyMetrics) HasDataStatus() bool {
	if o != nil && !IsNil(o.DataStatus) {
		return true
	}

	return false
}

// SetDataStatus gets a reference to the given DataStatus and assigns it to the DataStatus field.
func (o *AnalyticsDailyMetrics) SetDataStatus(v DataStatus) {
	o.DataStatus = &v
}

// GetDate returns the Date field value if set, zero value otherwise.
func (o *AnalyticsDailyMetrics) GetDate() string {
	if o == nil || IsNil(o.Date) {
		var ret string
		return ret
	}
	return *o.Date
}

// GetDateOk returns a tuple with the Date field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyticsDailyMetrics) GetDateOk() (*string, bool) {
	if o == nil || IsNil(o.Date) {
		return nil, false
	}
	return o.Date, true
}

// HasDate returns a boolean if a field has been set.
func (o *AnalyticsDailyMetrics) HasDate() bool {
	if o != nil && !IsNil(o.Date) {
		return true
	}

	return false
}

// SetDate gets a reference to the given string and assigns it to the Date field.
func (o *AnalyticsDailyMetrics) SetDate(v string) {
	o.Date = &v
}

// GetMetrics returns the Metrics field value if set, zero value otherwise.
func (o *AnalyticsDailyMetrics) GetMetrics() map[string]float32 {
	if o == nil || IsNil(o.Metrics) {
		var ret map[string]float32
		return ret
	}
	return *o.Metrics
}

// GetMetricsOk returns a tuple with the Metrics field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AnalyticsDailyMetrics) GetMetricsOk() (*map[string]float32, bool) {
	if o == nil || IsNil(o.Metrics) {
		return nil, false
	}
	return o.Metrics, true
}

// HasMetrics returns a boolean if a field has been set.
func (o *AnalyticsDailyMetrics) HasMetrics() bool {
	if o != nil && !IsNil(o.Metrics) {
		return true
	}

	return false
}

// SetMetrics gets a reference to the given map[string]float32 and assigns it to the Metrics field.
func (o *AnalyticsDailyMetrics) SetMetrics(v map[string]float32) {
	o.Metrics = &v
}

func (o AnalyticsDailyMetrics) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AnalyticsDailyMetrics) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.DataStatus) {
		toSerialize["data_status"] = o.DataStatus
	}
	if !IsNil(o.Date) {
		toSerialize["date"] = o.Date
	}
	if !IsNil(o.Metrics) {
		toSerialize["metrics"] = o.Metrics
	}
	return toSerialize, nil
}

type NullableAnalyticsDailyMetrics struct {
	value *AnalyticsDailyMetrics
	isSet bool
}

func (v NullableAnalyticsDailyMetrics) Get() *AnalyticsDailyMetrics {
	return v.value
}

func (v *NullableAnalyticsDailyMetrics) Set(val *AnalyticsDailyMetrics) {
	v.value = val
	v.isSet = true
}

func (v NullableAnalyticsDailyMetrics) IsSet() bool {
	return v.isSet
}

func (v *NullableAnalyticsDailyMetrics) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAnalyticsDailyMetrics(val *AnalyticsDailyMetrics) *NullableAnalyticsDailyMetrics {
	return &NullableAnalyticsDailyMetrics{value: val, isSet: true}
}

func (v NullableAnalyticsDailyMetrics) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAnalyticsDailyMetrics) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


