# CatalogsHotelBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**Items** | [**[]CatalogsHotelBatchItem**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**CatalogId** | Pointer to **string** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 

## Methods

### NewCatalogsHotelBatchRequest

`func NewCatalogsHotelBatchRequest(catalogType CatalogsType, country Country, language Language, items []CatalogsHotelBatchItem, ) *CatalogsHotelBatchRequest`

NewCatalogsHotelBatchRequest instantiates a new CatalogsHotelBatchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelBatchRequestWithDefaults

`func NewCatalogsHotelBatchRequestWithDefaults() *CatalogsHotelBatchRequest`

NewCatalogsHotelBatchRequestWithDefaults instantiates a new CatalogsHotelBatchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsHotelBatchRequest) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelBatchRequest) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelBatchRequest) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetCountry

`func (o *CatalogsHotelBatchRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsHotelBatchRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsHotelBatchRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *CatalogsHotelBatchRequest) GetLanguage() Language`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsHotelBatchRequest) GetLanguageOk() (*Language, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsHotelBatchRequest) SetLanguage(v Language)`

SetLanguage sets Language field to given value.


### GetItems

`func (o *CatalogsHotelBatchRequest) GetItems() []CatalogsHotelBatchItem`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CatalogsHotelBatchRequest) GetItemsOk() (*[]CatalogsHotelBatchItem, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CatalogsHotelBatchRequest) SetItems(v []CatalogsHotelBatchItem)`

SetItems sets Items field to given value.


### GetCatalogId

`func (o *CatalogsHotelBatchRequest) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsHotelBatchRequest) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsHotelBatchRequest) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsHotelBatchRequest) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


