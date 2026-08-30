# CampaignCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidOptions** | Pointer to [**NullableCampaignBidOptionsCreate**](CampaignBidOptionsCreate.md) |  | [optional] 
**IntendedPromotionType** | Pointer to [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] 
**IsAutomatedCampaign** | Pointer to **NullableBool** | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES | [optional] 
**IsCampaignBudgetOptimization** | Pointer to **NullableBool** | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. | [optional] 
**IsFlexibleDailyBudgets** | Pointer to **NullableBool** | Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. | [optional] 
**IsLtvOptimized** | Pointer to **bool** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**IsPerformancePlus** | Pointer to **bool** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. | [optional] [default to false]
**IsTopOfSearch** | Pointer to **bool** | &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update\&quot; target&#x3D;\&quot;blank\&quot;&gt;update it&lt;/a&gt;. | [optional] [default to false]
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**AdAccountId** | **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | 
**DailySpendCap** | Pointer to **NullableInt32** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**DefaultAdGroupBudgetInMicroCurrency** | Pointer to **NullableInt32** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**LifetimeSpendCap** | Pointer to **NullableInt32** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**Name** | **string** | Campaign name. | 
**OrderLineId** | Pointer to **NullableString** | Order line ID that appears on the invoice. | [optional] 
**StartTime** | Pointer to **NullableInt32** | Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**TrackingUrls** | Pointer to **map[string]interface{}** |  | [optional] 

## Methods

### NewCampaignCreateRequest

`func NewCampaignCreateRequest(objectiveType ObjectiveType, adAccountId string, name string, ) *CampaignCreateRequest`

NewCampaignCreateRequest instantiates a new CampaignCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignCreateRequestWithDefaults

`func NewCampaignCreateRequestWithDefaults() *CampaignCreateRequest`

NewCampaignCreateRequestWithDefaults instantiates a new CampaignCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBidOptions

`func (o *CampaignCreateRequest) GetBidOptions() CampaignBidOptionsCreate`

GetBidOptions returns the BidOptions field if non-nil, zero value otherwise.

### GetBidOptionsOk

`func (o *CampaignCreateRequest) GetBidOptionsOk() (*CampaignBidOptionsCreate, bool)`

GetBidOptionsOk returns a tuple with the BidOptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidOptions

`func (o *CampaignCreateRequest) SetBidOptions(v CampaignBidOptionsCreate)`

SetBidOptions sets BidOptions field to given value.

### HasBidOptions

`func (o *CampaignCreateRequest) HasBidOptions() bool`

HasBidOptions returns a boolean if a field has been set.

### SetBidOptionsNil

`func (o *CampaignCreateRequest) SetBidOptionsNil(b bool)`

 SetBidOptionsNil sets the value for BidOptions to be an explicit nil

### UnsetBidOptions
`func (o *CampaignCreateRequest) UnsetBidOptions()`

UnsetBidOptions ensures that no value is present for BidOptions, not even an explicit nil
### GetIntendedPromotionType

`func (o *CampaignCreateRequest) GetIntendedPromotionType() IntendedPromotionType`

GetIntendedPromotionType returns the IntendedPromotionType field if non-nil, zero value otherwise.

### GetIntendedPromotionTypeOk

`func (o *CampaignCreateRequest) GetIntendedPromotionTypeOk() (*IntendedPromotionType, bool)`

GetIntendedPromotionTypeOk returns a tuple with the IntendedPromotionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntendedPromotionType

`func (o *CampaignCreateRequest) SetIntendedPromotionType(v IntendedPromotionType)`

SetIntendedPromotionType sets IntendedPromotionType field to given value.

### HasIntendedPromotionType

`func (o *CampaignCreateRequest) HasIntendedPromotionType() bool`

HasIntendedPromotionType returns a boolean if a field has been set.

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

### SetIsAutomatedCampaignNil

`func (o *CampaignCreateRequest) SetIsAutomatedCampaignNil(b bool)`

 SetIsAutomatedCampaignNil sets the value for IsAutomatedCampaign to be an explicit nil

### UnsetIsAutomatedCampaign
`func (o *CampaignCreateRequest) UnsetIsAutomatedCampaign()`

UnsetIsAutomatedCampaign ensures that no value is present for IsAutomatedCampaign, not even an explicit nil
### GetIsCampaignBudgetOptimization

`func (o *CampaignCreateRequest) GetIsCampaignBudgetOptimization() bool`

GetIsCampaignBudgetOptimization returns the IsCampaignBudgetOptimization field if non-nil, zero value otherwise.

