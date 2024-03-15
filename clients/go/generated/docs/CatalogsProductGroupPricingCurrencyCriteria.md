# CatalogsProductGroupPricingCurrencyCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operator** | **string** |  | 
**Value** | **float32** |  | 
**Currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**Negated** | Pointer to **bool** |  | [optional] [default to false]

## Methods

### NewCatalogsProductGroupPricingCurrencyCriteria

`func NewCatalogsProductGroupPricingCurrencyCriteria(operator string, value float32, currency NonNullableCatalogsCurrency, ) *CatalogsProductGroupPricingCurrencyCriteria`

NewCatalogsProductGroupPricingCurrencyCriteria instantiates a new CatalogsProductGroupPricingCurrencyCriteria object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupPricingCurrencyCriteriaWithDefaults

`func NewCatalogsProductGroupPricingCurrencyCriteriaWithDefaults() *CatalogsProductGroupPricingCurrencyCriteria`

NewCatalogsProductGroupPricingCurrencyCriteriaWithDefaults instantiates a new CatalogsProductGroupPricingCurrencyCriteria object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperator

`func (o *CatalogsProductGroupPricingCurrencyCriteria) GetOperator() string`

GetOperator returns the Operator field if non-nil, zero value otherwise.

### GetOperatorOk

`func (o *CatalogsProductGroupPricingCurrencyCriteria) GetOperatorOk() (*string, bool)`

GetOperatorOk returns a tuple with the Operator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperator

`func (o *CatalogsProductGroupPricingCurrencyCriteria) SetOperator(v string)`

SetOperator sets Operator field to given value.


### GetValue

`func (o *CatalogsProductGroupPricingCurrencyCriteria) GetValue() float32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CatalogsProductGroupPricingCurrencyCriteria) GetValueOk() (*float32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CatalogsProductGroupPricingCurrencyCriteria) SetValue(v float32)`

SetValue sets Value field to given value.


### GetCurrency

`func (o *CatalogsProductGroupPricingCurrencyCriteria) GetCurrency() NonNullableCatalogsCurrency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *CatalogsProductGroupPricingCurrencyCriteria) GetCurrencyOk() (*NonNullableCatalogsCurrency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *CatalogsProductGroupPricingCurrencyCriteria) SetCurrency(v NonNullableCatalogsCurrency)`

SetCurrency sets Currency field to given value.


### GetNegated

`func (o *CatalogsProductGroupPricingCurrencyCriteria) GetNegated() bool`

GetNegated returns the Negated field if non-nil, zero value otherwise.

### GetNegatedOk

`func (o *CatalogsProductGroupPricingCurrencyCriteria) GetNegatedOk() (*bool, bool)`

GetNegatedOk returns a tuple with the Negated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNegated

`func (o *CatalogsProductGroupPricingCurrencyCriteria) SetNegated(v bool)`

SetNegated sets Negated field to given value.

### HasNegated

`func (o *CatalogsProductGroupPricingCurrencyCriteria) HasNegated() bool`

HasNegated returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


