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

// checks if the BidFloor type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BidFloor{}

// BidFloor struct for BidFloor
type BidFloor struct {
	// A list of bid floors in micro currency. For example, [100000, 200000]
	BidFloors []int32 `json:"bid_floors,omitempty"`
	// Always the string 'bidfloor'
	Type *string `json:"type,omitempty"`
}

// NewBidFloor instantiates a new BidFloor object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBidFloor() *BidFloor {
	this := BidFloor{}
	var type_ string = "bidfloor"
	this.Type = &type_
	return &this
}

// NewBidFloorWithDefaults instantiates a new BidFloor object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBidFloorWithDefaults() *BidFloor {
	this := BidFloor{}
	var type_ string = "bidfloor"
	this.Type = &type_
	return &this
}

// GetBidFloors returns the BidFloors field value if set, zero value otherwise.
func (o *BidFloor) GetBidFloors() []int32 {
	if o == nil || IsNil(o.BidFloors) {
		var ret []int32
		return ret
	}
	return o.BidFloors
}

// GetBidFloorsOk returns a tuple with the BidFloors field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BidFloor) GetBidFloorsOk() ([]int32, bool) {
	if o == nil || IsNil(o.BidFloors) {
		return nil, false
	}
	return o.BidFloors, true
}

// HasBidFloors returns a boolean if a field has been set.
func (o *BidFloor) HasBidFloors() bool {
	if o != nil && !IsNil(o.BidFloors) {
		return true
	}

	return false
}

// SetBidFloors gets a reference to the given []int32 and assigns it to the BidFloors field.
func (o *BidFloor) SetBidFloors(v []int32) {
	o.BidFloors = v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *BidFloor) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BidFloor) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *BidFloor) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *BidFloor) SetType(v string) {
	o.Type = &v
}

func (o BidFloor) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BidFloor) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.BidFloors) {
		toSerialize["bid_floors"] = o.BidFloors
	}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	return toSerialize, nil
}

type NullableBidFloor struct {
	value *BidFloor
	isSet bool
}

func (v NullableBidFloor) Get() *BidFloor {
	return v.value
}

func (v *NullableBidFloor) Set(val *BidFloor) {
	v.value = val
	v.isSet = true
}

func (v NullableBidFloor) IsSet() bool {
	return v.isSet
}

func (v *NullableBidFloor) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBidFloor(val *BidFloor) *NullableBidFloor {
	return &NullableBidFloor{value: val, isSet: true}
}

func (v NullableBidFloor) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBidFloor) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


