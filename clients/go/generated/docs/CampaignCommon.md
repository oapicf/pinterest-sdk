# CampaignCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] 
**Name** | Pointer to **string** | Campaign name. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**LifetimeSpendCap** | Pointer to **NullableInt32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**DailySpendCap** | Pointer to **NullableInt32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**OrderLineId** | Pointer to **NullableString** | Order line ID that appears on the invoice. | [optional] 
**TrackingUrls** | Pointer to [**NullableAdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**StartTime** | Pointer to **NullableInt32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**SummaryStatus** | Pointer to [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] 

## Methods

### NewCampaignCommon

`func NewCampaignCommon() *CampaignCommon`

NewCampaignCommon instantiates a new CampaignCommon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignCommonWithDefaults

`func NewCampaignCommonWithDefaults() *CampaignCommon`

NewCampaignCommonWithDefaults instantiates a new CampaignCommon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *CampaignCommon) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CampaignCommon) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CampaignCommon) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *CampaignCommon) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetName

`func (o *CampaignCommon) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CampaignCommon) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CampaignCommon) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CampaignCommon) HasName() bool`

HasName returns a boolean if a field has been set.

### GetStatus

`func (o *CampaignCommon) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CampaignCommon) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CampaignCommon) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CampaignCommon) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetLifetimeSpendCap

`func (o *CampaignCommon) GetLifetimeSpendCap() int32`

GetLifetimeSpendCap returns the LifetimeSpendCap field if non-nil, zero value otherwise.

### GetLifetimeSpendCapOk

`func (o *CampaignCommon) GetLifetimeSpendCapOk() (*int32, bool)`

GetLifetimeSpendCapOk returns a tuple with the LifetimeSpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeSpendCap

`func (o *CampaignCommon) SetLifetimeSpendCap(v int32)`

SetLifetimeSpendCap sets LifetimeSpendCap field to given value.

### HasLifetimeSpendCap

`func (o *CampaignCommon) HasLifetimeSpendCap() bool`

HasLifetimeSpendCap returns a boolean if a field has been set.

### SetLifetimeSpendCapNil

`func (o *CampaignCommon) SetLifetimeSpendCapNil(b bool)`

 SetLifetimeSpendCapNil sets the value for LifetimeSpendCap to be an explicit nil

### UnsetLifetimeSpendCap
`func (o *CampaignCommon) UnsetLifetimeSpendCap()`

UnsetLifetimeSpendCap ensures that no value is present for LifetimeSpendCap, not even an explicit nil
### GetDailySpendCap

`func (o *CampaignCommon) GetDailySpendCap() int32`

GetDailySpendCap returns the DailySpendCap field if non-nil, zero value otherwise.

### GetDailySpendCapOk

`func (o *CampaignCommon) GetDailySpendCapOk() (*int32, bool)`

GetDailySpendCapOk returns a tuple with the DailySpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailySpendCap

`func (o *CampaignCommon) SetDailySpendCap(v int32)`

SetDailySpendCap sets DailySpendCap field to given value.

### HasDailySpendCap

`func (o *CampaignCommon) HasDailySpendCap() bool`

HasDailySpendCap returns a boolean if a field has been set.

### SetDailySpendCapNil

`func (o *CampaignCommon) SetDailySpendCapNil(b bool)`

 SetDailySpendCapNil sets the value for DailySpendCap to be an explicit nil

### UnsetDailySpendCap
`func (o *CampaignCommon) UnsetDailySpendCap()`

UnsetDailySpendCap ensures that no value is present for DailySpendCap, not even an explicit nil
### GetOrderLineId

`func (o *CampaignCommon) GetOrderLineId() string`

GetOrderLineId returns the OrderLineId field if non-nil, zero value otherwise.

### GetOrderLineIdOk

`func (o *CampaignCommon) GetOrderLineIdOk() (*string, bool)`

GetOrderLineIdOk returns a tuple with the OrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLineId

`func (o *CampaignCommon) SetOrderLineId(v string)`

SetOrderLineId sets OrderLineId field to given value.

### HasOrderLineId

`func (o *CampaignCommon) HasOrderLineId() bool`

HasOrderLineId returns a boolean if a field has been set.

### SetOrderLineIdNil

`func (o *CampaignCommon) SetOrderLineIdNil(b bool)`

 SetOrderLineIdNil sets the value for OrderLineId to be an explicit nil

### UnsetOrderLineId
`func (o *CampaignCommon) UnsetOrderLineId()`

UnsetOrderLineId ensures that no value is present for OrderLineId, not even an explicit nil
### GetTrackingUrls

`func (o *CampaignCommon) GetTrackingUrls() AdCommonTrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *CampaignCommon) GetTrackingUrlsOk() (*AdCommonTrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *CampaignCommon) SetTrackingUrls(v AdCommonTrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *CampaignCommon) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *CampaignCommon) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *CampaignCommon) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetStartTime

`func (o *CampaignCommon) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *CampaignCommon) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *CampaignCommon) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *CampaignCommon) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *CampaignCommon) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *CampaignCommon) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetEndTime

`func (o *CampaignCommon) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *CampaignCommon) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *CampaignCommon) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *CampaignCommon) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *CampaignCommon) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *CampaignCommon) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetSummaryStatus

`func (o *CampaignCommon) GetSummaryStatus() CampaignSummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *CampaignCommon) GetSummaryStatusOk() (*CampaignSummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *CampaignCommon) SetSummaryStatus(v CampaignSummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.

### HasSummaryStatus

`func (o *CampaignCommon) HasSummaryStatus() bool`

HasSummaryStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


