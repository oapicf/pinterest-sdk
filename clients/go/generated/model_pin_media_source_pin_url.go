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
	"bytes"
	"fmt"
)

// checks if the PinMediaSourcePinURL type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PinMediaSourcePinURL{}

// PinMediaSourcePinURL Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
type PinMediaSourcePinURL struct {
	SourceType string `json:"source_type"`
	// This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
	IsAffiliateLink *bool `json:"is_affiliate_link,omitempty"`
}

type _PinMediaSourcePinURL PinMediaSourcePinURL

// NewPinMediaSourcePinURL instantiates a new PinMediaSourcePinURL object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPinMediaSourcePinURL(sourceType string) *PinMediaSourcePinURL {
	this := PinMediaSourcePinURL{}
	this.SourceType = sourceType
	var isAffiliateLink bool = false
	this.IsAffiliateLink = &isAffiliateLink
	return &this
}

// NewPinMediaSourcePinURLWithDefaults instantiates a new PinMediaSourcePinURL object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPinMediaSourcePinURLWithDefaults() *PinMediaSourcePinURL {
	this := PinMediaSourcePinURL{}
	var isAffiliateLink bool = false
	this.IsAffiliateLink = &isAffiliateLink
	return &this
}

// GetSourceType returns the SourceType field value
func (o *PinMediaSourcePinURL) GetSourceType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SourceType
}

// GetSourceTypeOk returns a tuple with the SourceType field value
// and a boolean to check if the value has been set.
func (o *PinMediaSourcePinURL) GetSourceTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SourceType, true
}

// SetSourceType sets field value
func (o *PinMediaSourcePinURL) SetSourceType(v string) {
	o.SourceType = v
}

// GetIsAffiliateLink returns the IsAffiliateLink field value if set, zero value otherwise.
func (o *PinMediaSourcePinURL) GetIsAffiliateLink() bool {
	if o == nil || IsNil(o.IsAffiliateLink) {
		var ret bool
		return ret
	}
	return *o.IsAffiliateLink
}

// GetIsAffiliateLinkOk returns a tuple with the IsAffiliateLink field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinMediaSourcePinURL) GetIsAffiliateLinkOk() (*bool, bool) {
	if o == nil || IsNil(o.IsAffiliateLink) {
		return nil, false
	}
	return o.IsAffiliateLink, true
}

// HasIsAffiliateLink returns a boolean if a field has been set.
func (o *PinMediaSourcePinURL) HasIsAffiliateLink() bool {
	if o != nil && !IsNil(o.IsAffiliateLink) {
		return true
	}

	return false
}

// SetIsAffiliateLink gets a reference to the given bool and assigns it to the IsAffiliateLink field.
func (o *PinMediaSourcePinURL) SetIsAffiliateLink(v bool) {
	o.IsAffiliateLink = &v
}

func (o PinMediaSourcePinURL) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PinMediaSourcePinURL) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["source_type"] = o.SourceType
	if !IsNil(o.IsAffiliateLink) {
		toSerialize["is_affiliate_link"] = o.IsAffiliateLink
	}
	return toSerialize, nil
}

func (o *PinMediaSourcePinURL) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"source_type",
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

	varPinMediaSourcePinURL := _PinMediaSourcePinURL{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varPinMediaSourcePinURL)

	if err != nil {
		return err
	}

	*o = PinMediaSourcePinURL(varPinMediaSourcePinURL)

	return err
}

type NullablePinMediaSourcePinURL struct {
	value *PinMediaSourcePinURL
	isSet bool
}

func (v NullablePinMediaSourcePinURL) Get() *PinMediaSourcePinURL {
	return v.value
}

func (v *NullablePinMediaSourcePinURL) Set(val *PinMediaSourcePinURL) {
	v.value = val
	v.isSet = true
}

func (v NullablePinMediaSourcePinURL) IsSet() bool {
	return v.isSet
}

func (v *NullablePinMediaSourcePinURL) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePinMediaSourcePinURL(val *PinMediaSourcePinURL) *NullablePinMediaSourcePinURL {
	return &NullablePinMediaSourcePinURL{value: val, isSet: true}
}

func (v NullablePinMediaSourcePinURL) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePinMediaSourcePinURL) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

