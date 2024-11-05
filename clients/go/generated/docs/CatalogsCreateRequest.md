# CatalogsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** | Type of the catalog entity. | 
**Name** | **string** | A human-friendly name associated to a given catalog. | 

## Methods

### NewCatalogsCreateRequest

`func NewCatalogsCreateRequest(catalogType string, name string, ) *CatalogsCreateRequest`

NewCatalogsCreateRequest instantiates a new CatalogsCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreateRequestWithDefaults

`func NewCatalogsCreateRequestWithDefaults() *CatalogsCreateRequest`

NewCatalogsCreateRequestWithDefaults instantiates a new CatalogsCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsCreateRequest) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsCreateRequest) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsCreateRequest) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetName

`func (o *CatalogsCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsCreateRequest) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


