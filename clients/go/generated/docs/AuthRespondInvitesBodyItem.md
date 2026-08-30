# AuthRespondInvitesBodyItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | [**AuthRespondInviteAction**](AuthRespondInviteAction.md) |  | 
**InviteId** | **string** | Unique identifier of an invite. | 

## Methods

### NewAuthRespondInvitesBodyItem

`func NewAuthRespondInvitesBodyItem(action AuthRespondInviteAction, inviteId string, ) *AuthRespondInvitesBodyItem`

NewAuthRespondInvitesBodyItem instantiates a new AuthRespondInvitesBodyItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthRespondInvitesBodyItemWithDefaults

`func NewAuthRespondInvitesBodyItemWithDefaults() *AuthRespondInvitesBodyItem`

NewAuthRespondInvitesBodyItemWithDefaults instantiates a new AuthRespondInvitesBodyItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *AuthRespondInvitesBodyItem) GetAction() AuthRespondInviteAction`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *AuthRespondInvitesBodyItem) GetActionOk() (*AuthRespondInviteAction, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *AuthRespondInvitesBodyItem) SetAction(v AuthRespondInviteAction)`

SetAction sets Action field to given value.


### GetInviteId

`func (o *AuthRespondInvitesBodyItem) GetInviteId() string`

GetInviteId returns the InviteId field if non-nil, zero value otherwise.

### GetInviteIdOk

`func (o *AuthRespondInvitesBodyItem) GetInviteIdOk() (*string, bool)`

GetInviteIdOk returns a tuple with the InviteId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteId

`func (o *AuthRespondInvitesBodyItem) SetInviteId(v string)`

SetInviteId sets InviteId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


