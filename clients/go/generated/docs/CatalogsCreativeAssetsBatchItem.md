# CatalogsCreativeAssetsBatchItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeAssetsId** | **string** | The catalog creative assets id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**CatalogsUpdatableCreativeAssetsAttributes**](CatalogsUpdatableCreativeAssetsAttributes.md) |  | 

## Methods

### NewCatalogsCreativeAssetsBatchItem

`func NewCatalogsCreativeAssetsBatchItem(creativeAssetsId string, operation string, attributes CatalogsUpdatableCreativeAssetsAttributes, ) *CatalogsCreativeAssetsBatchItem`

NewCatalogsCreativeAssetsBatchItem instantiates a new CatalogsCreativeAssetsBatchItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsBatchItemWithDefaults

`func NewCatalogsCreativeAssetsBatchItemWithDefaults() *CatalogsCreativeAssetsBatchItem`

NewCatalogsCreativeAssetsBatchItemWithDefaults instantiates a new CatalogsCreativeAssetsBatchItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreativeAssetsId

`func (o *CatalogsCreativeAssetsBatchItem) GetCreativeAssetsId() string`

GetCreativeAssetsId returns the CreativeAssetsId field if non-nil, zero value otherwise.

### GetCreativeAssetsIdOk

`func (o *CatalogsCreativeAssetsBatchItem) GetCreativeAssetsIdOk() (*string, bool)`

GetCreativeAssetsIdOk returns a tuple with the CreativeAssetsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsId

`func (o *CatalogsCreativeAssetsBatchItem) SetCreativeAssetsId(v string)`

SetCreativeAssetsId sets CreativeAssetsId field to given value.


### GetOperation

`func (o *CatalogsCreativeAssetsBatchItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsCreativeAssetsBatchItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsCreativeAssetsBatchItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsCreativeAssetsBatchItem) GetAttributes() CatalogsUpdatableCreativeAssetsAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsCreativeAssetsBatchItem) GetAttributesOk() (*CatalogsUpdatableCreativeAssetsAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsCreativeAssetsBatchItem) SetAttributes(v CatalogsUpdatableCreativeAssetsAttributes)`

SetAttributes sets Attributes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


