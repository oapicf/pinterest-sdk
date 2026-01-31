# ItemResponseOneOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Errors** | [**[]ItemValidationEvent**](ItemValidationEvent.md) |  | 
**ItemId** | Pointer to **string** | The catalog item id in the merchant namespace | [optional] 
**HotelId** | Pointer to **string** | The catalog hotel id in the merchant namespace | [optional] 
**CreativeAssetsId** | Pointer to **string** | The catalog creative assets id in the merchant namespace | [optional] 

## Methods

### NewItemResponseOneOf1

`func NewItemResponseOneOf1(catalogType CatalogsType, errors []ItemValidationEvent, ) *ItemResponseOneOf1`

NewItemResponseOneOf1 instantiates a new ItemResponseOneOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemResponseOneOf1WithDefaults

`func NewItemResponseOneOf1WithDefaults() *ItemResponseOneOf1`

NewItemResponseOneOf1WithDefaults instantiates a new ItemResponseOneOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *ItemResponseOneOf1) GetCatalogType() CatalogsType`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *ItemResponseOneOf1) GetCatalogTypeOk() (*CatalogsType, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *ItemResponseOneOf1) SetCatalogType(v CatalogsType)`

SetCatalogType sets CatalogType field to given value.


### GetErrors

`func (o *ItemResponseOneOf1) GetErrors() []ItemValidationEvent`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *ItemResponseOneOf1) GetErrorsOk() (*[]ItemValidationEvent, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *ItemResponseOneOf1) SetErrors(v []ItemValidationEvent)`

SetErrors sets Errors field to given value.


### GetItemId

`func (o *ItemResponseOneOf1) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *ItemResponseOneOf1) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *ItemResponseOneOf1) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *ItemResponseOneOf1) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetHotelId

`func (o *ItemResponseOneOf1) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *ItemResponseOneOf1) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *ItemResponseOneOf1) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.

### HasHotelId

`func (o *ItemResponseOneOf1) HasHotelId() bool`

HasHotelId returns a boolean if a field has been set.

### GetCreativeAssetsId

`func (o *ItemResponseOneOf1) GetCreativeAssetsId() string`

GetCreativeAssetsId returns the CreativeAssetsId field if non-nil, zero value otherwise.

### GetCreativeAssetsIdOk

`func (o *ItemResponseOneOf1) GetCreativeAssetsIdOk() (*string, bool)`

GetCreativeAssetsIdOk returns a tuple with the CreativeAssetsId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeAssetsId

`func (o *ItemResponseOneOf1) SetCreativeAssetsId(v string)`

SetCreativeAssetsId sets CreativeAssetsId field to given value.

### HasCreativeAssetsId

`func (o *ItemResponseOneOf1) HasCreativeAssetsId() bool`

HasCreativeAssetsId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


