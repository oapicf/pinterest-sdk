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

// checks if the ConversionEventsUserDataAnyOf1 type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ConversionEventsUserDataAnyOf1{}

// ConversionEventsUserDataAnyOf1 struct for ConversionEventsUserDataAnyOf1
type ConversionEventsUserDataAnyOf1 struct {
	// Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	Em []string `json:"em,omitempty"`
	// Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	HashedMaids []string `json:"hashed_maids"`
	// The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
	ClientIpAddress *string `json:"client_ip_address,omitempty"`
	// The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
	ClientUserAgent *string `json:"client_user_agent,omitempty"`
}

type _ConversionEventsUserDataAnyOf1 ConversionEventsUserDataAnyOf1

// NewConversionEventsUserDataAnyOf1 instantiates a new ConversionEventsUserDataAnyOf1 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversionEventsUserDataAnyOf1(hashedMaids []string) *ConversionEventsUserDataAnyOf1 {
	this := ConversionEventsUserDataAnyOf1{}
	this.HashedMaids = hashedMaids
	return &this
}

// NewConversionEventsUserDataAnyOf1WithDefaults instantiates a new ConversionEventsUserDataAnyOf1 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversionEventsUserDataAnyOf1WithDefaults() *ConversionEventsUserDataAnyOf1 {
	this := ConversionEventsUserDataAnyOf1{}
	return &this
}

// GetEm returns the Em field value if set, zero value otherwise.
func (o *ConversionEventsUserDataAnyOf1) GetEm() []string {
	if o == nil || IsNil(o.Em) {
		var ret []string
		return ret
	}
	return o.Em
}

// GetEmOk returns a tuple with the Em field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversionEventsUserDataAnyOf1) GetEmOk() ([]string, bool) {
	if o == nil || IsNil(o.Em) {
		return nil, false
	}
	return o.Em, true
}

// HasEm returns a boolean if a field has been set.
func (o *ConversionEventsUserDataAnyOf1) HasEm() bool {
	if o != nil && !IsNil(o.Em) {
		return true
	}

	return false
}

// SetEm gets a reference to the given []string and assigns it to the Em field.
func (o *ConversionEventsUserDataAnyOf1) SetEm(v []string) {
	o.Em = v
}

// GetHashedMaids returns the HashedMaids field value
func (o *ConversionEventsUserDataAnyOf1) GetHashedMaids() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.HashedMaids
}

// GetHashedMaidsOk returns a tuple with the HashedMaids field value
// and a boolean to check if the value has been set.
func (o *ConversionEventsUserDataAnyOf1) GetHashedMaidsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.HashedMaids, true
}

// SetHashedMaids sets field value
func (o *ConversionEventsUserDataAnyOf1) SetHashedMaids(v []string) {
	o.HashedMaids = v
}

// GetClientIpAddress returns the ClientIpAddress field value if set, zero value otherwise.
func (o *ConversionEventsUserDataAnyOf1) GetClientIpAddress() string {
	if o == nil || IsNil(o.ClientIpAddress) {
		var ret string
		return ret
	}
	return *o.ClientIpAddress
}

// GetClientIpAddressOk returns a tuple with the ClientIpAddress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversionEventsUserDataAnyOf1) GetClientIpAddressOk() (*string, bool) {
	if o == nil || IsNil(o.ClientIpAddress) {
		return nil, false
	}
	return o.ClientIpAddress, true
}

// HasClientIpAddress returns a boolean if a field has been set.
func (o *ConversionEventsUserDataAnyOf1) HasClientIpAddress() bool {
	if o != nil && !IsNil(o.ClientIpAddress) {
		return true
	}

	return false
}

// SetClientIpAddress gets a reference to the given string and assigns it to the ClientIpAddress field.
func (o *ConversionEventsUserDataAnyOf1) SetClientIpAddress(v string) {
	o.ClientIpAddress = &v
}

// GetClientUserAgent returns the ClientUserAgent field value if set, zero value otherwise.
func (o *ConversionEventsUserDataAnyOf1) GetClientUserAgent() string {
	if o == nil || IsNil(o.ClientUserAgent) {
		var ret string
		return ret
	}
	return *o.ClientUserAgent
}

// GetClientUserAgentOk returns a tuple with the ClientUserAgent field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversionEventsUserDataAnyOf1) GetClientUserAgentOk() (*string, bool) {
	if o == nil || IsNil(o.ClientUserAgent) {
		return nil, false
	}
	return o.ClientUserAgent, true
}

// HasClientUserAgent returns a boolean if a field has been set.
func (o *ConversionEventsUserDataAnyOf1) HasClientUserAgent() bool {
	if o != nil && !IsNil(o.ClientUserAgent) {
		return true
	}

	return false
}

// SetClientUserAgent gets a reference to the given string and assigns it to the ClientUserAgent field.
func (o *ConversionEventsUserDataAnyOf1) SetClientUserAgent(v string) {
	o.ClientUserAgent = &v
}

func (o ConversionEventsUserDataAnyOf1) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ConversionEventsUserDataAnyOf1) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Em) {
		toSerialize["em"] = o.Em
	}
	toSerialize["hashed_maids"] = o.HashedMaids
	if !IsNil(o.ClientIpAddress) {
		toSerialize["client_ip_address"] = o.ClientIpAddress
	}
	if !IsNil(o.ClientUserAgent) {
		toSerialize["client_user_agent"] = o.ClientUserAgent
	}
	return toSerialize, nil
}

func (o *ConversionEventsUserDataAnyOf1) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"hashed_maids",
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

	varConversionEventsUserDataAnyOf1 := _ConversionEventsUserDataAnyOf1{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varConversionEventsUserDataAnyOf1)

	if err != nil {
		return err
	}

	*o = ConversionEventsUserDataAnyOf1(varConversionEventsUserDataAnyOf1)

	return err
}

type NullableConversionEventsUserDataAnyOf1 struct {
	value *ConversionEventsUserDataAnyOf1
	isSet bool
}

func (v NullableConversionEventsUserDataAnyOf1) Get() *ConversionEventsUserDataAnyOf1 {
	return v.value
}

func (v *NullableConversionEventsUserDataAnyOf1) Set(val *ConversionEventsUserDataAnyOf1) {
	v.value = val
	v.isSet = true
}

func (v NullableConversionEventsUserDataAnyOf1) IsSet() bool {
	return v.isSet
}

func (v *NullableConversionEventsUserDataAnyOf1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversionEventsUserDataAnyOf1(val *ConversionEventsUserDataAnyOf1) *NullableConversionEventsUserDataAnyOf1 {
	return &NullableConversionEventsUserDataAnyOf1{value: val, isSet: true}
}

func (v NullableConversionEventsUserDataAnyOf1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversionEventsUserDataAnyOf1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