### GetIsCampaignBudgetOptimizationOk

`func (o *CampaignCreateRequest) GetIsCampaignBudgetOptimizationOk() (*bool, bool)`

GetIsCampaignBudgetOptimizationOk returns a tuple with the IsCampaignBudgetOptimization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCampaignBudgetOptimization

`func (o *CampaignCreateRequest) SetIsCampaignBudgetOptimization(v bool)`

SetIsCampaignBudgetOptimization sets IsCampaignBudgetOptimization field to given value.

### HasIsCampaignBudgetOptimization

`func (o *CampaignCreateRequest) HasIsCampaignBudgetOptimization() bool`

HasIsCampaignBudgetOptimization returns a boolean if a field has been set.

### SetIsCampaignBudgetOptimizationNil

`func (o *CampaignCreateRequest) SetIsCampaignBudgetOptimizationNil(b bool)`

 SetIsCampaignBudgetOptimizationNil sets the value for IsCampaignBudgetOptimization to be an explicit nil

### UnsetIsCampaignBudgetOptimization
`func (o *CampaignCreateRequest) UnsetIsCampaignBudgetOptimization()`

UnsetIsCampaignBudgetOptimization ensures that no value is present for IsCampaignBudgetOptimization, not even an explicit nil
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

### SetIsFlexibleDailyBudgetsNil

`func (o *CampaignCreateRequest) SetIsFlexibleDailyBudgetsNil(b bool)`

 SetIsFlexibleDailyBudgetsNil sets the value for IsFlexibleDailyBudgets to be an explicit nil

### UnsetIsFlexibleDailyBudgets
`func (o *CampaignCreateRequest) UnsetIsFlexibleDailyBudgets()`

UnsetIsFlexibleDailyBudgets ensures that no value is present for IsFlexibleDailyBudgets, not even an explicit nil
### GetIsLtvOptimized

`func (o *CampaignCreateRequest) GetIsLtvOptimized() bool`

GetIsLtvOptimized returns the IsLtvOptimized field if non-nil, zero value otherwise.

### GetIsLtvOptimizedOk

`func (o *CampaignCreateRequest) GetIsLtvOptimizedOk() (*bool, bool)`

GetIsLtvOptimizedOk returns a tuple with the IsLtvOptimized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLtvOptimized

`func (o *CampaignCreateRequest) SetIsLtvOptimized(v bool)`

SetIsLtvOptimized sets IsLtvOptimized field to given value.

### HasIsLtvOptimized

`func (o *CampaignCreateRequest) HasIsLtvOptimized() bool`

HasIsLtvOptimized returns a boolean if a field has been set.

### GetIsPerformancePlus

`func (o *CampaignCreateRequest) GetIsPerformancePlus() bool`

GetIsPerformancePlus returns the IsPerformancePlus field if non-nil, zero value otherwise.

### GetIsPerformancePlusOk

`func (o *CampaignCreateRequest) GetIsPerformancePlusOk() (*bool, bool)`

GetIsPerformancePlusOk returns a tuple with the IsPerformancePlus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPerformancePlus

`func (o *CampaignCreateRequest) SetIsPerformancePlus(v bool)`

SetIsPerformancePlus sets IsPerformancePlus field to given value.

### HasIsPerformancePlus

`func (o *CampaignCreateRequest) HasIsPerformancePlus() bool`

HasIsPerformancePlus returns a boolean if a field has been set.

### GetIsTopOfSearch

`func (o *CampaignCreateRequest) GetIsTopOfSearch() bool`

GetIsTopOfSearch returns the IsTopOfSearch field if non-nil, zero value otherwise.

### GetIsTopOfSearchOk

`func (o *CampaignCreateRequest) GetIsTopOfSearchOk() (*bool, bool)`

GetIsTopOfSearchOk returns a tuple with the IsTopOfSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsTopOfSearch

`func (o *CampaignCreateRequest) SetIsTopOfSearch(v bool)`

SetIsTopOfSearch sets IsTopOfSearch field to given value.

### HasIsTopOfSearch

`func (o *CampaignCreateRequest) HasIsTopOfSearch() bool`

HasIsTopOfSearch returns a boolean if a field has been set.

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
### GetTrackingUrls

`func (o *CampaignCreateRequest) GetTrackingUrls() map[string]interface{}`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *CampaignCreateRequest) GetTrackingUrlsOk() (*map[string]interface{}, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *CampaignCreateRequest) SetTrackingUrls(v map[string]interface{})`

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

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


