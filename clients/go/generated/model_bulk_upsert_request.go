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

// checks if the BulkUpsertRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BulkUpsertRequest{}

// BulkUpsertRequest Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
type BulkUpsertRequest struct {
	Create *BulkUpsertRequestCreate `json:"create,omitempty"`
	Update *BulkUpsertRequestUpdate `json:"update,omitempty"`
}

// NewBulkUpsertRequest instantiates a new BulkUpsertRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBulkUpsertRequest() *BulkUpsertRequest {
	this := BulkUpsertRequest{}
	return &this
}

// NewBulkUpsertRequestWithDefaults instantiates a new BulkUpsertRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBulkUpsertRequestWithDefaults() *BulkUpsertRequest {
	this := BulkUpsertRequest{}
	return &this
}

// GetCreate returns the Create field value if set, zero value otherwise.
func (o *BulkUpsertRequest) GetCreate() BulkUpsertRequestCreate {
	if o == nil || IsNil(o.Create) {
		var ret BulkUpsertRequestCreate
		return ret
	}
	return *o.Create
}

// GetCreateOk returns a tuple with the Create field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BulkUpsertRequest) GetCreateOk() (*BulkUpsertRequestCreate, bool) {
	if o == nil || IsNil(o.Create) {
		return nil, false
	}
	return o.Create, true
}

// HasCreate returns a boolean if a field has been set.
func (o *BulkUpsertRequest) HasCreate() bool {
	if o != nil && !IsNil(o.Create) {
		return true
	}

	return false
}

// SetCreate gets a reference to the given BulkUpsertRequestCreate and assigns it to the Create field.
func (o *BulkUpsertRequest) SetCreate(v BulkUpsertRequestCreate) {
	o.Create = &v
}

// GetUpdate returns the Update field value if set, zero value otherwise.
func (o *BulkUpsertRequest) GetUpdate() BulkUpsertRequestUpdate {
	if o == nil || IsNil(o.Update) {
		var ret BulkUpsertRequestUpdate
		return ret
	}
	return *o.Update
}

// GetUpdateOk returns a tuple with the Update field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BulkUpsertRequest) GetUpdateOk() (*BulkUpsertRequestUpdate, bool) {
	if o == nil || IsNil(o.Update) {
		return nil, false
	}
	return o.Update, true
}

// HasUpdate returns a boolean if a field has been set.
func (o *BulkUpsertRequest) HasUpdate() bool {
	if o != nil && !IsNil(o.Update) {
		return true
	}

	return false
}

// SetUpdate gets a reference to the given BulkUpsertRequestUpdate and assigns it to the Update field.
func (o *BulkUpsertRequest) SetUpdate(v BulkUpsertRequestUpdate) {
	o.Update = &v
}

func (o BulkUpsertRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BulkUpsertRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Create) {
		toSerialize["create"] = o.Create
	}
	if !IsNil(o.Update) {
		toSerialize["update"] = o.Update
	}
	return toSerialize, nil
}

type NullableBulkUpsertRequest struct {
	value *BulkUpsertRequest
	isSet bool
}

func (v NullableBulkUpsertRequest) Get() *BulkUpsertRequest {
	return v.value
}

func (v *NullableBulkUpsertRequest) Set(val *BulkUpsertRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableBulkUpsertRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableBulkUpsertRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBulkUpsertRequest(val *BulkUpsertRequest) *NullableBulkUpsertRequest {
	return &NullableBulkUpsertRequest{value: val, isSet: true}
}

func (v NullableBulkUpsertRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBulkUpsertRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


