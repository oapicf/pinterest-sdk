# AdsCreditDiscountsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Active** | Pointer to **bool** | True if the offer code is currently active. | [optional] 
**AdvertiserId** | Pointer to **string** | Advertiser ID the offer was applied to. | [optional] 
**DiscountType** | Pointer to **NullableString** | The type of discount of this credit | [optional] 
**DiscountInMicroCurrency** | Pointer to **NullableFloat32** | The discount applied in the offer’s currency value. | [optional] 
**DiscountCurrency** | Pointer to **NullableString** | Currency value for the discount. | [optional] 
**Title** | Pointer to **NullableString** | Human readable title of the offer code. | [optional] 
**RemainingDiscountInMicroCurrency** | Pointer to **NullableFloat32** | The credits left to spend. | [optional] 

## Methods

### NewAdsCreditDiscountsResponse

`func NewAdsCreditDiscountsResponse() *AdsCreditDiscountsResponse`

NewAdsCreditDiscountsResponse instantiates a new AdsCreditDiscountsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdsCreditDiscountsResponseWithDefaults

`func NewAdsCreditDiscountsResponseWithDefaults() *AdsCreditDiscountsResponse`

NewAdsCreditDiscountsResponseWithDefaults instantiates a new AdsCreditDiscountsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActive

`func (o *AdsCreditDiscountsResponse) GetActive() bool`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *AdsCreditDiscountsResponse) GetActiveOk() (*bool, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *AdsCreditDiscountsResponse) SetActive(v bool)`

SetActive sets Active field to given value.

### HasActive

`func (o *AdsCreditDiscountsResponse) HasActive() bool`

HasActive returns a boolean if a field has been set.

### GetAdvertiserId

`func (o *AdsCreditDiscountsResponse) GetAdvertiserId() string`

GetAdvertiserId returns the AdvertiserId field if non-nil, zero value otherwise.

### GetAdvertiserIdOk

`func (o *AdsCreditDiscountsResponse) GetAdvertiserIdOk() (*string, bool)`

GetAdvertiserIdOk returns a tuple with the AdvertiserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvertiserId

`func (o *AdsCreditDiscountsResponse) SetAdvertiserId(v string)`

SetAdvertiserId sets AdvertiserId field to given value.

### HasAdvertiserId

`func (o *AdsCreditDiscountsResponse) HasAdvertiserId() bool`

HasAdvertiserId returns a boolean if a field has been set.

### GetDiscountType

`func (o *AdsCreditDiscountsResponse) GetDiscountType() string`

GetDiscountType returns the DiscountType field if non-nil, zero value otherwise.

### GetDiscountTypeOk

`func (o *AdsCreditDiscountsResponse) GetDiscountTypeOk() (*string, bool)`

GetDiscountTypeOk returns a tuple with the DiscountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountType

`func (o *AdsCreditDiscountsResponse) SetDiscountType(v string)`

SetDiscountType sets DiscountType field to given value.

### HasDiscountType

`func (o *AdsCreditDiscountsResponse) HasDiscountType() bool`

HasDiscountType returns a boolean if a field has been set.

### SetDiscountTypeNil

`func (o *AdsCreditDiscountsResponse) SetDiscountTypeNil(b bool)`

 SetDiscountTypeNil sets the value for DiscountType to be an explicit nil

### UnsetDiscountType
`func (o *AdsCreditDiscountsResponse) UnsetDiscountType()`

UnsetDiscountType ensures that no value is present for DiscountType, not even an explicit nil
### GetDiscountInMicroCurrency

`func (o *AdsCreditDiscountsResponse) GetDiscountInMicroCurrency() float32`

GetDiscountInMicroCurrency returns the DiscountInMicroCurrency field if non-nil, zero value otherwise.

### GetDiscountInMicroCurrencyOk

`func (o *AdsCreditDiscountsResponse) GetDiscountInMicroCurrencyOk() (*float32, bool)`

GetDiscountInMicroCurrencyOk returns a tuple with the DiscountInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountInMicroCurrency

`func (o *AdsCreditDiscountsResponse) SetDiscountInMicroCurrency(v float32)`

SetDiscountInMicroCurrency sets DiscountInMicroCurrency field to given value.

### HasDiscountInMicroCurrency

`func (o *AdsCreditDiscountsResponse) HasDiscountInMicroCurrency() bool`

HasDiscountInMicroCurrency returns a boolean if a field has been set.

### SetDiscountInMicroCurrencyNil

`func (o *AdsCreditDiscountsResponse) SetDiscountInMicroCurrencyNil(b bool)`

 SetDiscountInMicroCurrencyNil sets the value for DiscountInMicroCurrency to be an explicit nil

### UnsetDiscountInMicroCurrency
`func (o *AdsCreditDiscountsResponse) UnsetDiscountInMicroCurrency()`

UnsetDiscountInMicroCurrency ensures that no value is present for DiscountInMicroCurrency, not even an explicit nil
### GetDiscountCurrency

`func (o *AdsCreditDiscountsResponse) GetDiscountCurrency() string`

GetDiscountCurrency returns the DiscountCurrency field if non-nil, zero value otherwise.

### GetDiscountCurrencyOk

`func (o *AdsCreditDiscountsResponse) GetDiscountCurrencyOk() (*string, bool)`

GetDiscountCurrencyOk returns a tuple with the DiscountCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountCurrency

`func (o *AdsCreditDiscountsResponse) SetDiscountCurrency(v string)`

SetDiscountCurrency sets DiscountCurrency field to given value.

### HasDiscountCurrency

`func (o *AdsCreditDiscountsResponse) HasDiscountCurrency() bool`

HasDiscountCurrency returns a boolean if a field has been set.

### SetDiscountCurrencyNil

`func (o *AdsCreditDiscountsResponse) SetDiscountCurrencyNil(b bool)`

 SetDiscountCurrencyNil sets the value for DiscountCurrency to be an explicit nil

### UnsetDiscountCurrency
`func (o *AdsCreditDiscountsResponse) UnsetDiscountCurrency()`

UnsetDiscountCurrency ensures that no value is present for DiscountCurrency, not even an explicit nil
### GetTitle

`func (o *AdsCreditDiscountsResponse) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *AdsCreditDiscountsResponse) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *AdsCreditDiscountsResponse) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *AdsCreditDiscountsResponse) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### SetTitleNil

