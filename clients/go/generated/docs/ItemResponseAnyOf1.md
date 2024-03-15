# ItemResponseAnyOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**ItemId** | Pointer to **string** | The catalog item id in the merchant namespace | [optional] 
**Errors** | Pointer to [**[]ItemValidationEvent**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 
**HotelId** | Pointer to **string** | The catalog hotel id in the merchant namespace | [optional] 

## Methods

### NewItemResponseAnyOf1

`func NewItemResponseAnyOf1(catalogType CatalogsType, ) *ItemResponseAnyOf1`

NewItemResponseAnyOf1 instantiates a new ItemResponseAnyOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemResponseAnyOf1WithDefaults

`func NewItemResponseAnyOf1WithDefaults() *ItemResponseAnyOf1`

NewItemResponseAnyOf1WithDefaults instantiates a new ItemResponseAnyOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *ItemResponseAnyOf1) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *ItemResponseAnyOf1) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *ItemResponseAnyOf1) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetItemId

`func (o *ItemResponseAnyOf1) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *ItemResponseAnyOf1) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *ItemResponseAnyOf1) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *ItemResponseAnyOf1) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetErrors

`func (o *ItemResponseAnyOf1) GetErrors() []ItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *ItemResponseAnyOf1) GetErrorsOk() (*[]ItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *ItemResponseAnyOf1) SetErrors(v []ItemValidationEvent)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *ItemResponseAnyOf1) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetHotelId

`func (o *ItemResponseAnyOf1) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *ItemResponseAnyOf1) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *ItemResponseAnyOf1) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.

### HasHotelId

`func (o *ItemResponseAnyOf1) HasHotelId() bool`

HasHotelId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


