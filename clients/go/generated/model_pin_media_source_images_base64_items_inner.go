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

// checks if the PinMediaSourceImagesBase64ItemsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PinMediaSourceImagesBase64ItemsInner{}

// PinMediaSourceImagesBase64ItemsInner struct for PinMediaSourceImagesBase64ItemsInner
type PinMediaSourceImagesBase64ItemsInner struct {
	Title *string `json:"title,omitempty"`
	Description *string `json:"description,omitempty"`
	// Destination link for the image.
	Link *string `json:"link,omitempty"`
	ContentType string `json:"content_type"`
	// Image to upload as base64 string.
	Data string `json:"data" validate:"regexp=[a-zA-Z0-9+\\/=]+"`
}

type _PinMediaSourceImagesBase64ItemsInner PinMediaSourceImagesBase64ItemsInner

// NewPinMediaSourceImagesBase64ItemsInner instantiates a new PinMediaSourceImagesBase64ItemsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPinMediaSourceImagesBase64ItemsInner(contentType string, data string) *PinMediaSourceImagesBase64ItemsInner {
	this := PinMediaSourceImagesBase64ItemsInner{}
	this.ContentType = contentType
	this.Data = data
	return &this
}

// NewPinMediaSourceImagesBase64ItemsInnerWithDefaults instantiates a new PinMediaSourceImagesBase64ItemsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPinMediaSourceImagesBase64ItemsInnerWithDefaults() *PinMediaSourceImagesBase64ItemsInner {
	this := PinMediaSourceImagesBase64ItemsInner{}
	return &this
}

// GetTitle returns the Title field value if set, zero value otherwise.
func (o *PinMediaSourceImagesBase64ItemsInner) GetTitle() string {
	if o == nil || IsNil(o.Title) {
		var ret string
		return ret
	}
	return *o.Title
}

// GetTitleOk returns a tuple with the Title field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinMediaSourceImagesBase64ItemsInner) GetTitleOk() (*string, bool) {
	if o == nil || IsNil(o.Title) {
		return nil, false
	}
	return o.Title, true
}

// HasTitle returns a boolean if a field has been set.
func (o *PinMediaSourceImagesBase64ItemsInner) HasTitle() bool {
	if o != nil && !IsNil(o.Title) {
		return true
	}

	return false
}

// SetTitle gets a reference to the given string and assigns it to the Title field.
func (o *PinMediaSourceImagesBase64ItemsInner) SetTitle(v string) {
	o.Title = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *PinMediaSourceImagesBase64ItemsInner) GetDescription() string {
	if o == nil || IsNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinMediaSourceImagesBase64ItemsInner) GetDescriptionOk() (*string, bool) {
	if o == nil || IsNil(o.Description) {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *PinMediaSourceImagesBase64ItemsInner) HasDescription() bool {
	if o != nil && !IsNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *PinMediaSourceImagesBase64ItemsInner) SetDescription(v string) {
	o.Description = &v
}

// GetLink returns the Link field value if set, zero value otherwise.
func (o *PinMediaSourceImagesBase64ItemsInner) GetLink() string {
	if o == nil || IsNil(o.Link) {
		var ret string
		return ret
	}
	return *o.Link
}

// GetLinkOk returns a tuple with the Link field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinMediaSourceImagesBase64ItemsInner) GetLinkOk() (*string, bool) {
	if o == nil || IsNil(o.Link) {
		return nil, false
	}
	return o.Link, true
}

// HasLink returns a boolean if a field has been set.
func (o *PinMediaSourceImagesBase64ItemsInner) HasLink() bool {
	if o != nil && !IsNil(o.Link) {
		return true
	}

	return false
}

// SetLink gets a reference to the given string and assigns it to the Link field.
func (o *PinMediaSourceImagesBase64ItemsInner) SetLink(v string) {
	o.Link = &v
}

// GetContentType returns the ContentType field value
func (o *PinMediaSourceImagesBase64ItemsInner) GetContentType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ContentType
}

// GetContentTypeOk returns a tuple with the ContentType field value
// and a boolean to check if the value has been set.
func (o *PinMediaSourceImagesBase64ItemsInner) GetContentTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ContentType, true
}

// SetContentType sets field value
func (o *PinMediaSourceImagesBase64ItemsInner) SetContentType(v string) {
	o.ContentType = v
}

// GetData returns the Data field value
func (o *PinMediaSourceImagesBase64ItemsInner) GetData() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *PinMediaSourceImagesBase64ItemsInner) GetDataOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Data, true
}

// SetData sets field value
func (o *PinMediaSourceImagesBase64ItemsInner) SetData(v string) {
	o.Data = v
}

func (o PinMediaSourceImagesBase64ItemsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PinMediaSourceImagesBase64ItemsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Title) {
		toSerialize["title"] = o.Title
	}
	if !IsNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !IsNil(o.Link) {
		toSerialize["link"] = o.Link
	}
	toSerialize["content_type"] = o.ContentType
	toSerialize["data"] = o.Data
	return toSerialize, nil
}

func (o *PinMediaSourceImagesBase64ItemsInner) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"content_type",
		"data",
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

	varPinMediaSourceImagesBase64ItemsInner := _PinMediaSourceImagesBase64ItemsInner{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varPinMediaSourceImagesBase64ItemsInner)

	if err != nil {
		return err
	}

	*o = PinMediaSourceImagesBase64ItemsInner(varPinMediaSourceImagesBase64ItemsInner)

	return err
}

type NullablePinMediaSourceImagesBase64ItemsInner struct {
	value *PinMediaSourceImagesBase64ItemsInner
	isSet bool
}

func (v NullablePinMediaSourceImagesBase64ItemsInner) Get() *PinMediaSourceImagesBase64ItemsInner {
	return v.value
}

func (v *NullablePinMediaSourceImagesBase64ItemsInner) Set(val *PinMediaSourceImagesBase64ItemsInner) {
	v.value = val
	v.isSet = true
}

func (v NullablePinMediaSourceImagesBase64ItemsInner) IsSet() bool {
	return v.isSet
}

func (v *NullablePinMediaSourceImagesBase64ItemsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePinMediaSourceImagesBase64ItemsInner(val *PinMediaSourceImagesBase64ItemsInner) *NullablePinMediaSourceImagesBase64ItemsInner {
	return &NullablePinMediaSourceImagesBase64ItemsInner{value: val, isSet: true}
}

func (v NullablePinMediaSourceImagesBase64ItemsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePinMediaSourceImagesBase64ItemsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


