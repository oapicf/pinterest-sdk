# CatalogsUpdateCreativeAssetsItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeAssetsId** | **string** | The catalog creative assets item id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**CatalogsUpdatableCreativeAssetsAttributes**](CatalogsUpdatableCreativeAssetsAttributes.md) |  | 

## Methods

### NewCatalogsUpdateCreativeAssetsItem

`func NewCatalogsUpdateCreativeAssetsItem(creativeAssetsId string, operation string, attributes CatalogsUpdatableCreativeAssetsAttributes, ) *CatalogsUpdateCreativeAssetsItem`

NewCatalogsUpdateCreativeAssetsItem instantiates a new CatalogsUpdateCreativeAssetsItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsUpdateCreativeAssetsItemWithDefaults

`func NewCatalogsUpdateCreativeAssetsItemWithDefaults() *CatalogsUpdateCreativeAssetsItem`

NewCatalogsUpdateCreativeAssetsItemWithDefaults instantiates a new CatalogsUpdateCreativeAssetsItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreativeAssetsId

`func (o *CatalogsUpdateCreativeAssetsItem) GetCreativeAssetsId() string`

GetCreativeAssetsId returns the CreativeAssetsId field if non-nil, zero value otherwise.

### GetCreativeAssetsIdOk

`func (o *CatalogsUpdateCreativeAssetsItem) GetCreativeAssetsIdOk() (*string, bool)`

GetCreativeAssetsIdOk returns a tuple with the CreativeAssetsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsId

`func (o *CatalogsUpdateCreativeAssetsItem) SetCreativeAssetsId(v string)`

SetCreativeAssetsId sets CreativeAssetsId field to given value.


### GetOperation

`func (o *CatalogsUpdateCreativeAssetsItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsUpdateCreativeAssetsItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsUpdateCreativeAssetsItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsUpdateCreativeAssetsItem) GetAttributes() CatalogsUpdatableCreativeAssetsAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsUpdateCreativeAssetsItem) GetAttributesOk() (*CatalogsUpdatableCreativeAssetsAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsUpdateCreativeAssetsItem) SetAttributes(v CatalogsUpdatableCreativeAssetsAttributes)`

SetAttributes sets Attributes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


