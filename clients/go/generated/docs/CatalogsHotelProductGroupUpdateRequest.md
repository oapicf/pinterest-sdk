# CatalogsHotelProductGroupUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | Pointer to [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | [optional] 

## Methods

### NewCatalogsHotelProductGroupUpdateRequest

`func NewCatalogsHotelProductGroupUpdateRequest() *CatalogsHotelProductGroupUpdateRequest`

NewCatalogsHotelProductGroupUpdateRequest instantiates a new CatalogsHotelProductGroupUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelProductGroupUpdateRequestWithDefaults

`func NewCatalogsHotelProductGroupUpdateRequestWithDefaults() *CatalogsHotelProductGroupUpdateRequest`

NewCatalogsHotelProductGroupUpdateRequestWithDefaults instantiates a new CatalogsHotelProductGroupUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsHotelProductGroupUpdateRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelProductGroupUpdateRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelProductGroupUpdateRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.

### HasCatalogType

`func (o *CatalogsHotelProductGroupUpdateRequest) HasCatalogType() bool`

HasCatalogType returns a boolean if a field has been set.

### GetName

`func (o *CatalogsHotelProductGroupUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsHotelProductGroupUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsHotelProductGroupUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsHotelProductGroupUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsHotelProductGroupUpdateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsHotelProductGroupUpdateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsHotelProductGroupUpdateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsHotelProductGroupUpdateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsHotelProductGroupUpdateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsHotelProductGroupUpdateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsHotelProductGroupUpdateRequest) GetFilters() CatalogsHotelProductGroupFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsHotelProductGroupUpdateRequest) GetFiltersOk() (*CatalogsHotelProductGroupFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsHotelProductGroupUpdateRequest) SetFilters(v CatalogsHotelProductGroupFilters)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CatalogsHotelProductGroupUpdateRequest) HasFilters() bool`

HasFilters returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


