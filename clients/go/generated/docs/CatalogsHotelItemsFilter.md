# CatalogsHotelItemsFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**HotelIds** | **[]string** |  | 
**CatalogId** | Pointer to **string** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 

## Methods

### NewCatalogsHotelItemsFilter

`func NewCatalogsHotelItemsFilter(catalogType string, hotelIds []string, ) *CatalogsHotelItemsFilter`

NewCatalogsHotelItemsFilter instantiates a new CatalogsHotelItemsFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelItemsFilterWithDefaults

`func NewCatalogsHotelItemsFilterWithDefaults() *CatalogsHotelItemsFilter`

NewCatalogsHotelItemsFilterWithDefaults instantiates a new CatalogsHotelItemsFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsHotelItemsFilter) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelItemsFilter) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelItemsFilter) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetHotelIds

`func (o *CatalogsHotelItemsFilter) GetHotelIds() []string`

GetHotelIds returns the HotelIds field if non-nil, zero value otherwise.

### GetHotelIdsOk

`func (o *CatalogsHotelItemsFilter) GetHotelIdsOk() (*[]string, bool)`

GetHotelIdsOk returns a tuple with the HotelIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelIds

`func (o *CatalogsHotelItemsFilter) SetHotelIds(v []string)`

SetHotelIds sets HotelIds field to given value.


### GetCatalogId

`func (o *CatalogsHotelItemsFilter) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsHotelItemsFilter) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsHotelItemsFilter) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsHotelItemsFilter) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


