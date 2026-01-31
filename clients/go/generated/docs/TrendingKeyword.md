# TrendingKeyword

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Demographics** | Pointer to [**NullableTrendingKeywordDemographics**](TrendingKeywordDemographics.md) |  | [optional] 
**HasPrediction** | Pointer to **bool** | Indicates whether the keyword has a prediction available for the next 90 days.&lt;br /&gt; This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. &lt;br /&gt; By default, the value is &#x60;false&#x60; and no prediction data is included in the response. | [optional] 
**Keyword** | Pointer to **string** | The keyword that is trending. | [optional] 
**PctGrowthMom** | Pointer to **int32** | The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth. | [optional] 
**PctGrowthWow** | Pointer to **int32** | The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth. | [optional] 
**PctGrowthYoy** | Pointer to **int32** | The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth. | [optional] 
**PredictedTimeSeries** | Pointer to [**PredictedTimeSeries**](PredictedTimeSeries.md) |  | [optional] 
**TimeSeries** | Pointer to [**TimeSeries**](TimeSeries.md) |  | [optional] 

## Methods

### NewTrendingKeyword

`func NewTrendingKeyword() *TrendingKeyword`

NewTrendingKeyword instantiates a new TrendingKeyword object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTrendingKeywordWithDefaults

`func NewTrendingKeywordWithDefaults() *TrendingKeyword`

NewTrendingKeywordWithDefaults instantiates a new TrendingKeyword object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDemographics

`func (o *TrendingKeyword) GetDemographics() TrendingKeywordDemographics`

GetDemographics returns the Demographics field if non-nil, zero value otherwise.

### GetDemographicsOk

`func (o *TrendingKeyword) GetDemographicsOk() (*TrendingKeywordDemographics, bool)`

GetDemographicsOk returns a tuple with the Demographics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDemographics

`func (o *TrendingKeyword) SetDemographics(v TrendingKeywordDemographics)`

SetDemographics sets Demographics field to given value.

### HasDemographics

`func (o *TrendingKeyword) HasDemographics() bool`

HasDemographics returns a boolean if a field has been set.

### SetDemographicsNil

`func (o *TrendingKeyword) SetDemographicsNil(b bool)`

 SetDemographicsNil sets the value for Demographics to be an explicit nil

### UnsetDemographics
`func (o *TrendingKeyword) UnsetDemographics()`

UnsetDemographics ensures that no value is present for Demographics, not even an explicit nil
### GetHasPrediction

`func (o *TrendingKeyword) GetHasPrediction() bool`

GetHasPrediction returns the HasPrediction field if non-nil, zero value otherwise.

### GetHasPredictionOk

`func (o *TrendingKeyword) GetHasPredictionOk() (*bool, bool)`

GetHasPredictionOk returns a tuple with the HasPrediction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasPrediction

`func (o *TrendingKeyword) SetHasPrediction(v bool)`

SetHasPrediction sets HasPrediction field to given value.

### HasHasPrediction

`func (o *TrendingKeyword) HasHasPrediction() bool`

HasHasPrediction returns a boolean if a field has been set.

### GetKeyword

`func (o *TrendingKeyword) GetKeyword() string`

GetKeyword returns the Keyword field if non-nil, zero value otherwise.

### GetKeywordOk

`func (o *TrendingKeyword) GetKeywordOk() (*string, bool)`

GetKeywordOk returns a tuple with the Keyword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeyword

`func (o *TrendingKeyword) SetKeyword(v string)`

SetKeyword sets Keyword field to given value.

### HasKeyword

`func (o *TrendingKeyword) HasKeyword() bool`

HasKeyword returns a boolean if a field has been set.

### GetPctGrowthMom

`func (o *TrendingKeyword) GetPctGrowthMom() int32`

GetPctGrowthMom returns the PctGrowthMom field if non-nil, zero value otherwise.

### GetPctGrowthMomOk

`func (o *TrendingKeyword) GetPctGrowthMomOk() (*int32, bool)`

GetPctGrowthMomOk returns a tuple with the PctGrowthMom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPctGrowthMom

`func (o *TrendingKeyword) SetPctGrowthMom(v int32)`

SetPctGrowthMom sets PctGrowthMom field to given value.

### HasPctGrowthMom

`func (o *TrendingKeyword) HasPctGrowthMom() bool`

HasPctGrowthMom returns a boolean if a field has been set.

### GetPctGrowthWow

`func (o *TrendingKeyword) GetPctGrowthWow() int32`

GetPctGrowthWow returns the PctGrowthWow field if non-nil, zero value otherwise.

### GetPctGrowthWowOk

`func (o *TrendingKeyword) GetPctGrowthWowOk() (*int32, bool)`

GetPctGrowthWowOk returns a tuple with the PctGrowthWow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPctGrowthWow

`func (o *TrendingKeyword) SetPctGrowthWow(v int32)`

SetPctGrowthWow sets PctGrowthWow field to given value.

### HasPctGrowthWow

`func (o *TrendingKeyword) HasPctGrowthWow() bool`

HasPctGrowthWow returns a boolean if a field has been set.

### GetPctGrowthYoy

`func (o *TrendingKeyword) GetPctGrowthYoy() int32`

GetPctGrowthYoy returns the PctGrowthYoy field if non-nil, zero value otherwise.

### GetPctGrowthYoyOk

`func (o *TrendingKeyword) GetPctGrowthYoyOk() (*int32, bool)`

GetPctGrowthYoyOk returns a tuple with the PctGrowthYoy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPctGrowthYoy

`func (o *TrendingKeyword) SetPctGrowthYoy(v int32)`

SetPctGrowthYoy sets PctGrowthYoy field to given value.

### HasPctGrowthYoy

`func (o *TrendingKeyword) HasPctGrowthYoy() bool`

HasPctGrowthYoy returns a boolean if a field has been set.

### GetPredictedTimeSeries

`func (o *TrendingKeyword) GetPredictedTimeSeries() PredictedTimeSeries`

GetPredictedTimeSeries returns the PredictedTimeSeries field if non-nil, zero value otherwise.

### GetPredictedTimeSeriesOk

`func (o *TrendingKeyword) GetPredictedTimeSeriesOk() (*PredictedTimeSeries, bool)`

GetPredictedTimeSeriesOk returns a tuple with the PredictedTimeSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPredictedTimeSeries

`func (o *TrendingKeyword) SetPredictedTimeSeries(v PredictedTimeSeries)`

SetPredictedTimeSeries sets PredictedTimeSeries field to given value.

### HasPredictedTimeSeries

`func (o *TrendingKeyword) HasPredictedTimeSeries() bool`

HasPredictedTimeSeries returns a boolean if a field has been set.

### GetTimeSeries

`func (o *TrendingKeyword) GetTimeSeries() TimeSeries`

GetTimeSeries returns the TimeSeries field if non-nil, zero value otherwise.

### GetTimeSeriesOk

`func (o *TrendingKeyword) GetTimeSeriesOk() (*TimeSeries, bool)`

GetTimeSeriesOk returns a tuple with the TimeSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeSeries

`func (o *TrendingKeyword) SetTimeSeries(v TimeSeries)`

SetTimeSeries sets TimeSeries field to given value.

### HasTimeSeries

`func (o *TrendingKeyword) HasTimeSeries() bool`

HasTimeSeries returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


