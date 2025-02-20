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

// checks if the OauthAccessTokenResponseClientCredentials type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OauthAccessTokenResponseClientCredentials{}

// OauthAccessTokenResponseClientCredentials A successful OAuth client token response for the client token flow.
type OauthAccessTokenResponseClientCredentials struct {
	ResponseType *string `json:"response_type,omitempty"`
	AccessToken string `json:"access_token"`
	TokenType string `json:"token_type"`
	ExpiresIn int32 `json:"expires_in"`
	Scope string `json:"scope"`
}

type _OauthAccessTokenResponseClientCredentials OauthAccessTokenResponseClientCredentials

// NewOauthAccessTokenResponseClientCredentials instantiates a new OauthAccessTokenResponseClientCredentials object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOauthAccessTokenResponseClientCredentials(accessToken string, tokenType string, expiresIn int32, scope string) *OauthAccessTokenResponseClientCredentials {
	this := OauthAccessTokenResponseClientCredentials{}
	this.AccessToken = accessToken
	this.TokenType = tokenType
	this.ExpiresIn = expiresIn
	this.Scope = scope
	return &this
}

// NewOauthAccessTokenResponseClientCredentialsWithDefaults instantiates a new OauthAccessTokenResponseClientCredentials object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOauthAccessTokenResponseClientCredentialsWithDefaults() *OauthAccessTokenResponseClientCredentials {
	this := OauthAccessTokenResponseClientCredentials{}
	var tokenType string = "bearer"
	this.TokenType = tokenType
	return &this
}

// GetResponseType returns the ResponseType field value if set, zero value otherwise.
func (o *OauthAccessTokenResponseClientCredentials) GetResponseType() string {
	if o == nil || IsNil(o.ResponseType) {
		var ret string
		return ret
	}
	return *o.ResponseType
}

// GetResponseTypeOk returns a tuple with the ResponseType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OauthAccessTokenResponseClientCredentials) GetResponseTypeOk() (*string, bool) {
	if o == nil || IsNil(o.ResponseType) {
		return nil, false
	}
	return o.ResponseType, true
}

// HasResponseType returns a boolean if a field has been set.
func (o *OauthAccessTokenResponseClientCredentials) HasResponseType() bool {
	if o != nil && !IsNil(o.ResponseType) {
		return true
	}

	return false
}

// SetResponseType gets a reference to the given string and assigns it to the ResponseType field.
func (o *OauthAccessTokenResponseClientCredentials) SetResponseType(v string) {
	o.ResponseType = &v
}

// GetAccessToken returns the AccessToken field value
func (o *OauthAccessTokenResponseClientCredentials) GetAccessToken() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AccessToken
}

// GetAccessTokenOk returns a tuple with the AccessToken field value
// and a boolean to check if the value has been set.
func (o *OauthAccessTokenResponseClientCredentials) GetAccessTokenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AccessToken, true
}

// SetAccessToken sets field value
func (o *OauthAccessTokenResponseClientCredentials) SetAccessToken(v string) {
	o.AccessToken = v
}

// GetTokenType returns the TokenType field value
func (o *OauthAccessTokenResponseClientCredentials) GetTokenType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.TokenType
}

// GetTokenTypeOk returns a tuple with the TokenType field value
// and a boolean to check if the value has been set.
func (o *OauthAccessTokenResponseClientCredentials) GetTokenTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TokenType, true
}

// SetTokenType sets field value
func (o *OauthAccessTokenResponseClientCredentials) SetTokenType(v string) {
	o.TokenType = v
}

// GetExpiresIn returns the ExpiresIn field value
func (o *OauthAccessTokenResponseClientCredentials) GetExpiresIn() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.ExpiresIn
}

// GetExpiresInOk returns a tuple with the ExpiresIn field value
// and a boolean to check if the value has been set.
func (o *OauthAccessTokenResponseClientCredentials) GetExpiresInOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ExpiresIn, true
}

// SetExpiresIn sets field value
func (o *OauthAccessTokenResponseClientCredentials) SetExpiresIn(v int32) {
	o.ExpiresIn = v
}

// GetScope returns the Scope field value
func (o *OauthAccessTokenResponseClientCredentials) GetScope() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Scope
}

// GetScopeOk returns a tuple with the Scope field value
// and a boolean to check if the value has been set.
func (o *OauthAccessTokenResponseClientCredentials) GetScopeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Scope, true
}

// SetScope sets field value
func (o *OauthAccessTokenResponseClientCredentials) SetScope(v string) {
	o.Scope = v
}

func (o OauthAccessTokenResponseClientCredentials) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OauthAccessTokenResponseClientCredentials) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ResponseType) {
		toSerialize["response_type"] = o.ResponseType
	}
	toSerialize["access_token"] = o.AccessToken
	toSerialize["token_type"] = o.TokenType
	toSerialize["expires_in"] = o.ExpiresIn
	toSerialize["scope"] = o.Scope
	return toSerialize, nil
}

func (o *OauthAccessTokenResponseClientCredentials) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"access_token",
		"token_type",
		"expires_in",
		"scope",
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

	varOauthAccessTokenResponseClientCredentials := _OauthAccessTokenResponseClientCredentials{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varOauthAccessTokenResponseClientCredentials)

	if err != nil {
		return err
	}

	*o = OauthAccessTokenResponseClientCredentials(varOauthAccessTokenResponseClientCredentials)

	return err
}

type NullableOauthAccessTokenResponseClientCredentials struct {
	value *OauthAccessTokenResponseClientCredentials
	isSet bool
}

func (v NullableOauthAccessTokenResponseClientCredentials) Get() *OauthAccessTokenResponseClientCredentials {
	return v.value
}

func (v *NullableOauthAccessTokenResponseClientCredentials) Set(val *OauthAccessTokenResponseClientCredentials) {
	v.value = val
	v.isSet = true
}

func (v NullableOauthAccessTokenResponseClientCredentials) IsSet() bool {
	return v.isSet
}

func (v *NullableOauthAccessTokenResponseClientCredentials) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOauthAccessTokenResponseClientCredentials(val *OauthAccessTokenResponseClientCredentials) *NullableOauthAccessTokenResponseClientCredentials {
	return &NullableOauthAccessTokenResponseClientCredentials{value: val, isSet: true}
}

func (v NullableOauthAccessTokenResponseClientCredentials) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOauthAccessTokenResponseClientCredentials) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


