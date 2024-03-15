# CatalogsHotelItemErrorResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**HotelId** | Pointer to **string** | The catalog hotel id in the merchant namespace | [optional] 
**Errors** | Pointer to [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 

## Methods

### NewCatalogsHotelItemErrorResponse

`func NewCatalogsHotelItemErrorResponse(catalogType CatalogsType, ) *CatalogsHotelItemErrorResponse`

NewCatalogsHotelItemErrorResponse instantiates a new CatalogsHotelItemErrorResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelItemErrorResponseWithDefaults

`func NewCatalogsHotelItemErrorResponseWithDefaults() *CatalogsHotelItemErrorResponse`

NewCatalogsHotelItemErrorResponseWithDefaults instantiates a new CatalogsHotelItemErrorResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsHotelItemErrorResponse) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsHotelItemErrorResponse) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsHotelItemErrorResponse) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetHotelId

`func (o *CatalogsHotelItemErrorResponse) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *CatalogsHotelItemErrorResponse) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *CatalogsHotelItemErrorResponse) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.

### HasHotelId

`func (o *CatalogsHotelItemErrorResponse) HasHotelId() bool`

HasHotelId returns a boolean if a field has been set.

### GetErrors

`func (o *CatalogsHotelItemErrorResponse) GetErrors() []ItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *CatalogsHotelItemErrorResponse) GetErrorsOk() (*[]ItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *CatalogsHotelItemErrorResponse) SetErrors(v []ItemValidationEvent)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *CatalogsHotelItemErrorResponse) HasErrors() bool`

HasErrors returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


