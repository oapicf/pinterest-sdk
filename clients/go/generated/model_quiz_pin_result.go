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

// checks if the QuizPinResult type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &QuizPinResult{}

// QuizPinResult The result, and link out, based on the user’s choice.
type QuizPinResult struct {
	OrganicPinId *string `json:"organic_pin_id,omitempty"`
	AndroidDeepLink *string `json:"android_deep_link,omitempty"`
	IosDeepLink *string `json:"ios_deep_link,omitempty"`
	DestinationUrl *string `json:"destination_url,omitempty"`
	ResultId *float32 `json:"result_id,omitempty"`
}

// NewQuizPinResult instantiates a new QuizPinResult object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewQuizPinResult() *QuizPinResult {
	this := QuizPinResult{}
	return &this
}

// NewQuizPinResultWithDefaults instantiates a new QuizPinResult object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewQuizPinResultWithDefaults() *QuizPinResult {
	this := QuizPinResult{}
	return &this
}

// GetOrganicPinId returns the OrganicPinId field value if set, zero value otherwise.
func (o *QuizPinResult) GetOrganicPinId() string {
	if o == nil || IsNil(o.OrganicPinId) {
		var ret string
		return ret
	}
	return *o.OrganicPinId
}

// GetOrganicPinIdOk returns a tuple with the OrganicPinId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *QuizPinResult) GetOrganicPinIdOk() (*string, bool) {
	if o == nil || IsNil(o.OrganicPinId) {
		return nil, false
	}
	return o.OrganicPinId, true
}

// HasOrganicPinId returns a boolean if a field has been set.
func (o *QuizPinResult) HasOrganicPinId() bool {
	if o != nil && !IsNil(o.OrganicPinId) {
		return true
	}

	return false
}

// SetOrganicPinId gets a reference to the given string and assigns it to the OrganicPinId field.
func (o *QuizPinResult) SetOrganicPinId(v string) {
	o.OrganicPinId = &v
}

// GetAndroidDeepLink returns the AndroidDeepLink field value if set, zero value otherwise.
func (o *QuizPinResult) GetAndroidDeepLink() string {
	if o == nil || IsNil(o.AndroidDeepLink) {
		var ret string
		return ret
	}
	return *o.AndroidDeepLink
}

// GetAndroidDeepLinkOk returns a tuple with the AndroidDeepLink field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *QuizPinResult) GetAndroidDeepLinkOk() (*string, bool) {
	if o == nil || IsNil(o.AndroidDeepLink) {
		return nil, false
	}
	return o.AndroidDeepLink, true
}

// HasAndroidDeepLink returns a boolean if a field has been set.
func (o *QuizPinResult) HasAndroidDeepLink() bool {
	if o != nil && !IsNil(o.AndroidDeepLink) {
		return true
	}

	return false
}

// SetAndroidDeepLink gets a reference to the given string and assigns it to the AndroidDeepLink field.
func (o *QuizPinResult) SetAndroidDeepLink(v string) {
	o.AndroidDeepLink = &v
}

// GetIosDeepLink returns the IosDeepLink field value if set, zero value otherwise.
func (o *QuizPinResult) GetIosDeepLink() string {
	if o == nil || IsNil(o.IosDeepLink) {
		var ret string
		return ret
	}
	return *o.IosDeepLink
}

// GetIosDeepLinkOk returns a tuple with the IosDeepLink field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *QuizPinResult) GetIosDeepLinkOk() (*string, bool) {
	if o == nil || IsNil(o.IosDeepLink) {
		return nil, false
	}
	return o.IosDeepLink, true
}

// HasIosDeepLink returns a boolean if a field has been set.
func (o *QuizPinResult) HasIosDeepLink() bool {
	if o != nil && !IsNil(o.IosDeepLink) {
		return true
	}

	return false
}

// SetIosDeepLink gets a reference to the given string and assigns it to the IosDeepLink field.
func (o *QuizPinResult) SetIosDeepLink(v string) {
	o.IosDeepLink = &v
}

// GetDestinationUrl returns the DestinationUrl field value if set, zero value otherwise.
func (o *QuizPinResult) GetDestinationUrl() string {
	if o == nil || IsNil(o.DestinationUrl) {
		var ret string
		return ret
	}
	return *o.DestinationUrl
}

// GetDestinationUrlOk returns a tuple with the DestinationUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *QuizPinResult) GetDestinationUrlOk() (*string, bool) {
	if o == nil || IsNil(o.DestinationUrl) {
		return nil, false
	}
	return o.DestinationUrl, true
}

// HasDestinationUrl returns a boolean if a field has been set.
func (o *QuizPinResult) HasDestinationUrl() bool {
	if o != nil && !IsNil(o.DestinationUrl) {
		return true
	}

	return false
}

// SetDestinationUrl gets a reference to the given string and assigns it to the DestinationUrl field.
func (o *QuizPinResult) SetDestinationUrl(v string) {
	o.DestinationUrl = &v
}

// GetResultId returns the ResultId field value if set, zero value otherwise.
func (o *QuizPinResult) GetResultId() float32 {
	if o == nil || IsNil(o.ResultId) {
		var ret float32
		return ret
	}
	return *o.ResultId
}

// GetResultIdOk returns a tuple with the ResultId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *QuizPinResult) GetResultIdOk() (*float32, bool) {
	if o == nil || IsNil(o.ResultId) {
		return nil, false
	}
	return o.ResultId, true
}

// HasResultId returns a boolean if a field has been set.
func (o *QuizPinResult) HasResultId() bool {
	if o != nil && !IsNil(o.ResultId) {
		return true
	}

	return false
}

// SetResultId gets a reference to the given float32 and assigns it to the ResultId field.
func (o *QuizPinResult) SetResultId(v float32) {
	o.ResultId = &v
}

func (o QuizPinResult) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o QuizPinResult) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.OrganicPinId) {
		toSerialize["organic_pin_id"] = o.OrganicPinId
	}
	if !IsNil(o.AndroidDeepLink) {
		toSerialize["android_deep_link"] = o.AndroidDeepLink
	}
	if !IsNil(o.IosDeepLink) {
		toSerialize["ios_deep_link"] = o.IosDeepLink
	}
	if !IsNil(o.DestinationUrl) {
		toSerialize["destination_url"] = o.DestinationUrl
	}
	if !IsNil(o.ResultId) {
		toSerialize["result_id"] = o.ResultId
	}
	return toSerialize, nil
}

type NullableQuizPinResult struct {
	value *QuizPinResult
	isSet bool
}

func (v NullableQuizPinResult) Get() *QuizPinResult {
	return v.value
}

func (v *NullableQuizPinResult) Set(val *QuizPinResult) {
	v.value = val
	v.isSet = true
}

func (v NullableQuizPinResult) IsSet() bool {
	return v.isSet
}

func (v *NullableQuizPinResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableQuizPinResult(val *QuizPinResult) *NullableQuizPinResult {
	return &NullableQuizPinResult{value: val, isSet: true}
}

func (v NullableQuizPinResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableQuizPinResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

