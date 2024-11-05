# CatalogsHotelItemsPostFilter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**HotelIds** | **[]string** |  | 
**CatalogId** | Pointer to **string** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 

## Methods

### NewCatalogsHotelItemsPostFilter

`func NewCatalogsHotelItemsPostFilter(catalogType string, hotelIds []string, ) *CatalogsHotelItemsPostFilter`

NewCatalogsHotelItemsPostFilter instantiates a new CatalogsHotelItemsPostFilter object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelItemsPostFilterWithDefaults

`func NewCatalogsHotelItemsPostFilterWithDefaults() *CatalogsHotelItemsPostFilter`

NewCatalogsHotelItemsPostFilterWithDefaults instantiates a new CatalogsHotelItemsPostFilter object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsHotelItemsPostFilter) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelItemsPostFilter) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelItemsPostFilter) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetHotelIds

`func (o *CatalogsHotelItemsPostFilter) GetHotelIds() []string`

GetHotelIds returns the HotelIds field if non-nil, zero value otherwise.

### GetHotelIdsOk

`func (o *CatalogsHotelItemsPostFilter) GetHotelIdsOk() (*[]string, bool)`

GetHotelIdsOk returns a tuple with the HotelIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelIds

`func (o *CatalogsHotelItemsPostFilter) SetHotelIds(v []string)`

SetHotelIds sets HotelIds field to given value.


### GetCatalogId

`func (o *CatalogsHotelItemsPostFilter) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsHotelItemsPostFilter) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsHotelItemsPostFilter) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsHotelItemsPostFilter) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