`func (o *AdsCreditDiscountsResponse) SetTitleNil(b bool)`

 SetTitleNil sets the value for Title to be an explicit nil

### UnsetTitle
`func (o *AdsCreditDiscountsResponse) UnsetTitle()`

UnsetTitle ensures that no value is present for Title, not even an explicit nil
### GetRemainingDiscountInMicroCurrency

`func (o *AdsCreditDiscountsResponse) GetRemainingDiscountInMicroCurrency() float32`

GetRemainingDiscountInMicroCurrency returns the RemainingDiscountInMicroCurrency field if non-nil, zero value otherwise.

### GetRemainingDiscountInMicroCurrencyOk

`func (o *AdsCreditDiscountsResponse) GetRemainingDiscountInMicroCurrencyOk() (*float32, bool)`

GetRemainingDiscountInMicroCurrencyOk returns a tuple with the RemainingDiscountInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRemainingDiscountInMicroCurrency

`func (o *AdsCreditDiscountsResponse) SetRemainingDiscountInMicroCurrency(v float32)`

SetRemainingDiscountInMicroCurrency sets RemainingDiscountInMicroCurrency field to given value.

### HasRemainingDiscountInMicroCurrency

`func (o *AdsCreditDiscountsResponse) HasRemainingDiscountInMicroCurrency() bool`

HasRemainingDiscountInMicroCurrency returns a boolean if a field has been set.

### SetRemainingDiscountInMicroCurrencyNil

`func (o *AdsCreditDiscountsResponse) SetRemainingDiscountInMicroCurrencyNil(b bool)`

 SetRemainingDiscountInMicroCurrencyNil sets the value for RemainingDiscountInMicroCurrency to be an explicit nil

### UnsetRemainingDiscountInMicroCurrency
`func (o *AdsCreditDiscountsResponse) UnsetRemainingDiscountInMicroCurrency()`

UnsetRemainingDiscountInMicroCurrency ensures that no value is present for RemainingDiscountInMicroCurrency, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


