/*
Pinterest REST API

Pinterest's REST API

API version: 5.12.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// checks if the RelatedTermsRelatedTermsListInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &RelatedTermsRelatedTermsListInner{}

// RelatedTermsRelatedTermsListInner struct for RelatedTermsRelatedTermsListInner
type RelatedTermsRelatedTermsListInner struct {
	Term *string `json:"term,omitempty"`
	RelatedTerms []string `json:"related_terms,omitempty"`
}

// NewRelatedTermsRelatedTermsListInner instantiates a new RelatedTermsRelatedTermsListInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRelatedTermsRelatedTermsListInner() *RelatedTermsRelatedTermsListInner {
	this := RelatedTermsRelatedTermsListInner{}
	return &this
}

// NewRelatedTermsRelatedTermsListInnerWithDefaults instantiates a new RelatedTermsRelatedTermsListInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRelatedTermsRelatedTermsListInnerWithDefaults() *RelatedTermsRelatedTermsListInner {
	this := RelatedTermsRelatedTermsListInner{}
	return &this
}

// GetTerm returns the Term field value if set, zero value otherwise.
func (o *RelatedTermsRelatedTermsListInner) GetTerm() string {
	if o == nil || IsNil(o.Term) {
		var ret string
		return ret
	}
	return *o.Term
}

// GetTermOk returns a tuple with the Term field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelatedTermsRelatedTermsListInner) GetTermOk() (*string, bool) {
	if o == nil || IsNil(o.Term) {
		return nil, false
	}
	return o.Term, true
}

// HasTerm returns a boolean if a field has been set.
func (o *RelatedTermsRelatedTermsListInner) HasTerm() bool {
	if o != nil && !IsNil(o.Term) {
		return true
	}

	return false
}

// SetTerm gets a reference to the given string and assigns it to the Term field.
func (o *RelatedTermsRelatedTermsListInner) SetTerm(v string) {
	o.Term = &v
}

// GetRelatedTerms returns the RelatedTerms field value if set, zero value otherwise.
func (o *RelatedTermsRelatedTermsListInner) GetRelatedTerms() []string {
	if o == nil || IsNil(o.RelatedTerms) {
		var ret []string
		return ret
	}
	return o.RelatedTerms
}

// GetRelatedTermsOk returns a tuple with the RelatedTerms field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelatedTermsRelatedTermsListInner) GetRelatedTermsOk() ([]string, bool) {
	if o == nil || IsNil(o.RelatedTerms) {
		return nil, false
	}
	return o.RelatedTerms, true
}

// HasRelatedTerms returns a boolean if a field has been set.
func (o *RelatedTermsRelatedTermsListInner) HasRelatedTerms() bool {
	if o != nil && !IsNil(o.RelatedTerms) {
		return true
	}

	return false
}

// SetRelatedTerms gets a reference to the given []string and assigns it to the RelatedTerms field.
func (o *RelatedTermsRelatedTermsListInner) SetRelatedTerms(v []string) {
	o.RelatedTerms = v
}

func (o RelatedTermsRelatedTermsListInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o RelatedTermsRelatedTermsListInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Term) {
		toSerialize["term"] = o.Term
	}
	if !IsNil(o.RelatedTerms) {
		toSerialize["related_terms"] = o.RelatedTerms
	}
	return toSerialize, nil
}

type NullableRelatedTermsRelatedTermsListInner struct {
	value *RelatedTermsRelatedTermsListInner
	isSet bool
}

func (v NullableRelatedTermsRelatedTermsListInner) Get() *RelatedTermsRelatedTermsListInner {
	return v.value
}

func (v *NullableRelatedTermsRelatedTermsListInner) Set(val *RelatedTermsRelatedTermsListInner) {
	v.value = val
	v.isSet = true
}

func (v NullableRelatedTermsRelatedTermsListInner) IsSet() bool {
	return v.isSet
}

func (v *NullableRelatedTermsRelatedTermsListInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRelatedTermsRelatedTermsListInner(val *RelatedTermsRelatedTermsListInner) *NullableRelatedTermsRelatedTermsListInner {
	return &NullableRelatedTermsRelatedTermsListInner{value: val, isSet: true}
}

func (v NullableRelatedTermsRelatedTermsListInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRelatedTermsRelatedTermsListInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

