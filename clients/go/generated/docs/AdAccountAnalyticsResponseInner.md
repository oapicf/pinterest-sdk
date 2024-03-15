# AdAccountAnalyticsResponseInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AD_ACCOUNT_ID** | **string** | The ID of the advertiser that this metrics belongs to. | 
**DATE** | Pointer to **string** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Methods

### NewAdAccountAnalyticsResponseInner

`func NewAdAccountAnalyticsResponseInner(aDACCOUNTID string, ) *AdAccountAnalyticsResponseInner`

NewAdAccountAnalyticsResponseInner instantiates a new AdAccountAnalyticsResponseInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountAnalyticsResponseInnerWithDefaults

`func NewAdAccountAnalyticsResponseInnerWithDefaults() *AdAccountAnalyticsResponseInner`

NewAdAccountAnalyticsResponseInnerWithDefaults instantiates a new AdAccountAnalyticsResponseInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAD_ACCOUNT_ID

`func (o *AdAccountAnalyticsResponseInner) GetAD_ACCOUNT_ID() string`

GetAD_ACCOUNT_ID returns the AD_ACCOUNT_ID field if non-nil, zero value otherwise.

### GetAD_ACCOUNT_IDOk

`func (o *AdAccountAnalyticsResponseInner) GetAD_ACCOUNT_IDOk() (*string, bool)`

GetAD_ACCOUNT_IDOk returns a tuple with the AD_ACCOUNT_ID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAD_ACCOUNT_ID

`func (o *AdAccountAnalyticsResponseInner) SetAD_ACCOUNT_ID(v string)`

SetAD_ACCOUNT_ID sets AD_ACCOUNT_ID field to given value.


### GetDATE

`func (o *AdAccountAnalyticsResponseInner) GetDATE() string`

GetDATE returns the DATE field if non-nil, zero value otherwise.

### GetDATEOk

`func (o *AdAccountAnalyticsResponseInner) GetDATEOk() (*string, bool)`

GetDATEOk returns a tuple with the DATE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDATE

`func (o *AdAccountAnalyticsResponseInner) SetDATE(v string)`

SetDATE sets DATE field to given value.

### HasDATE

`func (o *AdAccountAnalyticsResponseInner) HasDATE() bool`

HasDATE returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


