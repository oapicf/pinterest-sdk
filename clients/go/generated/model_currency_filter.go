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

// checks if the CurrencyFilter type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CurrencyFilter{}

// CurrencyFilter struct for CurrencyFilter
type CurrencyFilter struct {
	CURRENCY CatalogsProductGroupCurrencyCriteria `json:"CURRENCY"`
}

type _CurrencyFilter CurrencyFilter

// NewCurrencyFilter instantiates a new CurrencyFilter object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurrencyFilter(cURRENCY CatalogsProductGroupCurrencyCriteria) *CurrencyFilter {
	this := CurrencyFilter{}
	this.CURRENCY = cURRENCY
	return &this
}

// NewCurrencyFilterWithDefaults instantiates a new CurrencyFilter object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurrencyFilterWithDefaults() *CurrencyFilter {
	this := CurrencyFilter{}
	return &this
}

// GetCURRENCY returns the CURRENCY field value
func (o *CurrencyFilter) GetCURRENCY() CatalogsProductGroupCurrencyCriteria {
	if o == nil {
		var ret CatalogsProductGroupCurrencyCriteria
		return ret
	}

	return o.CURRENCY
}

// GetCURRENCYOk returns a tuple with the CURRENCY field value
// and a boolean to check if the value has been set.
func (o *CurrencyFilter) GetCURRENCYOk() (CatalogsProductGroupCurrencyCriteria, bool) {
	if o == nil {
		return CatalogsProductGroupCurrencyCriteria{}, false
	}
	return o.CURRENCY, true
}

// SetCURRENCY sets field value
func (o *CurrencyFilter) SetCURRENCY(v CatalogsProductGroupCurrencyCriteria) {
	o.CURRENCY = v
}

func (o CurrencyFilter) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CurrencyFilter) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["CURRENCY"] = o.CURRENCY
	return toSerialize, nil
}

func (o *CurrencyFilter) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"CURRENCY",
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

	varCurrencyFilter := _CurrencyFilter{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCurrencyFilter)

	if err != nil {
		return err
	}

	*o = CurrencyFilter(varCurrencyFilter)

	return err
}

type NullableCurrencyFilter struct {
	value *CurrencyFilter
	isSet bool
}

func (v NullableCurrencyFilter) Get() *CurrencyFilter {
	return v.value
}

func (v *NullableCurrencyFilter) Set(val *CurrencyFilter) {
	v.value = val
	v.isSet = true
}

func (v NullableCurrencyFilter) IsSet() bool {
	return v.isSet
}

func (v *NullableCurrencyFilter) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurrencyFilter(val *CurrencyFilter) *NullableCurrencyFilter {
	return &NullableCurrencyFilter{value: val, isSet: true}
}

func (v NullableCurrencyFilter) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurrencyFilter) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

