# CreateAssetInvitesRequestItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteId** | **string** | Unique identifier of an invite. | 
**InviteType** | [**InviteType**](InviteType.md) |  | 
**AssetIdToPermissions** | [**map[string][]Permissions**](array.md) | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 

## Methods

### NewCreateAssetInvitesRequestItem

`func NewCreateAssetInvitesRequestItem(inviteId string, inviteType InviteType, assetIdToPermissions map[string][]Permissions, ) *CreateAssetInvitesRequestItem`

NewCreateAssetInvitesRequestItem instantiates a new CreateAssetInvitesRequestItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateAssetInvitesRequestItemWithDefaults

`func NewCreateAssetInvitesRequestItemWithDefaults() *CreateAssetInvitesRequestItem`

NewCreateAssetInvitesRequestItemWithDefaults instantiates a new CreateAssetInvitesRequestItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInviteId

`func (o *CreateAssetInvitesRequestItem) GetInviteId() string`

GetInviteId returns the InviteId field if non-nil, zero value otherwise.

### GetInviteIdOk

`func (o *CreateAssetInvitesRequestItem) GetInviteIdOk() (*string, bool)`

GetInviteIdOk returns a tuple with the InviteId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteId

`func (o *CreateAssetInvitesRequestItem) SetInviteId(v string)`

SetInviteId sets InviteId field to given value.


### GetInviteType

`func (o *CreateAssetInvitesRequestItem) GetInviteType() InviteType`

GetInviteType returns the InviteType field if non-nil, zero value otherwise.

### GetInviteTypeOk

`func (o *CreateAssetInvitesRequestItem) GetInviteTypeOk() (*InviteType, bool)`

GetInviteTypeOk returns a tuple with the InviteType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteType

`func (o *CreateAssetInvitesRequestItem) SetInviteType(v InviteType)`

SetInviteType sets InviteType field to given value.


### GetAssetIdToPermissions

`func (o *CreateAssetInvitesRequestItem) GetAssetIdToPermissions() map[string][]Permissions`

GetAssetIdToPermissions returns the AssetIdToPermissions field if non-nil, zero value otherwise.

### GetAssetIdToPermissionsOk

`func (o *CreateAssetInvitesRequestItem) GetAssetIdToPermissionsOk() (*map[string][]Permissions, bool)`

GetAssetIdToPermissionsOk returns a tuple with the AssetIdToPermissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetIdToPermissions

`func (o *CreateAssetInvitesRequestItem) SetAssetIdToPermissions(v map[string][]Permissions)`

SetAssetIdToPermissions sets AssetIdToPermissions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


