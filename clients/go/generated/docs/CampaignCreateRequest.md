# CampaignCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**Name** | **string** | Campaign name. | 
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
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | 

## Methods

### NewCampaignCreateRequest

`func NewCampaignCreateRequest(adAccountId string, name string, objectiveType ObjectiveType, ) *CampaignCreateRequest`

NewCampaignCreateRequest instantiates a new CampaignCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignCreateRequestWithDefaults

`func NewCampaignCreateRequestWithDefaults() *CampaignCreateRequest`

NewCampaignCreateRequestWithDefaults instantiates a new CampaignCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *CampaignCreateRequest) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CampaignCreateRequest) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CampaignCreateRequest) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.


### GetName

`func (o *CampaignCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CampaignCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CampaignCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetStatus

`func (o *CampaignCreateRequest) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CampaignCreateRequest) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CampaignCreateRequest) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CampaignCreateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetLifetimeSpendCap

`func (o *CampaignCreateRequest) GetLifetimeSpendCap() int32`

GetLifetimeSpendCap returns the LifetimeSpendCap field if non-nil, zero value otherwise.

### GetLifetimeSpendCapOk

`func (o *CampaignCreateRequest) GetLifetimeSpendCapOk() (*int32, bool)`

GetLifetimeSpendCapOk returns a tuple with the LifetimeSpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeSpendCap

`func (o *CampaignCreateRequest) SetLifetimeSpendCap(v int32)`

SetLifetimeSpendCap sets LifetimeSpendCap field to given value.

### HasLifetimeSpendCap

`func (o *CampaignCreateRequest) HasLifetimeSpendCap() bool`

HasLifetimeSpendCap returns a boolean if a field has been set.

### SetLifetimeSpendCapNil

`func (o *CampaignCreateRequest) SetLifetimeSpendCapNil(b bool)`

 SetLifetimeSpendCapNil sets the value for LifetimeSpendCap to be an explicit nil

### UnsetLifetimeSpendCap
`func (o *CampaignCreateRequest) UnsetLifetimeSpendCap()`

UnsetLifetimeSpendCap ensures that no value is present for LifetimeSpendCap, not even an explicit nil
### GetDailySpendCap

`func (o *CampaignCreateRequest) GetDailySpendCap() int32`

GetDailySpendCap returns the DailySpendCap field if non-nil, zero value otherwise.

### GetDailySpendCapOk

`func (o *CampaignCreateRequest) GetDailySpendCapOk() (*int32, bool)`

GetDailySpendCapOk returns a tuple with the DailySpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailySpendCap

`func (o *CampaignCreateRequest) SetDailySpendCap(v int32)`

SetDailySpendCap sets DailySpendCap field to given value.

### HasDailySpendCap

`func (o *CampaignCreateRequest) HasDailySpendCap() bool`

HasDailySpendCap returns a boolean if a field has been set.

### SetDailySpendCapNil

`func (o *CampaignCreateRequest) SetDailySpendCapNil(b bool)`

 SetDailySpendCapNil sets the value for DailySpendCap to be an explicit nil

### UnsetDailySpendCap
`func (o *CampaignCreateRequest) UnsetDailySpendCap()`

UnsetDailySpendCap ensures that no value is present for DailySpendCap, not even an explicit nil
### GetOrderLineId

`func (o *CampaignCreateRequest) GetOrderLineId() string`

GetOrderLineId returns the OrderLineId field if non-nil, zero value otherwise.

### GetOrderLineIdOk

`func (o *CampaignCreateRequest) GetOrderLineIdOk() (*string, bool)`

GetOrderLineIdOk returns a tuple with the OrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLineId

`func (o *CampaignCreateRequest) SetOrderLineId(v string)`

SetOrderLineId sets OrderLineId field to given value.

### HasOrderLineId

`func (o *CampaignCreateRequest) HasOrderLineId() bool`

HasOrderLineId returns a boolean if a field has been set.

### SetOrderLineIdNil

`func (o *CampaignCreateRequest) SetOrderLineIdNil(b bool)`

 SetOrderLineIdNil sets the value for OrderLineId to be an explicit nil

### UnsetOrderLineId
`func (o *CampaignCreateRequest) UnsetOrderLineId()`

UnsetOrderLineId ensures that no value is present for OrderLineId, not even an explicit nil
### GetTrackingUrls

`func (o *CampaignCreateRequest) GetTrackingUrls() AdCommonTrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *CampaignCreateRequest) GetTrackingUrlsOk() (*AdCommonTrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *CampaignCreateRequest) SetTrackingUrls(v AdCommonTrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *CampaignCreateRequest) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *CampaignCreateRequest) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *CampaignCreateRequest) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetStartTime

`func (o *CampaignCreateRequest) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *CampaignCreateRequest) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *CampaignCreateRequest) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *CampaignCreateRequest) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *CampaignCreateRequest) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *CampaignCreateRequest) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetEndTime

