# UpdatePartnerAssetAccessBodyAccessesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartnerId** | **string** | Unique identifier of a business partner to update asset access to. | 
**AssetId** | **string** | Unique identifier of the business asset. | 
**Permissions** | [**[]Permissions**](Permissions.md) | A non-empty array of permissions to assign to the partner. | 

## Methods

### NewUpdatePartnerAssetAccessBodyAccessesInner

`func NewUpdatePartnerAssetAccessBodyAccessesInner(partnerId string, assetId string, permissions []Permissions, ) *UpdatePartnerAssetAccessBodyAccessesInner`

NewUpdatePartnerAssetAccessBodyAccessesInner instantiates a new UpdatePartnerAssetAccessBodyAccessesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePartnerAssetAccessBodyAccessesInnerWithDefaults

`func NewUpdatePartnerAssetAccessBodyAccessesInnerWithDefaults() *UpdatePartnerAssetAccessBodyAccessesInner`

NewUpdatePartnerAssetAccessBodyAccessesInnerWithDefaults instantiates a new UpdatePartnerAssetAccessBodyAccessesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPartnerId

`func (o *UpdatePartnerAssetAccessBodyAccessesInner) GetPartnerId() string`

GetPartnerId returns the PartnerId field if non-nil, zero value otherwise.

### GetPartnerIdOk

`func (o *UpdatePartnerAssetAccessBodyAccessesInner) GetPartnerIdOk() (*string, bool)`

GetPartnerIdOk returns a tuple with the PartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerId

`func (o *UpdatePartnerAssetAccessBodyAccessesInner) SetPartnerId(v string)`

SetPartnerId sets PartnerId field to given value.


### GetAssetId

`func (o *UpdatePartnerAssetAccessBodyAccessesInner) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *UpdatePartnerAssetAccessBodyAccessesInner) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *UpdatePartnerAssetAccessBodyAccessesInner) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.


### GetPermissions

`func (o *UpdatePartnerAssetAccessBodyAccessesInner) GetPermissions() []Permissions`

GetPermissions returns the Permissions field if non-nil, zero value otherwise.

### GetPermissionsOk

`func (o *UpdatePartnerAssetAccessBodyAccessesInner) GetPermissionsOk() (*[]Permissions, bool)`

GetPermissionsOk returns a tuple with the Permissions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPermissions

`func (o *UpdatePartnerAssetAccessBodyAccessesInner) SetPermissions(v []Permissions)`

SetPermissions sets Permissions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


