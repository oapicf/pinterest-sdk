# UpdateMemberResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessRole** | Pointer to **string** | The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. | [optional] 
**MemberId** | Pointer to **string** | Unique identifier of the business member. | [optional] 

## Methods

### NewUpdateMemberResult

`func NewUpdateMemberResult() *UpdateMemberResult`

NewUpdateMemberResult instantiates a new UpdateMemberResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateMemberResultWithDefaults

`func NewUpdateMemberResultWithDefaults() *UpdateMemberResult`

NewUpdateMemberResultWithDefaults instantiates a new UpdateMemberResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessRole

`func (o *UpdateMemberResult) GetBusinessRole() string`

GetBusinessRole returns the BusinessRole field if non-nil, zero value otherwise.

### GetBusinessRoleOk

`func (o *UpdateMemberResult) GetBusinessRoleOk() (*string, bool)`

GetBusinessRoleOk returns a tuple with the BusinessRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessRole

`func (o *UpdateMemberResult) SetBusinessRole(v string)`

SetBusinessRole sets BusinessRole field to given value.

### HasBusinessRole

`func (o *UpdateMemberResult) HasBusinessRole() bool`

HasBusinessRole returns a boolean if a field has been set.

### GetMemberId

`func (o *UpdateMemberResult) GetMemberId() string`

GetMemberId returns the MemberId field if non-nil, zero value otherwise.

### GetMemberIdOk

`func (o *UpdateMemberResult) GetMemberIdOk() (*string, bool)`

GetMemberIdOk returns a tuple with the MemberId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberId

`func (o *UpdateMemberResult) SetMemberId(v string)`

SetMemberId sets MemberId field to given value.

### HasMemberId

`func (o *UpdateMemberResult) HasMemberId() bool`

HasMemberId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


