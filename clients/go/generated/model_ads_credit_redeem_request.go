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

// checks if the AdsCreditRedeemRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AdsCreditRedeemRequest{}

// AdsCreditRedeemRequest struct for AdsCreditRedeemRequest
type AdsCreditRedeemRequest struct {
	// Takes in a SHA256 hash of the offerCode.
	OfferCodeHash string `json:"offerCodeHash" validate:"regexp=^[a-z0-9]*$"`
	// If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
	ValidateOnly bool `json:"validateOnly"`
}

type _AdsCreditRedeemRequest AdsCreditRedeemRequest

// NewAdsCreditRedeemRequest instantiates a new AdsCreditRedeemRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdsCreditRedeemRequest(offerCodeHash string, validateOnly bool) *AdsCreditRedeemRequest {
	this := AdsCreditRedeemRequest{}
	this.OfferCodeHash = offerCodeHash
	this.ValidateOnly = validateOnly
	return &this
}

// NewAdsCreditRedeemRequestWithDefaults instantiates a new AdsCreditRedeemRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdsCreditRedeemRequestWithDefaults() *AdsCreditRedeemRequest {
	this := AdsCreditRedeemRequest{}
	return &this
}

// GetOfferCodeHash returns the OfferCodeHash field value
func (o *AdsCreditRedeemRequest) GetOfferCodeHash() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.OfferCodeHash
}

// GetOfferCodeHashOk returns a tuple with the OfferCodeHash field value
// and a boolean to check if the value has been set.
func (o *AdsCreditRedeemRequest) GetOfferCodeHashOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.OfferCodeHash, true
}

// SetOfferCodeHash sets field value
func (o *AdsCreditRedeemRequest) SetOfferCodeHash(v string) {
	o.OfferCodeHash = v
}

// GetValidateOnly returns the ValidateOnly field value
func (o *AdsCreditRedeemRequest) GetValidateOnly() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.ValidateOnly
}

// GetValidateOnlyOk returns a tuple with the ValidateOnly field value
// and a boolean to check if the value has been set.
func (o *AdsCreditRedeemRequest) GetValidateOnlyOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ValidateOnly, true
}

// SetValidateOnly sets field value
func (o *AdsCreditRedeemRequest) SetValidateOnly(v bool) {
	o.ValidateOnly = v
}

func (o AdsCreditRedeemRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AdsCreditRedeemRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["offerCodeHash"] = o.OfferCodeHash
	toSerialize["validateOnly"] = o.ValidateOnly
	return toSerialize, nil
}

func (o *AdsCreditRedeemRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"offerCodeHash",
		"validateOnly",
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

	varAdsCreditRedeemRequest := _AdsCreditRedeemRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAdsCreditRedeemRequest)

	if err != nil {
		return err
	}

	*o = AdsCreditRedeemRequest(varAdsCreditRedeemRequest)

	return err
}

type NullableAdsCreditRedeemRequest struct {
	value *AdsCreditRedeemRequest
	isSet bool
}

func (v NullableAdsCreditRedeemRequest) Get() *AdsCreditRedeemRequest {
	return v.value
}

func (v *NullableAdsCreditRedeemRequest) Set(val *AdsCreditRedeemRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableAdsCreditRedeemRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableAdsCreditRedeemRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdsCreditRedeemRequest(val *AdsCreditRedeemRequest) *NullableAdsCreditRedeemRequest {
	return &NullableAdsCreditRedeemRequest{value: val, isSet: true}
}

func (v NullableAdsCreditRedeemRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdsCreditRedeemRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


