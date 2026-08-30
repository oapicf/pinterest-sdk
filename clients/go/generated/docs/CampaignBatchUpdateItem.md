# CampaignBatchUpdateItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Setting this field does nothing. The ad account ID gets set from the path parameter. | [optional] 
**AppId** | Pointer to **string** | [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for &#x60;APP_INSTALL&#x60; campaigns. | [optional] 
**AppPlatform** | Pointer to [**MobileAppPlatform**](MobileAppPlatform.md) | [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for &#x60;APP_INSTALL&#x60; campaigns. | [optional] 
**BidOptions** | Pointer to [**NullableCampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) | Object describing an update to the campaign level bid multipliers. | [optional] 
**DailySpendCap** | Pointer to **NullableInt32** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. | [optional] 
**DefaultAdGroupBudgetInMicroCurrency** | Pointer to **NullableInt32** | Setting this field does nothing. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**Id** | **string** | Campaign ID, must be associated with the ad account ID provided in the path. | 
**IntendedPromotionType** | Pointer to [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] 
**IsAutomatedCampaign** | Pointer to **NullableBool** | Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES | [optional] 
**IsCampaignBudgetOptimization** | Pointer to **NullableBool** | Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. | [optional] 
**IsFlexibleDailyBudgets** | Pointer to **NullableBool** | Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. | [optional] 
**IsLtvOptimized** | Pointer to **bool** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**IsPerformancePlus** | Pointer to **bool** | Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) | [optional] 
**IsTopOfSearch** | Pointer to **bool** | Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. | [optional] 
**LifetimeSpendCap** | Pointer to **NullableInt32** | Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. | [optional] 
**Name** | Pointer to **string** | Campaign name - 255 chars max. | [optional] 
**ObjectiveType** | Pointer to [**ConversionObjectiveType**](ConversionObjectiveType.md) |  | [optional] 
**OrderLineId** | Pointer to **NullableString** | Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. | [optional] 
**PerformancePlusCampaignSettings** | Pointer to [**NullablePerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] 
**StartTime** | Pointer to **NullableInt32** | Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | Pointer to [**NullableTrackingUrls**](TrackingUrls.md) |  | [optional] 

## Methods

### NewCampaignBatchUpdateItem

`func NewCampaignBatchUpdateItem(id string, ) *CampaignBatchUpdateItem`

NewCampaignBatchUpdateItem instantiates a new CampaignBatchUpdateItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignBatchUpdateItemWithDefaults

`func NewCampaignBatchUpdateItemWithDefaults() *CampaignBatchUpdateItem`

NewCampaignBatchUpdateItemWithDefaults instantiates a new CampaignBatchUpdateItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *CampaignBatchUpdateItem) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CampaignBatchUpdateItem) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CampaignBatchUpdateItem) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *CampaignBatchUpdateItem) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAppId

`func (o *CampaignBatchUpdateItem) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *CampaignBatchUpdateItem) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *CampaignBatchUpdateItem) SetAppId(v string)`

SetAppId sets AppId field to given value.

### HasAppId

`func (o *CampaignBatchUpdateItem) HasAppId() bool`

HasAppId returns a boolean if a field has been set.

### GetAppPlatform

`func (o *CampaignBatchUpdateItem) GetAppPlatform() MobileAppPlatform`

GetAppPlatform returns the AppPlatform field if non-nil, zero value otherwise.

### GetAppPlatformOk

`func (o *CampaignBatchUpdateItem) GetAppPlatformOk() (*MobileAppPlatform, bool)`

GetAppPlatformOk returns a tuple with the AppPlatform field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppPlatform

`func (o *CampaignBatchUpdateItem) SetAppPlatform(v MobileAppPlatform)`

SetAppPlatform sets AppPlatform field to given value.

### HasAppPlatform

`func (o *CampaignBatchUpdateItem) HasAppPlatform() bool`

HasAppPlatform returns a boolean if a field has been set.

### GetBidOptions

`func (o *CampaignBatchUpdateItem) GetBidOptions() CampaignBidOptionsUpdate`

GetBidOptions returns the BidOptions field if non-nil, zero value otherwise.

### GetBidOptionsOk

`func (o *CampaignBatchUpdateItem) GetBidOptionsOk() (*CampaignBidOptionsUpdate, bool)`

GetBidOptionsOk returns a tuple with the BidOptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidOptions

