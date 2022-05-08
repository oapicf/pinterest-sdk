/*
Pinterest REST API

Pinterest's REST API

API version: 5.3.0
Contact: pinterest-api@pinterest.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// MediaUpload Media upload that has been registered but not uploaded/processed yet.
type MediaUpload struct {
	// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
	MediaId *string `json:"media_id,omitempty"`
	MediaType *MediaUploadType `json:"media_type,omitempty"`
	// The URL where you will POST your media file.
	UploadUrl *string `json:"upload_url,omitempty"`
	UploadParameters *MediaUploadAllOfUploadParameters `json:"upload_parameters,omitempty"`
}

// NewMediaUpload instantiates a new MediaUpload object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMediaUpload() *MediaUpload {
	this := MediaUpload{}
	return &this
}

// NewMediaUploadWithDefaults instantiates a new MediaUpload object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMediaUploadWithDefaults() *MediaUpload {
	this := MediaUpload{}
	return &this
}

// GetMediaId returns the MediaId field value if set, zero value otherwise.
func (o *MediaUpload) GetMediaId() string {
	if o == nil || o.MediaId == nil {
		var ret string
		return ret
	}
	return *o.MediaId
}

// GetMediaIdOk returns a tuple with the MediaId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MediaUpload) GetMediaIdOk() (*string, bool) {
	if o == nil || o.MediaId == nil {
		return nil, false
	}
	return o.MediaId, true
}

// HasMediaId returns a boolean if a field has been set.
func (o *MediaUpload) HasMediaId() bool {
	if o != nil && o.MediaId != nil {
		return true
	}

	return false
}

// SetMediaId gets a reference to the given string and assigns it to the MediaId field.
func (o *MediaUpload) SetMediaId(v string) {
	o.MediaId = &v
}

// GetMediaType returns the MediaType field value if set, zero value otherwise.
func (o *MediaUpload) GetMediaType() MediaUploadType {
	if o == nil || o.MediaType == nil {
		var ret MediaUploadType
		return ret
	}
	return *o.MediaType
}

// GetMediaTypeOk returns a tuple with the MediaType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MediaUpload) GetMediaTypeOk() (*MediaUploadType, bool) {
	if o == nil || o.MediaType == nil {
		return nil, false
	}
	return o.MediaType, true
}

// HasMediaType returns a boolean if a field has been set.
func (o *MediaUpload) HasMediaType() bool {
	if o != nil && o.MediaType != nil {
		return true
	}

	return false
}

// SetMediaType gets a reference to the given MediaUploadType and assigns it to the MediaType field.
func (o *MediaUpload) SetMediaType(v MediaUploadType) {
	o.MediaType = &v
}

// GetUploadUrl returns the UploadUrl field value if set, zero value otherwise.
func (o *MediaUpload) GetUploadUrl() string {
	if o == nil || o.UploadUrl == nil {
		var ret string
		return ret
	}
	return *o.UploadUrl
}

// GetUploadUrlOk returns a tuple with the UploadUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MediaUpload) GetUploadUrlOk() (*string, bool) {
	if o == nil || o.UploadUrl == nil {
		return nil, false
	}
	return o.UploadUrl, true
}

// HasUploadUrl returns a boolean if a field has been set.
func (o *MediaUpload) HasUploadUrl() bool {
	if o != nil && o.UploadUrl != nil {
		return true
	}

	return false
}

// SetUploadUrl gets a reference to the given string and assigns it to the UploadUrl field.
func (o *MediaUpload) SetUploadUrl(v string) {
	o.UploadUrl = &v
}

// GetUploadParameters returns the UploadParameters field value if set, zero value otherwise.
func (o *MediaUpload) GetUploadParameters() MediaUploadAllOfUploadParameters {
	if o == nil || o.UploadParameters == nil {
		var ret MediaUploadAllOfUploadParameters
		return ret
	}
	return *o.UploadParameters
}

// GetUploadParametersOk returns a tuple with the UploadParameters field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MediaUpload) GetUploadParametersOk() (*MediaUploadAllOfUploadParameters, bool) {
	if o == nil || o.UploadParameters == nil {
		return nil, false
	}
	return o.UploadParameters, true
}

// HasUploadParameters returns a boolean if a field has been set.
func (o *MediaUpload) HasUploadParameters() bool {
	if o != nil && o.UploadParameters != nil {
		return true
	}

	return false
}

// SetUploadParameters gets a reference to the given MediaUploadAllOfUploadParameters and assigns it to the UploadParameters field.
func (o *MediaUpload) SetUploadParameters(v MediaUploadAllOfUploadParameters) {
	o.UploadParameters = &v
}

func (o MediaUpload) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.MediaId != nil {
		toSerialize["media_id"] = o.MediaId
	}
	if o.MediaType != nil {
		toSerialize["media_type"] = o.MediaType
	}
	if o.UploadUrl != nil {
		toSerialize["upload_url"] = o.UploadUrl
	}
	if o.UploadParameters != nil {
		toSerialize["upload_parameters"] = o.UploadParameters
	}
	return json.Marshal(toSerialize)
}

type NullableMediaUpload struct {
	value *MediaUpload
	isSet bool
}

func (v NullableMediaUpload) Get() *MediaUpload {
	return v.value
}

func (v *NullableMediaUpload) Set(val *MediaUpload) {
	v.value = val
	v.isSet = true
}

func (v NullableMediaUpload) IsSet() bool {
	return v.isSet
}

func (v *NullableMediaUpload) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMediaUpload(val *MediaUpload) *NullableMediaUpload {
	return &NullableMediaUpload{value: val, isSet: true}
}

func (v NullableMediaUpload) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMediaUpload) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

