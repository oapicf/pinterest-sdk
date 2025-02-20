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

// checks if the LeadFormCommonPolicyLinksInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &LeadFormCommonPolicyLinksInner{}

// LeadFormCommonPolicyLinksInner struct for LeadFormCommonPolicyLinksInner
type LeadFormCommonPolicyLinksInner struct {
	// Policy label for an additional policy link.
	Label *string `json:"label,omitempty"`
	// Policy link for an additional policy link.
	Link *string `json:"link,omitempty"`
}

// NewLeadFormCommonPolicyLinksInner instantiates a new LeadFormCommonPolicyLinksInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLeadFormCommonPolicyLinksInner() *LeadFormCommonPolicyLinksInner {
	this := LeadFormCommonPolicyLinksInner{}
	return &this
}

// NewLeadFormCommonPolicyLinksInnerWithDefaults instantiates a new LeadFormCommonPolicyLinksInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLeadFormCommonPolicyLinksInnerWithDefaults() *LeadFormCommonPolicyLinksInner {
	this := LeadFormCommonPolicyLinksInner{}
	return &this
}

// GetLabel returns the Label field value if set, zero value otherwise.
func (o *LeadFormCommonPolicyLinksInner) GetLabel() string {
	if o == nil || IsNil(o.Label) {
		var ret string
		return ret
	}
	return *o.Label
}

// GetLabelOk returns a tuple with the Label field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormCommonPolicyLinksInner) GetLabelOk() (*string, bool) {
	if o == nil || IsNil(o.Label) {
		return nil, false
	}
	return o.Label, true
}

// HasLabel returns a boolean if a field has been set.
func (o *LeadFormCommonPolicyLinksInner) HasLabel() bool {
	if o != nil && !IsNil(o.Label) {
		return true
	}

	return false
}

// SetLabel gets a reference to the given string and assigns it to the Label field.
func (o *LeadFormCommonPolicyLinksInner) SetLabel(v string) {
	o.Label = &v
}

// GetLink returns the Link field value if set, zero value otherwise.
func (o *LeadFormCommonPolicyLinksInner) GetLink() string {
	if o == nil || IsNil(o.Link) {
		var ret string
		return ret
	}
	return *o.Link
}

// GetLinkOk returns a tuple with the Link field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormCommonPolicyLinksInner) GetLinkOk() (*string, bool) {
	if o == nil || IsNil(o.Link) {
		return nil, false
	}
	return o.Link, true
}

// HasLink returns a boolean if a field has been set.
func (o *LeadFormCommonPolicyLinksInner) HasLink() bool {
	if o != nil && !IsNil(o.Link) {
		return true
	}

	return false
}

// SetLink gets a reference to the given string and assigns it to the Link field.
func (o *LeadFormCommonPolicyLinksInner) SetLink(v string) {
	o.Link = &v
}

func (o LeadFormCommonPolicyLinksInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o LeadFormCommonPolicyLinksInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Label) {
		toSerialize["label"] = o.Label
	}
	if !IsNil(o.Link) {
		toSerialize["link"] = o.Link
	}
	return toSerialize, nil
}

type NullableLeadFormCommonPolicyLinksInner struct {
	value *LeadFormCommonPolicyLinksInner
	isSet bool
}

func (v NullableLeadFormCommonPolicyLinksInner) Get() *LeadFormCommonPolicyLinksInner {
	return v.value
}

func (v *NullableLeadFormCommonPolicyLinksInner) Set(val *LeadFormCommonPolicyLinksInner) {
	v.value = val
	v.isSet = true
}

func (v NullableLeadFormCommonPolicyLinksInner) IsSet() bool {
	return v.isSet
}

func (v *NullableLeadFormCommonPolicyLinksInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLeadFormCommonPolicyLinksInner(val *LeadFormCommonPolicyLinksInner) *NullableLeadFormCommonPolicyLinksInner {
	return &NullableLeadFormCommonPolicyLinksInner{value: val, isSet: true}
}

func (v NullableLeadFormCommonPolicyLinksInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLeadFormCommonPolicyLinksInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