`func (o *CampaignBatchUpdateItem) SetBidOptions(v CampaignBidOptionsUpdate)`

SetBidOptions sets BidOptions field to given value.

### HasBidOptions

`func (o *CampaignBatchUpdateItem) HasBidOptions() bool`

HasBidOptions returns a boolean if a field has been set.

### SetBidOptionsNil

`func (o *CampaignBatchUpdateItem) SetBidOptionsNil(b bool)`

 SetBidOptionsNil sets the value for BidOptions to be an explicit nil

### UnsetBidOptions
`func (o *CampaignBatchUpdateItem) UnsetBidOptions()`

UnsetBidOptions ensures that no value is present for BidOptions, not even an explicit nil
### GetDailySpendCap

`func (o *CampaignBatchUpdateItem) GetDailySpendCap() int32`

GetDailySpendCap returns the DailySpendCap field if non-nil, zero value otherwise.

### GetDailySpendCapOk

`func (o *CampaignBatchUpdateItem) GetDailySpendCapOk() (*int32, bool)`

GetDailySpendCapOk returns a tuple with the DailySpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailySpendCap

`func (o *CampaignBatchUpdateItem) SetDailySpendCap(v int32)`

SetDailySpendCap sets DailySpendCap field to given value.

### HasDailySpendCap

`func (o *CampaignBatchUpdateItem) HasDailySpendCap() bool`

HasDailySpendCap returns a boolean if a field has been set.

### SetDailySpendCapNil

`func (o *CampaignBatchUpdateItem) SetDailySpendCapNil(b bool)`

 SetDailySpendCapNil sets the value for DailySpendCap to be an explicit nil

### UnsetDailySpendCap
`func (o *CampaignBatchUpdateItem) UnsetDailySpendCap()`

UnsetDailySpendCap ensures that no value is present for DailySpendCap, not even an explicit nil
### GetDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignBatchUpdateItem) GetDefaultAdGroupBudgetInMicroCurrency() int32`

GetDefaultAdGroupBudgetInMicroCurrency returns the DefaultAdGroupBudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetDefaultAdGroupBudgetInMicroCurrencyOk

`func (o *CampaignBatchUpdateItem) GetDefaultAdGroupBudgetInMicroCurrencyOk() (*int32, bool)`

GetDefaultAdGroupBudgetInMicroCurrencyOk returns a tuple with the DefaultAdGroupBudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignBatchUpdateItem) SetDefaultAdGroupBudgetInMicroCurrency(v int32)`

SetDefaultAdGroupBudgetInMicroCurrency sets DefaultAdGroupBudgetInMicroCurrency field to given value.

### HasDefaultAdGroupBudgetInMicroCurrency

`func (o *CampaignBatchUpdateItem) HasDefaultAdGroupBudgetInMicroCurrency() bool`

HasDefaultAdGroupBudgetInMicroCurrency returns a boolean if a field has been set.

### SetDefaultAdGroupBudgetInMicroCurrencyNil

`func (o *CampaignBatchUpdateItem) SetDefaultAdGroupBudgetInMicroCurrencyNil(b bool)`

 SetDefaultAdGroupBudgetInMicroCurrencyNil sets the value for DefaultAdGroupBudgetInMicroCurrency to be an explicit nil

### UnsetDefaultAdGroupBudgetInMicroCurrency
`func (o *CampaignBatchUpdateItem) UnsetDefaultAdGroupBudgetInMicroCurrency()`

UnsetDefaultAdGroupBudgetInMicroCurrency ensures that no value is present for DefaultAdGroupBudgetInMicroCurrency, not even an explicit nil
### GetEndTime

`func (o *CampaignBatchUpdateItem) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *CampaignBatchUpdateItem) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *CampaignBatchUpdateItem) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *CampaignBatchUpdateItem) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *CampaignBatchUpdateItem) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *CampaignBatchUpdateItem) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetId

`func (o *CampaignBatchUpdateItem) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CampaignBatchUpdateItem) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CampaignBatchUpdateItem) SetId(v string)`

SetId sets Id field to given value.


### GetIntendedPromotionType

`func (o *CampaignBatchUpdateItem) GetIntendedPromotionType() IntendedPromotionType`

GetIntendedPromotionType returns the IntendedPromotionType field if non-nil, zero value otherwise.

