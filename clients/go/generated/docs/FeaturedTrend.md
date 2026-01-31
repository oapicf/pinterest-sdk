# FeaturedTrend

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Interest** | [**InterestsEnum**](InterestsEnum.md) | The main interest category | 
**Market** | Pointer to [**ProductCategoryRegion**](ProductCategoryRegion.md) | Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.) | [optional] 
**Trends** | Pointer to [**[]TrendingTopic**](TrendingTopic.md) | List of trending topics within this interest category | [optional] 

## Methods

### NewFeaturedTrend

`func NewFeaturedTrend(interest InterestsEnum, ) *FeaturedTrend`

NewFeaturedTrend instantiates a new FeaturedTrend object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeaturedTrendWithDefaults

`func NewFeaturedTrendWithDefaults() *FeaturedTrend`

NewFeaturedTrendWithDefaults instantiates a new FeaturedTrend object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInterest

`func (o *FeaturedTrend) GetInterest() InterestsEnum`

GetInterest returns the Interest field if non-nil, zero value otherwise.

### GetInterestOk

`func (o *FeaturedTrend) GetInterestOk() (*InterestsEnum, bool)`

GetInterestOk returns a tuple with the Interest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterest

`func (o *FeaturedTrend) SetInterest(v InterestsEnum)`

SetInterest sets Interest field to given value.


### GetMarket

`func (o *FeaturedTrend) GetMarket() ProductCategoryRegion`

GetMarket returns the Market field if non-nil, zero value otherwise.

### GetMarketOk

`func (o *FeaturedTrend) GetMarketOk() (*ProductCategoryRegion, bool)`

GetMarketOk returns a tuple with the Market field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMarket

`func (o *FeaturedTrend) SetMarket(v ProductCategoryRegion)`

SetMarket sets Market field to given value.

### HasMarket

`func (o *FeaturedTrend) HasMarket() bool`

HasMarket returns a boolean if a field has been set.

### GetTrends

`func (o *FeaturedTrend) GetTrends() []TrendingTopic`

GetTrends returns the Trends field if non-nil, zero value otherwise.

### GetTrendsOk

`func (o *FeaturedTrend) GetTrendsOk() (*[]TrendingTopic, bool)`

GetTrendsOk returns a tuple with the Trends field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrends

`func (o *FeaturedTrend) SetTrends(v []TrendingTopic)`

SetTrends sets Trends field to given value.

### HasTrends

`func (o *FeaturedTrend) HasTrends() bool`

HasTrends returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


