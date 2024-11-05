# CreateMembershipOrPartnershipInvitesBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessRole** | **string** | The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. | 
**InviteType** | [**InviteType**](InviteType.md) |  | 
**Members** | Pointer to **[]string** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] 
**Partners** | Pointer to **[]string** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] 

## Methods

### NewCreateMembershipOrPartnershipInvitesBody

`func NewCreateMembershipOrPartnershipInvitesBody(businessRole string, inviteType InviteType, ) *CreateMembershipOrPartnershipInvitesBody`

NewCreateMembershipOrPartnershipInvitesBody instantiates a new CreateMembershipOrPartnershipInvitesBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateMembershipOrPartnershipInvitesBodyWithDefaults

`func NewCreateMembershipOrPartnershipInvitesBodyWithDefaults() *CreateMembershipOrPartnershipInvitesBody`

NewCreateMembershipOrPartnershipInvitesBodyWithDefaults instantiates a new CreateMembershipOrPartnershipInvitesBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessRole

`func (o *CreateMembershipOrPartnershipInvitesBody) GetBusinessRole() string`

GetBusinessRole returns the BusinessRole field if non-nil, zero value otherwise.

### GetBusinessRoleOk

`func (o *CreateMembershipOrPartnershipInvitesBody) GetBusinessRoleOk() (*string, bool)`

GetBusinessRoleOk returns a tuple with the BusinessRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessRole

`func (o *CreateMembershipOrPartnershipInvitesBody) SetBusinessRole(v string)`

SetBusinessRole sets BusinessRole field to given value.


### GetInviteType

`func (o *CreateMembershipOrPartnershipInvitesBody) GetInviteType() InviteType`

GetInviteType returns the InviteType field if non-nil, zero value otherwise.

### GetInviteTypeOk

`func (o *CreateMembershipOrPartnershipInvitesBody) GetInviteTypeOk() (*InviteType, bool)`

GetInviteTypeOk returns a tuple with the InviteType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteType

`func (o *CreateMembershipOrPartnershipInvitesBody) SetInviteType(v InviteType)`

SetInviteType sets InviteType field to given value.


### GetMembers

`func (o *CreateMembershipOrPartnershipInvitesBody) GetMembers() []string`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *CreateMembershipOrPartnershipInvitesBody) GetMembersOk() (*[]string, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *CreateMembershipOrPartnershipInvitesBody) SetMembers(v []string)`

SetMembers sets Members field to given value.

### HasMembers

`func (o *CreateMembershipOrPartnershipInvitesBody) HasMembers() bool`

HasMembers returns a boolean if a field has been set.

### GetPartners

`func (o *CreateMembershipOrPartnershipInvitesBody) GetPartners() []string`

GetPartners returns the Partners field if non-nil, zero value otherwise.

### GetPartnersOk

`func (o *CreateMembershipOrPartnershipInvitesBody) GetPartnersOk() (*[]string, bool)`

GetPartnersOk returns a tuple with the Partners field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartners

`func (o *CreateMembershipOrPartnershipInvitesBody) SetPartners(v []string)`

SetPartners sets Partners field to given value.

### HasPartners

`func (o *CreateMembershipOrPartnershipInvitesBody) HasPartners() bool`

HasPartners returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


