# CancelInvitesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteIds** | **[]string** | A list of invite/request ids to cancel. | 

## Methods

### NewCancelInvitesRequest

`func NewCancelInvitesRequest(inviteIds []string, ) *CancelInvitesRequest`

NewCancelInvitesRequest instantiates a new CancelInvitesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCancelInvitesRequestWithDefaults

`func NewCancelInvitesRequestWithDefaults() *CancelInvitesRequest`

NewCancelInvitesRequestWithDefaults instantiates a new CancelInvitesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInviteIds

`func (o *CancelInvitesRequest) GetInviteIds() []string`

GetInviteIds returns the InviteIds field if non-nil, zero value otherwise.

### GetInviteIdsOk

`func (o *CancelInvitesRequest) GetInviteIdsOk() (*[]string, bool)`

GetInviteIdsOk returns a tuple with the InviteIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteIds

`func (o *CancelInvitesRequest) SetInviteIds(v []string)`

SetInviteIds sets InviteIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


