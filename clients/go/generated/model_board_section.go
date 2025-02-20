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

// checks if the BoardSection type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BoardSection{}

// BoardSection Sections help organize pins within a board.
type BoardSection struct {
	Id *string `json:"id,omitempty"`
	Name string `json:"name"`
}

type _BoardSection BoardSection

// NewBoardSection instantiates a new BoardSection object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBoardSection(name string) *BoardSection {
	this := BoardSection{}
	this.Name = name
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
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BoardSection) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *BoardSection) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *BoardSection) SetId(v string) {
	o.Id = &v
}

// GetName returns the Name field value
func (o *BoardSection) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *BoardSection) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *BoardSection) SetName(v string) {
	o.Name = v
}

func (o BoardSection) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BoardSection) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	toSerialize["name"] = o.Name
	return toSerialize, nil
}

func (o *BoardSection) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"name",
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

	varBoardSection := _BoardSection{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varBoardSection)

	if err != nil {
		return err
	}

	*o = BoardSection(varBoardSection)

	return err
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


