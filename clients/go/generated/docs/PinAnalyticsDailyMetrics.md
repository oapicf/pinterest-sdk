# PinAnalyticsDailyMetrics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataStatus** | Pointer to [**DataStatus**](DataStatus.md) |  | [optional] 
**Date** | Pointer to **string** | Metrics date (UTC): YYYY-MM-DD. | [optional] 
**Metrics** | Pointer to **map[string]float32** |  | [optional] 

## Methods

### NewPinAnalyticsDailyMetrics

`func NewPinAnalyticsDailyMetrics() *PinAnalyticsDailyMetrics`

NewPinAnalyticsDailyMetrics instantiates a new PinAnalyticsDailyMetrics object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinAnalyticsDailyMetricsWithDefaults

`func NewPinAnalyticsDailyMetricsWithDefaults() *PinAnalyticsDailyMetrics`

NewPinAnalyticsDailyMetricsWithDefaults instantiates a new PinAnalyticsDailyMetrics object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDataStatus

`func (o *PinAnalyticsDailyMetrics) GetDataStatus() DataStatus`

GetDataStatus returns the DataStatus field if non-nil, zero value otherwise.

### GetDataStatusOk

`func (o *PinAnalyticsDailyMetrics) GetDataStatusOk() (*DataStatus, bool)`

GetDataStatusOk returns a tuple with the DataStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataStatus

`func (o *PinAnalyticsDailyMetrics) SetDataStatus(v DataStatus)`

SetDataStatus sets DataStatus field to given value.

### HasDataStatus

`func (o *PinAnalyticsDailyMetrics) HasDataStatus() bool`

HasDataStatus returns a boolean if a field has been set.

### GetDate

`func (o *PinAnalyticsDailyMetrics) GetDate() string`

GetDate returns the Date field if non-nil, zero value otherwise.

### GetDateOk

`func (o *PinAnalyticsDailyMetrics) GetDateOk() (*string, bool)`

GetDateOk returns a tuple with the Date field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDate

`func (o *PinAnalyticsDailyMetrics) SetDate(v string)`

SetDate sets Date field to given value.

### HasDate

`func (o *PinAnalyticsDailyMetrics) HasDate() bool`

HasDate returns a boolean if a field has been set.

### GetMetrics

`func (o *PinAnalyticsDailyMetrics) GetMetrics() map[string]float32`

GetMetrics returns the Metrics field if non-nil, zero value otherwise.

### GetMetricsOk

`func (o *PinAnalyticsDailyMetrics) GetMetricsOk() (*map[string]float32, bool)`

GetMetricsOk returns a tuple with the Metrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetrics

`func (o *PinAnalyticsDailyMetrics) SetMetrics(v map[string]float32)`

SetMetrics sets Metrics field to given value.

### HasMetrics

`func (o *PinAnalyticsDailyMetrics) HasMetrics() bool`

HasMetrics returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


