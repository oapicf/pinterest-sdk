# CampaignUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Campaign ID. | 
**AdAccountId** | **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**Name** | Pointer to **string** | Campaign name. | [optional] 
**Status** | Pointer to [**NullableEntityStatus**](EntityStatus.md) |  | [optional] 
**LifetimeSpendCap** | Pointer to **NullableInt32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**DailySpendCap** | Pointer to **NullableInt32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**OrderLineId** | Pointer to **NullableString** | Order line ID that appears on the invoice. | [optional] 
**TrackingUrls** | Pointer to [**NullableAdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**StartTime** | Pointer to **NullableInt32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**SummaryStatus** | Pointer to [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] 
**IsFlexibleDailyBudgets** | Pointer to **NullableBool** | Determine if a campaign has flexible daily budgets setup. | [optional] 
**DefaultAdGroupBudgetInMicroCurrency** | Pointer to **NullableInt32** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**IsAutomatedCampaign** | Pointer to **NullableBool** | Specifies whether the campaign was created in the automated campaign flow | [optional] 
**IsCampaignBudgetOptimization** | Pointer to **NullableBool** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] 
**ObjectiveType** | Pointer to [**NullableObjectiveType**](ObjectiveType.md) |  | [optional] 

## Methods

### NewCampaignUpdateRequest

`func NewCampaignUpdateRequest(id string, adAccountId string, ) *CampaignUpdateRequest`

NewCampaignUpdateRequest instantiates a new CampaignUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignUpdateRequestWithDefaults

`func NewCampaignUpdateRequestWithDefaults() *CampaignUpdateRequest`

NewCampaignUpdateRequestWithDefaults instantiates a new CampaignUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CampaignUpdateRequest) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CampaignUpdateRequest) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CampaignUpdateRequest) SetId(v string)`

SetId sets Id field to given value.


### GetAdAccountId

`func (o *CampaignUpdateRequest) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CampaignUpdateRequest) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CampaignUpdateRequest) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.


### GetName

`func (o *CampaignUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CampaignUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CampaignUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CampaignUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetStatus

`func (o *CampaignUpdateRequest) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CampaignUpdateRequest) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CampaignUpdateRequest) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CampaignUpdateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### SetStatusNil

`func (o *CampaignUpdateRequest) SetStatusNil(b bool)`

 SetStatusNil sets the value for Status to be an explicit nil

### UnsetStatus
`func (o *CampaignUpdateRequest) UnsetStatus()`

UnsetStatus ensures that no value is present for Status, not even an explicit nil
### GetLifetimeSpendCap

`func (o *CampaignUpdateRequest) GetLifetimeSpendCap() int32`

GetLifetimeSpendCap returns the LifetimeSpendCap field if non-nil, zero value otherwise.

### GetLifetimeSpendCapOk

`func (o *CampaignUpdateRequest) GetLifetimeSpendCapOk() (*int32, bool)`

GetLifetimeSpendCapOk returns a tuple with the LifetimeSpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeSpendCap

`func (o *CampaignUpdateRequest) SetLifetimeSpendCap(v int32)`

SetLifetimeSpendCap sets LifetimeSpendCap field to given value.

### HasLifetimeSpendCap

`func (o *CampaignUpdateRequest) HasLifetimeSpendCap() bool`

HasLifetimeSpendCap returns a boolean if a field has been set.

### SetLifetimeSpendCapNil

`func (o *CampaignUpdateRequest) SetLifetimeSpendCapNil(b bool)`

 SetLifetimeSpendCapNil sets the value for LifetimeSpendCap to be an explicit nil

### UnsetLifetimeSpendCap
`func (o *CampaignUpdateRequest) UnsetLifetimeSpendCap()`

UnsetLifetimeSpendCap ensures that no value is present for LifetimeSpendCap, not even an explicit nil
### GetDailySpendCap

`func (o *CampaignUpdateRequest) GetDailySpendCap() int32`

GetDailySpendCap returns the DailySpendCap field if non-nil, zero value otherwise.

### GetDailySpendCapOk

`func (o *CampaignUpdateRequest) GetDailySpendCapOk() (*int32, bool)`

GetDailySpendCapOk returns a tuple with the DailySpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailySpendCap

`func (o *CampaignUpdateRequest) SetDailySpendCap(v int32)`

SetDailySpendCap sets DailySpendCap field to given value.

### HasDailySpendCap

`func (o *CampaignUpdateRequest) HasDailySpendCap() bool`

HasDailySpendCap returns a boolean if a field has been set.

### SetDailySpendCapNil

`func (o *CampaignUpdateRequest) SetDailySpendCapNil(b bool)`

 SetDailySpendCapNil sets the value for DailySpendCap to be an explicit nil