### GetIntendedPromotionTypeOk

`func (o *CampaignBatchUpdateItem) GetIntendedPromotionTypeOk() (*IntendedPromotionType, bool)`

GetIntendedPromotionTypeOk returns a tuple with the IntendedPromotionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntendedPromotionType

`func (o *CampaignBatchUpdateItem) SetIntendedPromotionType(v IntendedPromotionType)`

SetIntendedPromotionType sets IntendedPromotionType field to given value.

### HasIntendedPromotionType

`func (o *CampaignBatchUpdateItem) HasIntendedPromotionType() bool`

HasIntendedPromotionType returns a boolean if a field has been set.

### GetIsAutomatedCampaign

`func (o *CampaignBatchUpdateItem) GetIsAutomatedCampaign() bool`

GetIsAutomatedCampaign returns the IsAutomatedCampaign field if non-nil, zero value otherwise.

### GetIsAutomatedCampaignOk

`func (o *CampaignBatchUpdateItem) GetIsAutomatedCampaignOk() (*bool, bool)`

GetIsAutomatedCampaignOk returns a tuple with the IsAutomatedCampaign field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAutomatedCampaign

`func (o *CampaignBatchUpdateItem) SetIsAutomatedCampaign(v bool)`

SetIsAutomatedCampaign sets IsAutomatedCampaign field to given value.

### HasIsAutomatedCampaign

`func (o *CampaignBatchUpdateItem) HasIsAutomatedCampaign() bool`

HasIsAutomatedCampaign returns a boolean if a field has been set.

### SetIsAutomatedCampaignNil

`func (o *CampaignBatchUpdateItem) SetIsAutomatedCampaignNil(b bool)`

 SetIsAutomatedCampaignNil sets the value for IsAutomatedCampaign to be an explicit nil

### UnsetIsAutomatedCampaign
`func (o *CampaignBatchUpdateItem) UnsetIsAutomatedCampaign()`

UnsetIsAutomatedCampaign ensures that no value is present for IsAutomatedCampaign, not even an explicit nil
### GetIsCampaignBudgetOptimization

`func (o *CampaignBatchUpdateItem) GetIsCampaignBudgetOptimization() bool`

GetIsCampaignBudgetOptimization returns the IsCampaignBudgetOptimization field if non-nil, zero value otherwise.

### GetIsCampaignBudgetOptimizationOk

`func (o *CampaignBatchUpdateItem) GetIsCampaignBudgetOptimizationOk() (*bool, bool)`

GetIsCampaignBudgetOptimizationOk returns a tuple with the IsCampaignBudgetOptimization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCampaignBudgetOptimization

`func (o *CampaignBatchUpdateItem) SetIsCampaignBudgetOptimization(v bool)`

SetIsCampaignBudgetOptimization sets IsCampaignBudgetOptimization field to given value.

### HasIsCampaignBudgetOptimization

`func (o *CampaignBatchUpdateItem) HasIsCampaignBudgetOptimization() bool`

HasIsCampaignBudgetOptimization returns a boolean if a field has been set.

### SetIsCampaignBudgetOptimizationNil

`func (o *CampaignBatchUpdateItem) SetIsCampaignBudgetOptimizationNil(b bool)`

 SetIsCampaignBudgetOptimizationNil sets the value for IsCampaignBudgetOptimization to be an explicit nil

### UnsetIsCampaignBudgetOptimization
`func (o *CampaignBatchUpdateItem) UnsetIsCampaignBudgetOptimization()`

UnsetIsCampaignBudgetOptimization ensures that no value is present for IsCampaignBudgetOptimization, not even an explicit nil
### GetIsFlexibleDailyBudgets

`func (o *CampaignBatchUpdateItem) GetIsFlexibleDailyBudgets() bool`

GetIsFlexibleDailyBudgets returns the IsFlexibleDailyBudgets field if non-nil, zero value otherwise.

### GetIsFlexibleDailyBudgetsOk

`func (o *CampaignBatchUpdateItem) GetIsFlexibleDailyBudgetsOk() (*bool, bool)`

GetIsFlexibleDailyBudgetsOk returns a tuple with the IsFlexibleDailyBudgets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFlexibleDailyBudgets

`func (o *CampaignBatchUpdateItem) SetIsFlexibleDailyBudgets(v bool)`

