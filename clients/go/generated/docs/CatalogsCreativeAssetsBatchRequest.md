# CatalogsCreativeAssetsBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | Pointer to **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**CatalogType** | **string** |  | 
**Country** | [**Country**](Country.md) |  | 
**Items** | [**[]CatalogsCreativeAssetsBatchItem**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | 
**Language** | **string** | We recommend using the CatalogsLocale values. | 

## Methods

### NewCatalogsCreativeAssetsBatchRequest

`func NewCatalogsCreativeAssetsBatchRequest(catalogType string, country Country, items []CatalogsCreativeAssetsBatchItem, language string, ) *CatalogsCreativeAssetsBatchRequest`

NewCatalogsCreativeAssetsBatchRequest instantiates a new CatalogsCreativeAssetsBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsBatchRequestWithDefaults

`func NewCatalogsCreativeAssetsBatchRequestWithDefaults() *CatalogsCreativeAssetsBatchRequest`

NewCatalogsCreativeAssetsBatchRequestWithDefaults instantiates a new CatalogsCreativeAssetsBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogId

`func (o *CatalogsCreativeAssetsBatchRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsCreativeAssetsBatchRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsCreativeAssetsBatchRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsCreativeAssetsBatchRequest) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetCatalogType

`func (o *CatalogsCreativeAssetsBatchRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsCreativeAssetsBatchRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsCreativeAssetsBatchRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetCountry

`func (o *CatalogsCreativeAssetsBatchRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsCreativeAssetsBatchRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsCreativeAssetsBatchRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetItems

`func (o *CatalogsCreativeAssetsBatchRequest) GetItems() []CatalogsCreativeAssetsBatchItem`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsCreativeAssetsBatchRequest) GetItemsOk() (*[]CatalogsCreativeAssetsBatchItem, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsCreativeAssetsBatchRequest) SetItems(v []CatalogsCreativeAssetsBatchItem)`

SetItems sets Items field to given value.


### GetLanguage

`func (o *CatalogsCreativeAssetsBatchRequest) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsCreativeAssetsBatchRequest) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsCreativeAssetsBatchRequest) SetLanguage(v string)`

SetLanguage sets Language field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


