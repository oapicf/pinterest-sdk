# AnalyticsDailyMetrics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataStatus** | Pointer to [**DataStatus**](DataStatus.md) |  | [optional] 
**Date** | Pointer to **string** | Metrics date (UTC): YYYY-MM-DD. | [optional] 
**Metrics** | Pointer to **map[string]float32** | The metric name and daily value for each requested metric | [optional] 

## Methods

### NewAnalyticsDailyMetrics

`func NewAnalyticsDailyMetrics() *AnalyticsDailyMetrics`

NewAnalyticsDailyMetrics instantiates a new AnalyticsDailyMetrics object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAnalyticsDailyMetricsWithDefaults

`func NewAnalyticsDailyMetricsWithDefaults() *AnalyticsDailyMetrics`

NewAnalyticsDailyMetricsWithDefaults instantiates a new AnalyticsDailyMetrics object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDataStatus

`func (o *AnalyticsDailyMetrics) GetDataStatus() DataStatus`

GetDataStatus returns the DataStatus field if non-nil, zero value otherwise.

### GetDataStatusOk

`func (o *AnalyticsDailyMetrics) GetDataStatusOk() (*DataStatus, bool)`

GetDataStatusOk returns a tuple with the DataStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataStatus

`func (o *AnalyticsDailyMetrics) SetDataStatus(v DataStatus)`

SetDataStatus sets DataStatus field to given value.

### HasDataStatus

`func (o *AnalyticsDailyMetrics) HasDataStatus() bool`

HasDataStatus returns a boolean if a field has been set.

### GetDate

`func (o *AnalyticsDailyMetrics) GetDate() string`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *AnalyticsDailyMetrics) GetDateOk() (*string, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *AnalyticsDailyMetrics) SetDate(v string)`

SetDate sets Date field to given value.

### HasDate

`func (o *AnalyticsDailyMetrics) HasDate() bool`

HasDate returns a boolean if a field has been set.

### GetMetrics

`func (o *AnalyticsDailyMetrics) GetMetrics() map[string]float32`

GetMetrics returns the Metrics field if non-nil, zero value otherwise.

### GetMetricsOk

`func (o *AnalyticsDailyMetrics) GetMetricsOk() (*map[string]float32, bool)`

GetMetricsOk returns a tuple with the Metrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetrics

`func (o *AnalyticsDailyMetrics) SetMetrics(v map[string]float32)`

SetMetrics sets Metrics field to given value.

### HasMetrics

`func (o *AnalyticsDailyMetrics) HasMetrics() bool`

HasMetrics returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


