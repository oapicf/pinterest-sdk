# TrendingKeywordsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Trends** | Pointer to [**[]TrendingKeywordsResponseTrendsInner**](TrendingKeywordsResponseTrendsInner.md) | The top trending keywords for the specified trend type in the requested region.&lt;br /&gt; Results are ordered, with the first element in the array representing the #1 top trend. | [optional] 

## Methods

### NewTrendingKeywordsResponse

`func NewTrendingKeywordsResponse() *TrendingKeywordsResponse`

NewTrendingKeywordsResponse instantiates a new TrendingKeywordsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTrendingKeywordsResponseWithDefaults

`func NewTrendingKeywordsResponseWithDefaults() *TrendingKeywordsResponse`

NewTrendingKeywordsResponseWithDefaults instantiates a new TrendingKeywordsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTrends

`func (o *TrendingKeywordsResponse) GetTrends() []TrendingKeywordsResponseTrendsInner`

GetTrends returns the Trends field if non-nil, zero value otherwise.

### GetTrendsOk

`func (o *TrendingKeywordsResponse) GetTrendsOk() (*[]TrendingKeywordsResponseTrendsInner, bool)`

GetTrendsOk returns a tuple with the Trends field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrends

`func (o *TrendingKeywordsResponse) SetTrends(v []TrendingKeywordsResponseTrendsInner)`

SetTrends sets Trends field to given value.

### HasTrends

`func (o *TrendingKeywordsResponse) HasTrends() bool`

HasTrends returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


