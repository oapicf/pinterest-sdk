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

// OauthAccessTokenRequestCode A request to exchange an authorization code for an access token.
type OauthAccessTokenRequestCode struct {
	OauthAccessTokenRequest
	Code string `json:"code"`
	RedirectUri string `json:"redirect_uri"`
}

// NewOauthAccessTokenRequestCode instantiates a new OauthAccessTokenRequestCode object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOauthAccessTokenRequestCode(code string, redirectUri string, grantType string) *OauthAccessTokenRequestCode {
	this := OauthAccessTokenRequestCode{}
	this.GrantType = grantType
	this.Code = code
	this.RedirectUri = redirectUri
	return &this
}

// NewOauthAccessTokenRequestCodeWithDefaults instantiates a new OauthAccessTokenRequestCode object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOauthAccessTokenRequestCodeWithDefaults() *OauthAccessTokenRequestCode {
	this := OauthAccessTokenRequestCode{}
	return &this
}

// GetCode returns the Code field value
func (o *OauthAccessTokenRequestCode) GetCode() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Code
}

// GetCodeOk returns a tuple with the Code field value
// and a boolean to check if the value has been set.
func (o *OauthAccessTokenRequestCode) GetCodeOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Code, true
}

// SetCode sets field value
func (o *OauthAccessTokenRequestCode) SetCode(v string) {
	o.Code = v
}

// GetRedirectUri returns the RedirectUri field value
func (o *OauthAccessTokenRequestCode) GetRedirectUri() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RedirectUri
}

// GetRedirectUriOk returns a tuple with the RedirectUri field value
// and a boolean to check if the value has been set.
func (o *OauthAccessTokenRequestCode) GetRedirectUriOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.RedirectUri, true
}

// SetRedirectUri sets field value
func (o *OauthAccessTokenRequestCode) SetRedirectUri(v string) {
	o.RedirectUri = v
}

func (o OauthAccessTokenRequestCode) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	serializedOauthAccessTokenRequest, errOauthAccessTokenRequest := json.Marshal(o.OauthAccessTokenRequest)
	if errOauthAccessTokenRequest != nil {
		return []byte{}, errOauthAccessTokenRequest
	}
	errOauthAccessTokenRequest = json.Unmarshal([]byte(serializedOauthAccessTokenRequest), &toSerialize)
	if errOauthAccessTokenRequest != nil {
		return []byte{}, errOauthAccessTokenRequest
	}
	if true {
		toSerialize["code"] = o.Code
	}
	if true {
		toSerialize["redirect_uri"] = o.RedirectUri
	}
	return json.Marshal(toSerialize)
}

type NullableOauthAccessTokenRequestCode struct {
	value *OauthAccessTokenRequestCode
	isSet bool
}

func (v NullableOauthAccessTokenRequestCode) Get() *OauthAccessTokenRequestCode {
	return v.value
}

func (v *NullableOauthAccessTokenRequestCode) Set(val *OauthAccessTokenRequestCode) {
	v.value = val
	v.isSet = true
}

func (v NullableOauthAccessTokenRequestCode) IsSet() bool {
	return v.isSet
}

func (v *NullableOauthAccessTokenRequestCode) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOauthAccessTokenRequestCode(val *OauthAccessTokenRequestCode) *NullableOauthAccessTokenRequestCode {
	return &NullableOauthAccessTokenRequestCode{value: val, isSet: true}
}

func (v NullableOauthAccessTokenRequestCode) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOauthAccessTokenRequestCode) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

