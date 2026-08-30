# Campaign

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Campaign&#39;s Advertiser ID. | [optional] 
**BidOptions** | Pointer to [**NullableCampaignBidOptions**](CampaignBidOptions.md) | [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers. | [optional] 
**CreatedTime** | Pointer to **int32** | Campaign creation time. Unix timestamp in seconds. | [optional] [readonly] 
**DailySpendCap** | Pointer to **NullableInt32** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. | [optional] 
**DefaultAdGroupBudgetInMicroCurrency** | Pointer to **NullableInt32** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**Id** | **string** | Campaign ID, must be associated with the ad account ID provided in the path. | 
**IntendedPromotionType** | Pointer to [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] 
**IsAutomatedCampaign** | Pointer to **NullableBool** | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES | [optional] 
**IsCampaignBudgetOptimization** | Pointer to **NullableBool** | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. | [optional] 
**IsCarting** | Pointer to **bool** | Whether the campaign contains a carting(where-to-buy link) ad. | [optional] [readonly] 
**IsFlexibleDailyBudgets** | Pointer to **NullableBool** | Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. | [optional] 
**IsLtvOptimized** | Pointer to **bool** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**IsPerformancePlus** | Pointer to **bool** | Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) | [optional] 
**IsTopOfSearch** | Pointer to **bool** | Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. | [optional] 
**LifetimeSpendCap** | Pointer to **NullableInt32** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. | [optional] 
**Name** | Pointer to **string** | Campaign name - 255 chars max. | [optional] 
**ObjectiveType** | [**CampaignObjectiveType**](CampaignObjectiveType.md) |  | 
**OrderLineId** | Pointer to **NullableString** | Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. | [optional] 
**PerformancePlusCampaignSettings** | Pointer to [**NullablePerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] 
**StartTime** | Pointer to **NullableInt32** | Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**SummaryStatus** | Pointer to [**SummaryStatus**](SummaryStatus.md) |  | [optional] [readonly] 
**TrackingUrls** | Pointer to [**NullableTrackingUrls**](TrackingUrls.md) |  | [optional] 
**Type** | Pointer to **string** | Always \&quot;campaign\&quot;. | [optional] [readonly] 
**UpdatedTime** | Pointer to **int32** | UTC timestamp. Last update time. | [optional] [readonly] 

## Methods

### NewCampaign

`func NewCampaign(id string, objectiveType CampaignObjectiveType, ) *Campaign`

NewCampaign instantiates a new Campaign object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignWithDefaults

`func NewCampaignWithDefaults() *Campaign`

NewCampaignWithDefaults instantiates a new Campaign object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *Campaign) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *Campaign) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *Campaign) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *Campaign) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetBidOptions

`func (o *Campaign) GetBidOptions() CampaignBidOptions`

GetBidOptions returns the BidOptions field if non-nil, zero value otherwise.

### GetBidOptionsOk

`func (o *Campaign) GetBidOptionsOk() (*CampaignBidOptions, bool)`

GetBidOptionsOk returns a tuple with the BidOptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidOptions

`func (o *Campaign) SetBidOptions(v CampaignBidOptions)`

SetBidOptions sets BidOptions field to given value.

### HasBidOptions

`func (o *Campaign) HasBidOptions() bool`

HasBidOptions returns a boolean if a field has been set.

### SetBidOptionsNil

`func (o *Campaign) SetBidOptionsNil(b bool)`

 SetBidOptionsNil sets the value for BidOptions to be an explicit nil

### UnsetBidOptions
`func (o *Campaign) UnsetBidOptions()`

UnsetBidOptions ensures that no value is present for BidOptions, not even an explicit nil
### GetCreatedTime

