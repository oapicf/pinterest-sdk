# CatalogsItemsDeleteBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 
**Items** | [**[]ItemDeleteBatchRecord**](ItemDeleteBatchRecord.md) | Array with catalogs items | 

## Methods

### NewCatalogsItemsDeleteBatchRequest

`func NewCatalogsItemsDeleteBatchRequest(country Country, language CatalogsItemsRequestLanguage, operation BatchOperation, items []ItemDeleteBatchRecord, ) *CatalogsItemsDeleteBatchRequest`

NewCatalogsItemsDeleteBatchRequest instantiates a new CatalogsItemsDeleteBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsDeleteBatchRequestWithDefaults

`func NewCatalogsItemsDeleteBatchRequestWithDefaults() *CatalogsItemsDeleteBatchRequest`

NewCatalogsItemsDeleteBatchRequestWithDefaults instantiates a new CatalogsItemsDeleteBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *CatalogsItemsDeleteBatchRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsItemsDeleteBatchRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsItemsDeleteBatchRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *CatalogsItemsDeleteBatchRequest) GetLanguage() CatalogsItemsRequestLanguage`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsItemsDeleteBatchRequest) GetLanguageOk() (*CatalogsItemsRequestLanguage, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsItemsDeleteBatchRequest) SetLanguage(v CatalogsItemsRequestLanguage)`

SetLanguage sets Language field to given value.


### GetOperation

`func (o *CatalogsItemsDeleteBatchRequest) GetOperation() BatchOperation`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsItemsDeleteBatchRequest) GetOperationOk() (*BatchOperation, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsItemsDeleteBatchRequest) SetOperation(v BatchOperation)`

SetOperation sets Operation field to given value.


### GetItems

`func (o *CatalogsItemsDeleteBatchRequest) GetItems() []ItemDeleteBatchRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsItemsDeleteBatchRequest) GetItemsOk() (*[]ItemDeleteBatchRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsItemsDeleteBatchRequest) SetItems(v []ItemDeleteBatchRecord)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


