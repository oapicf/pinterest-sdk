# AdvancedAuctionBidOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidInMicroCurrency** | Pointer to **NullableInt64** | Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;. | [optional] 
**AppTypeMultipliers** | Pointer to [**NullableAppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] 
**PlacementMultipliers** | Pointer to [**NullablePlacementMultipliers**](PlacementMultipliers.md) |  | [optional] 

## Methods

### NewAdvancedAuctionBidOptions

`func NewAdvancedAuctionBidOptions() *AdvancedAuctionBidOptions`

NewAdvancedAuctionBidOptions instantiates a new AdvancedAuctionBidOptions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdvancedAuctionBidOptionsWithDefaults

`func NewAdvancedAuctionBidOptionsWithDefaults() *AdvancedAuctionBidOptions`

NewAdvancedAuctionBidOptionsWithDefaults instantiates a new AdvancedAuctionBidOptions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBidInMicroCurrency

`func (o *AdvancedAuctionBidOptions) GetBidInMicroCurrency() int64`

GetBidInMicroCurrency returns the BidInMicroCurrency field if non-nil, zero value otherwise.

### GetBidInMicroCurrencyOk

`func (o *AdvancedAuctionBidOptions) GetBidInMicroCurrencyOk() (*int64, bool)`

GetBidInMicroCurrencyOk returns a tuple with the BidInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidInMicroCurrency

`func (o *AdvancedAuctionBidOptions) SetBidInMicroCurrency(v int64)`

SetBidInMicroCurrency sets BidInMicroCurrency field to given value.

### HasBidInMicroCurrency

`func (o *AdvancedAuctionBidOptions) HasBidInMicroCurrency() bool`

HasBidInMicroCurrency returns a boolean if a field has been set.

### SetBidInMicroCurrencyNil

`func (o *AdvancedAuctionBidOptions) SetBidInMicroCurrencyNil(b bool)`

 SetBidInMicroCurrencyNil sets the value for BidInMicroCurrency to be an explicit nil

### UnsetBidInMicroCurrency
`func (o *AdvancedAuctionBidOptions) UnsetBidInMicroCurrency()`

UnsetBidInMicroCurrency ensures that no value is present for BidInMicroCurrency, not even an explicit nil
### GetAppTypeMultipliers

`func (o *AdvancedAuctionBidOptions) GetAppTypeMultipliers() AppTypeMultipliers`

GetAppTypeMultipliers returns the AppTypeMultipliers field if non-nil, zero value otherwise.

### GetAppTypeMultipliersOk

`func (o *AdvancedAuctionBidOptions) GetAppTypeMultipliersOk() (*AppTypeMultipliers, bool)`

GetAppTypeMultipliersOk returns a tuple with the AppTypeMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppTypeMultipliers

`func (o *AdvancedAuctionBidOptions) SetAppTypeMultipliers(v AppTypeMultipliers)`

SetAppTypeMultipliers sets AppTypeMultipliers field to given value.

### HasAppTypeMultipliers

`func (o *AdvancedAuctionBidOptions) HasAppTypeMultipliers() bool`

HasAppTypeMultipliers returns a boolean if a field has been set.

### SetAppTypeMultipliersNil

`func (o *AdvancedAuctionBidOptions) SetAppTypeMultipliersNil(b bool)`

 SetAppTypeMultipliersNil sets the value for AppTypeMultipliers to be an explicit nil

### UnsetAppTypeMultipliers
`func (o *AdvancedAuctionBidOptions) UnsetAppTypeMultipliers()`

UnsetAppTypeMultipliers ensures that no value is present for AppTypeMultipliers, not even an explicit nil
### GetPlacementMultipliers

`func (o *AdvancedAuctionBidOptions) GetPlacementMultipliers() PlacementMultipliers`

GetPlacementMultipliers returns the PlacementMultipliers field if non-nil, zero value otherwise.

### GetPlacementMultipliersOk

`func (o *AdvancedAuctionBidOptions) GetPlacementMultipliersOk() (*PlacementMultipliers, bool)`

GetPlacementMultipliersOk returns a tuple with the PlacementMultipliers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementMultipliers

`func (o *AdvancedAuctionBidOptions) SetPlacementMultipliers(v PlacementMultipliers)`

SetPlacementMultipliers sets PlacementMultipliers field to given value.

### HasPlacementMultipliers

`func (o *AdvancedAuctionBidOptions) HasPlacementMultipliers() bool`

HasPlacementMultipliers returns a boolean if a field has been set.

### SetPlacementMultipliersNil

`func (o *AdvancedAuctionBidOptions) SetPlacementMultipliersNil(b bool)`

 SetPlacementMultipliersNil sets the value for PlacementMultipliers to be an explicit nil

### UnsetPlacementMultipliers
`func (o *AdvancedAuctionBidOptions) UnsetPlacementMultipliers()`

UnsetPlacementMultipliers ensures that no value is present for PlacementMultipliers, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


