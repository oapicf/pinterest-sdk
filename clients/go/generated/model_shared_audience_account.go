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

// checks if the SharedAudienceAccount type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &SharedAudienceAccount{}

// SharedAudienceAccount struct for SharedAudienceAccount
type SharedAudienceAccount struct {
	// Account ID (ad account or business ID).
	AccountId string `json:"account_id" validate:"regexp=^\\\\d+$"`
	// Account name.
	AccountName string `json:"account_name"`
	// account type
	AccountType string `json:"account_type"`
	// Epoch timestamp in seconds for the shared audience event
	SharedOnTimestamp int32 `json:"shared_on_timestamp"`
}

type _SharedAudienceAccount SharedAudienceAccount

// NewSharedAudienceAccount instantiates a new SharedAudienceAccount object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSharedAudienceAccount(accountId string, accountName string, accountType string, sharedOnTimestamp int32) *SharedAudienceAccount {
	this := SharedAudienceAccount{}
	this.AccountId = accountId
	this.AccountName = accountName
	this.AccountType = accountType
	this.SharedOnTimestamp = sharedOnTimestamp
	return &this
}

// NewSharedAudienceAccountWithDefaults instantiates a new SharedAudienceAccount object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSharedAudienceAccountWithDefaults() *SharedAudienceAccount {
	this := SharedAudienceAccount{}
	return &this
}

// GetAccountId returns the AccountId field value
func (o *SharedAudienceAccount) GetAccountId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AccountId
}

// GetAccountIdOk returns a tuple with the AccountId field value
// and a boolean to check if the value has been set.
func (o *SharedAudienceAccount) GetAccountIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AccountId, true
}

// SetAccountId sets field value
func (o *SharedAudienceAccount) SetAccountId(v string) {
	o.AccountId = v
}

// GetAccountName returns the AccountName field value
func (o *SharedAudienceAccount) GetAccountName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AccountName
}

// GetAccountNameOk returns a tuple with the AccountName field value
// and a boolean to check if the value has been set.
func (o *SharedAudienceAccount) GetAccountNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AccountName, true
}

// SetAccountName sets field value
func (o *SharedAudienceAccount) SetAccountName(v string) {
	o.AccountName = v
}

// GetAccountType returns the AccountType field value
func (o *SharedAudienceAccount) GetAccountType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AccountType
}

// GetAccountTypeOk returns a tuple with the AccountType field value
// and a boolean to check if the value has been set.
func (o *SharedAudienceAccount) GetAccountTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AccountType, true
}

// SetAccountType sets field value
func (o *SharedAudienceAccount) SetAccountType(v string) {
	o.AccountType = v
}

// GetSharedOnTimestamp returns the SharedOnTimestamp field value
func (o *SharedAudienceAccount) GetSharedOnTimestamp() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.SharedOnTimestamp
}

// GetSharedOnTimestampOk returns a tuple with the SharedOnTimestamp field value
// and a boolean to check if the value has been set.
func (o *SharedAudienceAccount) GetSharedOnTimestampOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SharedOnTimestamp, true
}

// SetSharedOnTimestamp sets field value
func (o *SharedAudienceAccount) SetSharedOnTimestamp(v int32) {
	o.SharedOnTimestamp = v
}

func (o SharedAudienceAccount) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SharedAudienceAccount) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["account_id"] = o.AccountId
	toSerialize["account_name"] = o.AccountName
	toSerialize["account_type"] = o.AccountType
	toSerialize["shared_on_timestamp"] = o.SharedOnTimestamp
	return toSerialize, nil
}

func (o *SharedAudienceAccount) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"account_id",
		"account_name",
		"account_type",
		"shared_on_timestamp",
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

	varSharedAudienceAccount := _SharedAudienceAccount{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varSharedAudienceAccount)

	if err != nil {
		return err
	}

	*o = SharedAudienceAccount(varSharedAudienceAccount)

	return err
}

type NullableSharedAudienceAccount struct {
	value *SharedAudienceAccount
	isSet bool
}

func (v NullableSharedAudienceAccount) Get() *SharedAudienceAccount {
	return v.value
}

func (v *NullableSharedAudienceAccount) Set(val *SharedAudienceAccount) {
	v.value = val
	v.isSet = true
}

func (v NullableSharedAudienceAccount) IsSet() bool {
	return v.isSet
}

func (v *NullableSharedAudienceAccount) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSharedAudienceAccount(val *SharedAudienceAccount) *NullableSharedAudienceAccount {
	return &NullableSharedAudienceAccount{value: val, isSet: true}
}

func (v NullableSharedAudienceAccount) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSharedAudienceAccount) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


