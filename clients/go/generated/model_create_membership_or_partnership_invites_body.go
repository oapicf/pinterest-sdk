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

// checks if the CreateMembershipOrPartnershipInvitesBody type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateMembershipOrPartnershipInvitesBody{}

// CreateMembershipOrPartnershipInvitesBody Body to be used on path to send Members or Partners Invite or Request
type CreateMembershipOrPartnershipInvitesBody struct {
	// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
	BusinessRole string `json:"business_role"`
	InviteType InviteType `json:"invite_type"`
	// A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
	Members []string `json:"members,omitempty"`
	// A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
	Partners []string `json:"partners,omitempty"`
}

type _CreateMembershipOrPartnershipInvitesBody CreateMembershipOrPartnershipInvitesBody

// NewCreateMembershipOrPartnershipInvitesBody instantiates a new CreateMembershipOrPartnershipInvitesBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateMembershipOrPartnershipInvitesBody(businessRole string, inviteType InviteType) *CreateMembershipOrPartnershipInvitesBody {
	this := CreateMembershipOrPartnershipInvitesBody{}
	this.BusinessRole = businessRole
	this.InviteType = inviteType
	return &this
}

// NewCreateMembershipOrPartnershipInvitesBodyWithDefaults instantiates a new CreateMembershipOrPartnershipInvitesBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateMembershipOrPartnershipInvitesBodyWithDefaults() *CreateMembershipOrPartnershipInvitesBody {
	this := CreateMembershipOrPartnershipInvitesBody{}
	return &this
}

// GetBusinessRole returns the BusinessRole field value
func (o *CreateMembershipOrPartnershipInvitesBody) GetBusinessRole() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.BusinessRole
}

// GetBusinessRoleOk returns a tuple with the BusinessRole field value
// and a boolean to check if the value has been set.
func (o *CreateMembershipOrPartnershipInvitesBody) GetBusinessRoleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.BusinessRole, true
}

// SetBusinessRole sets field value
func (o *CreateMembershipOrPartnershipInvitesBody) SetBusinessRole(v string) {
	o.BusinessRole = v
}

// GetInviteType returns the InviteType field value
func (o *CreateMembershipOrPartnershipInvitesBody) GetInviteType() InviteType {
	if o == nil {
		var ret InviteType
		return ret
	}

	return o.InviteType
}

// GetInviteTypeOk returns a tuple with the InviteType field value
// and a boolean to check if the value has been set.
func (o *CreateMembershipOrPartnershipInvitesBody) GetInviteTypeOk() (*InviteType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.InviteType, true
}

// SetInviteType sets field value
func (o *CreateMembershipOrPartnershipInvitesBody) SetInviteType(v InviteType) {
	o.InviteType = v
}

// GetMembers returns the Members field value if set, zero value otherwise.
func (o *CreateMembershipOrPartnershipInvitesBody) GetMembers() []string {
	if o == nil || IsNil(o.Members) {
		var ret []string
		return ret
	}
	return o.Members
}

// GetMembersOk returns a tuple with the Members field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateMembershipOrPartnershipInvitesBody) GetMembersOk() ([]string, bool) {
	if o == nil || IsNil(o.Members) {
		return nil, false
	}
	return o.Members, true
}

// HasMembers returns a boolean if a field has been set.
func (o *CreateMembershipOrPartnershipInvitesBody) HasMembers() bool {
	if o != nil && !IsNil(o.Members) {
		return true
	}

	return false
}

// SetMembers gets a reference to the given []string and assigns it to the Members field.
func (o *CreateMembershipOrPartnershipInvitesBody) SetMembers(v []string) {
	o.Members = v
}

// GetPartners returns the Partners field value if set, zero value otherwise.
func (o *CreateMembershipOrPartnershipInvitesBody) GetPartners() []string {
	if o == nil || IsNil(o.Partners) {
		var ret []string
		return ret
	}
	return o.Partners
}

// GetPartnersOk returns a tuple with the Partners field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateMembershipOrPartnershipInvitesBody) GetPartnersOk() ([]string, bool) {
	if o == nil || IsNil(o.Partners) {
		return nil, false
	}
	return o.Partners, true
}

// HasPartners returns a boolean if a field has been set.
func (o *CreateMembershipOrPartnershipInvitesBody) HasPartners() bool {
	if o != nil && !IsNil(o.Partners) {
		return true
	}

	return false
}

// SetPartners gets a reference to the given []string and assigns it to the Partners field.
func (o *CreateMembershipOrPartnershipInvitesBody) SetPartners(v []string) {
	o.Partners = v
}

func (o CreateMembershipOrPartnershipInvitesBody) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateMembershipOrPartnershipInvitesBody) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["business_role"] = o.BusinessRole
	toSerialize["invite_type"] = o.InviteType
	if !IsNil(o.Members) {
		toSerialize["members"] = o.Members
	}
	if !IsNil(o.Partners) {
		toSerialize["partners"] = o.Partners
	}
	return toSerialize, nil
}

func (o *CreateMembershipOrPartnershipInvitesBody) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"business_role",
		"invite_type",
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

	varCreateMembershipOrPartnershipInvitesBody := _CreateMembershipOrPartnershipInvitesBody{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCreateMembershipOrPartnershipInvitesBody)

	if err != nil {
		return err
	}

	*o = CreateMembershipOrPartnershipInvitesBody(varCreateMembershipOrPartnershipInvitesBody)

	return err
}

type NullableCreateMembershipOrPartnershipInvitesBody struct {
	value *CreateMembershipOrPartnershipInvitesBody
	isSet bool
}

func (v NullableCreateMembershipOrPartnershipInvitesBody) Get() *CreateMembershipOrPartnershipInvitesBody {
	return v.value
}

func (v *NullableCreateMembershipOrPartnershipInvitesBody) Set(val *CreateMembershipOrPartnershipInvitesBody) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateMembershipOrPartnershipInvitesBody) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateMembershipOrPartnershipInvitesBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateMembershipOrPartnershipInvitesBody(val *CreateMembershipOrPartnershipInvitesBody) *NullableCreateMembershipOrPartnershipInvitesBody {
	return &NullableCreateMembershipOrPartnershipInvitesBody{value: val, isSet: true}
}

func (v NullableCreateMembershipOrPartnershipInvitesBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateMembershipOrPartnershipInvitesBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


