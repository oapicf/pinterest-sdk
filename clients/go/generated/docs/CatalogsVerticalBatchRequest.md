# CatalogsVerticalBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**Items** | [**[]CatalogsCreativeAssetsBatchItem**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | 
**CatalogId** | Pointer to **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 

## Methods

### NewCatalogsVerticalBatchRequest

`func NewCatalogsVerticalBatchRequest(catalogType string, country Country, language CatalogsItemsRequestLanguage, items []CatalogsCreativeAssetsBatchItem, ) *CatalogsVerticalBatchRequest`

NewCatalogsVerticalBatchRequest instantiates a new CatalogsVerticalBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsVerticalBatchRequestWithDefaults

`func NewCatalogsVerticalBatchRequestWithDefaults() *CatalogsVerticalBatchRequest`

NewCatalogsVerticalBatchRequestWithDefaults instantiates a new CatalogsVerticalBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsVerticalBatchRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsVerticalBatchRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsVerticalBatchRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetCountry

`func (o *CatalogsVerticalBatchRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsVerticalBatchRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsVerticalBatchRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *CatalogsVerticalBatchRequest) GetLanguage() CatalogsItemsRequestLanguage`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsVerticalBatchRequest) GetLanguageOk() (*CatalogsItemsRequestLanguage, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsVerticalBatchRequest) SetLanguage(v CatalogsItemsRequestLanguage)`

SetLanguage sets Language field to given value.


### GetItems

`func (o *CatalogsVerticalBatchRequest) GetItems() []CatalogsCreativeAssetsBatchItem`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsVerticalBatchRequest) GetItemsOk() (*[]CatalogsCreativeAssetsBatchItem, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsVerticalBatchRequest) SetItems(v []CatalogsCreativeAssetsBatchItem)`

SetItems sets Items field to given value.


### GetCatalogId

`func (o *CatalogsVerticalBatchRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsVerticalBatchRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsVerticalBatchRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsVerticalBatchRequest) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