`func (o *Campaign) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *Campaign) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *Campaign) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *Campaign) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetDailySpendCap

`func (o *Campaign) GetDailySpendCap() int32`

GetDailySpendCap returns the DailySpendCap field if non-nil, zero value otherwise.

### GetDailySpendCapOk

`func (o *Campaign) GetDailySpendCapOk() (*int32, bool)`

GetDailySpendCapOk returns a tuple with the DailySpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailySpendCap

`func (o *Campaign) SetDailySpendCap(v int32)`

SetDailySpendCap sets DailySpendCap field to given value.

### HasDailySpendCap

`func (o *Campaign) HasDailySpendCap() bool`

HasDailySpendCap returns a boolean if a field has been set.

### SetDailySpendCapNil

`func (o *Campaign) SetDailySpendCapNil(b bool)`

 SetDailySpendCapNil sets the value for DailySpendCap to be an explicit nil

### UnsetDailySpendCap
`func (o *Campaign) UnsetDailySpendCap()`

UnsetDailySpendCap ensures that no value is present for DailySpendCap, not even an explicit nil
### GetDefaultAdGroupBudgetInMicroCurrency

`func (o *Campaign) GetDefaultAdGroupBudgetInMicroCurrency() int32`

GetDefaultAdGroupBudgetInMicroCurrency returns the DefaultAdGroupBudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetDefaultAdGroupBudgetInMicroCurrencyOk

`func (o *Campaign) GetDefaultAdGroupBudgetInMicroCurrencyOk() (*int32, bool)`

GetDefaultAdGroupBudgetInMicroCurrencyOk returns a tuple with the DefaultAdGroupBudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAdGroupBudgetInMicroCurrency

`func (o *Campaign) SetDefaultAdGroupBudgetInMicroCurrency(v int32)`

SetDefaultAdGroupBudgetInMicroCurrency sets DefaultAdGroupBudgetInMicroCurrency field to given value.

### HasDefaultAdGroupBudgetInMicroCurrency

`func (o *Campaign) HasDefaultAdGroupBudgetInMicroCurrency() bool`

HasDefaultAdGroupBudgetInMicroCurrency returns a boolean if a field has been set.

### SetDefaultAdGroupBudgetInMicroCurrencyNil

`func (o *Campaign) SetDefaultAdGroupBudgetInMicroCurrencyNil(b bool)`

 SetDefaultAdGroupBudgetInMicroCurrencyNil sets the value for DefaultAdGroupBudgetInMicroCurrency to be an explicit nil

### UnsetDefaultAdGroupBudgetInMicroCurrency
`func (o *Campaign) UnsetDefaultAdGroupBudgetInMicroCurrency()`

UnsetDefaultAdGroupBudgetInMicroCurrency ensures that no value is present for DefaultAdGroupBudgetInMicroCurrency, not even an explicit nil
### GetEndTime

`func (o *Campaign) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *Campaign) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *Campaign) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *Campaign) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *Campaign) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *Campaign) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetId

`func (o *Campaign) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Campaign) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Campaign) SetId(v string)`

SetId sets Id field to given value.


### GetIntendedPromotionType

`func (o *Campaign) GetIntendedPromotionType() IntendedPromotionType`

GetIntendedPromotionType returns the IntendedPromotionType field if non-nil, zero value otherwise.

### GetIntendedPromotionTypeOk

`func (o *Campaign) GetIntendedPromotionTypeOk() (*IntendedPromotionType, bool)`

GetIntendedPromotionTypeOk returns a tuple with the IntendedPromotionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntendedPromotionType

`func (o *Campaign) SetIntendedPromotionType(v IntendedPromotionType)`

SetIntendedPromotionType sets IntendedPromotionType field to given value.

### HasIntendedPromotionType

`func (o *Campaign) HasIntendedPromotionType() bool`

HasIntendedPromotionType returns a boolean if a field has been set.

### GetIsAutomatedCampaign

`func (o *Campaign) GetIsAutomatedCampaign() bool`

GetIsAutomatedCampaign returns the IsAutomatedCampaign field if non-nil, zero value otherwise.

### GetIsAutomatedCampaignOk

`func (o *Campaign) GetIsAutomatedCampaignOk() (*bool, bool)`

GetIsAutomatedCampaignOk returns a tuple with the IsAutomatedCampaign field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAutomatedCampaign

`func (o *Campaign) SetIsAutomatedCampaign(v bool)`

SetIsAutomatedCampaign sets IsAutomatedCampaign field to given value.

### HasIsAutomatedCampaign

`func (o *Campaign) HasIsAutomatedCampaign() bool`

HasIsAutomatedCampaign returns a boolean if a field has been set.

### SetIsAutomatedCampaignNil

`func (o *Campaign) SetIsAutomatedCampaignNil(b bool)`

 SetIsAutomatedCampaignNil sets the value for IsAutomatedCampaign to be an explicit nil

### UnsetIsAutomatedCampaign
`func (o *Campaign) UnsetIsAutomatedCampaign()`

UnsetIsAutomatedCampaign ensures that no value is present for IsAutomatedCampaign, not even an explicit nil
### GetIsCampaignBudgetOptimization

`func (o *Campaign) GetIsCampaignBudgetOptimization() bool`

GetIsCampaignBudgetOptimization returns the IsCampaignBudgetOptimization field if non-nil, zero value otherwise.

### GetIsCampaignBudgetOptimizationOk

`func (o *Campaign) GetIsCampaignBudgetOptimizationOk() (*bool, bool)`

GetIsCampaignBudgetOptimizationOk returns a tuple with the IsCampaignBudgetOptimization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCampaignBudgetOptimization

`func (o *Campaign) SetIsCampaignBudgetOptimization(v bool)`

SetIsCampaignBudgetOptimization sets IsCampaignBudgetOptimization field to given value.

### HasIsCampaignBudgetOptimization

`func (o *Campaign) HasIsCampaignBudgetOptimization() bool`

