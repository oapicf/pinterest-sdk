# CampaignCreateCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] 
**Name** | Pointer to **string** | Campaign name. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] [default to ACTIVE]
**LifetimeSpendCap** | Pointer to **NullableInt32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**DailySpendCap** | Pointer to **NullableInt32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**OrderLineId** | Pointer to **NullableString** | Order line ID that appears on the invoice. | [optional] 
**TrackingUrls** | Pointer to [**NullableAdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**StartTime** | Pointer to **NullableInt32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**SummaryStatus** | Pointer to [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] 
**IsFlexibleDailyBudgets** | Pointer to **bool** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to false]
**DefaultAdGroupBudgetInMicroCurrency** | Pointer to **NullableInt32** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**IsAutomatedCampaign** | Pointer to **bool** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to false]

## Methods

### NewCampaignCreateCommon

`func NewCampaignCreateCommon() *CampaignCreateCommon`

NewCampaignCreateCommon instantiates a new CampaignCreateCommon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignCreateCommonWithDefaults

`func NewCampaignCreateCommonWithDefaults() *CampaignCreateCommon`

NewCampaignCreateCommonWithDefaults instantiates a new CampaignCreateCommon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *CampaignCreateCommon) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CampaignCreateCommon) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CampaignCreateCommon) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *CampaignCreateCommon) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetName

`func (o *CampaignCreateCommon) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CampaignCreateCommon) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CampaignCreateCommon) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CampaignCreateCommon) HasName() bool`

HasName returns a boolean if a field has been set.

### GetStatus

`func (o *CampaignCreateCommon) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CampaignCreateCommon) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CampaignCreateCommon) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CampaignCreateCommon) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetLifetimeSpendCap

`func (o *CampaignCreateCommon) GetLifetimeSpendCap() int32`

GetLifetimeSpendCap returns the LifetimeSpendCap field if non-nil, zero value otherwise.

### GetLifetimeSpendCapOk

`func (o *CampaignCreateCommon) GetLifetimeSpendCapOk() (*int32, bool)`

GetLifetimeSpendCapOk returns a tuple with the LifetimeSpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeSpendCap

`func (o *CampaignCreateCommon) SetLifetimeSpendCap(v int32)`

SetLifetimeSpendCap sets LifetimeSpendCap field to given value.

### HasLifetimeSpendCap

`func (o *CampaignCreateCommon) HasLifetimeSpendCap() bool`

HasLifetimeSpendCap returns a boolean if a field has been set.

### SetLifetimeSpendCapNil

`func (o *CampaignCreateCommon) SetLifetimeSpendCapNil(b bool)`

 SetLifetimeSpendCapNil sets the value for LifetimeSpendCap to be an explicit nil

### UnsetLifetimeSpendCap
`func (o *CampaignCreateCommon) UnsetLifetimeSpendCap()`

UnsetLifetimeSpendCap ensures that no value is present for LifetimeSpendCap, not even an explicit nil
### GetDailySpendCap

`func (o *CampaignCreateCommon) GetDailySpendCap() int32`

GetDailySpendCap returns the DailySpendCap field if non-nil, zero value otherwise.

### GetDailySpendCapOk

`func (o *CampaignCreateCommon) GetDailySpendCapOk() (*int32, bool)`

GetDailySpendCapOk returns a tuple with the DailySpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailySpendCap

`func (o *CampaignCreateCommon) SetDailySpendCap(v int32)`

SetDailySpendCap sets DailySpendCap field to given value.

### HasDailySpendCap

`func (o *CampaignCreateCommon) HasDailySpendCap() bool`

HasDailySpendCap returns a boolean if a field has been set.

### SetDailySpendCapNil

`func (o *CampaignCreateCommon) SetDailySpendCapNil(b bool)`

 SetDailySpendCapNil sets the value for DailySpendCap to be an explicit nil

### UnsetDailySpendCap
`func (o *CampaignCreateCommon) UnsetDailySpendCap()`

UnsetDailySpendCap ensures that no value is present for DailySpendCap, not even an explicit nil
### GetOrderLineId

`func (o *CampaignCreateCommon) GetOrderLineId() string`

GetOrderLineId returns the OrderLineId field if non-nil, zero value otherwise.

### GetOrderLineIdOk

`func (o *CampaignCreateCommon) GetOrderLineIdOk() (*string, bool)`

GetOrderLineIdOk returns a tuple with the OrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLineId

`func (o *CampaignCreateCommon) SetOrderLineId(v string)`

SetOrderLineId sets OrderLineId field to given value.

### HasOrderLineId

`func (o *CampaignCreateCommon) HasOrderLineId() bool`

HasOrderLineId returns a boolean if a field has been set.

### SetOrderLineIdNil

`func (o *CampaignCreateCommon) SetOrderLineIdNil(b bool)`

 SetOrderLineIdNil sets the value for OrderLineId to be an explicit nil

### UnsetOrderLineId
`func (o *CampaignCreateCommon) UnsetOrderLineId()`

UnsetOrderLineId ensures that no value is present for OrderLineId, not even an explicit nil
### GetTrackingUrls

`func (o *CampaignCreateCommon) GetTrackingUrls() AdCommonTrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *CampaignCreateCommon) GetTrackingUrlsOk() (*AdCommonTrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *CampaignCreateCommon) SetTrackingUrls(v AdCommonTrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *CampaignCreateCommon) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *CampaignCreateCommon) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *CampaignCreateCommon) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetStartTime

