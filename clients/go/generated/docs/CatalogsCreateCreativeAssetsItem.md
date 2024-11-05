# CatalogsCreateCreativeAssetsItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeAssetsId** | **string** | The catalog creative assets id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | 

## Methods

### NewCatalogsCreateCreativeAssetsItem

`func NewCatalogsCreateCreativeAssetsItem(creativeAssetsId string, operation string, attributes CatalogsCreativeAssetsAttributes, ) *CatalogsCreateCreativeAssetsItem`

NewCatalogsCreateCreativeAssetsItem instantiates a new CatalogsCreateCreativeAssetsItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreateCreativeAssetsItemWithDefaults

`func NewCatalogsCreateCreativeAssetsItemWithDefaults() *CatalogsCreateCreativeAssetsItem`

NewCatalogsCreateCreativeAssetsItemWithDefaults instantiates a new CatalogsCreateCreativeAssetsItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreativeAssetsId

`func (o *CatalogsCreateCreativeAssetsItem) GetCreativeAssetsId() string`

GetCreativeAssetsId returns the CreativeAssetsId field if non-nil, zero value otherwise.

### GetCreativeAssetsIdOk

`func (o *CatalogsCreateCreativeAssetsItem) GetCreativeAssetsIdOk() (*string, bool)`

GetCreativeAssetsIdOk returns a tuple with the CreativeAssetsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsId

`func (o *CatalogsCreateCreativeAssetsItem) SetCreativeAssetsId(v string)`

SetCreativeAssetsId sets CreativeAssetsId field to given value.


### GetOperation

`func (o *CatalogsCreateCreativeAssetsItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsCreateCreativeAssetsItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsCreateCreativeAssetsItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsCreateCreativeAssetsItem) GetAttributes() CatalogsCreativeAssetsAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsCreateCreativeAssetsItem) GetAttributesOk() (*CatalogsCreativeAssetsAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsCreateCreativeAssetsItem) SetAttributes(v CatalogsCreativeAssetsAttributes)`

SetAttributes sets Attributes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


