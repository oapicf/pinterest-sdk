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

// checks if the LeadFormTestRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &LeadFormTestRequest{}

// LeadFormTestRequest Request to create test data for lead data test API.
type LeadFormTestRequest struct {
	// Test lead answers. Should follow the creation order.
	Answers []string `json:"answers"`
}

type _LeadFormTestRequest LeadFormTestRequest

// NewLeadFormTestRequest instantiates a new LeadFormTestRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLeadFormTestRequest(answers []string) *LeadFormTestRequest {
	this := LeadFormTestRequest{}
	this.Answers = answers
	return &this
}

// NewLeadFormTestRequestWithDefaults instantiates a new LeadFormTestRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLeadFormTestRequestWithDefaults() *LeadFormTestRequest {
	this := LeadFormTestRequest{}
	return &this
}

// GetAnswers returns the Answers field value
func (o *LeadFormTestRequest) GetAnswers() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Answers
}

// GetAnswersOk returns a tuple with the Answers field value
// and a boolean to check if the value has been set.
func (o *LeadFormTestRequest) GetAnswersOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Answers, true
}

// SetAnswers sets field value
func (o *LeadFormTestRequest) SetAnswers(v []string) {
	o.Answers = v
}

func (o LeadFormTestRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o LeadFormTestRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["answers"] = o.Answers
	return toSerialize, nil
}

func (o *LeadFormTestRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"answers",
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

	varLeadFormTestRequest := _LeadFormTestRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varLeadFormTestRequest)

	if err != nil {
		return err
	}

	*o = LeadFormTestRequest(varLeadFormTestRequest)

	return err
}

type NullableLeadFormTestRequest struct {
	value *LeadFormTestRequest
	isSet bool
}

func (v NullableLeadFormTestRequest) Get() *LeadFormTestRequest {
	return v.value
}

func (v *NullableLeadFormTestRequest) Set(val *LeadFormTestRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableLeadFormTestRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableLeadFormTestRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLeadFormTestRequest(val *LeadFormTestRequest) *NullableLeadFormTestRequest {
	return &NullableLeadFormTestRequest{value: val, isSet: true}
}

func (v NullableLeadFormTestRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLeadFormTestRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


