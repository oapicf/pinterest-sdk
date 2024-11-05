# CatalogsCreativeAssetsItemErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**CreativeAssetsId** | Pointer to **string** | The catalog creative assets id in the merchant namespace | [optional] 
**Errors** | Pointer to [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 

## Methods

### NewCatalogsCreativeAssetsItemErrorResponse

`func NewCatalogsCreativeAssetsItemErrorResponse(catalogType CatalogsType, ) *CatalogsCreativeAssetsItemErrorResponse`

NewCatalogsCreativeAssetsItemErrorResponse instantiates a new CatalogsCreativeAssetsItemErrorResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsItemErrorResponseWithDefaults

`func NewCatalogsCreativeAssetsItemErrorResponseWithDefaults() *CatalogsCreativeAssetsItemErrorResponse`

NewCatalogsCreativeAssetsItemErrorResponseWithDefaults instantiates a new CatalogsCreativeAssetsItemErrorResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsCreativeAssetsItemErrorResponse) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsCreativeAssetsItemErrorResponse) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsCreativeAssetsItemErrorResponse) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetCreativeAssetsId

`func (o *CatalogsCreativeAssetsItemErrorResponse) GetCreativeAssetsId() string`

GetCreativeAssetsId returns the CreativeAssetsId field if non-nil, zero value otherwise.

### GetCreativeAssetsIdOk

`func (o *CatalogsCreativeAssetsItemErrorResponse) GetCreativeAssetsIdOk() (*string, bool)`

GetCreativeAssetsIdOk returns a tuple with the CreativeAssetsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsId

`func (o *CatalogsCreativeAssetsItemErrorResponse) SetCreativeAssetsId(v string)`

SetCreativeAssetsId sets CreativeAssetsId field to given value.

### HasCreativeAssetsId

`func (o *CatalogsCreativeAssetsItemErrorResponse) HasCreativeAssetsId() bool`

HasCreativeAssetsId returns a boolean if a field has been set.

### GetErrors

`func (o *CatalogsCreativeAssetsItemErrorResponse) GetErrors() []ItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *CatalogsCreativeAssetsItemErrorResponse) GetErrorsOk() (*[]ItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *CatalogsCreativeAssetsItemErrorResponse) SetErrors(v []ItemValidationEvent)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *CatalogsCreativeAssetsItemErrorResponse) HasErrors() bool`

HasErrors returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


