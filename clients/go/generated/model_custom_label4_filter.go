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

// checks if the CustomLabel4Filter type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CustomLabel4Filter{}

// CustomLabel4Filter struct for CustomLabel4Filter
type CustomLabel4Filter struct {
	CUSTOMLABEL4 CatalogsProductGroupMultipleStringCriteria `json:"CUSTOM_LABEL_4"`
}

type _CustomLabel4Filter CustomLabel4Filter

// NewCustomLabel4Filter instantiates a new CustomLabel4Filter object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCustomLabel4Filter(cUSTOMLABEL4 CatalogsProductGroupMultipleStringCriteria) *CustomLabel4Filter {
	this := CustomLabel4Filter{}
	this.CUSTOMLABEL4 = cUSTOMLABEL4
	return &this
}

// NewCustomLabel4FilterWithDefaults instantiates a new CustomLabel4Filter object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCustomLabel4FilterWithDefaults() *CustomLabel4Filter {
	this := CustomLabel4Filter{}
	return &this
}

// GetCUSTOMLABEL4 returns the CUSTOMLABEL4 field value
func (o *CustomLabel4Filter) GetCUSTOMLABEL4() CatalogsProductGroupMultipleStringCriteria {
	if o == nil {
		var ret CatalogsProductGroupMultipleStringCriteria
		return ret
	}

	return o.CUSTOMLABEL4
}

// GetCUSTOMLABEL4Ok returns a tuple with the CUSTOMLABEL4 field value
// and a boolean to check if the value has been set.
func (o *CustomLabel4Filter) GetCUSTOMLABEL4Ok() (CatalogsProductGroupMultipleStringCriteria, bool) {
	if o == nil {
		return CatalogsProductGroupMultipleStringCriteria{}, false
	}
	return o.CUSTOMLABEL4, true
}

// SetCUSTOMLABEL4 sets field value
func (o *CustomLabel4Filter) SetCUSTOMLABEL4(v CatalogsProductGroupMultipleStringCriteria) {
	o.CUSTOMLABEL4 = v
}

func (o CustomLabel4Filter) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CustomLabel4Filter) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["CUSTOM_LABEL_4"] = o.CUSTOMLABEL4
	return toSerialize, nil
}

func (o *CustomLabel4Filter) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"CUSTOM_LABEL_4",
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

	varCustomLabel4Filter := _CustomLabel4Filter{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCustomLabel4Filter)

	if err != nil {
		return err
	}

	*o = CustomLabel4Filter(varCustomLabel4Filter)

	return err
}

type NullableCustomLabel4Filter struct {
	value *CustomLabel4Filter
	isSet bool
}

func (v NullableCustomLabel4Filter) Get() *CustomLabel4Filter {
	return v.value
}

func (v *NullableCustomLabel4Filter) Set(val *CustomLabel4Filter) {
	v.value = val
	v.isSet = true
}

func (v NullableCustomLabel4Filter) IsSet() bool {
	return v.isSet
}

func (v *NullableCustomLabel4Filter) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCustomLabel4Filter(val *CustomLabel4Filter) *NullableCustomLabel4Filter {
	return &NullableCustomLabel4Filter{value: val, isSet: true}
}

func (v NullableCustomLabel4Filter) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCustomLabel4Filter) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


