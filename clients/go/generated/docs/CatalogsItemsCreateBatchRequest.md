# CatalogsItemsCreateBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 
**Items** | [**[]ItemCreateBatchRecord**](ItemCreateBatchRecord.md) | Array with catalogs items | 

## Methods

### NewCatalogsItemsCreateBatchRequest

`func NewCatalogsItemsCreateBatchRequest(country Country, language Language, operation BatchOperation, items []ItemCreateBatchRecord, ) *CatalogsItemsCreateBatchRequest`

NewCatalogsItemsCreateBatchRequest instantiates a new CatalogsItemsCreateBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsCreateBatchRequestWithDefaults

`func NewCatalogsItemsCreateBatchRequestWithDefaults() *CatalogsItemsCreateBatchRequest`

NewCatalogsItemsCreateBatchRequestWithDefaults instantiates a new CatalogsItemsCreateBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *CatalogsItemsCreateBatchRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsItemsCreateBatchRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsItemsCreateBatchRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *CatalogsItemsCreateBatchRequest) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsItemsCreateBatchRequest) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsItemsCreateBatchRequest) SetLanguage(v Language)`

SetLanguage sets Language field to given value.


### GetOperation

`func (o *CatalogsItemsCreateBatchRequest) GetOperation() BatchOperation`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsItemsCreateBatchRequest) GetOperationOk() (*BatchOperation, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsItemsCreateBatchRequest) SetOperation(v BatchOperation)`

SetOperation sets Operation field to given value.


### GetItems

`func (o *CatalogsItemsCreateBatchRequest) GetItems() []ItemCreateBatchRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsItemsCreateBatchRequest) GetItemsOk() (*[]ItemCreateBatchRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsItemsCreateBatchRequest) SetItems(v []ItemCreateBatchRecord)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


