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

// checks if the ConversionEventResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ConversionEventResponse{}

// ConversionEventResponse struct for ConversionEventResponse
type ConversionEventResponse struct {
	ConversionEvent *ConversionTagType `json:"conversion_event,omitempty"`
	// Id of the tag.
	ConversionTagId *string `json:"conversion_tag_id,omitempty"`
	// Id of the ad account.
	AdAccountId *string `json:"ad_account_id,omitempty"`
	// Creation date in epoch format.
	CreatedTime *int32 `json:"created_time,omitempty"`
}

// NewConversionEventResponse instantiates a new ConversionEventResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversionEventResponse() *ConversionEventResponse {
	this := ConversionEventResponse{}
	return &this
}

// NewConversionEventResponseWithDefaults instantiates a new ConversionEventResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversionEventResponseWithDefaults() *ConversionEventResponse {
	this := ConversionEventResponse{}
	return &this
}

// GetConversionEvent returns the ConversionEvent field value if set, zero value otherwise.
func (o *ConversionEventResponse) GetConversionEvent() ConversionTagType {
	if o == nil || IsNil(o.ConversionEvent) {
		var ret ConversionTagType
		return ret
	}
	return *o.ConversionEvent
}

// GetConversionEventOk returns a tuple with the ConversionEvent field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversionEventResponse) GetConversionEventOk() (*ConversionTagType, bool) {
	if o == nil || IsNil(o.ConversionEvent) {
		return nil, false
	}
	return o.ConversionEvent, true
}

// HasConversionEvent returns a boolean if a field has been set.
func (o *ConversionEventResponse) HasConversionEvent() bool {
	if o != nil && !IsNil(o.ConversionEvent) {
		return true
	}

	return false
}

// SetConversionEvent gets a reference to the given ConversionTagType and assigns it to the ConversionEvent field.
func (o *ConversionEventResponse) SetConversionEvent(v ConversionTagType) {
	o.ConversionEvent = &v
}

// GetConversionTagId returns the ConversionTagId field value if set, zero value otherwise.
func (o *ConversionEventResponse) GetConversionTagId() string {
	if o == nil || IsNil(o.ConversionTagId) {
		var ret string
		return ret
	}
	return *o.ConversionTagId
}

// GetConversionTagIdOk returns a tuple with the ConversionTagId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversionEventResponse) GetConversionTagIdOk() (*string, bool) {
	if o == nil || IsNil(o.ConversionTagId) {
		return nil, false
	}
	return o.ConversionTagId, true
}

// HasConversionTagId returns a boolean if a field has been set.
func (o *ConversionEventResponse) HasConversionTagId() bool {
	if o != nil && !IsNil(o.ConversionTagId) {
		return true
	}

	return false
}

// SetConversionTagId gets a reference to the given string and assigns it to the ConversionTagId field.
func (o *ConversionEventResponse) SetConversionTagId(v string) {
	o.ConversionTagId = &v
}

// GetAdAccountId returns the AdAccountId field value if set, zero value otherwise.
func (o *ConversionEventResponse) GetAdAccountId() string {
	if o == nil || IsNil(o.AdAccountId) {
		var ret string
		return ret
	}
	return *o.AdAccountId
}

// GetAdAccountIdOk returns a tuple with the AdAccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversionEventResponse) GetAdAccountIdOk() (*string, bool) {
	if o == nil || IsNil(o.AdAccountId) {
		return nil, false
	}
	return o.AdAccountId, true
}

// HasAdAccountId returns a boolean if a field has been set.
func (o *ConversionEventResponse) HasAdAccountId() bool {
	if o != nil && !IsNil(o.AdAccountId) {
		return true
	}

	return false
}

// SetAdAccountId gets a reference to the given string and assigns it to the AdAccountId field.
func (o *ConversionEventResponse) SetAdAccountId(v string) {
	o.AdAccountId = &v
}

// GetCreatedTime returns the CreatedTime field value if set, zero value otherwise.
func (o *ConversionEventResponse) GetCreatedTime() int32 {
	if o == nil || IsNil(o.CreatedTime) {
		var ret int32
		return ret
	}
	return *o.CreatedTime
}

// GetCreatedTimeOk returns a tuple with the CreatedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversionEventResponse) GetCreatedTimeOk() (*int32, bool) {
	if o == nil || IsNil(o.CreatedTime) {
		return nil, false
	}
	return o.CreatedTime, true
}

// HasCreatedTime returns a boolean if a field has been set.
func (o *ConversionEventResponse) HasCreatedTime() bool {
	if o != nil && !IsNil(o.CreatedTime) {
		return true
	}

	return false
}

// SetCreatedTime gets a reference to the given int32 and assigns it to the CreatedTime field.
func (o *ConversionEventResponse) SetCreatedTime(v int32) {
	o.CreatedTime = &v
}

func (o ConversionEventResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ConversionEventResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ConversionEvent) {
		toSerialize["conversion_event"] = o.ConversionEvent
	}
	if !IsNil(o.ConversionTagId) {
		toSerialize["conversion_tag_id"] = o.ConversionTagId
	}
	if !IsNil(o.AdAccountId) {
		toSerialize["ad_account_id"] = o.AdAccountId
	}
	if !IsNil(o.CreatedTime) {
		toSerialize["created_time"] = o.CreatedTime
	}
	return toSerialize, nil
}

type NullableConversionEventResponse struct {
	value *ConversionEventResponse
	isSet bool
}

func (v NullableConversionEventResponse) Get() *ConversionEventResponse {
	return v.value
}

func (v *NullableConversionEventResponse) Set(val *ConversionEventResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableConversionEventResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableConversionEventResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversionEventResponse(val *ConversionEventResponse) *NullableConversionEventResponse {
	return &NullableConversionEventResponse{value: val, isSet: true}
}

func (v NullableConversionEventResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversionEventResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