`func (o *CampaignCreateCommon) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *CampaignCreateCommon) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *CampaignCreateCommon) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *CampaignCreateCommon) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *CampaignCreateCommon) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *CampaignCreateCommon) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetEndTime

`func (o *CampaignCreateCommon) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *CampaignCreateCommon) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *CampaignCreateCommon) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *CampaignCreateCommon) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *CampaignCreateCommon) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *CampaignCreateCommon) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetSummaryStatus

`func (o *CampaignCreateCommon) GetSummaryStatus() CampaignSummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *CampaignCreateCommon) GetSummaryStatusOk() (*CampaignSummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *CampaignCreateCommon) SetSummaryStatus(v CampaignSummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.

### HasSummaryStatus

`func (o *CampaignCreateCommon) HasSummaryStatus() bool`

HasSummaryStatus returns a boolean if a field has been set.

### GetIsFlexibleDailyBudgets

`func (o *CampaignCreateCommon) GetIsFlexibleDailyBudgets() bool`

GetIsFlexibleDailyBudgets returns the IsFlexibleDailyBudgets field if non-nil, zero value otherwise.

### GetIsFlexibleDailyBudgetsOk

`func (o *CampaignCreateCommon) GetIsFlexibleDailyBudgetsOk() (*bool, bool)`

GetIsFlexibleDailyBudgetsOk returns a tuple with the IsFlexibleDailyBudgets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFlexibleDailyBudgets

`func (o *CampaignCreateCommon) SetIsFlexibleDailyBudgets(v bool)`

SetIsFlexibleDailyBudgets sets IsFlexibleDailyBudgets field to given value.

### HasIsFlexibleDailyBudgets

`func (o *CampaignCreateCommon) HasIsFlexibleDailyBudgets() bool`

HasIsFlexibleDailyBudgets returns a boolean if a field has been set.

### GetDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignCreateCommon) GetDefaultAdGroupBudgetInMicroCurrency() int32`

GetDefaultAdGroupBudgetInMicroCurrency returns the DefaultAdGroupBudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetDefaultAdGroupBudgetInMicroCurrencyOk

`func (o *CampaignCreateCommon) GetDefaultAdGroupBudgetInMicroCurrencyOk() (*int32, bool)`

GetDefaultAdGroupBudgetInMicroCurrencyOk returns a tuple with the DefaultAdGroupBudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignCreateCommon) SetDefaultAdGroupBudgetInMicroCurrency(v int32)`

SetDefaultAdGroupBudgetInMicroCurrency sets DefaultAdGroupBudgetInMicroCurrency field to given value.

### HasDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignCreateCommon) HasDefaultAdGroupBudgetInMicroCurrency() bool`

HasDefaultAdGroupBudgetInMicroCurrency returns a boolean if a field has been set.

### SetDefaultAdGroupBudgetInMicroCurrencyNil

`func (o *CampaignCreateCommon) SetDefaultAdGroupBudgetInMicroCurrencyNil(b bool)`

 SetDefaultAdGroupBudgetInMicroCurrencyNil sets the value for DefaultAdGroupBudgetInMicroCurrency to be an explicit nil

### UnsetDefaultAdGroupBudgetInMicroCurrency
`func (o *CampaignCreateCommon) UnsetDefaultAdGroupBudgetInMicroCurrency()`

UnsetDefaultAdGroupBudgetInMicroCurrency ensures that no value is present for DefaultAdGroupBudgetInMicroCurrency, not even an explicit nil
### GetIsAutomatedCampaign

`func (o *CampaignCreateCommon) GetIsAutomatedCampaign() bool`

GetIsAutomatedCampaign returns the IsAutomatedCampaign field if non-nil, zero value otherwise.

### GetIsAutomatedCampaignOk

`func (o *CampaignCreateCommon) GetIsAutomatedCampaignOk() (*bool, bool)`

GetIsAutomatedCampaignOk returns a tuple with the IsAutomatedCampaign field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAutomatedCampaign

`func (o *CampaignCreateCommon) SetIsAutomatedCampaign(v bool)`

SetIsAutomatedCampaign sets IsAutomatedCampaign field to given value.

### HasIsAutomatedCampaign

`func (o *CampaignCreateCommon) HasIsAutomatedCampaign() bool`

HasIsAutomatedCampaign returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