HasIsCampaignBudgetOptimization returns a boolean if a field has been set.

### SetIsCampaignBudgetOptimizationNil

`func (o *Campaign) SetIsCampaignBudgetOptimizationNil(b bool)`

 SetIsCampaignBudgetOptimizationNil sets the value for IsCampaignBudgetOptimization to be an explicit nil

### UnsetIsCampaignBudgetOptimization
`func (o *Campaign) UnsetIsCampaignBudgetOptimization()`

UnsetIsCampaignBudgetOptimization ensures that no value is present for IsCampaignBudgetOptimization, not even an explicit nil
### GetIsCarting

`func (o *Campaign) GetIsCarting() bool`

GetIsCarting returns the IsCarting field if non-nil, zero value otherwise.

### GetIsCartingOk

`func (o *Campaign) GetIsCartingOk() (*bool, bool)`

GetIsCartingOk returns a tuple with the IsCarting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCarting

`func (o *Campaign) SetIsCarting(v bool)`

SetIsCarting sets IsCarting field to given value.

### HasIsCarting

`func (o *Campaign) HasIsCarting() bool`

HasIsCarting returns a boolean if a field has been set.

### GetIsFlexibleDailyBudgets

`func (o *Campaign) GetIsFlexibleDailyBudgets() bool`

GetIsFlexibleDailyBudgets returns the IsFlexibleDailyBudgets field if non-nil, zero value otherwise.

### GetIsFlexibleDailyBudgetsOk

`func (o *Campaign) GetIsFlexibleDailyBudgetsOk() (*bool, bool)`

GetIsFlexibleDailyBudgetsOk returns a tuple with the IsFlexibleDailyBudgets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFlexibleDailyBudgets

`func (o *Campaign) SetIsFlexibleDailyBudgets(v bool)`

SetIsFlexibleDailyBudgets sets IsFlexibleDailyBudgets field to given value.

### HasIsFlexibleDailyBudgets

`func (o *Campaign) HasIsFlexibleDailyBudgets() bool`

HasIsFlexibleDailyBudgets returns a boolean if a field has been set.

### SetIsFlexibleDailyBudgetsNil

`func (o *Campaign) SetIsFlexibleDailyBudgetsNil(b bool)`

 SetIsFlexibleDailyBudgetsNil sets the value for IsFlexibleDailyBudgets to be an explicit nil

### UnsetIsFlexibleDailyBudgets
`func (o *Campaign) UnsetIsFlexibleDailyBudgets()`

UnsetIsFlexibleDailyBudgets ensures that no value is present for IsFlexibleDailyBudgets, not even an explicit nil
### GetIsLtvOptimized

`func (o *Campaign) GetIsLtvOptimized() bool`

GetIsLtvOptimized returns the IsLtvOptimized field if non-nil, zero value otherwise.

### GetIsLtvOptimizedOk

`func (o *Campaign) GetIsLtvOptimizedOk() (*bool, bool)`

GetIsLtvOptimizedOk returns a tuple with the IsLtvOptimized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLtvOptimized

`func (o *Campaign) SetIsLtvOptimized(v bool)`

SetIsLtvOptimized sets IsLtvOptimized field to given value.

### HasIsLtvOptimized

`func (o *Campaign) HasIsLtvOptimized() bool`

HasIsLtvOptimized returns a boolean if a field has been set.

### GetIsPerformancePlus

`func (o *Campaign) GetIsPerformancePlus() bool`

GetIsPerformancePlus returns the IsPerformancePlus field if non-nil, zero value otherwise.

### GetIsPerformancePlusOk

`func (o *Campaign) GetIsPerformancePlusOk() (*bool, bool)`

GetIsPerformancePlusOk returns a tuple with the IsPerformancePlus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPerformancePlus

`func (o *Campaign) SetIsPerformancePlus(v bool)`

SetIsPerformancePlus sets IsPerformancePlus field to given value.

### HasIsPerformancePlus

`func (o *Campaign) HasIsPerformancePlus() bool`

HasIsPerformancePlus returns a boolean if a field has been set.

### GetIsTopOfSearch

`func (o *Campaign) GetIsTopOfSearch() bool`

GetIsTopOfSearch returns the IsTopOfSearch field if non-nil, zero value otherwise.

### GetIsTopOfSearchOk

`func (o *Campaign) GetIsTopOfSearchOk() (*bool, bool)`

GetIsTopOfSearchOk returns a tuple with the IsTopOfSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsTopOfSearch

`func (o *Campaign) SetIsTopOfSearch(v bool)`

SetIsTopOfSearch sets IsTopOfSearch field to given value.

### HasIsTopOfSearch

`func (o *Campaign) HasIsTopOfSearch() bool`

HasIsTopOfSearch returns a boolean if a field has been set.

### GetLifetimeSpendCap

