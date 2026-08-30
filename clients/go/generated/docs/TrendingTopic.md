# TrendingTopic

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **string** | Description of the trending topic | 
**Id** | **string** | Unique identifier for the trending topic | 
**PercentGrowthMom** | Pointer to **int32** | Month-over-month growth percentage | [optional] 
**Pins** | [**[]TrendingPin**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | 
**RelatedInterests** | **[]string** | List of related interest categories | 
**RelatedSearches** | **[]string** | List of related search terms | 
**TimeSeries** | **map[string]float32** | Time series data showing trend values over time, with dates as keys and values as numeric | 
**Title** | **string** | Title of the trending topic | 

## Methods

### NewTrendingTopic

`func NewTrendingTopic(description string, id string, pins []TrendingPin, relatedInterests []string, relatedSearches []string, timeSeries map[string]float32, title string, ) *TrendingTopic`

NewTrendingTopic instantiates a new TrendingTopic object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTrendingTopicWithDefaults

`func NewTrendingTopicWithDefaults() *TrendingTopic`

NewTrendingTopicWithDefaults instantiates a new TrendingTopic object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *TrendingTopic) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *TrendingTopic) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *TrendingTopic) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetId

`func (o *TrendingTopic) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TrendingTopic) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TrendingTopic) SetId(v string)`

SetId sets Id field to given value.


### GetPercentGrowthMom

`func (o *TrendingTopic) GetPercentGrowthMom() int32`

GetPercentGrowthMom returns the PercentGrowthMom field if non-nil, zero value otherwise.

### GetPercentGrowthMomOk

`func (o *TrendingTopic) GetPercentGrowthMomOk() (*int32, bool)`

GetPercentGrowthMomOk returns a tuple with the PercentGrowthMom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercentGrowthMom

`func (o *TrendingTopic) SetPercentGrowthMom(v int32)`

SetPercentGrowthMom sets PercentGrowthMom field to given value.

### HasPercentGrowthMom

`func (o *TrendingTopic) HasPercentGrowthMom() bool`

HasPercentGrowthMom returns a boolean if a field has been set.

### GetPins

`func (o *TrendingTopic) GetPins() []TrendingPin`

GetPins returns the Pins field if non-nil, zero value otherwise.

### GetPinsOk

`func (o *TrendingTopic) GetPinsOk() (*[]TrendingPin, bool)`

GetPinsOk returns a tuple with the Pins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPins

`func (o *TrendingTopic) SetPins(v []TrendingPin)`

SetPins sets Pins field to given value.


### GetRelatedInterests

`func (o *TrendingTopic) GetRelatedInterests() []string`

GetRelatedInterests returns the RelatedInterests field if non-nil, zero value otherwise.

### GetRelatedInterestsOk

`func (o *TrendingTopic) GetRelatedInterestsOk() (*[]string, bool)`

GetRelatedInterestsOk returns a tuple with the RelatedInterests field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedInterests

`func (o *TrendingTopic) SetRelatedInterests(v []string)`

SetRelatedInterests sets RelatedInterests field to given value.


### GetRelatedSearches

`func (o *TrendingTopic) GetRelatedSearches() []string`

GetRelatedSearches returns the RelatedSearches field if non-nil, zero value otherwise.

### GetRelatedSearchesOk

`func (o *TrendingTopic) GetRelatedSearchesOk() (*[]string, bool)`

GetRelatedSearchesOk returns a tuple with the RelatedSearches field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelatedSearches

`func (o *TrendingTopic) SetRelatedSearches(v []string)`

SetRelatedSearches sets RelatedSearches field to given value.


### GetTimeSeries

`func (o *TrendingTopic) GetTimeSeries() map[string]float32`

GetTimeSeries returns the TimeSeries field if non-nil, zero value otherwise.

### GetTimeSeriesOk

`func (o *TrendingTopic) GetTimeSeriesOk() (*map[string]float32, bool)`

GetTimeSeriesOk returns a tuple with the TimeSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeSeries

`func (o *TrendingTopic) SetTimeSeries(v map[string]float32)`

SetTimeSeries sets TimeSeries field to given value.


### GetTitle

`func (o *TrendingTopic) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *TrendingTopic) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *TrendingTopic) SetTitle(v string)`

SetTitle sets Title field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


