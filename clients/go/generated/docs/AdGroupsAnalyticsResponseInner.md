# AdGroupsAnalyticsResponseInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AD_GROUP_ID** | **string** | The ID of the ad group that this metrics belongs to. | 
**DATE** | Pointer to **string** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Methods

### NewAdGroupsAnalyticsResponseInner

`func NewAdGroupsAnalyticsResponseInner(aDGROUPID string, ) *AdGroupsAnalyticsResponseInner`

NewAdGroupsAnalyticsResponseInner instantiates a new AdGroupsAnalyticsResponseInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupsAnalyticsResponseInnerWithDefaults

`func NewAdGroupsAnalyticsResponseInnerWithDefaults() *AdGroupsAnalyticsResponseInner`

NewAdGroupsAnalyticsResponseInnerWithDefaults instantiates a new AdGroupsAnalyticsResponseInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAD_GROUP_ID

`func (o *AdGroupsAnalyticsResponseInner) GetAD_GROUP_ID() string`

GetAD_GROUP_ID returns the AD_GROUP_ID field if non-nil, zero value otherwise.

### GetAD_GROUP_IDOk

`func (o *AdGroupsAnalyticsResponseInner) GetAD_GROUP_IDOk() (*string, bool)`

GetAD_GROUP_IDOk returns a tuple with the AD_GROUP_ID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAD_GROUP_ID

`func (o *AdGroupsAnalyticsResponseInner) SetAD_GROUP_ID(v string)`

SetAD_GROUP_ID sets AD_GROUP_ID field to given value.


### GetDATE

`func (o *AdGroupsAnalyticsResponseInner) GetDATE() string`

GetDATE returns the DATE field if non-nil, zero value otherwise.

### GetDATEOk

`func (o *AdGroupsAnalyticsResponseInner) GetDATEOk() (*string, bool)`

GetDATEOk returns a tuple with the DATE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDATE

`func (o *AdGroupsAnalyticsResponseInner) SetDATE(v string)`

SetDATE sets DATE field to given value.

### HasDATE

`func (o *AdGroupsAnalyticsResponseInner) HasDATE() bool`

HasDATE returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


