# TopPinsAnalyticsResponsePinsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metrics** | Pointer to **map[string]float32** | The metric name and daily value for each requested metric | [optional] 
**DataStatus** | Pointer to [**map[string]DataStatus**](DataStatus.md) |  | [optional] 
**PinId** | Pointer to **string** | The pin id | [optional] 

## Methods

### NewTopPinsAnalyticsResponsePinsInner

`func NewTopPinsAnalyticsResponsePinsInner() *TopPinsAnalyticsResponsePinsInner`

NewTopPinsAnalyticsResponsePinsInner instantiates a new TopPinsAnalyticsResponsePinsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTopPinsAnalyticsResponsePinsInnerWithDefaults

`func NewTopPinsAnalyticsResponsePinsInnerWithDefaults() *TopPinsAnalyticsResponsePinsInner`

NewTopPinsAnalyticsResponsePinsInnerWithDefaults instantiates a new TopPinsAnalyticsResponsePinsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMetrics

`func (o *TopPinsAnalyticsResponsePinsInner) GetMetrics() map[string]float32`

GetMetrics returns the Metrics field if non-nil, zero value otherwise.

### GetMetricsOk

`func (o *TopPinsAnalyticsResponsePinsInner) GetMetricsOk() (*map[string]float32, bool)`

GetMetricsOk returns a tuple with the Metrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetrics

`func (o *TopPinsAnalyticsResponsePinsInner) SetMetrics(v map[string]float32)`

SetMetrics sets Metrics field to given value.

### HasMetrics

`func (o *TopPinsAnalyticsResponsePinsInner) HasMetrics() bool`

HasMetrics returns a boolean if a field has been set.

### GetDataStatus

`func (o *TopPinsAnalyticsResponsePinsInner) GetDataStatus() map[string]DataStatus`

GetDataStatus returns the DataStatus field if non-nil, zero value otherwise.

### GetDataStatusOk

`func (o *TopPinsAnalyticsResponsePinsInner) GetDataStatusOk() (*map[string]DataStatus, bool)`

GetDataStatusOk returns a tuple with the DataStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataStatus

`func (o *TopPinsAnalyticsResponsePinsInner) SetDataStatus(v map[string]DataStatus)`

SetDataStatus sets DataStatus field to given value.

### HasDataStatus

`func (o *TopPinsAnalyticsResponsePinsInner) HasDataStatus() bool`

HasDataStatus returns a boolean if a field has been set.

### GetPinId

`func (o *TopPinsAnalyticsResponsePinsInner) GetPinId() string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *TopPinsAnalyticsResponsePinsInner) GetPinIdOk() (*string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *TopPinsAnalyticsResponsePinsInner) SetPinId(v string)`

SetPinId sets PinId field to given value.

### HasPinId

`func (o *TopPinsAnalyticsResponsePinsInner) HasPinId() bool`

HasPinId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


