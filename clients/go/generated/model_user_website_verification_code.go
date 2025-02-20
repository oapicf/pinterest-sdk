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

// checks if the UserWebsiteVerificationCode type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UserWebsiteVerificationCode{}

// UserWebsiteVerificationCode struct for UserWebsiteVerificationCode
type UserWebsiteVerificationCode struct {
	// Code to check against the user claiming the website
	VerificationCode *string `json:"verification_code,omitempty"`
	// DNS TXT record to check against for the website to be claimed
	DnsTxtRecord *string `json:"dns_txt_record,omitempty"`
	// Metatag the verification process searchs for the website to be claimed
	Metatag *string `json:"metatag,omitempty"`
	// File expected to find on the website being claimed
	Filename *string `json:"filename,omitempty"`
	// A full html file to upload to the website in order for it to be claimed
	FileContent *string `json:"file_content,omitempty"`
}

// NewUserWebsiteVerificationCode instantiates a new UserWebsiteVerificationCode object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUserWebsiteVerificationCode() *UserWebsiteVerificationCode {
	this := UserWebsiteVerificationCode{}
	return &this
}

// NewUserWebsiteVerificationCodeWithDefaults instantiates a new UserWebsiteVerificationCode object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUserWebsiteVerificationCodeWithDefaults() *UserWebsiteVerificationCode {
	this := UserWebsiteVerificationCode{}
	return &this
}

// GetVerificationCode returns the VerificationCode field value if set, zero value otherwise.
func (o *UserWebsiteVerificationCode) GetVerificationCode() string {
	if o == nil || IsNil(o.VerificationCode) {
		var ret string
		return ret
	}
	return *o.VerificationCode
}

// GetVerificationCodeOk returns a tuple with the VerificationCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserWebsiteVerificationCode) GetVerificationCodeOk() (*string, bool) {
	if o == nil || IsNil(o.VerificationCode) {
		return nil, false
	}
	return o.VerificationCode, true
}

// HasVerificationCode returns a boolean if a field has been set.
func (o *UserWebsiteVerificationCode) HasVerificationCode() bool {
	if o != nil && !IsNil(o.VerificationCode) {
		return true
	}

	return false
}

// SetVerificationCode gets a reference to the given string and assigns it to the VerificationCode field.
func (o *UserWebsiteVerificationCode) SetVerificationCode(v string) {
	o.VerificationCode = &v
}

// GetDnsTxtRecord returns the DnsTxtRecord field value if set, zero value otherwise.
func (o *UserWebsiteVerificationCode) GetDnsTxtRecord() string {
	if o == nil || IsNil(o.DnsTxtRecord) {
		var ret string
		return ret
	}
	return *o.DnsTxtRecord
}

// GetDnsTxtRecordOk returns a tuple with the DnsTxtRecord field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserWebsiteVerificationCode) GetDnsTxtRecordOk() (*string, bool) {
	if o == nil || IsNil(o.DnsTxtRecord) {
		return nil, false
	}
	return o.DnsTxtRecord, true
}

// HasDnsTxtRecord returns a boolean if a field has been set.
func (o *UserWebsiteVerificationCode) HasDnsTxtRecord() bool {
	if o != nil && !IsNil(o.DnsTxtRecord) {
		return true
	}

	return false
}

// SetDnsTxtRecord gets a reference to the given string and assigns it to the DnsTxtRecord field.
func (o *UserWebsiteVerificationCode) SetDnsTxtRecord(v string) {
	o.DnsTxtRecord = &v
}

// GetMetatag returns the Metatag field value if set, zero value otherwise.
func (o *UserWebsiteVerificationCode) GetMetatag() string {
	if o == nil || IsNil(o.Metatag) {
		var ret string
		return ret
	}
	return *o.Metatag
}

// GetMetatagOk returns a tuple with the Metatag field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserWebsiteVerificationCode) GetMetatagOk() (*string, bool) {
	if o == nil || IsNil(o.Metatag) {
		return nil, false
	}
	return o.Metatag, true
}

// HasMetatag returns a boolean if a field has been set.
func (o *UserWebsiteVerificationCode) HasMetatag() bool {
	if o != nil && !IsNil(o.Metatag) {
		return true
	}

	return false
}

// SetMetatag gets a reference to the given string and assigns it to the Metatag field.
func (o *UserWebsiteVerificationCode) SetMetatag(v string) {
	o.Metatag = &v
}

// GetFilename returns the Filename field value if set, zero value otherwise.
func (o *UserWebsiteVerificationCode) GetFilename() string {
	if o == nil || IsNil(o.Filename) {
		var ret string
		return ret
	}
	return *o.Filename
}

// GetFilenameOk returns a tuple with the Filename field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserWebsiteVerificationCode) GetFilenameOk() (*string, bool) {
	if o == nil || IsNil(o.Filename) {
		return nil, false
	}
	return o.Filename, true
}

// HasFilename returns a boolean if a field has been set.
func (o *UserWebsiteVerificationCode) HasFilename() bool {
	if o != nil && !IsNil(o.Filename) {
		return true
	}

	return false
}

// SetFilename gets a reference to the given string and assigns it to the Filename field.
func (o *UserWebsiteVerificationCode) SetFilename(v string) {
	o.Filename = &v
}

// GetFileContent returns the FileContent field value if set, zero value otherwise.
func (o *UserWebsiteVerificationCode) GetFileContent() string {
	if o == nil || IsNil(o.FileContent) {
		var ret string
		return ret
	}
	return *o.FileContent
}

// GetFileContentOk returns a tuple with the FileContent field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserWebsiteVerificationCode) GetFileContentOk() (*string, bool) {
	if o == nil || IsNil(o.FileContent) {
		return nil, false
	}
	return o.FileContent, true
}

// HasFileContent returns a boolean if a field has been set.
func (o *UserWebsiteVerificationCode) HasFileContent() bool {
	if o != nil && !IsNil(o.FileContent) {
		return true
	}

	return false
}

// SetFileContent gets a reference to the given string and assigns it to the FileContent field.
func (o *UserWebsiteVerificationCode) SetFileContent(v string) {
	o.FileContent = &v
}

func (o UserWebsiteVerificationCode) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UserWebsiteVerificationCode) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.VerificationCode) {
		toSerialize["verification_code"] = o.VerificationCode
	}
	if !IsNil(o.DnsTxtRecord) {
		toSerialize["dns_txt_record"] = o.DnsTxtRecord
	}
	if !IsNil(o.Metatag) {
		toSerialize["metatag"] = o.Metatag
	}
	if !IsNil(o.Filename) {
		toSerialize["filename"] = o.Filename
	}
	if !IsNil(o.FileContent) {
		toSerialize["file_content"] = o.FileContent
	}
	return toSerialize, nil
}

type NullableUserWebsiteVerificationCode struct {
	value *UserWebsiteVerificationCode
	isSet bool
}

func (v NullableUserWebsiteVerificationCode) Get() *UserWebsiteVerificationCode {
	return v.value
}

func (v *NullableUserWebsiteVerificationCode) Set(val *UserWebsiteVerificationCode) {
	v.value = val
	v.isSet = true
}

func (v NullableUserWebsiteVerificationCode) IsSet() bool {
	return v.isSet
}

func (v *NullableUserWebsiteVerificationCode) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUserWebsiteVerificationCode(val *UserWebsiteVerificationCode) *NullableUserWebsiteVerificationCode {
	return &NullableUserWebsiteVerificationCode{value: val, isSet: true}
}

func (v NullableUserWebsiteVerificationCode) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUserWebsiteVerificationCode) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


