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

// checks if the PinMediaSourceImageURL type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PinMediaSourceImageURL{}

// PinMediaSourceImageURL Image URL-based media source
type PinMediaSourceImageURL struct {
	SourceType string `json:"source_type"`
	Url string `json:"url"`
	// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
	IsStandard *bool `json:"is_standard,omitempty"`
}

type _PinMediaSourceImageURL PinMediaSourceImageURL

// NewPinMediaSourceImageURL instantiates a new PinMediaSourceImageURL object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPinMediaSourceImageURL(sourceType string, url string) *PinMediaSourceImageURL {
	this := PinMediaSourceImageURL{}
	this.SourceType = sourceType
	this.Url = url
	var isStandard bool = true
	this.IsStandard = &isStandard
	return &this
}

// NewPinMediaSourceImageURLWithDefaults instantiates a new PinMediaSourceImageURL object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPinMediaSourceImageURLWithDefaults() *PinMediaSourceImageURL {
	this := PinMediaSourceImageURL{}
	var isStandard bool = true
	this.IsStandard = &isStandard
	return &this
}

// GetSourceType returns the SourceType field value
func (o *PinMediaSourceImageURL) GetSourceType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SourceType
}

// GetSourceTypeOk returns a tuple with the SourceType field value
// and a boolean to check if the value has been set.
func (o *PinMediaSourceImageURL) GetSourceTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SourceType, true
}

// SetSourceType sets field value
func (o *PinMediaSourceImageURL) SetSourceType(v string) {
	o.SourceType = v
}

// GetUrl returns the Url field value
func (o *PinMediaSourceImageURL) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *PinMediaSourceImageURL) GetUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *PinMediaSourceImageURL) SetUrl(v string) {
	o.Url = v
}

// GetIsStandard returns the IsStandard field value if set, zero value otherwise.
func (o *PinMediaSourceImageURL) GetIsStandard() bool {
	if o == nil || IsNil(o.IsStandard) {
		var ret bool
		return ret
	}
	return *o.IsStandard
}

// GetIsStandardOk returns a tuple with the IsStandard field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinMediaSourceImageURL) GetIsStandardOk() (*bool, bool) {
	if o == nil || IsNil(o.IsStandard) {
		return nil, false
	}
	return o.IsStandard, true
}

// HasIsStandard returns a boolean if a field has been set.
func (o *PinMediaSourceImageURL) HasIsStandard() bool {
	if o != nil && !IsNil(o.IsStandard) {
		return true
	}

	return false
}

// SetIsStandard gets a reference to the given bool and assigns it to the IsStandard field.
func (o *PinMediaSourceImageURL) SetIsStandard(v bool) {
	o.IsStandard = &v
}

func (o PinMediaSourceImageURL) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PinMediaSourceImageURL) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["source_type"] = o.SourceType
	toSerialize["url"] = o.Url
	if !IsNil(o.IsStandard) {
		toSerialize["is_standard"] = o.IsStandard
	}
	return toSerialize, nil
}

func (o *PinMediaSourceImageURL) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"source_type",
		"url",
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

	varPinMediaSourceImageURL := _PinMediaSourceImageURL{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varPinMediaSourceImageURL)

	if err != nil {
		return err
	}

	*o = PinMediaSourceImageURL(varPinMediaSourceImageURL)

	return err
}

type NullablePinMediaSourceImageURL struct {
	value *PinMediaSourceImageURL
	isSet bool
}

func (v NullablePinMediaSourceImageURL) Get() *PinMediaSourceImageURL {
	return v.value
}

func (v *NullablePinMediaSourceImageURL) Set(val *PinMediaSourceImageURL) {
	v.value = val
	v.isSet = true
}

func (v NullablePinMediaSourceImageURL) IsSet() bool {
	return v.isSet
}

func (v *NullablePinMediaSourceImageURL) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePinMediaSourceImageURL(val *PinMediaSourceImageURL) *NullablePinMediaSourceImageURL {
	return &NullablePinMediaSourceImageURL{value: val, isSet: true}
}

func (v NullablePinMediaSourceImageURL) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePinMediaSourceImageURL) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


