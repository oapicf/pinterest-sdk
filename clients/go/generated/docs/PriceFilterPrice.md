# PriceFilterPrice

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**Negated** | Pointer to **bool** |  | [optional] 
**Operator** | [**NumericFilterOperatorType**](NumericFilterOperatorType.md) |  | 
**Value** | **float32** |  | 

## Methods

### NewPriceFilterPrice

`func NewPriceFilterPrice(currency NonNullableCatalogsCurrency, operator NumericFilterOperatorType, value float32, ) *PriceFilterPrice`

NewPriceFilterPrice instantiates a new PriceFilterPrice object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPriceFilterPriceWithDefaults

`func NewPriceFilterPriceWithDefaults() *PriceFilterPrice`

NewPriceFilterPriceWithDefaults instantiates a new PriceFilterPrice object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCurrency

`func (o *PriceFilterPrice) GetCurrency() NonNullableCatalogsCurrency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *PriceFilterPrice) GetCurrencyOk() (*NonNullableCatalogsCurrency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *PriceFilterPrice) SetCurrency(v NonNullableCatalogsCurrency)`

SetCurrency sets Currency field to given value.


### GetNegated

`func (o *PriceFilterPrice) GetNegated() bool`

GetNegated returns the Negated field if non-nil, zero value otherwise.

### GetNegatedOk

`func (o *PriceFilterPrice) GetNegatedOk() (*bool, bool)`

GetNegatedOk returns a tuple with the Negated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNegated

`func (o *PriceFilterPrice) SetNegated(v bool)`

SetNegated sets Negated field to given value.

### HasNegated

`func (o *PriceFilterPrice) HasNegated() bool`

HasNegated returns a boolean if a field has been set.

### GetOperator

`func (o *PriceFilterPrice) GetOperator() NumericFilterOperatorType`

GetOperator returns the Operator field if non-nil, zero value otherwise.

### GetOperatorOk

`func (o *PriceFilterPrice) GetOperatorOk() (*NumericFilterOperatorType, bool)`

GetOperatorOk returns a tuple with the Operator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperator

`func (o *PriceFilterPrice) SetOperator(v NumericFilterOperatorType)`

SetOperator sets Operator field to given value.


### GetValue

`func (o *PriceFilterPrice) GetValue() float32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *PriceFilterPrice) GetValueOk() (*float32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *PriceFilterPrice) SetValue(v float32)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


