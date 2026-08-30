# InviteAssetsSummaryItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Unique identifier of the asset. | [optional] 
**Permissions** | Pointer to **[]string** | Permission levels member or partner has on an asset. | [optional] 

## Methods

### NewInviteAssetsSummaryItem

`func NewInviteAssetsSummaryItem() *InviteAssetsSummaryItem`

NewInviteAssetsSummaryItem instantiates a new InviteAssetsSummaryItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInviteAssetsSummaryItemWithDefaults

`func NewInviteAssetsSummaryItemWithDefaults() *InviteAssetsSummaryItem`

NewInviteAssetsSummaryItemWithDefaults instantiates a new InviteAssetsSummaryItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *InviteAssetsSummaryItem) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *InviteAssetsSummaryItem) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *InviteAssetsSummaryItem) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *InviteAssetsSummaryItem) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPermissions

`func (o *InviteAssetsSummaryItem) GetPermissions() []string`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *InviteAssetsSummaryItem) GetPermissionsOk() (*[]string, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *InviteAssetsSummaryItem) SetPermissions(v []string)`

SetPermissions sets Permissions field to given value.

### HasPermissions

`func (o *InviteAssetsSummaryItem) HasPermissions() bool`

HasPermissions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


