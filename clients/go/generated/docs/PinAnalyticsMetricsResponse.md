# PinAnalyticsMetricsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LifetimeMetrics** | Pointer to **map[string]int32** | The lifetime metric name and value. | [optional] 
**DailyMetrics** | Pointer to [**[]PinAnalyticsMetricsResponseDailyMetricsInner**](PinAnalyticsMetricsResponseDailyMetricsInner.md) | Array with the requested daily metric records | [optional] 
**SummaryMetrics** | Pointer to **map[string]float32** | The metric name and value over the requested period for each requested metric | [optional] 

## Methods

### NewPinAnalyticsMetricsResponse

`func NewPinAnalyticsMetricsResponse() *PinAnalyticsMetricsResponse`

NewPinAnalyticsMetricsResponse instantiates a new PinAnalyticsMetricsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinAnalyticsMetricsResponseWithDefaults

`func NewPinAnalyticsMetricsResponseWithDefaults() *PinAnalyticsMetricsResponse`

NewPinAnalyticsMetricsResponseWithDefaults instantiates a new PinAnalyticsMetricsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLifetimeMetrics

`func (o *PinAnalyticsMetricsResponse) GetLifetimeMetrics() map[string]int32`

GetLifetimeMetrics returns the LifetimeMetrics field if non-nil, zero value otherwise.

### GetLifetimeMetricsOk

`func (o *PinAnalyticsMetricsResponse) GetLifetimeMetricsOk() (*map[string]int32, bool)`

GetLifetimeMetricsOk returns a tuple with the LifetimeMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeMetrics

`func (o *PinAnalyticsMetricsResponse) SetLifetimeMetrics(v map[string]int32)`

SetLifetimeMetrics sets LifetimeMetrics field to given value.

### HasLifetimeMetrics

`func (o *PinAnalyticsMetricsResponse) HasLifetimeMetrics() bool`

HasLifetimeMetrics returns a boolean if a field has been set.

### GetDailyMetrics

`func (o *PinAnalyticsMetricsResponse) GetDailyMetrics() []PinAnalyticsMetricsResponseDailyMetricsInner`

GetDailyMetrics returns the DailyMetrics field if non-nil, zero value otherwise.

### GetDailyMetricsOk

`func (o *PinAnalyticsMetricsResponse) GetDailyMetricsOk() (*[]PinAnalyticsMetricsResponseDailyMetricsInner, bool)`

GetDailyMetricsOk returns a tuple with the DailyMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailyMetrics

`func (o *PinAnalyticsMetricsResponse) SetDailyMetrics(v []PinAnalyticsMetricsResponseDailyMetricsInner)`

SetDailyMetrics sets DailyMetrics field to given value.

### HasDailyMetrics

`func (o *PinAnalyticsMetricsResponse) HasDailyMetrics() bool`

HasDailyMetrics returns a boolean if a field has been set.

### GetSummaryMetrics

`func (o *PinAnalyticsMetricsResponse) GetSummaryMetrics() map[string]float32`

GetSummaryMetrics returns the SummaryMetrics field if non-nil, zero value otherwise.

### GetSummaryMetricsOk

`func (o *PinAnalyticsMetricsResponse) GetSummaryMetricsOk() (*map[string]float32, bool)`

GetSummaryMetricsOk returns a tuple with the SummaryMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryMetrics

`func (o *PinAnalyticsMetricsResponse) SetSummaryMetrics(v map[string]float32)`

SetSummaryMetrics sets SummaryMetrics field to given value.

### HasSummaryMetrics

`func (o *PinAnalyticsMetricsResponse) HasSummaryMetrics() bool`

HasSummaryMetrics returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


