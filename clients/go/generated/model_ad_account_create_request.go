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

// checks if the AdAccountCreateRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AdAccountCreateRequest{}

// AdAccountCreateRequest struct for AdAccountCreateRequest
type AdAccountCreateRequest struct {
	Country *Country `json:"country,omitempty"`
	// Ad Account name.
	Name *string `json:"name,omitempty"`
	// Advertiser's owning user ID.
	OwnerUserId *string `json:"owner_user_id,omitempty" validate:"regexp=^\\\\d+$"`
}

// NewAdAccountCreateRequest instantiates a new AdAccountCreateRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdAccountCreateRequest() *AdAccountCreateRequest {
	this := AdAccountCreateRequest{}
	return &this
}

// NewAdAccountCreateRequestWithDefaults instantiates a new AdAccountCreateRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdAccountCreateRequestWithDefaults() *AdAccountCreateRequest {
	this := AdAccountCreateRequest{}
	return &this
}

// GetCountry returns the Country field value if set, zero value otherwise.
func (o *AdAccountCreateRequest) GetCountry() Country {
	if o == nil || IsNil(o.Country) {
		var ret Country
		return ret
	}
	return *o.Country
}

// GetCountryOk returns a tuple with the Country field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountCreateRequest) GetCountryOk() (*Country, bool) {
	if o == nil || IsNil(o.Country) {
		return nil, false
	}
	return o.Country, true
}

// HasCountry returns a boolean if a field has been set.
func (o *AdAccountCreateRequest) HasCountry() bool {
	if o != nil && !IsNil(o.Country) {
		return true
	}

	return false
}

// SetCountry gets a reference to the given Country and assigns it to the Country field.
func (o *AdAccountCreateRequest) SetCountry(v Country) {
	o.Country = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *AdAccountCreateRequest) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountCreateRequest) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *AdAccountCreateRequest) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *AdAccountCreateRequest) SetName(v string) {
	o.Name = &v
}

// GetOwnerUserId returns the OwnerUserId field value if set, zero value otherwise.
func (o *AdAccountCreateRequest) GetOwnerUserId() string {
	if o == nil || IsNil(o.OwnerUserId) {
		var ret string
		return ret
	}
	return *o.OwnerUserId
}

// GetOwnerUserIdOk returns a tuple with the OwnerUserId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountCreateRequest) GetOwnerUserIdOk() (*string, bool) {
	if o == nil || IsNil(o.OwnerUserId) {
		return nil, false
	}
	return o.OwnerUserId, true
}

// HasOwnerUserId returns a boolean if a field has been set.
func (o *AdAccountCreateRequest) HasOwnerUserId() bool {
	if o != nil && !IsNil(o.OwnerUserId) {
		return true
	}

	return false
}

// SetOwnerUserId gets a reference to the given string and assigns it to the OwnerUserId field.
func (o *AdAccountCreateRequest) SetOwnerUserId(v string) {
	o.OwnerUserId = &v
}

func (o AdAccountCreateRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AdAccountCreateRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Country) {
		toSerialize["country"] = o.Country
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.OwnerUserId) {
		toSerialize["owner_user_id"] = o.OwnerUserId
	}
	return toSerialize, nil
}

type NullableAdAccountCreateRequest struct {
	value *AdAccountCreateRequest
	isSet bool
}

func (v NullableAdAccountCreateRequest) Get() *AdAccountCreateRequest {
	return v.value
}

func (v *NullableAdAccountCreateRequest) Set(val *AdAccountCreateRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableAdAccountCreateRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableAdAccountCreateRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdAccountCreateRequest(val *AdAccountCreateRequest) *NullableAdAccountCreateRequest {
	return &NullableAdAccountCreateRequest{value: val, isSet: true}
}

func (v NullableAdAccountCreateRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdAccountCreateRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


