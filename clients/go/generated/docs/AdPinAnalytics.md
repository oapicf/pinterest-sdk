# AdPinAnalytics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DATE** | Pointer to **string** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 
**PIN_ID** | **string** | The ID of the pin that the metric belongs to. | 

## Methods

### NewAdPinAnalytics

`func NewAdPinAnalytics(pINID string, ) *AdPinAnalytics`

NewAdPinAnalytics instantiates a new AdPinAnalytics object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdPinAnalyticsWithDefaults

`func NewAdPinAnalyticsWithDefaults() *AdPinAnalytics`

NewAdPinAnalyticsWithDefaults instantiates a new AdPinAnalytics object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDATE

`func (o *AdPinAnalytics) GetDATE() string`

GetDATE returns the DATE field if non-nil, zero value otherwise.

### GetDATEOk

`func (o *AdPinAnalytics) GetDATEOk() (*string, bool)`

GetDATEOk returns a tuple with the DATE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDATE

`func (o *AdPinAnalytics) SetDATE(v string)`

SetDATE sets DATE field to given value.

### HasDATE

`func (o *AdPinAnalytics) HasDATE() bool`

HasDATE returns a boolean if a field has been set.

### GetPIN_ID

`func (o *AdPinAnalytics) GetPIN_ID() string`

GetPIN_ID returns the PIN_ID field if non-nil, zero value otherwise.

### GetPIN_IDOk

`func (o *AdPinAnalytics) GetPIN_IDOk() (*string, bool)`

GetPIN_IDOk returns a tuple with the PIN_ID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPIN_ID

`func (o *AdPinAnalytics) SetPIN_ID(v string)`

SetPIN_ID sets PIN_ID field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


