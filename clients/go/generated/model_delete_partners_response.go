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

// checks if the DeletePartnersResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &DeletePartnersResponse{}

// DeletePartnersResponse An object with a list of partners that were deleted.
type DeletePartnersResponse struct {
	// List of partners whose business partnership have been terminated.
	DeletedPartners []string `json:"deleted_partners,omitempty"`
}

// NewDeletePartnersResponse instantiates a new DeletePartnersResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDeletePartnersResponse() *DeletePartnersResponse {
	this := DeletePartnersResponse{}
	return &this
}

// NewDeletePartnersResponseWithDefaults instantiates a new DeletePartnersResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDeletePartnersResponseWithDefaults() *DeletePartnersResponse {
	this := DeletePartnersResponse{}
	return &this
}

// GetDeletedPartners returns the DeletedPartners field value if set, zero value otherwise.
func (o *DeletePartnersResponse) GetDeletedPartners() []string {
	if o == nil || IsNil(o.DeletedPartners) {
		var ret []string
		return ret
	}
	return o.DeletedPartners
}

// GetDeletedPartnersOk returns a tuple with the DeletedPartners field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeletePartnersResponse) GetDeletedPartnersOk() ([]string, bool) {
	if o == nil || IsNil(o.DeletedPartners) {
		return nil, false
	}
	return o.DeletedPartners, true
}

// HasDeletedPartners returns a boolean if a field has been set.
func (o *DeletePartnersResponse) HasDeletedPartners() bool {
	if o != nil && !IsNil(o.DeletedPartners) {
		return true
	}

	return false
}

// SetDeletedPartners gets a reference to the given []string and assigns it to the DeletedPartners field.
func (o *DeletePartnersResponse) SetDeletedPartners(v []string) {
	o.DeletedPartners = v
}

func (o DeletePartnersResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DeletePartnersResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.DeletedPartners) {
		toSerialize["deleted_partners"] = o.DeletedPartners
	}
	return toSerialize, nil
}

type NullableDeletePartnersResponse struct {
	value *DeletePartnersResponse
	isSet bool
}

func (v NullableDeletePartnersResponse) Get() *DeletePartnersResponse {
	return v.value
}

func (v *NullableDeletePartnersResponse) Set(val *DeletePartnersResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableDeletePartnersResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableDeletePartnersResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDeletePartnersResponse(val *DeletePartnersResponse) *NullableDeletePartnersResponse {
	return &NullableDeletePartnersResponse{value: val, isSet: true}
}

func (v NullableDeletePartnersResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDeletePartnersResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


