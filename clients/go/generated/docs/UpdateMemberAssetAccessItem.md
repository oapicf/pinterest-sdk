# UpdateMemberAssetAccessItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **string** | Id of the asset to update. | 
**MemberId** | **string** | Unique identifier of the member on which to perform the update | 
**Permissions** | [**[]Permissions**](Permissions.md) | A non-empty array of permissions to assign to the member. | 

## Methods

### NewUpdateMemberAssetAccessItem

`func NewUpdateMemberAssetAccessItem(assetId string, memberId string, permissions []Permissions, ) *UpdateMemberAssetAccessItem`

NewUpdateMemberAssetAccessItem instantiates a new UpdateMemberAssetAccessItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateMemberAssetAccessItemWithDefaults

`func NewUpdateMemberAssetAccessItemWithDefaults() *UpdateMemberAssetAccessItem`

NewUpdateMemberAssetAccessItemWithDefaults instantiates a new UpdateMemberAssetAccessItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *UpdateMemberAssetAccessItem) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *UpdateMemberAssetAccessItem) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *UpdateMemberAssetAccessItem) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.


### GetMemberId

`func (o *UpdateMemberAssetAccessItem) GetMemberId() string`

GetMemberId returns the MemberId field if non-nil, zero value otherwise.

### GetMemberIdOk

`func (o *UpdateMemberAssetAccessItem) GetMemberIdOk() (*string, bool)`

GetMemberIdOk returns a tuple with the MemberId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberId

`func (o *UpdateMemberAssetAccessItem) SetMemberId(v string)`

SetMemberId sets MemberId field to given value.


### GetPermissions

`func (o *UpdateMemberAssetAccessItem) GetPermissions() []Permissions`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *UpdateMemberAssetAccessItem) GetPermissionsOk() (*[]Permissions, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *UpdateMemberAssetAccessItem) SetPermissions(v []Permissions)`

SetPermissions sets Permissions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


