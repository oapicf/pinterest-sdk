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
	"bytes"
	"fmt"
)

// checks if the CatalogsFeedProcessingSchedule type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsFeedProcessingSchedule{}

// CatalogsFeedProcessingSchedule Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
type CatalogsFeedProcessingSchedule struct {
	// A time in format HH:MM with leading 0 (zero)
	Time string `json:"time" validate:"regexp=^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$"`
	// The timezone considered for the processing schedule time.
	Timezone NullableString `json:"timezone"`
}

type _CatalogsFeedProcessingSchedule CatalogsFeedProcessingSchedule

// NewCatalogsFeedProcessingSchedule instantiates a new CatalogsFeedProcessingSchedule object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsFeedProcessingSchedule(time string, timezone NullableString) *CatalogsFeedProcessingSchedule {
	this := CatalogsFeedProcessingSchedule{}
	this.Time = time
	this.Timezone = timezone
	return &this
}

// NewCatalogsFeedProcessingScheduleWithDefaults instantiates a new CatalogsFeedProcessingSchedule object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsFeedProcessingScheduleWithDefaults() *CatalogsFeedProcessingSchedule {
	this := CatalogsFeedProcessingSchedule{}
	return &this
}

// GetTime returns the Time field value
func (o *CatalogsFeedProcessingSchedule) GetTime() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Time
}

// GetTimeOk returns a tuple with the Time field value
// and a boolean to check if the value has been set.
func (o *CatalogsFeedProcessingSchedule) GetTimeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Time, true
}

// SetTime sets field value
func (o *CatalogsFeedProcessingSchedule) SetTime(v string) {
	o.Time = v
}

// GetTimezone returns the Timezone field value
// If the value is explicit nil, the zero value for string will be returned
func (o *CatalogsFeedProcessingSchedule) GetTimezone() string {
	if o == nil || o.Timezone.Get() == nil {
		var ret string
		return ret
	}

	return *o.Timezone.Get()
}

// GetTimezoneOk returns a tuple with the Timezone field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsFeedProcessingSchedule) GetTimezoneOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timezone.Get(), o.Timezone.IsSet()
}

// SetTimezone sets field value
func (o *CatalogsFeedProcessingSchedule) SetTimezone(v string) {
	o.Timezone.Set(&v)
}

func (o CatalogsFeedProcessingSchedule) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsFeedProcessingSchedule) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["time"] = o.Time
	toSerialize["timezone"] = o.Timezone.Get()
	return toSerialize, nil
}

func (o *CatalogsFeedProcessingSchedule) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"time",
		"timezone",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varCatalogsFeedProcessingSchedule := _CatalogsFeedProcessingSchedule{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsFeedProcessingSchedule)

	if err != nil {
		return err
	}

	*o = CatalogsFeedProcessingSchedule(varCatalogsFeedProcessingSchedule)

	return err
}

type NullableCatalogsFeedProcessingSchedule struct {
	value *CatalogsFeedProcessingSchedule
	isSet bool
}

func (v NullableCatalogsFeedProcessingSchedule) Get() *CatalogsFeedProcessingSchedule {
	return v.value
}

func (v *NullableCatalogsFeedProcessingSchedule) Set(val *CatalogsFeedProcessingSchedule) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsFeedProcessingSchedule) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsFeedProcessingSchedule) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsFeedProcessingSchedule(val *CatalogsFeedProcessingSchedule) *NullableCatalogsFeedProcessingSchedule {
	return &NullableCatalogsFeedProcessingSchedule{value: val, isSet: true}
}

func (v NullableCatalogsFeedProcessingSchedule) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsFeedProcessingSchedule) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


