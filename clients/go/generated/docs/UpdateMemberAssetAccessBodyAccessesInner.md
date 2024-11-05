# UpdateMemberAssetAccessBodyAccessesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **string** | Id of the asset to update. | 
**MemberId** | **string** | Unique identifier of the member on which to perform the update | 
**Permissions** | [**[]Permissions**](Permissions.md) | A non-empty array of permissions to assign to the member. | 

## Methods

### NewUpdateMemberAssetAccessBodyAccessesInner

`func NewUpdateMemberAssetAccessBodyAccessesInner(assetId string, memberId string, permissions []Permissions, ) *UpdateMemberAssetAccessBodyAccessesInner`

NewUpdateMemberAssetAccessBodyAccessesInner instantiates a new UpdateMemberAssetAccessBodyAccessesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateMemberAssetAccessBodyAccessesInnerWithDefaults

`func NewUpdateMemberAssetAccessBodyAccessesInnerWithDefaults() *UpdateMemberAssetAccessBodyAccessesInner`

NewUpdateMemberAssetAccessBodyAccessesInnerWithDefaults instantiates a new UpdateMemberAssetAccessBodyAccessesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *UpdateMemberAssetAccessBodyAccessesInner) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *UpdateMemberAssetAccessBodyAccessesInner) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *UpdateMemberAssetAccessBodyAccessesInner) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.


### GetMemberId

`func (o *UpdateMemberAssetAccessBodyAccessesInner) GetMemberId() string`

GetMemberId returns the MemberId field if non-nil, zero value otherwise.

### GetMemberIdOk

`func (o *UpdateMemberAssetAccessBodyAccessesInner) GetMemberIdOk() (*string, bool)`

GetMemberIdOk returns a tuple with the MemberId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberId

`func (o *UpdateMemberAssetAccessBodyAccessesInner) SetMemberId(v string)`

SetMemberId sets MemberId field to given value.


### GetPermissions

`func (o *UpdateMemberAssetAccessBodyAccessesInner) GetPermissions() []Permissions`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *UpdateMemberAssetAccessBodyAccessesInner) GetPermissionsOk() (*[]Permissions, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *UpdateMemberAssetAccessBodyAccessesInner) SetPermissions(v []Permissions)`

SetPermissions sets Permissions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


