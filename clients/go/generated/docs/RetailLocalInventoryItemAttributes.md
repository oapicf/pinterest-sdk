# RetailLocalInventoryItemAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdLink** | Pointer to **string** | Ad link for the item | [optional] 
**Availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | 
**Price** | **string** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | 
**SalePrice** | Pointer to **string** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 

## Methods

### NewRetailLocalInventoryItemAttributes

`func NewRetailLocalInventoryItemAttributes(availability ItemAvailability, price string, ) *RetailLocalInventoryItemAttributes`

NewRetailLocalInventoryItemAttributes instantiates a new RetailLocalInventoryItemAttributes object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRetailLocalInventoryItemAttributesWithDefaults

`func NewRetailLocalInventoryItemAttributesWithDefaults() *RetailLocalInventoryItemAttributes`

NewRetailLocalInventoryItemAttributesWithDefaults instantiates a new RetailLocalInventoryItemAttributes object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdLink

`func (o *RetailLocalInventoryItemAttributes) GetAdLink() string`

GetAdLink returns the AdLink field if non-nil, zero value otherwise.

### GetAdLinkOk

`func (o *RetailLocalInventoryItemAttributes) GetAdLinkOk() (*string, bool)`

GetAdLinkOk returns a tuple with the AdLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdLink

`func (o *RetailLocalInventoryItemAttributes) SetAdLink(v string)`

SetAdLink sets AdLink field to given value.

### HasAdLink

`func (o *RetailLocalInventoryItemAttributes) HasAdLink() bool`

HasAdLink returns a boolean if a field has been set.

### GetAvailability

`func (o *RetailLocalInventoryItemAttributes) GetAvailability() ItemAvailability`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *RetailLocalInventoryItemAttributes) GetAvailabilityOk() (*ItemAvailability, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *RetailLocalInventoryItemAttributes) SetAvailability(v ItemAvailability)`

SetAvailability sets Availability field to given value.


### GetPrice

`func (o *RetailLocalInventoryItemAttributes) GetPrice() string`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *RetailLocalInventoryItemAttributes) GetPriceOk() (*string, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *RetailLocalInventoryItemAttributes) SetPrice(v string)`

SetPrice sets Price field to given value.


### GetSalePrice

`func (o *RetailLocalInventoryItemAttributes) GetSalePrice() string`

GetSalePrice returns the SalePrice field if non-nil, zero value otherwise.

### GetSalePriceOk

`func (o *RetailLocalInventoryItemAttributes) GetSalePriceOk() (*string, bool)`

GetSalePriceOk returns a tuple with the SalePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalePrice

`func (o *RetailLocalInventoryItemAttributes) SetSalePrice(v string)`

SetSalePrice sets SalePrice field to given value.

### HasSalePrice

`func (o *RetailLocalInventoryItemAttributes) HasSalePrice() bool`

HasSalePrice returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


