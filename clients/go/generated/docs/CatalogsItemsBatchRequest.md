# CatalogsItemsBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | Pointer to [**Country**](Country.md) |  | [optional] 
**Language** | Pointer to [**Language**](Language.md) |  | [optional] 
**Operation** | Pointer to [**BatchOperation**](BatchOperation.md) |  | [optional] 
**Items** | Pointer to [**[]ItemBatchRecord**](ItemBatchRecord.md) | Array with catalogs items | [optional] 

## Methods

### NewCatalogsItemsBatchRequest

`func NewCatalogsItemsBatchRequest() *CatalogsItemsBatchRequest`

NewCatalogsItemsBatchRequest instantiates a new CatalogsItemsBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsBatchRequestWithDefaults

`func NewCatalogsItemsBatchRequestWithDefaults() *CatalogsItemsBatchRequest`

NewCatalogsItemsBatchRequestWithDefaults instantiates a new CatalogsItemsBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *CatalogsItemsBatchRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsItemsBatchRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsItemsBatchRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *CatalogsItemsBatchRequest) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetLanguage

`func (o *CatalogsItemsBatchRequest) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsItemsBatchRequest) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsItemsBatchRequest) SetLanguage(v Language)`

SetLanguage sets Language field to given value.

### HasLanguage

`func (o *CatalogsItemsBatchRequest) HasLanguage() bool`

HasLanguage returns a boolean if a field has been set.

### GetOperation

`func (o *CatalogsItemsBatchRequest) GetOperation() BatchOperation`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsItemsBatchRequest) GetOperationOk() (*BatchOperation, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsItemsBatchRequest) SetOperation(v BatchOperation)`

SetOperation sets Operation field to given value.

### HasOperation

`func (o *CatalogsItemsBatchRequest) HasOperation() bool`

HasOperation returns a boolean if a field has been set.

### GetItems

`func (o *CatalogsItemsBatchRequest) GetItems() []ItemBatchRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsItemsBatchRequest) GetItemsOk() (*[]ItemBatchRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsItemsBatchRequest) SetItems(v []ItemBatchRecord)`

SetItems sets Items field to given value.

### HasItems

`func (o *CatalogsItemsBatchRequest) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


