# DeletePartnerAssetAccessBodyAccessesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartnerId** | **string** | Unique identifier of a business partner to update asset access to. | 
**AssetId** | **string** | Unique identifier of the business asset. | 
**PartnerType** | Pointer to **string** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. | [optional] [default to "INTERNAL"]

## Methods

### NewDeletePartnerAssetAccessBodyAccessesInner

`func NewDeletePartnerAssetAccessBodyAccessesInner(partnerId string, assetId string, ) *DeletePartnerAssetAccessBodyAccessesInner`

NewDeletePartnerAssetAccessBodyAccessesInner instantiates a new DeletePartnerAssetAccessBodyAccessesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeletePartnerAssetAccessBodyAccessesInnerWithDefaults

`func NewDeletePartnerAssetAccessBodyAccessesInnerWithDefaults() *DeletePartnerAssetAccessBodyAccessesInner`

NewDeletePartnerAssetAccessBodyAccessesInnerWithDefaults instantiates a new DeletePartnerAssetAccessBodyAccessesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPartnerId

`func (o *DeletePartnerAssetAccessBodyAccessesInner) GetPartnerId() string`

GetPartnerId returns the PartnerId field if non-nil, zero value otherwise.

### GetPartnerIdOk

`func (o *DeletePartnerAssetAccessBodyAccessesInner) GetPartnerIdOk() (*string, bool)`

GetPartnerIdOk returns a tuple with the PartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerId

`func (o *DeletePartnerAssetAccessBodyAccessesInner) SetPartnerId(v string)`

SetPartnerId sets PartnerId field to given value.


### GetAssetId

`func (o *DeletePartnerAssetAccessBodyAccessesInner) GetAssetId() string`

GetAssetId returns the AssetId field if non-nil, zero value otherwise.

### GetAssetIdOk

`func (o *DeletePartnerAssetAccessBodyAccessesInner) GetAssetIdOk() (*string, bool)`

GetAssetIdOk returns a tuple with the AssetId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetId

`func (o *DeletePartnerAssetAccessBodyAccessesInner) SetAssetId(v string)`

SetAssetId sets AssetId field to given value.


### GetPartnerType

`func (o *DeletePartnerAssetAccessBodyAccessesInner) GetPartnerType() string`

GetPartnerType returns the PartnerType field if non-nil, zero value otherwise.

### GetPartnerTypeOk

`func (o *DeletePartnerAssetAccessBodyAccessesInner) GetPartnerTypeOk() (*string, bool)`

GetPartnerTypeOk returns a tuple with the PartnerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerType

`func (o *DeletePartnerAssetAccessBodyAccessesInner) SetPartnerType(v string)`

SetPartnerType sets PartnerType field to given value.

### HasPartnerType

`func (o *DeletePartnerAssetAccessBodyAccessesInner) HasPartnerType() bool`

HasPartnerType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