`func (o *Campaign) GetLifetimeSpendCap() int32`

GetLifetimeSpendCap returns the LifetimeSpendCap field if non-nil, zero value otherwise.

### GetLifetimeSpendCapOk

`func (o *Campaign) GetLifetimeSpendCapOk() (*int32, bool)`

GetLifetimeSpendCapOk returns a tuple with the LifetimeSpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeSpendCap

`func (o *Campaign) SetLifetimeSpendCap(v int32)`

SetLifetimeSpendCap sets LifetimeSpendCap field to given value.

### HasLifetimeSpendCap

`func (o *Campaign) HasLifetimeSpendCap() bool`

HasLifetimeSpendCap returns a boolean if a field has been set.

### SetLifetimeSpendCapNil

`func (o *Campaign) SetLifetimeSpendCapNil(b bool)`

 SetLifetimeSpendCapNil sets the value for LifetimeSpendCap to be an explicit nil

### UnsetLifetimeSpendCap
`func (o *Campaign) UnsetLifetimeSpendCap()`

UnsetLifetimeSpendCap ensures that no value is present for LifetimeSpendCap, not even an explicit nil
### GetName

`func (o *Campaign) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Campaign) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Campaign) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Campaign) HasName() bool`

HasName returns a boolean if a field has been set.

### GetObjectiveType

`func (o *Campaign) GetObjectiveType() CampaignObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *Campaign) GetObjectiveTypeOk() (*CampaignObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *Campaign) SetObjectiveType(v CampaignObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.


### GetOrderLineId

`func (o *Campaign) GetOrderLineId() string`

GetOrderLineId returns the OrderLineId field if non-nil, zero value otherwise.

### GetOrderLineIdOk

`func (o *Campaign) GetOrderLineIdOk() (*string, bool)`

GetOrderLineIdOk returns a tuple with the OrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLineId

`func (o *Campaign) SetOrderLineId(v string)`

SetOrderLineId sets OrderLineId field to given value.

### HasOrderLineId

`func (o *Campaign) HasOrderLineId() bool`

HasOrderLineId returns a boolean if a field has been set.

### SetOrderLineIdNil

`func (o *Campaign) SetOrderLineIdNil(b bool)`

 SetOrderLineIdNil sets the value for OrderLineId to be an explicit nil

### UnsetOrderLineId
`func (o *Campaign) UnsetOrderLineId()`

UnsetOrderLineId ensures that no value is present for OrderLineId, not even an explicit nil
### GetPerformancePlusCampaignSettings

`func (o *Campaign) GetPerformancePlusCampaignSettings() PerformancePlusCampaignSettings`

GetPerformancePlusCampaignSettings returns the PerformancePlusCampaignSettings field if non-nil, zero value otherwise.

### GetPerformancePlusCampaignSettingsOk

`func (o *Campaign) GetPerformancePlusCampaignSettingsOk() (*PerformancePlusCampaignSettings, bool)`

GetPerformancePlusCampaignSettingsOk returns a tuple with the PerformancePlusCampaignSettings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerformancePlusCampaignSettings

`func (o *Campaign) SetPerformancePlusCampaignSettings(v PerformancePlusCampaignSettings)`

SetPerformancePlusCampaignSettings sets PerformancePlusCampaignSettings field to given value.

### HasPerformancePlusCampaignSettings

`func (o *Campaign) HasPerformancePlusCampaignSettings() bool`

HasPerformancePlusCampaignSettings returns a boolean if a field has been set.

### SetPerformancePlusCampaignSettingsNil

`func (o *Campaign) SetPerformancePlusCampaignSettingsNil(b bool)`

 SetPerformancePlusCampaignSettingsNil sets the value for PerformancePlusCampaignSettings to be an explicit nil

### UnsetPerformancePlusCampaignSettings
`func (o *Campaign) UnsetPerformancePlusCampaignSettings()`

UnsetPerformancePlusCampaignSettings ensures that no value is present for PerformancePlusCampaignSettings, not even an explicit nil
### GetStartTime

`func (o *Campaign) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *Campaign) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *Campaign) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *Campaign) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *Campaign) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *Campaign) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetStatus

`func (o *Campaign) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Campaign) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Campaign) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Campaign) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSummaryStatus

`func (o *Campaign) GetSummaryStatus() SummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *Campaign) GetSummaryStatusOk() (*SummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *Campaign) SetSummaryStatus(v SummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.

### HasSummaryStatus

`func (o *Campaign) HasSummaryStatus() bool`

HasSummaryStatus returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *Campaign) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *Campaign) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *Campaign) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *Campaign) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *Campaign) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *Campaign) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetType

`func (o *Campaign) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Campaign) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Campaign) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *Campaign) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *Campaign) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *Campaign) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *Campaign) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *Campaign) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


