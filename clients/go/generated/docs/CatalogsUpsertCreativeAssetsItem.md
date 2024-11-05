# CatalogsUpsertCreativeAssetsItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeAssetsId** | **string** | The catalog creative assets id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | 

## Methods

### NewCatalogsUpsertCreativeAssetsItem

`func NewCatalogsUpsertCreativeAssetsItem(creativeAssetsId string, operation string, attributes CatalogsCreativeAssetsAttributes, ) *CatalogsUpsertCreativeAssetsItem`

NewCatalogsUpsertCreativeAssetsItem instantiates a new CatalogsUpsertCreativeAssetsItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsUpsertCreativeAssetsItemWithDefaults

`func NewCatalogsUpsertCreativeAssetsItemWithDefaults() *CatalogsUpsertCreativeAssetsItem`

NewCatalogsUpsertCreativeAssetsItemWithDefaults instantiates a new CatalogsUpsertCreativeAssetsItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreativeAssetsId

`func (o *CatalogsUpsertCreativeAssetsItem) GetCreativeAssetsId() string`

GetCreativeAssetsId returns the CreativeAssetsId field if non-nil, zero value otherwise.

### GetCreativeAssetsIdOk

`func (o *CatalogsUpsertCreativeAssetsItem) GetCreativeAssetsIdOk() (*string, bool)`

GetCreativeAssetsIdOk returns a tuple with the CreativeAssetsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsId

`func (o *CatalogsUpsertCreativeAssetsItem) SetCreativeAssetsId(v string)`

SetCreativeAssetsId sets CreativeAssetsId field to given value.


### GetOperation

`func (o *CatalogsUpsertCreativeAssetsItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsUpsertCreativeAssetsItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsUpsertCreativeAssetsItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsUpsertCreativeAssetsItem) GetAttributes() CatalogsCreativeAssetsAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsUpsertCreativeAssetsItem) GetAttributesOk() (*CatalogsCreativeAssetsAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsUpsertCreativeAssetsItem) SetAttributes(v CatalogsCreativeAssetsAttributes)`

SetAttributes sets Attributes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


