# AuthRespondInvitesBodyInvitesInnerAction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcceptInvite** | **bool** | Whether the invite/request is accepted. | 
**AssetIdToPermissions** | Pointer to [**map[string][]Permissions**](array.md) | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | [optional] 

## Methods

### NewAuthRespondInvitesBodyInvitesInnerAction

`func NewAuthRespondInvitesBodyInvitesInnerAction(acceptInvite bool, ) *AuthRespondInvitesBodyInvitesInnerAction`

NewAuthRespondInvitesBodyInvitesInnerAction instantiates a new AuthRespondInvitesBodyInvitesInnerAction object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAuthRespondInvitesBodyInvitesInnerActionWithDefaults

`func NewAuthRespondInvitesBodyInvitesInnerActionWithDefaults() *AuthRespondInvitesBodyInvitesInnerAction`

NewAuthRespondInvitesBodyInvitesInnerActionWithDefaults instantiates a new AuthRespondInvitesBodyInvitesInnerAction object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAcceptInvite

`func (o *AuthRespondInvitesBodyInvitesInnerAction) GetAcceptInvite() bool`

GetAcceptInvite returns the AcceptInvite field if non-nil, zero value otherwise.

### GetAcceptInviteOk

`func (o *AuthRespondInvitesBodyInvitesInnerAction) GetAcceptInviteOk() (*bool, bool)`

GetAcceptInviteOk returns a tuple with the AcceptInvite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptInvite

`func (o *AuthRespondInvitesBodyInvitesInnerAction) SetAcceptInvite(v bool)`

SetAcceptInvite sets AcceptInvite field to given value.


### GetAssetIdToPermissions

`func (o *AuthRespondInvitesBodyInvitesInnerAction) GetAssetIdToPermissions() map[string][]Permissions`

GetAssetIdToPermissions returns the AssetIdToPermissions field if non-nil, zero value otherwise.

### GetAssetIdToPermissionsOk

`func (o *AuthRespondInvitesBodyInvitesInnerAction) GetAssetIdToPermissionsOk() (*map[string][]Permissions, bool)`

GetAssetIdToPermissionsOk returns a tuple with the AssetIdToPermissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetIdToPermissions

`func (o *AuthRespondInvitesBodyInvitesInnerAction) SetAssetIdToPermissions(v map[string][]Permissions)`

SetAssetIdToPermissions sets AssetIdToPermissions field to given value.

### HasAssetIdToPermissions

`func (o *AuthRespondInvitesBodyInvitesInnerAction) HasAssetIdToPermissions() bool`

HasAssetIdToPermissions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


