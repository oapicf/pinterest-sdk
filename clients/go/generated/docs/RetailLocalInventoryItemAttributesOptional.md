# RetailLocalInventoryItemAttributesOptional

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdLink** | Pointer to **string** | Ad link for the item | [optional] 
**Availability** | Pointer to [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] 
**Price** | Pointer to **string** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**SalePrice** | Pointer to **string** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 

## Methods

### NewRetailLocalInventoryItemAttributesOptional

`func NewRetailLocalInventoryItemAttributesOptional() *RetailLocalInventoryItemAttributesOptional`

NewRetailLocalInventoryItemAttributesOptional instantiates a new RetailLocalInventoryItemAttributesOptional object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRetailLocalInventoryItemAttributesOptionalWithDefaults

`func NewRetailLocalInventoryItemAttributesOptionalWithDefaults() *RetailLocalInventoryItemAttributesOptional`

NewRetailLocalInventoryItemAttributesOptionalWithDefaults instantiates a new RetailLocalInventoryItemAttributesOptional object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdLink

`func (o *RetailLocalInventoryItemAttributesOptional) GetAdLink() string`

GetAdLink returns the AdLink field if non-nil, zero value otherwise.

### GetAdLinkOk

`func (o *RetailLocalInventoryItemAttributesOptional) GetAdLinkOk() (*string, bool)`

GetAdLinkOk returns a tuple with the AdLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdLink

`func (o *RetailLocalInventoryItemAttributesOptional) SetAdLink(v string)`

SetAdLink sets AdLink field to given value.

### HasAdLink

`func (o *RetailLocalInventoryItemAttributesOptional) HasAdLink() bool`

HasAdLink returns a boolean if a field has been set.

### GetAvailability

`func (o *RetailLocalInventoryItemAttributesOptional) GetAvailability() ItemAvailability`

GetAvailability returns the Availability field if non-nil, zero value otherwise.

### GetAvailabilityOk

`func (o *RetailLocalInventoryItemAttributesOptional) GetAvailabilityOk() (*ItemAvailability, bool)`

GetAvailabilityOk returns a tuple with the Availability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailability

`func (o *RetailLocalInventoryItemAttributesOptional) SetAvailability(v ItemAvailability)`

SetAvailability sets Availability field to given value.

### HasAvailability

`func (o *RetailLocalInventoryItemAttributesOptional) HasAvailability() bool`

HasAvailability returns a boolean if a field has been set.

### GetPrice

`func (o *RetailLocalInventoryItemAttributesOptional) GetPrice() string`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *RetailLocalInventoryItemAttributesOptional) GetPriceOk() (*string, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *RetailLocalInventoryItemAttributesOptional) SetPrice(v string)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *RetailLocalInventoryItemAttributesOptional) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetSalePrice

`func (o *RetailLocalInventoryItemAttributesOptional) GetSalePrice() string`

GetSalePrice returns the SalePrice field if non-nil, zero value otherwise.

### GetSalePriceOk

`func (o *RetailLocalInventoryItemAttributesOptional) GetSalePriceOk() (*string, bool)`

GetSalePriceOk returns a tuple with the SalePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalePrice

`func (o *RetailLocalInventoryItemAttributesOptional) SetSalePrice(v string)`

SetSalePrice sets SalePrice field to given value.

### HasSalePrice

`func (o *RetailLocalInventoryItemAttributesOptional) HasSalePrice() bool`

HasSalePrice returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


