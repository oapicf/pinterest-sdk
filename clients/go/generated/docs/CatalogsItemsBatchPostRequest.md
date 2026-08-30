# CatalogsItemsBatchPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | Pointer to **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**CatalogType** | **string** |  | 
**Country** | [**Country**](Country.md) |  | 
**Items** | [**[]ItemDeleteBatchRecord**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**Language** | **string** | We recommend using the CatalogsLocale values. | 
**Operation** | **string** |  | 

## Methods

### NewCatalogsItemsBatchPostRequest

`func NewCatalogsItemsBatchPostRequest(catalogType string, country Country, items []ItemDeleteBatchRecord, language string, operation string, ) *CatalogsItemsBatchPostRequest`

NewCatalogsItemsBatchPostRequest instantiates a new CatalogsItemsBatchPostRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsBatchPostRequestWithDefaults

`func NewCatalogsItemsBatchPostRequestWithDefaults() *CatalogsItemsBatchPostRequest`

NewCatalogsItemsBatchPostRequestWithDefaults instantiates a new CatalogsItemsBatchPostRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogId

`func (o *CatalogsItemsBatchPostRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsItemsBatchPostRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsItemsBatchPostRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsItemsBatchPostRequest) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetCatalogType

`func (o *CatalogsItemsBatchPostRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsItemsBatchPostRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsItemsBatchPostRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetCountry

`func (o *CatalogsItemsBatchPostRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsItemsBatchPostRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsItemsBatchPostRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetItems

`func (o *CatalogsItemsBatchPostRequest) GetItems() []ItemDeleteBatchRecord`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsItemsBatchPostRequest) GetItemsOk() (*[]ItemDeleteBatchRecord, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsItemsBatchPostRequest) SetItems(v []ItemDeleteBatchRecord)`

SetItems sets Items field to given value.


### GetLanguage

`func (o *CatalogsItemsBatchPostRequest) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsItemsBatchPostRequest) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsItemsBatchPostRequest) SetLanguage(v string)`

SetLanguage sets Language field to given value.


### GetOperation

`func (o *CatalogsItemsBatchPostRequest) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsItemsBatchPostRequest) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsItemsBatchPostRequest) SetOperation(v string)`

SetOperation sets Operation field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


