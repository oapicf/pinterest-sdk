# ItemsBatchPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**Operation** | [**BatchOperation**](BatchOperation.md) |  | 
**Items** | [**[]ItemDeleteBatchRecord**](ItemDeleteBatchRecord.md) | Array with catalogs items | 

## Methods

### NewItemsBatchPostRequest

`func NewItemsBatchPostRequest(country Country, language Language, operation BatchOperation, items []ItemDeleteBatchRecord, ) *ItemsBatchPostRequest`

NewItemsBatchPostRequest instantiates a new ItemsBatchPostRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemsBatchPostRequestWithDefaults

`func NewItemsBatchPostRequestWithDefaults() *ItemsBatchPostRequest`

NewItemsBatchPostRequestWithDefaults instantiates a new ItemsBatchPostRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *ItemsBatchPostRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *ItemsBatchPostRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *ItemsBatchPostRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *ItemsBatchPostRequest) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *ItemsBatchPostRequest) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *ItemsBatchPostRequest) SetLanguage(v Language)`

SetLanguage sets Language field to given value.


### GetOperation

`func (o *ItemsBatchPostRequest) GetOperation() BatchOperation`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *ItemsBatchPostRequest) GetOperationOk() (*BatchOperation, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *ItemsBatchPostRequest) SetOperation(v BatchOperation)`

SetOperation sets Operation field to given value.


### GetItems

`func (o *ItemsBatchPostRequest) GetItems() []ItemDeleteBatchRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *ItemsBatchPostRequest) GetItemsOk() (*[]ItemDeleteBatchRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *ItemsBatchPostRequest) SetItems(v []ItemDeleteBatchRecord)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


