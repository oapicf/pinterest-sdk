# UpdateMemberBusinessRoleBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessRole** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  | 
**MemberId** | **string** | Unique identifier of the member | 

## Methods

### NewUpdateMemberBusinessRoleBody

`func NewUpdateMemberBusinessRoleBody(businessRole BusinessRoleForMembers, memberId string, ) *UpdateMemberBusinessRoleBody`

NewUpdateMemberBusinessRoleBody instantiates a new UpdateMemberBusinessRoleBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateMemberBusinessRoleBodyWithDefaults

`func NewUpdateMemberBusinessRoleBodyWithDefaults() *UpdateMemberBusinessRoleBody`

NewUpdateMemberBusinessRoleBodyWithDefaults instantiates a new UpdateMemberBusinessRoleBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessRole

`func (o *UpdateMemberBusinessRoleBody) GetBusinessRole() BusinessRoleForMembers`

GetBusinessRole returns the BusinessRole field if non-nil, zero value otherwise.

### GetBusinessRoleOk

`func (o *UpdateMemberBusinessRoleBody) GetBusinessRoleOk() (*BusinessRoleForMembers, bool)`

GetBusinessRoleOk returns a tuple with the BusinessRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessRole

`func (o *UpdateMemberBusinessRoleBody) SetBusinessRole(v BusinessRoleForMembers)`

SetBusinessRole sets BusinessRole field to given value.


### GetMemberId

`func (o *UpdateMemberBusinessRoleBody) GetMemberId() string`

GetMemberId returns the MemberId field if non-nil, zero value otherwise.

### GetMemberIdOk

`func (o *UpdateMemberBusinessRoleBody) GetMemberIdOk() (*string, bool)`

GetMemberIdOk returns a tuple with the MemberId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberId

`func (o *UpdateMemberBusinessRoleBody) SetMemberId(v string)`

SetMemberId sets MemberId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


