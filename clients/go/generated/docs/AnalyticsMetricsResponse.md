# AnalyticsMetricsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DailyMetrics** | Pointer to [**[]AnalyticsMetricsResponseDailyMetrics**](AnalyticsMetricsResponseDailyMetrics.md) | Array with the requested daily metric records | [optional] 
**SummaryMetrics** | Pointer to **map[string]float32** | The metric name and value over the requested period for each requested metric | [optional] 

## Methods

### NewAnalyticsMetricsResponse

`func NewAnalyticsMetricsResponse() *AnalyticsMetricsResponse`

NewAnalyticsMetricsResponse instantiates a new AnalyticsMetricsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAnalyticsMetricsResponseWithDefaults

`func NewAnalyticsMetricsResponseWithDefaults() *AnalyticsMetricsResponse`

NewAnalyticsMetricsResponseWithDefaults instantiates a new AnalyticsMetricsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDailyMetrics

`func (o *AnalyticsMetricsResponse) GetDailyMetrics() []AnalyticsMetricsResponseDailyMetrics`

GetDailyMetrics returns the DailyMetrics field if non-nil, zero value otherwise.

### GetDailyMetricsOk

`func (o *AnalyticsMetricsResponse) GetDailyMetricsOk() (*[]AnalyticsMetricsResponseDailyMetrics, bool)`

GetDailyMetricsOk returns a tuple with the DailyMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailyMetrics

`func (o *AnalyticsMetricsResponse) SetDailyMetrics(v []AnalyticsMetricsResponseDailyMetrics)`

SetDailyMetrics sets DailyMetrics field to given value.

### HasDailyMetrics

`func (o *AnalyticsMetricsResponse) HasDailyMetrics() bool`

HasDailyMetrics returns a boolean if a field has been set.

### GetSummaryMetrics

`func (o *AnalyticsMetricsResponse) GetSummaryMetrics() map[string]float32`

GetSummaryMetrics returns the SummaryMetrics field if non-nil, zero value otherwise.

### GetSummaryMetricsOk

`func (o *AnalyticsMetricsResponse) GetSummaryMetricsOk() (*map[string]float32, bool)`

GetSummaryMetricsOk returns a tuple with the SummaryMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryMetrics

`func (o *AnalyticsMetricsResponse) SetSummaryMetrics(v map[string]float32)`

SetSummaryMetrics sets SummaryMetrics field to given value.

### HasSummaryMetrics

`func (o *AnalyticsMetricsResponse) HasSummaryMetrics() bool`

HasSummaryMetrics returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


