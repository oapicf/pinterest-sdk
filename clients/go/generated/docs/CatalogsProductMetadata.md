# CatalogsProductMetadata

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

### NewCatalogsProductMetadata

`func NewCatalogsProductMetadata(itemId string, itemGroupId NullableString, availability NonNullableProductAvailabilityType, price float32, salePrice NullableFloat32, currency NonNullableCatalogsCurrency, ) *CatalogsProductMetadata`

NewCatalogsProductMetadata instantiates a new CatalogsProductMetadata object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductMetadataWithDefaults

`func NewCatalogsProductMetadataWithDefaults() *CatalogsProductMetadata`

NewCatalogsProductMetadataWithDefaults instantiates a new CatalogsProductMetadata object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *CatalogsProductMetadata) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsProductMetadata) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsProductMetadata) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetItemGroupId

`func (o *CatalogsProductMetadata) GetItemGroupId() string`

GetItemGroupId returns the ItemGroupId field if non-nil, zero value otherwise.

### GetItemGroupIdOk

`func (o *CatalogsProductMetadata) GetItemGroupIdOk() (*string, bool)`

GetItemGroupIdOk returns a tuple with the ItemGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemGroupId

`func (o *CatalogsProductMetadata) SetItemGroupId(v string)`

SetItemGroupId sets ItemGroupId field to given value.


### SetItemGroupIdNil

`func (o *CatalogsProductMetadata) SetItemGroupIdNil(b bool)`

 SetItemGroupIdNil sets the value for ItemGroupId to be an explicit nil

### UnsetItemGroupId
`func (o *CatalogsProductMetadata) UnsetItemGroupId()`

UnsetItemGroupId ensures that no value is present for ItemGroupId, not even an explicit nil
### GetAvailability

`func (o *CatalogsProductMetadata) GetAvailability() NonNullableProductAvailabilityType`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *CatalogsProductMetadata) GetAvailabilityOk() (*NonNullableProductAvailabilityType, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *CatalogsProductMetadata) SetAvailability(v NonNullableProductAvailabilityType)`

SetAvailability sets Availability field to given value.


### GetPrice

`func (o *CatalogsProductMetadata) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *CatalogsProductMetadata) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *CatalogsProductMetadata) SetPrice(v float32)`

SetPrice sets Price field to given value.


### GetSalePrice

`func (o *CatalogsProductMetadata) GetSalePrice() float32`

GetSalePrice returns the SalePrice field if non-nil, zero value otherwise.

### GetSalePriceOk

`func (o *CatalogsProductMetadata) GetSalePriceOk() (*float32, bool)`

GetSalePriceOk returns a tuple with the SalePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalePrice

`func (o *CatalogsProductMetadata) SetSalePrice(v float32)`

SetSalePrice sets SalePrice field to given value.


### SetSalePriceNil

`func (o *CatalogsProductMetadata) SetSalePriceNil(b bool)`

 SetSalePriceNil sets the value for SalePrice to be an explicit nil

### UnsetSalePrice
`func (o *CatalogsProductMetadata) UnsetSalePrice()`

UnsetSalePrice ensures that no value is present for SalePrice, not even an explicit nil
### GetCurrency

`func (o *CatalogsProductMetadata) GetCurrency() NonNullableCatalogsCurrency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *CatalogsProductMetadata) GetCurrencyOk() (*NonNullableCatalogsCurrency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *CatalogsProductMetadata) SetCurrency(v NonNullableCatalogsCurrency)`

SetCurrency sets Currency field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


