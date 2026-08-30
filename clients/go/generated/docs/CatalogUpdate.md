# CatalogUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | Pointer to [**CatalogsType**](CatalogsType.md) |  | [optional] 
**Name** | Pointer to **string** | A human-friendly name associated to a catalog entity. | [optional] 

## Methods

### NewCatalogUpdate

`func NewCatalogUpdate() *CatalogUpdate`

NewCatalogUpdate instantiates a new CatalogUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogUpdateWithDefaults

`func NewCatalogUpdateWithDefaults() *CatalogUpdate`

NewCatalogUpdateWithDefaults instantiates a new CatalogUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogUpdate) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogUpdate) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogUpdate) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.

### HasCatalogType

`func (o *CatalogUpdate) HasCatalogType() bool`

HasCatalogType returns a boolean if a field has been set.

### GetName

`func (o *CatalogUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogUpdate) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


