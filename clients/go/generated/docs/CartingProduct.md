# CartingProduct

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CartingProductId** | **string** | the internal Pinterest carting product id (different from industry product id) | 
**DisplayPreferredRetailersOnly** | Pointer to **bool** | Whether to display only the preferred retailers for the carting product | [optional] 
**DisplayProductPrice** | Pointer to **bool** | Whether to display the price for the carting product | [optional] 
**PreferredRetailers** | Pointer to [**[]CartingRetailer**](CartingRetailer.md) | A sorted array of preferred retailers for the carting product | [optional] 
**RandomizePreferredRetailers** | Pointer to **bool** | Whether to randomize preferred retailers for the carting product | [optional] 

## Methods

### NewCartingProduct

`func NewCartingProduct(cartingProductId string, ) *CartingProduct`

NewCartingProduct instantiates a new CartingProduct object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCartingProductWithDefaults

`func NewCartingProductWithDefaults() *CartingProduct`

NewCartingProductWithDefaults instantiates a new CartingProduct object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCartingProductId

`func (o *CartingProduct) GetCartingProductId() string`

GetCartingProductId returns the CartingProductId field if non-nil, zero value otherwise.

### GetCartingProductIdOk

`func (o *CartingProduct) GetCartingProductIdOk() (*string, bool)`

GetCartingProductIdOk returns a tuple with the CartingProductId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCartingProductId

`func (o *CartingProduct) SetCartingProductId(v string)`

SetCartingProductId sets CartingProductId field to given value.


### GetDisplayPreferredRetailersOnly

`func (o *CartingProduct) GetDisplayPreferredRetailersOnly() bool`

GetDisplayPreferredRetailersOnly returns the DisplayPreferredRetailersOnly field if non-nil, zero value otherwise.

### GetDisplayPreferredRetailersOnlyOk

`func (o *CartingProduct) GetDisplayPreferredRetailersOnlyOk() (*bool, bool)`

GetDisplayPreferredRetailersOnlyOk returns a tuple with the DisplayPreferredRetailersOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayPreferredRetailersOnly

`func (o *CartingProduct) SetDisplayPreferredRetailersOnly(v bool)`

SetDisplayPreferredRetailersOnly sets DisplayPreferredRetailersOnly field to given value.

### HasDisplayPreferredRetailersOnly

`func (o *CartingProduct) HasDisplayPreferredRetailersOnly() bool`

HasDisplayPreferredRetailersOnly returns a boolean if a field has been set.

### GetDisplayProductPrice

`func (o *CartingProduct) GetDisplayProductPrice() bool`

GetDisplayProductPrice returns the DisplayProductPrice field if non-nil, zero value otherwise.

### GetDisplayProductPriceOk

`func (o *CartingProduct) GetDisplayProductPriceOk() (*bool, bool)`

GetDisplayProductPriceOk returns a tuple with the DisplayProductPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayProductPrice

`func (o *CartingProduct) SetDisplayProductPrice(v bool)`

SetDisplayProductPrice sets DisplayProductPrice field to given value.

### HasDisplayProductPrice

`func (o *CartingProduct) HasDisplayProductPrice() bool`

HasDisplayProductPrice returns a boolean if a field has been set.

### GetPreferredRetailers

`func (o *CartingProduct) GetPreferredRetailers() []CartingRetailer`

GetPreferredRetailers returns the PreferredRetailers field if non-nil, zero value otherwise.

### GetPreferredRetailersOk

`func (o *CartingProduct) GetPreferredRetailersOk() (*[]CartingRetailer, bool)`

GetPreferredRetailersOk returns a tuple with the PreferredRetailers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredRetailers

`func (o *CartingProduct) SetPreferredRetailers(v []CartingRetailer)`

SetPreferredRetailers sets PreferredRetailers field to given value.

### HasPreferredRetailers

`func (o *CartingProduct) HasPreferredRetailers() bool`

HasPreferredRetailers returns a boolean if a field has been set.

### GetRandomizePreferredRetailers

`func (o *CartingProduct) GetRandomizePreferredRetailers() bool`

GetRandomizePreferredRetailers returns the RandomizePreferredRetailers field if non-nil, zero value otherwise.

### GetRandomizePreferredRetailersOk

`func (o *CartingProduct) GetRandomizePreferredRetailersOk() (*bool, bool)`

GetRandomizePreferredRetailersOk returns a tuple with the RandomizePreferredRetailers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRandomizePreferredRetailers

`func (o *CartingProduct) SetRandomizePreferredRetailers(v bool)`

SetRandomizePreferredRetailers sets RandomizePreferredRetailers field to given value.

### HasRandomizePreferredRetailers

`func (o *CartingProduct) HasRandomizePreferredRetailers() bool`

HasRandomizePreferredRetailers returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


