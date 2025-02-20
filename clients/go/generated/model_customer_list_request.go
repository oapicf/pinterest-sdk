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

// checks if the CustomerListRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CustomerListRequest{}

// CustomerListRequest struct for CustomerListRequest
type CustomerListRequest struct {
	// Customer list name.
	Name string `json:"name"`
	// Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
	Records string `json:"records"`
	ListType *UserListType `json:"list_type,omitempty"`
	// Customer list errors.
	Exceptions map[string]interface{} `json:"exceptions,omitempty"`
}

type _CustomerListRequest CustomerListRequest

// NewCustomerListRequest instantiates a new CustomerListRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCustomerListRequest(name string, records string) *CustomerListRequest {
	this := CustomerListRequest{}
	this.Name = name
	this.Records = records
	var listType UserListType = EMAIL
	this.ListType = &listType
	return &this
}

// NewCustomerListRequestWithDefaults instantiates a new CustomerListRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCustomerListRequestWithDefaults() *CustomerListRequest {
	this := CustomerListRequest{}
	var listType UserListType = EMAIL
	this.ListType = &listType
	return &this
}

// GetName returns the Name field value
func (o *CustomerListRequest) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CustomerListRequest) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CustomerListRequest) SetName(v string) {
	o.Name = v
}

// GetRecords returns the Records field value
func (o *CustomerListRequest) GetRecords() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Records
}

// GetRecordsOk returns a tuple with the Records field value
// and a boolean to check if the value has been set.
func (o *CustomerListRequest) GetRecordsOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Records, true
}

// SetRecords sets field value
func (o *CustomerListRequest) SetRecords(v string) {
	o.Records = v
}

// GetListType returns the ListType field value if set, zero value otherwise.
func (o *CustomerListRequest) GetListType() UserListType {
	if o == nil || IsNil(o.ListType) {
		var ret UserListType
		return ret
	}
	return *o.ListType
}

// GetListTypeOk returns a tuple with the ListType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CustomerListRequest) GetListTypeOk() (*UserListType, bool) {
	if o == nil || IsNil(o.ListType) {
		return nil, false
	}
	return o.ListType, true
}

// HasListType returns a boolean if a field has been set.
func (o *CustomerListRequest) HasListType() bool {
	if o != nil && !IsNil(o.ListType) {
		return true
	}

	return false
}

// SetListType gets a reference to the given UserListType and assigns it to the ListType field.
func (o *CustomerListRequest) SetListType(v UserListType) {
	o.ListType = &v
}

// GetExceptions returns the Exceptions field value if set, zero value otherwise.
func (o *CustomerListRequest) GetExceptions() map[string]interface{} {
	if o == nil || IsNil(o.Exceptions) {
		var ret map[string]interface{}
		return ret
	}
	return o.Exceptions
}

// GetExceptionsOk returns a tuple with the Exceptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CustomerListRequest) GetExceptionsOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Exceptions) {
		return map[string]interface{}{}, false
	}
	return o.Exceptions, true
}

// HasExceptions returns a boolean if a field has been set.
func (o *CustomerListRequest) HasExceptions() bool {
	if o != nil && !IsNil(o.Exceptions) {
		return true
	}

	return false
}

// SetExceptions gets a reference to the given map[string]interface{} and assigns it to the Exceptions field.
func (o *CustomerListRequest) SetExceptions(v map[string]interface{}) {
	o.Exceptions = v
}

func (o CustomerListRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CustomerListRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["name"] = o.Name
	toSerialize["records"] = o.Records
	if !IsNil(o.ListType) {
		toSerialize["list_type"] = o.ListType
	}
	if !IsNil(o.Exceptions) {
		toSerialize["exceptions"] = o.Exceptions
	}
	return toSerialize, nil
}

func (o *CustomerListRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"name",
		"records",
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

	varCustomerListRequest := _CustomerListRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCustomerListRequest)

	if err != nil {
		return err
	}

	*o = CustomerListRequest(varCustomerListRequest)

	return err
}

type NullableCustomerListRequest struct {
	value *CustomerListRequest
	isSet bool
}

func (v NullableCustomerListRequest) Get() *CustomerListRequest {
	return v.value
}

func (v *NullableCustomerListRequest) Set(val *CustomerListRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCustomerListRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCustomerListRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCustomerListRequest(val *CustomerListRequest) *NullableCustomerListRequest {
	return &NullableCustomerListRequest{value: val, isSet: true}
}

func (v NullableCustomerListRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCustomerListRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


