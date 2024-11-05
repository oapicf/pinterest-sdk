# UsersForIndividualAssetResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | Pointer to **string** | Unique identifier of a business asset. | [optional] 
**MemberId** | Pointer to **string** | Unique identifier of the business member with asset access. | [optional] 
**Permissions** | Pointer to **[]string** | Permission levels member or partner has on an asset. | [optional] 

## Methods

### NewUsersForIndividualAssetResponse

`func NewUsersForIndividualAssetResponse() *UsersForIndividualAssetResponse`

NewUsersForIndividualAssetResponse instantiates a new UsersForIndividualAssetResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsersForIndividualAssetResponseWithDefaults

`func NewUsersForIndividualAssetResponseWithDefaults() *UsersForIndividualAssetResponse`

NewUsersForIndividualAssetResponseWithDefaults instantiates a new UsersForIndividualAssetResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *UsersForIndividualAssetResponse) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *UsersForIndividualAssetResponse) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *UsersForIndividualAssetResponse) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.

### HasAssetId

`func (o *UsersForIndividualAssetResponse) HasAssetId() bool`

HasAssetId returns a boolean if a field has been set.

### GetMemberId

`func (o *UsersForIndividualAssetResponse) GetMemberId() string`

GetMemberId returns the MemberId field if non-nil, zero value otherwise.

### GetMemberIdOk

`func (o *UsersForIndividualAssetResponse) GetMemberIdOk() (*string, bool)`

GetMemberIdOk returns a tuple with the MemberId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMemberId

`func (o *UsersForIndividualAssetResponse) SetMemberId(v string)`

SetMemberId sets MemberId field to given value.

### HasMemberId

`func (o *UsersForIndividualAssetResponse) HasMemberId() bool`

HasMemberId returns a boolean if a field has been set.

### GetPermissions

`func (o *UsersForIndividualAssetResponse) GetPermissions() []string`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *UsersForIndividualAssetResponse) GetPermissionsOk() (*[]string, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *UsersForIndividualAssetResponse) SetPermissions(v []string)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *UsersForIndividualAssetResponse) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


