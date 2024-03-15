# CatalogsItemsUpsertBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 
**Items** | [**[]ItemUpsertBatchRecord**](ItemUpsertBatchRecord.md) | Array with catalogs items | 

## Methods

### NewCatalogsItemsUpsertBatchRequest

`func NewCatalogsItemsUpsertBatchRequest(country Country, language Language, operation BatchOperation, items []ItemUpsertBatchRecord, ) *CatalogsItemsUpsertBatchRequest`

NewCatalogsItemsUpsertBatchRequest instantiates a new CatalogsItemsUpsertBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsUpsertBatchRequestWithDefaults

`func NewCatalogsItemsUpsertBatchRequestWithDefaults() *CatalogsItemsUpsertBatchRequest`

NewCatalogsItemsUpsertBatchRequestWithDefaults instantiates a new CatalogsItemsUpsertBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *CatalogsItemsUpsertBatchRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsItemsUpsertBatchRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsItemsUpsertBatchRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *CatalogsItemsUpsertBatchRequest) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsItemsUpsertBatchRequest) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsItemsUpsertBatchRequest) SetLanguage(v Language)`

SetLanguage sets Language field to given value.


### GetOperation

`func (o *CatalogsItemsUpsertBatchRequest) GetOperation() BatchOperation`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsItemsUpsertBatchRequest) GetOperationOk() (*BatchOperation, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsItemsUpsertBatchRequest) SetOperation(v BatchOperation)`

SetOperation sets Operation field to given value.


### GetItems

`func (o *CatalogsItemsUpsertBatchRequest) GetItems() []ItemUpsertBatchRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsItemsUpsertBatchRequest) GetItemsOk() (*[]ItemUpsertBatchRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsItemsUpsertBatchRequest) SetItems(v []ItemUpsertBatchRecord)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


