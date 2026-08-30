# DeletePartnerAssetAccessItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **string** | Unique identifier of the business asset. | 
**PartnerId** | **string** | Unique identifier of a business partner to update asset access to. | 
**PartnerType** | Pointer to **string** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. | [optional] [default to "INTERNAL"]

## Methods

### NewDeletePartnerAssetAccessItem

`func NewDeletePartnerAssetAccessItem(assetId string, partnerId string, ) *DeletePartnerAssetAccessItem`

NewDeletePartnerAssetAccessItem instantiates a new DeletePartnerAssetAccessItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeletePartnerAssetAccessItemWithDefaults

`func NewDeletePartnerAssetAccessItemWithDefaults() *DeletePartnerAssetAccessItem`

NewDeletePartnerAssetAccessItemWithDefaults instantiates a new DeletePartnerAssetAccessItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssetId

`func (o *DeletePartnerAssetAccessItem) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *DeletePartnerAssetAccessItem) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *DeletePartnerAssetAccessItem) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.


### GetPartnerId

`func (o *DeletePartnerAssetAccessItem) GetPartnerId() string`

GetPartnerId returns the PartnerId field if non-nil, zero value otherwise.

### GetPartnerIdOk

`func (o *DeletePartnerAssetAccessItem) GetPartnerIdOk() (*string, bool)`

GetPartnerIdOk returns a tuple with the PartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerId

`func (o *DeletePartnerAssetAccessItem) SetPartnerId(v string)`

SetPartnerId sets PartnerId field to given value.


### GetPartnerType

`func (o *DeletePartnerAssetAccessItem) GetPartnerType() string`

GetPartnerType returns the PartnerType field if non-nil, zero value otherwise.

### GetPartnerTypeOk

`func (o *DeletePartnerAssetAccessItem) GetPartnerTypeOk() (*string, bool)`

GetPartnerTypeOk returns a tuple with the PartnerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerType

`func (o *DeletePartnerAssetAccessItem) SetPartnerType(v string)`

SetPartnerType sets PartnerType field to given value.

### HasPartnerType

`func (o *DeletePartnerAssetAccessItem) HasPartnerType() bool`

HasPartnerType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


