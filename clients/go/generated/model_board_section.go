/*
Pinterest REST API

Pinterest's REST API

API version: 5.3.0
Contact: pinterest-api@pinterest.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// BoardSection Sections help organize pins within a board.
type BoardSection struct {
	Id *string `json:"id,omitempty"`
	Name *string `json:"name,omitempty"`
}

// NewBoardSection instantiates a new BoardSection object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBoardSection() *BoardSection {
	this := BoardSection{}
	return &this
}

// NewBoardSectionWithDefaults instantiates a new BoardSection object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBoardSectionWithDefaults() *BoardSection {
	this := BoardSection{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *BoardSection) GetId() string {
	if o == nil || o.Id == nil {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BoardSection) GetIdOk() (*string, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *BoardSection) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *BoardSection) SetId(v string) {
	o.Id = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *BoardSection) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BoardSection) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *BoardSection) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *BoardSection) SetName(v string) {
	o.Name = &v
}

func (o BoardSection) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableBoardSection struct {
	value *BoardSection
	isSet bool
}

func (v NullableBoardSection) Get() *BoardSection {
	return v.value
}

func (v *NullableBoardSection) Set(val *BoardSection) {
	v.value = val
	v.isSet = true
}

func (v NullableBoardSection) IsSet() bool {
	return v.isSet
}

func (v *NullableBoardSection) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBoardSection(val *BoardSection) *NullableBoardSection {
	return &NullableBoardSection{value: val, isSet: true}
}

func (v NullableBoardSection) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBoardSection) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

