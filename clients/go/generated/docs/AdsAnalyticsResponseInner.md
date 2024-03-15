# AdsAnalyticsResponseInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AD_ID** | **string** | The ID of the ad that this metrics belongs to. | 
**DATE** | Pointer to **string** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Methods

### NewAdsAnalyticsResponseInner

`func NewAdsAnalyticsResponseInner(aDID string, ) *AdsAnalyticsResponseInner`

NewAdsAnalyticsResponseInner instantiates a new AdsAnalyticsResponseInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdsAnalyticsResponseInnerWithDefaults

`func NewAdsAnalyticsResponseInnerWithDefaults() *AdsAnalyticsResponseInner`

NewAdsAnalyticsResponseInnerWithDefaults instantiates a new AdsAnalyticsResponseInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAD_ID

`func (o *AdsAnalyticsResponseInner) GetAD_ID() string`

GetAD_ID returns the AD_ID field if non-nil, zero value otherwise.

### GetAD_IDOk

`func (o *AdsAnalyticsResponseInner) GetAD_IDOk() (*string, bool)`

GetAD_IDOk returns a tuple with the AD_ID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAD_ID

`func (o *AdsAnalyticsResponseInner) SetAD_ID(v string)`

SetAD_ID sets AD_ID field to given value.


### GetDATE

`func (o *AdsAnalyticsResponseInner) GetDATE() string`

GetDATE returns the DATE field if non-nil, zero value otherwise.

### GetDATEOk

`func (o *AdsAnalyticsResponseInner) GetDATEOk() (*string, bool)`

GetDATEOk returns a tuple with the DATE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDATE

`func (o *AdsAnalyticsResponseInner) SetDATE(v string)`

SetDATE sets DATE field to given value.

### HasDATE

`func (o *AdsAnalyticsResponseInner) HasDATE() bool`

HasDATE returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