`func (o *CampaignCreateRequest) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *CampaignCreateRequest) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *CampaignCreateRequest) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *CampaignCreateRequest) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *CampaignCreateRequest) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *CampaignCreateRequest) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetSummaryStatus

`func (o *CampaignCreateRequest) GetSummaryStatus() CampaignSummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *CampaignCreateRequest) GetSummaryStatusOk() (*CampaignSummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *CampaignCreateRequest) SetSummaryStatus(v CampaignSummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.

### HasSummaryStatus

`func (o *CampaignCreateRequest) HasSummaryStatus() bool`

HasSummaryStatus returns a boolean if a field has been set.

### GetIsFlexibleDailyBudgets

`func (o *CampaignCreateRequest) GetIsFlexibleDailyBudgets() bool`

GetIsFlexibleDailyBudgets returns the IsFlexibleDailyBudgets field if non-nil, zero value otherwise.

### GetIsFlexibleDailyBudgetsOk

`func (o *CampaignCreateRequest) GetIsFlexibleDailyBudgetsOk() (*bool, bool)`

GetIsFlexibleDailyBudgetsOk returns a tuple with the IsFlexibleDailyBudgets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFlexibleDailyBudgets

`func (o *CampaignCreateRequest) SetIsFlexibleDailyBudgets(v bool)`

SetIsFlexibleDailyBudgets sets IsFlexibleDailyBudgets field to given value.

### HasIsFlexibleDailyBudgets

`func (o *CampaignCreateRequest) HasIsFlexibleDailyBudgets() bool`

HasIsFlexibleDailyBudgets returns a boolean if a field has been set.

### GetDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignCreateRequest) GetDefaultAdGroupBudgetInMicroCurrency() int32`

GetDefaultAdGroupBudgetInMicroCurrency returns the DefaultAdGroupBudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetDefaultAdGroupBudgetInMicroCurrencyOk

`func (o *CampaignCreateRequest) GetDefaultAdGroupBudgetInMicroCurrencyOk() (*int32, bool)`

GetDefaultAdGroupBudgetInMicroCurrencyOk returns a tuple with the DefaultAdGroupBudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignCreateRequest) SetDefaultAdGroupBudgetInMicroCurrency(v int32)`

SetDefaultAdGroupBudgetInMicroCurrency sets DefaultAdGroupBudgetInMicroCurrency field to given value.

### HasDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignCreateRequest) HasDefaultAdGroupBudgetInMicroCurrency() bool`

HasDefaultAdGroupBudgetInMicroCurrency returns a boolean if a field has been set.

### SetDefaultAdGroupBudgetInMicroCurrencyNil

`func (o *CampaignCreateRequest) SetDefaultAdGroupBudgetInMicroCurrencyNil(b bool)`

 SetDefaultAdGroupBudgetInMicroCurrencyNil sets the value for DefaultAdGroupBudgetInMicroCurrency to be an explicit nil

### UnsetDefaultAdGroupBudgetInMicroCurrency
`func (o *CampaignCreateRequest) UnsetDefaultAdGroupBudgetInMicroCurrency()`

UnsetDefaultAdGroupBudgetInMicroCurrency ensures that no value is present for DefaultAdGroupBudgetInMicroCurrency, not even an explicit nil
### GetIsAutomatedCampaign

`func (o *CampaignCreateRequest) GetIsAutomatedCampaign() bool`

GetIsAutomatedCampaign returns the IsAutomatedCampaign field if non-nil, zero value otherwise.

### GetIsAutomatedCampaignOk

`func (o *CampaignCreateRequest) GetIsAutomatedCampaignOk() (*bool, bool)`

GetIsAutomatedCampaignOk returns a tuple with the IsAutomatedCampaign field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAutomatedCampaign

`func (o *CampaignCreateRequest) SetIsAutomatedCampaign(v bool)`

SetIsAutomatedCampaign sets IsAutomatedCampaign field to given value.

### HasIsAutomatedCampaign

`func (o *CampaignCreateRequest) HasIsAutomatedCampaign() bool`

HasIsAutomatedCampaign returns a boolean if a field has been set.

### GetObjectiveType

`func (o *CampaignCreateRequest) GetObjectiveType() ObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *CampaignCreateRequest) GetObjectiveTypeOk() (*ObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *CampaignCreateRequest) SetObjectiveType(v ObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


