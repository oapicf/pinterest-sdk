# MembersToDeleteBodyMembersInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MemberId** | **string** | Unique identifier of the member | 
**BusinessRole** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  | 

## Methods

### NewMembersToDeleteBodyMembersInner

`func NewMembersToDeleteBodyMembersInner(memberId string, businessRole BusinessRoleForMembers, ) *MembersToDeleteBodyMembersInner`

NewMembersToDeleteBodyMembersInner instantiates a new MembersToDeleteBodyMembersInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMembersToDeleteBodyMembersInnerWithDefaults

`func NewMembersToDeleteBodyMembersInnerWithDefaults() *MembersToDeleteBodyMembersInner`

NewMembersToDeleteBodyMembersInnerWithDefaults instantiates a new MembersToDeleteBodyMembersInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMemberId

`func (o *MembersToDeleteBodyMembersInner) GetMemberId() string`

GetMemberId returns the MemberId field if non-nil, zero value otherwise.

### GetMemberIdOk

`func (o *MembersToDeleteBodyMembersInner) GetMemberIdOk() (*string, bool)`

GetMemberIdOk returns a tuple with the MemberId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberId

`func (o *MembersToDeleteBodyMembersInner) SetMemberId(v string)`

SetMemberId sets MemberId field to given value.


### GetBusinessRole

`func (o *MembersToDeleteBodyMembersInner) GetBusinessRole() BusinessRoleForMembers`

GetBusinessRole returns the BusinessRole field if non-nil, zero value otherwise.

### GetBusinessRoleOk

`func (o *MembersToDeleteBodyMembersInner) GetBusinessRoleOk() (*BusinessRoleForMembers, bool)`

GetBusinessRoleOk returns a tuple with the BusinessRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessRole

`func (o *MembersToDeleteBodyMembersInner) SetBusinessRole(v BusinessRoleForMembers)`

SetBusinessRole sets BusinessRole field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


