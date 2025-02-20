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

// checks if the AdvancedAuctionKey type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AdvancedAuctionKey{}

// AdvancedAuctionKey Object uniquely identifying a retail catalog item
type AdvancedAuctionKey struct {
	// The catalog retail item id in the merchant namespace
	ItemId string `json:"item_id"`
	Country Country `json:"country"`
	Language Language `json:"language"`
}

type _AdvancedAuctionKey AdvancedAuctionKey

// NewAdvancedAuctionKey instantiates a new AdvancedAuctionKey object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdvancedAuctionKey(itemId string, country Country, language Language) *AdvancedAuctionKey {
	this := AdvancedAuctionKey{}
	this.ItemId = itemId
	this.Country = country
	this.Language = language
	return &this
}

// NewAdvancedAuctionKeyWithDefaults instantiates a new AdvancedAuctionKey object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdvancedAuctionKeyWithDefaults() *AdvancedAuctionKey {
	this := AdvancedAuctionKey{}
	return &this
}

// GetItemId returns the ItemId field value
func (o *AdvancedAuctionKey) GetItemId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ItemId
}

// GetItemIdOk returns a tuple with the ItemId field value
// and a boolean to check if the value has been set.
func (o *AdvancedAuctionKey) GetItemIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ItemId, true
}

// SetItemId sets field value
func (o *AdvancedAuctionKey) SetItemId(v string) {
	o.ItemId = v
}

// GetCountry returns the Country field value
func (o *AdvancedAuctionKey) GetCountry() Country {
	if o == nil {
		var ret Country
		return ret
	}

	return o.Country
}

// GetCountryOk returns a tuple with the Country field value
// and a boolean to check if the value has been set.
func (o *AdvancedAuctionKey) GetCountryOk() (*Country, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Country, true
}

// SetCountry sets field value
func (o *AdvancedAuctionKey) SetCountry(v Country) {
	o.Country = v
}

// GetLanguage returns the Language field value
func (o *AdvancedAuctionKey) GetLanguage() Language {
	if o == nil {
		var ret Language
		return ret
	}

	return o.Language
}

// GetLanguageOk returns a tuple with the Language field value
// and a boolean to check if the value has been set.
func (o *AdvancedAuctionKey) GetLanguageOk() (*Language, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Language, true
}

// SetLanguage sets field value
func (o *AdvancedAuctionKey) SetLanguage(v Language) {
	o.Language = v
}

func (o AdvancedAuctionKey) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AdvancedAuctionKey) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["item_id"] = o.ItemId
	toSerialize["country"] = o.Country
	toSerialize["language"] = o.Language
	return toSerialize, nil
}

func (o *AdvancedAuctionKey) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"item_id",
		"country",
		"language",
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

	varAdvancedAuctionKey := _AdvancedAuctionKey{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAdvancedAuctionKey)

	if err != nil {
		return err
	}

	*o = AdvancedAuctionKey(varAdvancedAuctionKey)

	return err
}

type NullableAdvancedAuctionKey struct {
	value *AdvancedAuctionKey
	isSet bool
}

func (v NullableAdvancedAuctionKey) Get() *AdvancedAuctionKey {
	return v.value
}

func (v *NullableAdvancedAuctionKey) Set(val *AdvancedAuctionKey) {
	v.value = val
	v.isSet = true
}

func (v NullableAdvancedAuctionKey) IsSet() bool {
	return v.isSet
}

func (v *NullableAdvancedAuctionKey) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdvancedAuctionKey(val *AdvancedAuctionKey) *NullableAdvancedAuctionKey {
	return &NullableAdvancedAuctionKey{value: val, isSet: true}
}

func (v NullableAdvancedAuctionKey) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdvancedAuctionKey) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


