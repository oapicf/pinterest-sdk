# CatalogsRetailProductMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | The user-created unique ID that represents the product. | 
**ItemGroupId** | **NullableString** | The parent ID of the product. | 
**Availability** | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  | 
**Price** | **float32** | The price of the product. | 
**SalePrice** | **NullableFloat32** | The discounted price of the product. | 
**Currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 

## Methods

### NewCatalogsRetailProductMetadata

`func NewCatalogsRetailProductMetadata(itemId string, itemGroupId NullableString, availability NonNullableProductAvailabilityType, price float32, salePrice NullableFloat32, currency NonNullableCatalogsCurrency, ) *CatalogsRetailProductMetadata`

NewCatalogsRetailProductMetadata instantiates a new CatalogsRetailProductMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailProductMetadataWithDefaults

`func NewCatalogsRetailProductMetadataWithDefaults() *CatalogsRetailProductMetadata`

NewCatalogsRetailProductMetadataWithDefaults instantiates a new CatalogsRetailProductMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *CatalogsRetailProductMetadata) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsRetailProductMetadata) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsRetailProductMetadata) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetItemGroupId

`func (o *CatalogsRetailProductMetadata) GetItemGroupId() string`

GetItemGroupId returns the ItemGroupId field if non-nil, zero value otherwise.

### GetItemGroupIdOk

`func (o *CatalogsRetailProductMetadata) GetItemGroupIdOk() (*string, bool)`

GetItemGroupIdOk returns a tuple with the ItemGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemGroupId

`func (o *CatalogsRetailProductMetadata) SetItemGroupId(v string)`

SetItemGroupId sets ItemGroupId field to given value.


### SetItemGroupIdNil

`func (o *CatalogsRetailProductMetadata) SetItemGroupIdNil(b bool)`

 SetItemGroupIdNil sets the value for ItemGroupId to be an explicit nil

### UnsetItemGroupId
`func (o *CatalogsRetailProductMetadata) UnsetItemGroupId()`

UnsetItemGroupId ensures that no value is present for ItemGroupId, not even an explicit nil
### GetAvailability

`func (o *CatalogsRetailProductMetadata) GetAvailability() NonNullableProductAvailabilityType`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *CatalogsRetailProductMetadata) GetAvailabilityOk() (*NonNullableProductAvailabilityType, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *CatalogsRetailProductMetadata) SetAvailability(v NonNullableProductAvailabilityType)`

SetAvailability sets Availability field to given value.


### GetPrice

`func (o *CatalogsRetailProductMetadata) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *CatalogsRetailProductMetadata) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *CatalogsRetailProductMetadata) SetPrice(v float32)`

SetPrice sets Price field to given value.


### GetSalePrice

`func (o *CatalogsRetailProductMetadata) GetSalePrice() float32`

GetSalePrice returns the SalePrice field if non-nil, zero value otherwise.

### GetSalePriceOk

`func (o *CatalogsRetailProductMetadata) GetSalePriceOk() (*float32, bool)`

GetSalePriceOk returns a tuple with the SalePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalePrice

`func (o *CatalogsRetailProductMetadata) SetSalePrice(v float32)`

SetSalePrice sets SalePrice field to given value.


### SetSalePriceNil

`func (o *CatalogsRetailProductMetadata) SetSalePriceNil(b bool)`

 SetSalePriceNil sets the value for SalePrice to be an explicit nil

### UnsetSalePrice
`func (o *CatalogsRetailProductMetadata) UnsetSalePrice()`

UnsetSalePrice ensures that no value is present for SalePrice, not even an explicit nil
### GetCurrency

`func (o *CatalogsRetailProductMetadata) GetCurrency() NonNullableCatalogsCurrency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *CatalogsRetailProductMetadata) GetCurrencyOk() (*NonNullableCatalogsCurrency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *CatalogsRetailProductMetadata) SetCurrency(v NonNullableCatalogsCurrency)`

SetCurrency sets Currency field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


