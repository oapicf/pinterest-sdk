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

// checks if the CancelInvitesBody type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CancelInvitesBody{}

// CancelInvitesBody Request body used to cancel invites
type CancelInvitesBody struct {
	// List of invite/request ids to be cancelled
	InviteIds []string `json:"invite_ids"`
}

type _CancelInvitesBody CancelInvitesBody

// NewCancelInvitesBody instantiates a new CancelInvitesBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCancelInvitesBody(inviteIds []string) *CancelInvitesBody {
	this := CancelInvitesBody{}
	this.InviteIds = inviteIds
	return &this
}

// NewCancelInvitesBodyWithDefaults instantiates a new CancelInvitesBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCancelInvitesBodyWithDefaults() *CancelInvitesBody {
	this := CancelInvitesBody{}
	return &this
}

// GetInviteIds returns the InviteIds field value
func (o *CancelInvitesBody) GetInviteIds() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.InviteIds
}

// GetInviteIdsOk returns a tuple with the InviteIds field value
// and a boolean to check if the value has been set.
func (o *CancelInvitesBody) GetInviteIdsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.InviteIds, true
}

// SetInviteIds sets field value
func (o *CancelInvitesBody) SetInviteIds(v []string) {
	o.InviteIds = v
}

func (o CancelInvitesBody) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CancelInvitesBody) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["invite_ids"] = o.InviteIds
	return toSerialize, nil
}

func (o *CancelInvitesBody) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"invite_ids",
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

	varCancelInvitesBody := _CancelInvitesBody{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCancelInvitesBody)

	if err != nil {
		return err
	}

	*o = CancelInvitesBody(varCancelInvitesBody)

	return err
}

type NullableCancelInvitesBody struct {
	value *CancelInvitesBody
	isSet bool
}

func (v NullableCancelInvitesBody) Get() *CancelInvitesBody {
	return v.value
}

func (v *NullableCancelInvitesBody) Set(val *CancelInvitesBody) {
	v.value = val
	v.isSet = true
}

func (v NullableCancelInvitesBody) IsSet() bool {
	return v.isSet
}

func (v *NullableCancelInvitesBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCancelInvitesBody(val *CancelInvitesBody) *NullableCancelInvitesBody {
	return &NullableCancelInvitesBody{value: val, isSet: true}
}

func (v NullableCancelInvitesBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCancelInvitesBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


