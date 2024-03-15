# TrendingKeywordsResponseTrendsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keyword** | Pointer to **string** | The keyword that is trending. | [optional] 
**PctGrowthWow** | Pointer to **int32** | The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth. | [optional] 
**PctGrowthMom** | Pointer to **int32** | The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth. | [optional] 
**PctGrowthYoy** | Pointer to **int32** | The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth. | [optional] 
**TimeSeries** | Pointer to [**TrendingKeywordsResponseTrendsInnerTimeSeries**](TrendingKeywordsResponseTrendsInnerTimeSeries.md) |  | [optional] 

## Methods

### NewTrendingKeywordsResponseTrendsInner

`func NewTrendingKeywordsResponseTrendsInner() *TrendingKeywordsResponseTrendsInner`

NewTrendingKeywordsResponseTrendsInner instantiates a new TrendingKeywordsResponseTrendsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTrendingKeywordsResponseTrendsInnerWithDefaults

`func NewTrendingKeywordsResponseTrendsInnerWithDefaults() *TrendingKeywordsResponseTrendsInner`

NewTrendingKeywordsResponseTrendsInnerWithDefaults instantiates a new TrendingKeywordsResponseTrendsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKeyword

`func (o *TrendingKeywordsResponseTrendsInner) GetKeyword() string`

GetKeyword returns the Keyword field if non-nil, zero value otherwise.

### GetKeywordOk

`func (o *TrendingKeywordsResponseTrendsInner) GetKeywordOk() (*string, bool)`

GetKeywordOk returns a tuple with the Keyword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeyword

`func (o *TrendingKeywordsResponseTrendsInner) SetKeyword(v string)`

SetKeyword sets Keyword field to given value.

### HasKeyword

`func (o *TrendingKeywordsResponseTrendsInner) HasKeyword() bool`

HasKeyword returns a boolean if a field has been set.

### GetPctGrowthWow

`func (o *TrendingKeywordsResponseTrendsInner) GetPctGrowthWow() int32`

GetPctGrowthWow returns the PctGrowthWow field if non-nil, zero value otherwise.

### GetPctGrowthWowOk

`func (o *TrendingKeywordsResponseTrendsInner) GetPctGrowthWowOk() (*int32, bool)`

GetPctGrowthWowOk returns a tuple with the PctGrowthWow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPctGrowthWow

`func (o *TrendingKeywordsResponseTrendsInner) SetPctGrowthWow(v int32)`

SetPctGrowthWow sets PctGrowthWow field to given value.

### HasPctGrowthWow

`func (o *TrendingKeywordsResponseTrendsInner) HasPctGrowthWow() bool`

HasPctGrowthWow returns a boolean if a field has been set.

### GetPctGrowthMom

`func (o *TrendingKeywordsResponseTrendsInner) GetPctGrowthMom() int32`

GetPctGrowthMom returns the PctGrowthMom field if non-nil, zero value otherwise.

### GetPctGrowthMomOk

`func (o *TrendingKeywordsResponseTrendsInner) GetPctGrowthMomOk() (*int32, bool)`

GetPctGrowthMomOk returns a tuple with the PctGrowthMom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPctGrowthMom

`func (o *TrendingKeywordsResponseTrendsInner) SetPctGrowthMom(v int32)`

SetPctGrowthMom sets PctGrowthMom field to given value.

### HasPctGrowthMom

`func (o *TrendingKeywordsResponseTrendsInner) HasPctGrowthMom() bool`

HasPctGrowthMom returns a boolean if a field has been set.

### GetPctGrowthYoy

`func (o *TrendingKeywordsResponseTrendsInner) GetPctGrowthYoy() int32`

GetPctGrowthYoy returns the PctGrowthYoy field if non-nil, zero value otherwise.

### GetPctGrowthYoyOk

`func (o *TrendingKeywordsResponseTrendsInner) GetPctGrowthYoyOk() (*int32, bool)`

GetPctGrowthYoyOk returns a tuple with the PctGrowthYoy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPctGrowthYoy

`func (o *TrendingKeywordsResponseTrendsInner) SetPctGrowthYoy(v int32)`

SetPctGrowthYoy sets PctGrowthYoy field to given value.

### HasPctGrowthYoy

`func (o *TrendingKeywordsResponseTrendsInner) HasPctGrowthYoy() bool`

HasPctGrowthYoy returns a boolean if a field has been set.

### GetTimeSeries

`func (o *TrendingKeywordsResponseTrendsInner) GetTimeSeries() TrendingKeywordsResponseTrendsInnerTimeSeries`

GetTimeSeries returns the TimeSeries field if non-nil, zero value otherwise.

### GetTimeSeriesOk

`func (o *TrendingKeywordsResponseTrendsInner) GetTimeSeriesOk() (*TrendingKeywordsResponseTrendsInnerTimeSeries, bool)`

GetTimeSeriesOk returns a tuple with the TimeSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeSeries

`func (o *TrendingKeywordsResponseTrendsInner) SetTimeSeries(v TrendingKeywordsResponseTrendsInnerTimeSeries)`

SetTimeSeries sets TimeSeries field to given value.

### HasTimeSeries

`func (o *TrendingKeywordsResponseTrendsInner) HasTimeSeries() bool`

HasTimeSeries returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


