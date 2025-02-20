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

// checks if the LeadsExportCreateResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &LeadsExportCreateResponse{}

// LeadsExportCreateResponse struct for LeadsExportCreateResponse
type LeadsExportCreateResponse struct {
	// ID for the leads export job
	LeadsExportId *string `json:"leads_export_id,omitempty" validate:"regexp=^\\\\d+$"`
}

// NewLeadsExportCreateResponse instantiates a new LeadsExportCreateResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLeadsExportCreateResponse() *LeadsExportCreateResponse {
	this := LeadsExportCreateResponse{}
	return &this
}

// NewLeadsExportCreateResponseWithDefaults instantiates a new LeadsExportCreateResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLeadsExportCreateResponseWithDefaults() *LeadsExportCreateResponse {
	this := LeadsExportCreateResponse{}
	return &this
}

// GetLeadsExportId returns the LeadsExportId field value if set, zero value otherwise.
func (o *LeadsExportCreateResponse) GetLeadsExportId() string {
	if o == nil || IsNil(o.LeadsExportId) {
		var ret string
		return ret
	}
	return *o.LeadsExportId
}

// GetLeadsExportIdOk returns a tuple with the LeadsExportId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadsExportCreateResponse) GetLeadsExportIdOk() (*string, bool) {
	if o == nil || IsNil(o.LeadsExportId) {
		return nil, false
	}
	return o.LeadsExportId, true
}

// HasLeadsExportId returns a boolean if a field has been set.
func (o *LeadsExportCreateResponse) HasLeadsExportId() bool {
	if o != nil && !IsNil(o.LeadsExportId) {
		return true
	}

	return false
}

// SetLeadsExportId gets a reference to the given string and assigns it to the LeadsExportId field.
func (o *LeadsExportCreateResponse) SetLeadsExportId(v string) {
	o.LeadsExportId = &v
}

func (o LeadsExportCreateResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o LeadsExportCreateResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.LeadsExportId) {
		toSerialize["leads_export_id"] = o.LeadsExportId
	}
	return toSerialize, nil
}

type NullableLeadsExportCreateResponse struct {
	value *LeadsExportCreateResponse
	isSet bool
}

func (v NullableLeadsExportCreateResponse) Get() *LeadsExportCreateResponse {
	return v.value
}

func (v *NullableLeadsExportCreateResponse) Set(val *LeadsExportCreateResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableLeadsExportCreateResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableLeadsExportCreateResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLeadsExportCreateResponse(val *LeadsExportCreateResponse) *NullableLeadsExportCreateResponse {
	return &NullableLeadsExportCreateResponse{value: val, isSet: true}
}

func (v NullableLeadsExportCreateResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLeadsExportCreateResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