### UnsetDailySpendCap
`func (o *CampaignUpdateRequest) UnsetDailySpendCap()`

UnsetDailySpendCap ensures that no value is present for DailySpendCap, not even an explicit nil
### GetOrderLineId

`func (o *CampaignUpdateRequest) GetOrderLineId() string`

GetOrderLineId returns the OrderLineId field if non-nil, zero value otherwise.

### GetOrderLineIdOk

`func (o *CampaignUpdateRequest) GetOrderLineIdOk() (*string, bool)`

GetOrderLineIdOk returns a tuple with the OrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLineId

`func (o *CampaignUpdateRequest) SetOrderLineId(v string)`

SetOrderLineId sets OrderLineId field to given value.

### HasOrderLineId

`func (o *CampaignUpdateRequest) HasOrderLineId() bool`

HasOrderLineId returns a boolean if a field has been set.

### SetOrderLineIdNil

`func (o *CampaignUpdateRequest) SetOrderLineIdNil(b bool)`

 SetOrderLineIdNil sets the value for OrderLineId to be an explicit nil

### UnsetOrderLineId
`func (o *CampaignUpdateRequest) UnsetOrderLineId()`

UnsetOrderLineId ensures that no value is present for OrderLineId, not even an explicit nil
### GetTrackingUrls

`func (o *CampaignUpdateRequest) GetTrackingUrls() AdCommonTrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *CampaignUpdateRequest) GetTrackingUrlsOk() (*AdCommonTrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *CampaignUpdateRequest) SetTrackingUrls(v AdCommonTrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *CampaignUpdateRequest) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *CampaignUpdateRequest) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *CampaignUpdateRequest) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetStartTime

`func (o *CampaignUpdateRequest) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *CampaignUpdateRequest) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *CampaignUpdateRequest) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *CampaignUpdateRequest) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *CampaignUpdateRequest) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *CampaignUpdateRequest) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetEndTime

`func (o *CampaignUpdateRequest) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *CampaignUpdateRequest) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *CampaignUpdateRequest) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *CampaignUpdateRequest) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *CampaignUpdateRequest) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *CampaignUpdateRequest) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetSummaryStatus

`func (o *CampaignUpdateRequest) GetSummaryStatus() CampaignSummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *CampaignUpdateRequest) GetSummaryStatusOk() (*CampaignSummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *CampaignUpdateRequest) SetSummaryStatus(v CampaignSummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.

### HasSummaryStatus

`func (o *CampaignUpdateRequest) HasSummaryStatus() bool`

HasSummaryStatus returns a boolean if a field has been set.

### GetIsFlexibleDailyBudgets

`func (o *CampaignUpdateRequest) GetIsFlexibleDailyBudgets() bool`

GetIsFlexibleDailyBudgets returns the IsFlexibleDailyBudgets field if non-nil, zero value otherwise.

### GetIsFlexibleDailyBudgetsOk

`func (o *CampaignUpdateRequest) GetIsFlexibleDailyBudgetsOk() (*bool, bool)`

GetIsFlexibleDailyBudgetsOk returns a tuple with the IsFlexibleDailyBudgets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFlexibleDailyBudgets

`func (o *CampaignUpdateRequest) SetIsFlexibleDailyBudgets(v bool)`

SetIsFlexibleDailyBudgets sets IsFlexibleDailyBudgets field to given value.

### HasIsFlexibleDailyBudgets

`func (o *CampaignUpdateRequest) HasIsFlexibleDailyBudgets() bool`

HasIsFlexibleDailyBudgets returns a boolean if a field has been set.

### SetIsFlexibleDailyBudgetsNil

`func (o *CampaignUpdateRequest) SetIsFlexibleDailyBudgetsNil(b bool)`

 SetIsFlexibleDailyBudgetsNil sets the value for IsFlexibleDailyBudgets to be an explicit nil

### UnsetIsFlexibleDailyBudgets
`func (o *CampaignUpdateRequest) UnsetIsFlexibleDailyBudgets()`

UnsetIsFlexibleDailyBudgets ensures that no value is present for IsFlexibleDailyBudgets, not even an explicit nil
### GetDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignUpdateRequest) GetDefaultAdGroupBudgetInMicroCurrency() int32`

GetDefaultAdGroupBudgetInMicroCurrency returns the DefaultAdGroupBudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetDefaultAdGroupBudgetInMicroCurrencyOk

`func (o *CampaignUpdateRequest) GetDefaultAdGroupBudgetInMicroCurrencyOk() (*int32, bool)`

GetDefaultAdGroupBudgetInMicroCurrencyOk returns a tuple with the DefaultAdGroupBudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignUpdateRequest) SetDefaultAdGroupBudgetInMicroCurrency(v int32)`

SetDefaultAdGroupBudgetInMicroCurrency sets DefaultAdGroupBudgetInMicroCurrency field to given value.

### HasDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignUpdateRequest) HasDefaultAdGroupBudgetInMicroCurrency() bool`

