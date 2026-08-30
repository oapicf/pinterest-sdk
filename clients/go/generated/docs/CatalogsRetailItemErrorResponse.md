# CatalogsRetailItemErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Errors** | [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**ItemId** | Pointer to **string** | The catalog item id in the merchant namespace | [optional] 
**ItemResponseKind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 

## Methods

### NewCatalogsRetailItemErrorResponse

`func NewCatalogsRetailItemErrorResponse(catalogType string, errors []ItemValidationEvent, itemResponseKind string, ) *CatalogsRetailItemErrorResponse`

NewCatalogsRetailItemErrorResponse instantiates a new CatalogsRetailItemErrorResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailItemErrorResponseWithDefaults

`func NewCatalogsRetailItemErrorResponseWithDefaults() *CatalogsRetailItemErrorResponse`

NewCatalogsRetailItemErrorResponseWithDefaults instantiates a new CatalogsRetailItemErrorResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailItemErrorResponse) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailItemErrorResponse) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailItemErrorResponse) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetErrors

`func (o *CatalogsRetailItemErrorResponse) GetErrors() []ItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *CatalogsRetailItemErrorResponse) GetErrorsOk() (*[]ItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *CatalogsRetailItemErrorResponse) SetErrors(v []ItemValidationEvent)`

SetErrors sets Errors field to given value.


### GetItemId

`func (o *CatalogsRetailItemErrorResponse) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsRetailItemErrorResponse) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsRetailItemErrorResponse) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *CatalogsRetailItemErrorResponse) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetItemResponseKind

`func (o *CatalogsRetailItemErrorResponse) GetItemResponseKind() string`

GetItemResponseKind returns the ItemResponseKind field if non-nil, zero value otherwise.

### GetItemResponseKindOk

`func (o *CatalogsRetailItemErrorResponse) GetItemResponseKindOk() (*string, bool)`

GetItemResponseKindOk returns a tuple with the ItemResponseKind field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemResponseKind

`func (o *CatalogsRetailItemErrorResponse) SetItemResponseKind(v string)`

SetItemResponseKind sets ItemResponseKind field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


