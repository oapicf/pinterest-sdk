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

// checks if the TopPinsAnalyticsResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TopPinsAnalyticsResponse{}

// TopPinsAnalyticsResponse struct for TopPinsAnalyticsResponse
type TopPinsAnalyticsResponse struct {
	DateAvailability *TopPinsAnalyticsResponseDateAvailability `json:"date_availability,omitempty"`
	Pins []TopPinsAnalyticsResponsePinsInner `json:"pins,omitempty"`
	SortBy *string `json:"sort_by,omitempty"`
}

// NewTopPinsAnalyticsResponse instantiates a new TopPinsAnalyticsResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTopPinsAnalyticsResponse() *TopPinsAnalyticsResponse {
	this := TopPinsAnalyticsResponse{}
	return &this
}

// NewTopPinsAnalyticsResponseWithDefaults instantiates a new TopPinsAnalyticsResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTopPinsAnalyticsResponseWithDefaults() *TopPinsAnalyticsResponse {
	this := TopPinsAnalyticsResponse{}
	return &this
}

// GetDateAvailability returns the DateAvailability field value if set, zero value otherwise.
func (o *TopPinsAnalyticsResponse) GetDateAvailability() TopPinsAnalyticsResponseDateAvailability {
	if o == nil || IsNil(o.DateAvailability) {
		var ret TopPinsAnalyticsResponseDateAvailability
		return ret
	}
	return *o.DateAvailability
}

// GetDateAvailabilityOk returns a tuple with the DateAvailability field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TopPinsAnalyticsResponse) GetDateAvailabilityOk() (*TopPinsAnalyticsResponseDateAvailability, bool) {
	if o == nil || IsNil(o.DateAvailability) {
		return nil, false
	}
	return o.DateAvailability, true
}

// HasDateAvailability returns a boolean if a field has been set.
func (o *TopPinsAnalyticsResponse) HasDateAvailability() bool {
	if o != nil && !IsNil(o.DateAvailability) {
		return true
	}

	return false
}

// SetDateAvailability gets a reference to the given TopPinsAnalyticsResponseDateAvailability and assigns it to the DateAvailability field.
func (o *TopPinsAnalyticsResponse) SetDateAvailability(v TopPinsAnalyticsResponseDateAvailability) {
	o.DateAvailability = &v
}

// GetPins returns the Pins field value if set, zero value otherwise.
func (o *TopPinsAnalyticsResponse) GetPins() []TopPinsAnalyticsResponsePinsInner {
	if o == nil || IsNil(o.Pins) {
		var ret []TopPinsAnalyticsResponsePinsInner
		return ret
	}
	return o.Pins
}

// GetPinsOk returns a tuple with the Pins field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TopPinsAnalyticsResponse) GetPinsOk() ([]TopPinsAnalyticsResponsePinsInner, bool) {
	if o == nil || IsNil(o.Pins) {
		return nil, false
	}
	return o.Pins, true
}

// HasPins returns a boolean if a field has been set.
func (o *TopPinsAnalyticsResponse) HasPins() bool {
	if o != nil && !IsNil(o.Pins) {
		return true
	}

	return false
}

// SetPins gets a reference to the given []TopPinsAnalyticsResponsePinsInner and assigns it to the Pins field.
func (o *TopPinsAnalyticsResponse) SetPins(v []TopPinsAnalyticsResponsePinsInner) {
	o.Pins = v
}

// GetSortBy returns the SortBy field value if set, zero value otherwise.
func (o *TopPinsAnalyticsResponse) GetSortBy() string {
	if o == nil || IsNil(o.SortBy) {
		var ret string
		return ret
	}
	return *o.SortBy
}

// GetSortByOk returns a tuple with the SortBy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TopPinsAnalyticsResponse) GetSortByOk() (*string, bool) {
	if o == nil || IsNil(o.SortBy) {
		return nil, false
	}
	return o.SortBy, true
}

// HasSortBy returns a boolean if a field has been set.
func (o *TopPinsAnalyticsResponse) HasSortBy() bool {
	if o != nil && !IsNil(o.SortBy) {
		return true
	}

	return false
}

// SetSortBy gets a reference to the given string and assigns it to the SortBy field.
func (o *TopPinsAnalyticsResponse) SetSortBy(v string) {
	o.SortBy = &v
}

func (o TopPinsAnalyticsResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TopPinsAnalyticsResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.DateAvailability) {
		toSerialize["date_availability"] = o.DateAvailability
	}
	if !IsNil(o.Pins) {
		toSerialize["pins"] = o.Pins
	}
	if !IsNil(o.SortBy) {
		toSerialize["sort_by"] = o.SortBy
	}
	return toSerialize, nil
}

type NullableTopPinsAnalyticsResponse struct {
	value *TopPinsAnalyticsResponse
	isSet bool
}

func (v NullableTopPinsAnalyticsResponse) Get() *TopPinsAnalyticsResponse {
	return v.value
}

func (v *NullableTopPinsAnalyticsResponse) Set(val *TopPinsAnalyticsResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableTopPinsAnalyticsResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableTopPinsAnalyticsResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTopPinsAnalyticsResponse(val *TopPinsAnalyticsResponse) *NullableTopPinsAnalyticsResponse {
	return &NullableTopPinsAnalyticsResponse{value: val, isSet: true}
}

func (v NullableTopPinsAnalyticsResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTopPinsAnalyticsResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


