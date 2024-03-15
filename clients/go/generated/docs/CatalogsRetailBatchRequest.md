# CatalogsRetailBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**Items** | [**[]CatalogsRetailBatchRequestItemsInner**](CatalogsRetailBatchRequestItemsInner.md) | Array with catalogs item operations | 

## Methods

### NewCatalogsRetailBatchRequest

`func NewCatalogsRetailBatchRequest(catalogType CatalogsType, country Country, language Language, items []CatalogsRetailBatchRequestItemsInner, ) *CatalogsRetailBatchRequest`

NewCatalogsRetailBatchRequest instantiates a new CatalogsRetailBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailBatchRequestWithDefaults

`func NewCatalogsRetailBatchRequestWithDefaults() *CatalogsRetailBatchRequest`

NewCatalogsRetailBatchRequestWithDefaults instantiates a new CatalogsRetailBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailBatchRequest) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailBatchRequest) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailBatchRequest) SetCatalogType(v CatalogsType)`

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


### GetLanguage

`func (o *CatalogsRetailBatchRequest) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsRetailBatchRequest) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsRetailBatchRequest) SetLanguage(v Language)`

SetLanguage sets Language field to given value.


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



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


