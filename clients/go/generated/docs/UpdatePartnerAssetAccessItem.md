# UpdatePartnerAssetAccessItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **string** | Unique identifier of the business asset. | 
**PartnerId** | **string** | Unique identifier of a business partner to update asset access to. | 
**Permissions** | [**[]Permissions**](Permissions.md) | A non-empty array of permissions to assign to the partner. | 

## Methods

### NewUpdatePartnerAssetAccessItem

`func NewUpdatePartnerAssetAccessItem(assetId string, partnerId string, permissions []Permissions, ) *UpdatePartnerAssetAccessItem`

NewUpdatePartnerAssetAccessItem instantiates a new UpdatePartnerAssetAccessItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePartnerAssetAccessItemWithDefaults

`func NewUpdatePartnerAssetAccessItemWithDefaults() *UpdatePartnerAssetAccessItem`

NewUpdatePartnerAssetAccessItemWithDefaults instantiates a new UpdatePartnerAssetAccessItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *UpdatePartnerAssetAccessItem) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *UpdatePartnerAssetAccessItem) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *UpdatePartnerAssetAccessItem) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.


### GetPartnerId

`func (o *UpdatePartnerAssetAccessItem) GetPartnerId() string`

GetPartnerId returns the PartnerId field if non-nil, zero value otherwise.

### GetPartnerIdOk

`func (o *UpdatePartnerAssetAccessItem) GetPartnerIdOk() (*string, bool)`

GetPartnerIdOk returns a tuple with the PartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerId

`func (o *UpdatePartnerAssetAccessItem) SetPartnerId(v string)`

SetPartnerId sets PartnerId field to given value.


### GetPermissions

`func (o *UpdatePartnerAssetAccessItem) GetPermissions() []Permissions`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *UpdatePartnerAssetAccessItem) GetPermissionsOk() (*[]Permissions, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *UpdatePartnerAssetAccessItem) SetPermissions(v []Permissions)`

SetPermissions sets Permissions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


