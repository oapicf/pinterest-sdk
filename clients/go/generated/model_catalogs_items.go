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

// checks if the CatalogsItems type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsItems{}

// CatalogsItems Response object of catalogs items
type CatalogsItems struct {
	// Array with catalogs items
	Items []ItemResponse `json:"items,omitempty"`
}

// NewCatalogsItems instantiates a new CatalogsItems object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsItems() *CatalogsItems {
	this := CatalogsItems{}
	return &this
}

// NewCatalogsItemsWithDefaults instantiates a new CatalogsItems object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsItemsWithDefaults() *CatalogsItems {
	this := CatalogsItems{}
	return &this
}

// GetItems returns the Items field value if set, zero value otherwise.
func (o *CatalogsItems) GetItems() []ItemResponse {
	if o == nil || IsNil(o.Items) {
		var ret []ItemResponse
		return ret
	}
	return o.Items
}

// GetItemsOk returns a tuple with the Items field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsItems) GetItemsOk() ([]ItemResponse, bool) {
	if o == nil || IsNil(o.Items) {
		return nil, false
	}
	return o.Items, true
}

// HasItems returns a boolean if a field has been set.
func (o *CatalogsItems) HasItems() bool {
	if o != nil && !IsNil(o.Items) {
		return true
	}

	return false
}

// SetItems gets a reference to the given []ItemResponse and assigns it to the Items field.
func (o *CatalogsItems) SetItems(v []ItemResponse) {
	o.Items = v
}

func (o CatalogsItems) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsItems) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Items) {
		toSerialize["items"] = o.Items
	}
	return toSerialize, nil
}

type NullableCatalogsItems struct {
	value *CatalogsItems
	isSet bool
}

func (v NullableCatalogsItems) Get() *CatalogsItems {
	return v.value
}

func (v *NullableCatalogsItems) Set(val *CatalogsItems) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsItems) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsItems) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsItems(val *CatalogsItems) *NullableCatalogsItems {
	return &NullableCatalogsItems{value: val, isSet: true}
}

func (v NullableCatalogsItems) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsItems) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