HasDefaultAdGroupBudgetInMicroCurrency returns a boolean if a field has been set.

### SetDefaultAdGroupBudgetInMicroCurrencyNil

`func (o *CampaignUpdateRequest) SetDefaultAdGroupBudgetInMicroCurrencyNil(b bool)`

 SetDefaultAdGroupBudgetInMicroCurrencyNil sets the value for DefaultAdGroupBudgetInMicroCurrency to be an explicit nil

### UnsetDefaultAdGroupBudgetInMicroCurrency
`func (o *CampaignUpdateRequest) UnsetDefaultAdGroupBudgetInMicroCurrency()`

UnsetDefaultAdGroupBudgetInMicroCurrency ensures that no value is present for DefaultAdGroupBudgetInMicroCurrency, not even an explicit nil
### GetIsAutomatedCampaign

`func (o *CampaignUpdateRequest) GetIsAutomatedCampaign() bool`

GetIsAutomatedCampaign returns the IsAutomatedCampaign field if non-nil, zero value otherwise.

### GetIsAutomatedCampaignOk

`func (o *CampaignUpdateRequest) GetIsAutomatedCampaignOk() (*bool, bool)`

GetIsAutomatedCampaignOk returns a tuple with the IsAutomatedCampaign field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAutomatedCampaign

`func (o *CampaignUpdateRequest) SetIsAutomatedCampaign(v bool)`

SetIsAutomatedCampaign sets IsAutomatedCampaign field to given value.

### HasIsAutomatedCampaign

`func (o *CampaignUpdateRequest) HasIsAutomatedCampaign() bool`

HasIsAutomatedCampaign returns a boolean if a field has been set.

### SetIsAutomatedCampaignNil

`func (o *CampaignUpdateRequest) SetIsAutomatedCampaignNil(b bool)`

 SetIsAutomatedCampaignNil sets the value for IsAutomatedCampaign to be an explicit nil

### UnsetIsAutomatedCampaign
`func (o *CampaignUpdateRequest) UnsetIsAutomatedCampaign()`

UnsetIsAutomatedCampaign ensures that no value is present for IsAutomatedCampaign, not even an explicit nil
### GetIsCampaignBudgetOptimization

`func (o *CampaignUpdateRequest) GetIsCampaignBudgetOptimization() bool`

GetIsCampaignBudgetOptimization returns the IsCampaignBudgetOptimization field if non-nil, zero value otherwise.

### GetIsCampaignBudgetOptimizationOk

`func (o *CampaignUpdateRequest) GetIsCampaignBudgetOptimizationOk() (*bool, bool)`

GetIsCampaignBudgetOptimizationOk returns a tuple with the IsCampaignBudgetOptimization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCampaignBudgetOptimization

`func (o *CampaignUpdateRequest) SetIsCampaignBudgetOptimization(v bool)`

SetIsCampaignBudgetOptimization sets IsCampaignBudgetOptimization field to given value.

### HasIsCampaignBudgetOptimization

`func (o *CampaignUpdateRequest) HasIsCampaignBudgetOptimization() bool`

HasIsCampaignBudgetOptimization returns a boolean if a field has been set.

### SetIsCampaignBudgetOptimizationNil

`func (o *CampaignUpdateRequest) SetIsCampaignBudgetOptimizationNil(b bool)`

 SetIsCampaignBudgetOptimizationNil sets the value for IsCampaignBudgetOptimization to be an explicit nil

### UnsetIsCampaignBudgetOptimization
`func (o *CampaignUpdateRequest) UnsetIsCampaignBudgetOptimization()`

UnsetIsCampaignBudgetOptimization ensures that no value is present for IsCampaignBudgetOptimization, not even an explicit nil
### GetObjectiveType

`func (o *CampaignUpdateRequest) GetObjectiveType() ObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *CampaignUpdateRequest) GetObjectiveTypeOk() (*ObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *CampaignUpdateRequest) SetObjectiveType(v ObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *CampaignUpdateRequest) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.

### SetObjectiveTypeNil

`func (o *CampaignUpdateRequest) SetObjectiveTypeNil(b bool)`

 SetObjectiveTypeNil sets the value for ObjectiveType to be an explicit nil

### UnsetObjectiveType
`func (o *CampaignUpdateRequest) UnsetObjectiveType()`

UnsetObjectiveType ensures that no value is present for ObjectiveType, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