SetIsFlexibleDailyBudgets sets IsFlexibleDailyBudgets field to given value.

### HasIsFlexibleDailyBudgets

`func (o *CampaignBatchUpdateItem) HasIsFlexibleDailyBudgets() bool`

HasIsFlexibleDailyBudgets returns a boolean if a field has been set.

### SetIsFlexibleDailyBudgetsNil

`func (o *CampaignBatchUpdateItem) SetIsFlexibleDailyBudgetsNil(b bool)`

 SetIsFlexibleDailyBudgetsNil sets the value for IsFlexibleDailyBudgets to be an explicit nil

### UnsetIsFlexibleDailyBudgets
`func (o *CampaignBatchUpdateItem) UnsetIsFlexibleDailyBudgets()`

UnsetIsFlexibleDailyBudgets ensures that no value is present for IsFlexibleDailyBudgets, not even an explicit nil
### GetIsLtvOptimized

`func (o *CampaignBatchUpdateItem) GetIsLtvOptimized() bool`

GetIsLtvOptimized returns the IsLtvOptimized field if non-nil, zero value otherwise.

### GetIsLtvOptimizedOk

`func (o *CampaignBatchUpdateItem) GetIsLtvOptimizedOk() (*bool, bool)`

GetIsLtvOptimizedOk returns a tuple with the IsLtvOptimized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLtvOptimized

`func (o *CampaignBatchUpdateItem) SetIsLtvOptimized(v bool)`

SetIsLtvOptimized sets IsLtvOptimized field to given value.

### HasIsLtvOptimized

`func (o *CampaignBatchUpdateItem) HasIsLtvOptimized() bool`

HasIsLtvOptimized returns a boolean if a field has been set.

### GetIsPerformancePlus

`func (o *CampaignBatchUpdateItem) GetIsPerformancePlus() bool`

GetIsPerformancePlus returns the IsPerformancePlus field if non-nil, zero value otherwise.

### GetIsPerformancePlusOk

`func (o *CampaignBatchUpdateItem) GetIsPerformancePlusOk() (*bool, bool)`

GetIsPerformancePlusOk returns a tuple with the IsPerformancePlus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPerformancePlus

`func (o *CampaignBatchUpdateItem) SetIsPerformancePlus(v bool)`

SetIsPerformancePlus sets IsPerformancePlus field to given value.

### HasIsPerformancePlus

`func (o *CampaignBatchUpdateItem) HasIsPerformancePlus() bool`

HasIsPerformancePlus returns a boolean if a field has been set.

### GetIsTopOfSearch

`func (o *CampaignBatchUpdateItem) GetIsTopOfSearch() bool`

GetIsTopOfSearch returns the IsTopOfSearch field if non-nil, zero value otherwise.

### GetIsTopOfSearchOk

`func (o *CampaignBatchUpdateItem) GetIsTopOfSearchOk() (*bool, bool)`

GetIsTopOfSearchOk returns a tuple with the IsTopOfSearch field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsTopOfSearch

`func (o *CampaignBatchUpdateItem) SetIsTopOfSearch(v bool)`

SetIsTopOfSearch sets IsTopOfSearch field to given value.

### HasIsTopOfSearch

`func (o *CampaignBatchUpdateItem) HasIsTopOfSearch() bool`

HasIsTopOfSearch returns a boolean if a field has been set.

### GetLifetimeSpendCap

`func (o *CampaignBatchUpdateItem) GetLifetimeSpendCap() int32`

GetLifetimeSpendCap returns the LifetimeSpendCap field if non-nil, zero value otherwise.

### GetLifetimeSpendCapOk

`func (o *CampaignBatchUpdateItem) GetLifetimeSpendCapOk() (*int32, bool)`

GetLifetimeSpendCapOk returns a tuple with the LifetimeSpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeSpendCap

`func (o *CampaignBatchUpdateItem) SetLifetimeSpendCap(v int32)`

SetLifetimeSpendCap sets LifetimeSpendCap field to given value.

### HasLifetimeSpendCap

`func (o *CampaignBatchUpdateItem) HasLifetimeSpendCap() bool`

HasLifetimeSpendCap returns a boolean if a field has been set.

### SetLifetimeSpendCapNil

`func (o *CampaignBatchUpdateItem) SetLifetimeSpendCapNil(b bool)`

 SetLifetimeSpendCapNil sets the value for LifetimeSpendCap to be an explicit nil

