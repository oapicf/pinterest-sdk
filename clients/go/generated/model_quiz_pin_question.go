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

// checks if the QuizPinQuestion type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &QuizPinQuestion{}

// QuizPinQuestion A specific quiz inquiry.
type QuizPinQuestion struct {
	QuestionId *float32 `json:"question_id,omitempty"`
	QuestionText *string `json:"question_text,omitempty"`
	Options []QuizPinOption `json:"options,omitempty"`
}

// NewQuizPinQuestion instantiates a new QuizPinQuestion object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewQuizPinQuestion() *QuizPinQuestion {
	this := QuizPinQuestion{}
	return &this
}

// NewQuizPinQuestionWithDefaults instantiates a new QuizPinQuestion object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewQuizPinQuestionWithDefaults() *QuizPinQuestion {
	this := QuizPinQuestion{}
	return &this
}

// GetQuestionId returns the QuestionId field value if set, zero value otherwise.
func (o *QuizPinQuestion) GetQuestionId() float32 {
	if o == nil || IsNil(o.QuestionId) {
		var ret float32
		return ret
	}
	return *o.QuestionId
}

// GetQuestionIdOk returns a tuple with the QuestionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *QuizPinQuestion) GetQuestionIdOk() (*float32, bool) {
	if o == nil || IsNil(o.QuestionId) {
		return nil, false
	}
	return o.QuestionId, true
}

// HasQuestionId returns a boolean if a field has been set.
func (o *QuizPinQuestion) HasQuestionId() bool {
	if o != nil && !IsNil(o.QuestionId) {
		return true
	}

	return false
}

// SetQuestionId gets a reference to the given float32 and assigns it to the QuestionId field.
func (o *QuizPinQuestion) SetQuestionId(v float32) {
	o.QuestionId = &v
}

// GetQuestionText returns the QuestionText field value if set, zero value otherwise.
func (o *QuizPinQuestion) GetQuestionText() string {
	if o == nil || IsNil(o.QuestionText) {
		var ret string
		return ret
	}
	return *o.QuestionText
}

// GetQuestionTextOk returns a tuple with the QuestionText field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *QuizPinQuestion) GetQuestionTextOk() (*string, bool) {
	if o == nil || IsNil(o.QuestionText) {
		return nil, false
	}
	return o.QuestionText, true
}

// HasQuestionText returns a boolean if a field has been set.
func (o *QuizPinQuestion) HasQuestionText() bool {
	if o != nil && !IsNil(o.QuestionText) {
		return true
	}

	return false
}

// SetQuestionText gets a reference to the given string and assigns it to the QuestionText field.
func (o *QuizPinQuestion) SetQuestionText(v string) {
	o.QuestionText = &v
}

// GetOptions returns the Options field value if set, zero value otherwise.
func (o *QuizPinQuestion) GetOptions() []QuizPinOption {
	if o == nil || IsNil(o.Options) {
		var ret []QuizPinOption
		return ret
	}
	return o.Options
}

// GetOptionsOk returns a tuple with the Options field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *QuizPinQuestion) GetOptionsOk() ([]QuizPinOption, bool) {
	if o == nil || IsNil(o.Options) {
		return nil, false
	}
	return o.Options, true
}

// HasOptions returns a boolean if a field has been set.
func (o *QuizPinQuestion) HasOptions() bool {
	if o != nil && !IsNil(o.Options) {
		return true
	}

	return false
}

// SetOptions gets a reference to the given []QuizPinOption and assigns it to the Options field.
func (o *QuizPinQuestion) SetOptions(v []QuizPinOption) {
	o.Options = v
}

func (o QuizPinQuestion) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o QuizPinQuestion) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.QuestionId) {
		toSerialize["question_id"] = o.QuestionId
	}
	if !IsNil(o.QuestionText) {
		toSerialize["question_text"] = o.QuestionText
	}
	if !IsNil(o.Options) {
		toSerialize["options"] = o.Options
	}
	return toSerialize, nil
}

type NullableQuizPinQuestion struct {
	value *QuizPinQuestion
	isSet bool
}

func (v NullableQuizPinQuestion) Get() *QuizPinQuestion {
	return v.value
}

func (v *NullableQuizPinQuestion) Set(val *QuizPinQuestion) {
	v.value = val
	v.isSet = true
}

func (v NullableQuizPinQuestion) IsSet() bool {
	return v.isSet
}

func (v *NullableQuizPinQuestion) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableQuizPinQuestion(val *QuizPinQuestion) *NullableQuizPinQuestion {
	return &NullableQuizPinQuestion{value: val, isSet: true}
}

func (v NullableQuizPinQuestion) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableQuizPinQuestion) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

