# CatalogsRetailBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | Pointer to **string** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 
**CatalogType** | **string** |  | 
**Country** | [**Country**](Country.md) |  | 
**Items** | [**[]CatalogsRetailBatchRequestItemsInner**](CatalogsRetailBatchRequestItemsInner.md) | Array with catalogs item operations | 
**Language** | **string** | We recommend using the CatalogsLocale values. | 

## Methods

### NewCatalogsRetailBatchRequest

`func NewCatalogsRetailBatchRequest(catalogType string, country Country, items []CatalogsRetailBatchRequestItemsInner, language string, ) *CatalogsRetailBatchRequest`

NewCatalogsRetailBatchRequest instantiates a new CatalogsRetailBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailBatchRequestWithDefaults

`func NewCatalogsRetailBatchRequestWithDefaults() *CatalogsRetailBatchRequest`

NewCatalogsRetailBatchRequestWithDefaults instantiates a new CatalogsRetailBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogId

`func (o *CatalogsRetailBatchRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsRetailBatchRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsRetailBatchRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsRetailBatchRequest) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetCatalogType

`func (o *CatalogsRetailBatchRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailBatchRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailBatchRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetCountry

`func (o *CatalogsRetailBatchRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsRetailBatchRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsRetailBatchRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetItems

`func (o *CatalogsRetailBatchRequest) GetItems() []CatalogsRetailBatchRequestItemsInner`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsRetailBatchRequest) GetItemsOk() (*[]CatalogsRetailBatchRequestItemsInner, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsRetailBatchRequest) SetItems(v []CatalogsRetailBatchRequestItemsInner)`

SetItems sets Items field to given value.


### GetLanguage

`func (o *CatalogsRetailBatchRequest) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsRetailBatchRequest) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsRetailBatchRequest) SetLanguage(v string)`

SetLanguage sets Language field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