### UnsetLifetimeSpendCap
`func (o *CampaignBatchUpdateItem) UnsetLifetimeSpendCap()`

UnsetLifetimeSpendCap ensures that no value is present for LifetimeSpendCap, not even an explicit nil
### GetName

`func (o *CampaignBatchUpdateItem) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CampaignBatchUpdateItem) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CampaignBatchUpdateItem) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CampaignBatchUpdateItem) HasName() bool`

HasName returns a boolean if a field has been set.

### GetObjectiveType

`func (o *CampaignBatchUpdateItem) GetObjectiveType() ConversionObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *CampaignBatchUpdateItem) GetObjectiveTypeOk() (*ConversionObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *CampaignBatchUpdateItem) SetObjectiveType(v ConversionObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *CampaignBatchUpdateItem) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.

### GetOrderLineId

`func (o *CampaignBatchUpdateItem) GetOrderLineId() string`

GetOrderLineId returns the OrderLineId field if non-nil, zero value otherwise.

### GetOrderLineIdOk

`func (o *CampaignBatchUpdateItem) GetOrderLineIdOk() (*string, bool)`

GetOrderLineIdOk returns a tuple with the OrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLineId

`func (o *CampaignBatchUpdateItem) SetOrderLineId(v string)`

SetOrderLineId sets OrderLineId field to given value.

### HasOrderLineId

`func (o *CampaignBatchUpdateItem) HasOrderLineId() bool`

HasOrderLineId returns a boolean if a field has been set.

### SetOrderLineIdNil

`func (o *CampaignBatchUpdateItem) SetOrderLineIdNil(b bool)`

 SetOrderLineIdNil sets the value for OrderLineId to be an explicit nil

### UnsetOrderLineId
`func (o *CampaignBatchUpdateItem) UnsetOrderLineId()`

UnsetOrderLineId ensures that no value is present for OrderLineId, not even an explicit nil
### GetPerformancePlusCampaignSettings

`func (o *CampaignBatchUpdateItem) GetPerformancePlusCampaignSettings() PerformancePlusCampaignSettings`

GetPerformancePlusCampaignSettings returns the PerformancePlusCampaignSettings field if non-nil, zero value otherwise.

### GetPerformancePlusCampaignSettingsOk

`func (o *CampaignBatchUpdateItem) GetPerformancePlusCampaignSettingsOk() (*PerformancePlusCampaignSettings, bool)`

GetPerformancePlusCampaignSettingsOk returns a tuple with the PerformancePlusCampaignSettings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerformancePlusCampaignSettings

`func (o *CampaignBatchUpdateItem) SetPerformancePlusCampaignSettings(v PerformancePlusCampaignSettings)`

SetPerformancePlusCampaignSettings sets PerformancePlusCampaignSettings field to given value.

### HasPerformancePlusCampaignSettings

`func (o *CampaignBatchUpdateItem) HasPerformancePlusCampaignSettings() bool`

HasPerformancePlusCampaignSettings returns a boolean if a field has been set.

### SetPerformancePlusCampaignSettingsNil

`func (o *CampaignBatchUpdateItem) SetPerformancePlusCampaignSettingsNil(b bool)`

 SetPerformancePlusCampaignSettingsNil sets the value for PerformancePlusCampaignSettings to be an explicit nil

### UnsetPerformancePlusCampaignSettings
`func (o *CampaignBatchUpdateItem) UnsetPerformancePlusCampaignSettings()`

UnsetPerformancePlusCampaignSettings ensures that no value is present for PerformancePlusCampaignSettings, not even an explicit nil
### GetStartTime

`func (o *CampaignBatchUpdateItem) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *CampaignBatchUpdateItem) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *CampaignBatchUpdateItem) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *CampaignBatchUpdateItem) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *CampaignBatchUpdateItem) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *CampaignBatchUpdateItem) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetStatus

`func (o *CampaignBatchUpdateItem) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CampaignBatchUpdateItem) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CampaignBatchUpdateItem) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CampaignBatchUpdateItem) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *CampaignBatchUpdateItem) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *CampaignBatchUpdateItem) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *CampaignBatchUpdateItem) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *CampaignBatchUpdateItem) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *CampaignBatchUpdateItem) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *CampaignBatchUpdateItem) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


