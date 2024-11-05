# CatalogsItemsDeleteDiscontinuedBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 
**Items** | [**[]ItemDeleteDiscontinuedBatchRecord**](ItemDeleteDiscontinuedBatchRecord.md) | Array with catalogs items | 

## Methods

### NewCatalogsItemsDeleteDiscontinuedBatchRequest

`func NewCatalogsItemsDeleteDiscontinuedBatchRequest(country Country, language CatalogsItemsRequestLanguage, operation BatchOperation, items []ItemDeleteDiscontinuedBatchRecord, ) *CatalogsItemsDeleteDiscontinuedBatchRequest`

NewCatalogsItemsDeleteDiscontinuedBatchRequest instantiates a new CatalogsItemsDeleteDiscontinuedBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsDeleteDiscontinuedBatchRequestWithDefaults

`func NewCatalogsItemsDeleteDiscontinuedBatchRequestWithDefaults() *CatalogsItemsDeleteDiscontinuedBatchRequest`

NewCatalogsItemsDeleteDiscontinuedBatchRequestWithDefaults instantiates a new CatalogsItemsDeleteDiscontinuedBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) GetLanguage() CatalogsItemsRequestLanguage`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) GetLanguageOk() (*CatalogsItemsRequestLanguage, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) SetLanguage(v CatalogsItemsRequestLanguage)`

SetLanguage sets Language field to given value.


### GetOperation

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) GetOperation() BatchOperation`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) GetOperationOk() (*BatchOperation, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) SetOperation(v BatchOperation)`

SetOperation sets Operation field to given value.


### GetItems

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) GetItems() []ItemDeleteDiscontinuedBatchRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) GetItemsOk() (*[]ItemDeleteDiscontinuedBatchRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsItemsDeleteDiscontinuedBatchRequest) SetItems(v []ItemDeleteDiscontinuedBatchRecord)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


