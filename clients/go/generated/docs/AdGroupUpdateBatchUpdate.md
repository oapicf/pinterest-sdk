# AdGroupUpdateBatchUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | Pointer to **NullableBool** | Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] 
**BidInMicroCurrency** | Pointer to **NullableInt32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**BidMultiplier** | Pointer to **float32** | [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). | [optional] 
**BidStrategyType** | Pointer to [**NullableBidStrategyType**](BidStrategyType.md) |  | [optional] 
**BillableEvent** | Pointer to [**ActionType**](ActionType.md) |  | [optional] 
**BudgetInMicroCurrency** | Pointer to **NullableInt32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**BudgetType** | Pointer to [**BudgetType**](BudgetType.md) |  | [optional] 
**CampaignId** | Pointer to **string** | Campaign ID of the ad group. | [optional] 
**CustomerSegmentId** | Pointer to **string** | Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. | [optional] 
**ExtFeatures** | Pointer to [**NullableAdgroupTrackingFeatures**](AdgroupTrackingFeatures.md) |  | [optional] 
**FeedProfileId** | Pointer to **string** | Feed Profile ID associated to the adgroup. | [optional] 
**Id** | **string** | Ad group ID. | 
**IsCreativeOptimization** | Pointer to **NullableBool** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional] 
**IsLocalInventory** | Pointer to **bool** | Indicates whether the ad group should use the local inventory. | [optional] 
**LifetimeFrequencyCap** | Pointer to **int32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**LocalInventoryRadiusInMiles** | Pointer to **float32** | The targeting radius of the local inventory ads in miles. | [optional] 
**Name** | Pointer to **string** | Ad group name. | [optional] 
**OptimizationGoalMetadata** | Pointer to [**NullableNullableOptimizationGoalMetadata**](NullableOptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. | [optional] 
**PacingDeliveryType** | Pointer to [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] 
**PerformancePlusCampaignSettings** | Pointer to [**NullablePerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] 
**PlacementGroup** | Pointer to [**PlacementGroupType**](PlacementGroupType.md) | [Placement group](https://help.pinterest.com/en/business/article/placement-groups). | [optional] 
**PlacementTrafficType** | Pointer to [**NullablePlacementTrafficType**](PlacementTrafficType.md) | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both | [optional] 
**PromotionApplicationLevel** | Pointer to [**NullablePromotionApplicationLevel**](PromotionApplicationLevel.md) | Specify if the promotion is applied at ad group or item level | [optional] 
**PromotionId** | Pointer to **NullableString** | Promotion ID. To clear this field, set to null. | [optional] [default to "0"]
**PromotionIds** | Pointer to **[]string** | Promotion IDs list. To clear this field, set to an empty array []. | [optional] 
**StartTime** | Pointer to **NullableInt32** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] 
**TargetingSpec** | Pointer to [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 
**TargetingSpecOperations** | Pointer to [**[]TargetingSpecOperations**](TargetingSpecOperations.md) |  | [optional] 
**TargetingTemplateIds** | Pointer to **[]string** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] 
**TrackingUrls** | Pointer to [**NullableAdGroupTrackingURLs**](AdGroupTrackingURLs.md) |  | [optional] 

## Methods

### NewAdGroupUpdateBatchUpdate

`func NewAdGroupUpdateBatchUpdate(id string, ) *AdGroupUpdateBatchUpdate`

NewAdGroupUpdateBatchUpdate instantiates a new AdGroupUpdateBatchUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupUpdateBatchUpdateWithDefaults

`func NewAdGroupUpdateBatchUpdateWithDefaults() *AdGroupUpdateBatchUpdate`

NewAdGroupUpdateBatchUpdateWithDefaults instantiates a new AdGroupUpdateBatchUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAutoTargetingEnabled

`func (o *AdGroupUpdateBatchUpdate) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *AdGroupUpdateBatchUpdate) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *AdGroupUpdateBatchUpdate) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *AdGroupUpdateBatchUpdate) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### SetAutoTargetingEnabledNil

`func (o *AdGroupUpdateBatchUpdate) SetAutoTargetingEnabledNil(b bool)`

 SetAutoTargetingEnabledNil sets the value for AutoTargetingEnabled to be an explicit nil

### UnsetAutoTargetingEnabled
`func (o *AdGroupUpdateBatchUpdate) UnsetAutoTargetingEnabled()`

UnsetAutoTargetingEnabled ensures that no value is present for AutoTargetingEnabled, not even an explicit nil
### GetBidInMicroCurrency

`func (o *AdGroupUpdateBatchUpdate) GetBidInMicroCurrency() int32`

GetBidInMicroCurrency returns the BidInMicroCurrency field if non-nil, zero value otherwise.

### GetBidInMicroCurrencyOk

`func (o *AdGroupUpdateBatchUpdate) GetBidInMicroCurrencyOk() (*int32, bool)`

GetBidInMicroCurrencyOk returns a tuple with the BidInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidInMicroCurrency

`func (o *AdGroupUpdateBatchUpdate) SetBidInMicroCurrency(v int32)`

SetBidInMicroCurrency sets BidInMicroCurrency field to given value.

### HasBidInMicroCurrency

`func (o *AdGroupUpdateBatchUpdate) HasBidInMicroCurrency() bool`

HasBidInMicroCurrency returns a boolean if a field has been set.

### SetBidInMicroCurrencyNil

`func (o *AdGroupUpdateBatchUpdate) SetBidInMicroCurrencyNil(b bool)`

 SetBidInMicroCurrencyNil sets the value for BidInMicroCurrency to be an explicit nil

### UnsetBidInMicroCurrency
`func (o *AdGroupUpdateBatchUpdate) UnsetBidInMicroCurrency()`

UnsetBidInMicroCurrency ensures that no value is present for BidInMicroCurrency, not even an explicit nil
### GetBidMultiplier

`func (o *AdGroupUpdateBatchUpdate) GetBidMultiplier() float32`

GetBidMultiplier returns the BidMultiplier field if non-nil, zero value otherwise.

### GetBidMultiplierOk

`func (o *AdGroupUpdateBatchUpdate) GetBidMultiplierOk() (*float32, bool)`

GetBidMultiplierOk returns a tuple with the BidMultiplier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidMultiplier

`func (o *AdGroupUpdateBatchUpdate) SetBidMultiplier(v float32)`

SetBidMultiplier sets BidMultiplier field to given value.

### HasBidMultiplier

`func (o *AdGroupUpdateBatchUpdate) HasBidMultiplier() bool`

HasBidMultiplier returns a boolean if a field has been set.

### GetBidStrategyType

`func (o *AdGroupUpdateBatchUpdate) GetBidStrategyType() BidStrategyType`

GetBidStrategyType returns the BidStrategyType field if non-nil, zero value otherwise.

### GetBidStrategyTypeOk

`func (o *AdGroupUpdateBatchUpdate) GetBidStrategyTypeOk() (*BidStrategyType, bool)`

GetBidStrategyTypeOk returns a tuple with the BidStrategyType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidStrategyType

`func (o *AdGroupUpdateBatchUpdate) SetBidStrategyType(v BidStrategyType)`

SetBidStrategyType sets BidStrategyType field to given value.

### HasBidStrategyType

`func (o *AdGroupUpdateBatchUpdate) HasBidStrategyType() bool`

HasBidStrategyType returns a boolean if a field has been set.

### SetBidStrategyTypeNil

`func (o *AdGroupUpdateBatchUpdate) SetBidStrategyTypeNil(b bool)`

 SetBidStrategyTypeNil sets the value for BidStrategyType to be an explicit nil

### UnsetBidStrategyType
`func (o *AdGroupUpdateBatchUpdate) UnsetBidStrategyType()`

UnsetBidStrategyType ensures that no value is present for BidStrategyType, not even an explicit nil
### GetBillableEvent

`func (o *AdGroupUpdateBatchUpdate) GetBillableEvent() ActionType`

GetBillableEvent returns the BillableEvent field if non-nil, zero value otherwise.

### GetBillableEventOk

`func (o *AdGroupUpdateBatchUpdate) GetBillableEventOk() (*ActionType, bool)`

GetBillableEventOk returns a tuple with the BillableEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillableEvent

`func (o *AdGroupUpdateBatchUpdate) SetBillableEvent(v ActionType)`

SetBillableEvent sets BillableEvent field to given value.

### HasBillableEvent

`func (o *AdGroupUpdateBatchUpdate) HasBillableEvent() bool`

HasBillableEvent returns a boolean if a field has been set.

### GetBudgetInMicroCurrency

`func (o *AdGroupUpdateBatchUpdate) GetBudgetInMicroCurrency() int32`

GetBudgetInMicroCurrency returns the BudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetBudgetInMicroCurrencyOk

`func (o *AdGroupUpdateBatchUpdate) GetBudgetInMicroCurrencyOk() (*int32, bool)`

GetBudgetInMicroCurrencyOk returns a tuple with the BudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetInMicroCurrency

`func (o *AdGroupUpdateBatchUpdate) SetBudgetInMicroCurrency(v int32)`

SetBudgetInMicroCurrency sets BudgetInMicroCurrency field to given value.

### HasBudgetInMicroCurrency

`func (o *AdGroupUpdateBatchUpdate) HasBudgetInMicroCurrency() bool`

HasBudgetInMicroCurrency returns a boolean if a field has been set.

### SetBudgetInMicroCurrencyNil

`func (o *AdGroupUpdateBatchUpdate) SetBudgetInMicroCurrencyNil(b bool)`

 SetBudgetInMicroCurrencyNil sets the value for BudgetInMicroCurrency to be an explicit nil

### UnsetBudgetInMicroCurrency
`func (o *AdGroupUpdateBatchUpdate) UnsetBudgetInMicroCurrency()`

UnsetBudgetInMicroCurrency ensures that no value is present for BudgetInMicroCurrency, not even an explicit nil
### GetBudgetType

`func (o *AdGroupUpdateBatchUpdate) GetBudgetType() BudgetType`

GetBudgetType returns the BudgetType field if non-nil, zero value otherwise.

### GetBudgetTypeOk

`func (o *AdGroupUpdateBatchUpdate) GetBudgetTypeOk() (*BudgetType, bool)`

GetBudgetTypeOk returns a tuple with the BudgetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetType

`func (o *AdGroupUpdateBatchUpdate) SetBudgetType(v BudgetType)`

SetBudgetType sets BudgetType field to given value.

### HasBudgetType

`func (o *AdGroupUpdateBatchUpdate) HasBudgetType() bool`

HasBudgetType returns a boolean if a field has been set.

### GetCampaignId

`func (o *AdGroupUpdateBatchUpdate) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *AdGroupUpdateBatchUpdate) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *AdGroupUpdateBatchUpdate) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *AdGroupUpdateBatchUpdate) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetCustomerSegmentId

`func (o *AdGroupUpdateBatchUpdate) GetCustomerSegmentId() string`

GetCustomerSegmentId returns the CustomerSegmentId field if non-nil, zero value otherwise.

### GetCustomerSegmentIdOk

`func (o *AdGroupUpdateBatchUpdate) GetCustomerSegmentIdOk() (*string, bool)`

GetCustomerSegmentIdOk returns a tuple with the CustomerSegmentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerSegmentId

`func (o *AdGroupUpdateBatchUpdate) SetCustomerSegmentId(v string)`

SetCustomerSegmentId sets CustomerSegmentId field to given value.

### HasCustomerSegmentId

`func (o *AdGroupUpdateBatchUpdate) HasCustomerSegmentId() bool`

HasCustomerSegmentId returns a boolean if a field has been set.

### GetEndTime

`func (o *AdGroupUpdateBatchUpdate) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *AdGroupUpdateBatchUpdate) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *AdGroupUpdateBatchUpdate) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *AdGroupUpdateBatchUpdate) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *AdGroupUpdateBatchUpdate) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *AdGroupUpdateBatchUpdate) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetExtFeatures

`func (o *AdGroupUpdateBatchUpdate) GetExtFeatures() AdgroupTrackingFeatures`

GetExtFeatures returns the ExtFeatures field if non-nil, zero value otherwise.

### GetExtFeaturesOk

`func (o *AdGroupUpdateBatchUpdate) GetExtFeaturesOk() (*AdgroupTrackingFeatures, bool)`

GetExtFeaturesOk returns a tuple with the ExtFeatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtFeatures

`func (o *AdGroupUpdateBatchUpdate) SetExtFeatures(v AdgroupTrackingFeatures)`

SetExtFeatures sets ExtFeatures field to given value.

### HasExtFeatures

`func (o *AdGroupUpdateBatchUpdate) HasExtFeatures() bool`

HasExtFeatures returns a boolean if a field has been set.

### SetExtFeaturesNil

`func (o *AdGroupUpdateBatchUpdate) SetExtFeaturesNil(b bool)`

 SetExtFeaturesNil sets the value for ExtFeatures to be an explicit nil

### UnsetExtFeatures
`func (o *AdGroupUpdateBatchUpdate) UnsetExtFeatures()`

UnsetExtFeatures ensures that no value is present for ExtFeatures, not even an explicit nil
### GetFeedProfileId

`func (o *AdGroupUpdateBatchUpdate) GetFeedProfileId() string`

GetFeedProfileId returns the FeedProfileId field if non-nil, zero value otherwise.

### GetFeedProfileIdOk

`func (o *AdGroupUpdateBatchUpdate) GetFeedProfileIdOk() (*string, bool)`

GetFeedProfileIdOk returns a tuple with the FeedProfileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedProfileId

`func (o *AdGroupUpdateBatchUpdate) SetFeedProfileId(v string)`

SetFeedProfileId sets FeedProfileId field to given value.

### HasFeedProfileId

`func (o *AdGroupUpdateBatchUpdate) HasFeedProfileId() bool`

HasFeedProfileId returns a boolean if a field has been set.

### GetId

`func (o *AdGroupUpdateBatchUpdate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdGroupUpdateBatchUpdate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdGroupUpdateBatchUpdate) SetId(v string)`

SetId sets Id field to given value.


### GetIsCreativeOptimization

`func (o *AdGroupUpdateBatchUpdate) GetIsCreativeOptimization() bool`

GetIsCreativeOptimization returns the IsCreativeOptimization field if non-nil, zero value otherwise.

### GetIsCreativeOptimizationOk

`func (o *AdGroupUpdateBatchUpdate) GetIsCreativeOptimizationOk() (*bool, bool)`

GetIsCreativeOptimizationOk returns a tuple with the IsCreativeOptimization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCreativeOptimization

`func (o *AdGroupUpdateBatchUpdate) SetIsCreativeOptimization(v bool)`

SetIsCreativeOptimization sets IsCreativeOptimization field to given value.

### HasIsCreativeOptimization

`func (o *AdGroupUpdateBatchUpdate) HasIsCreativeOptimization() bool`

HasIsCreativeOptimization returns a boolean if a field has been set.

### SetIsCreativeOptimizationNil

`func (o *AdGroupUpdateBatchUpdate) SetIsCreativeOptimizationNil(b bool)`

 SetIsCreativeOptimizationNil sets the value for IsCreativeOptimization to be an explicit nil

### UnsetIsCreativeOptimization
`func (o *AdGroupUpdateBatchUpdate) UnsetIsCreativeOptimization()`

UnsetIsCreativeOptimization ensures that no value is present for IsCreativeOptimization, not even an explicit nil
### GetIsLocalInventory

`func (o *AdGroupUpdateBatchUpdate) GetIsLocalInventory() bool`

GetIsLocalInventory returns the IsLocalInventory field if non-nil, zero value otherwise.

### GetIsLocalInventoryOk

`func (o *AdGroupUpdateBatchUpdate) GetIsLocalInventoryOk() (*bool, bool)`

GetIsLocalInventoryOk returns a tuple with the IsLocalInventory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLocalInventory

`func (o *AdGroupUpdateBatchUpdate) SetIsLocalInventory(v bool)`

SetIsLocalInventory sets IsLocalInventory field to given value.

### HasIsLocalInventory

`func (o *AdGroupUpdateBatchUpdate) HasIsLocalInventory() bool`

HasIsLocalInventory returns a boolean if a field has been set.

### GetLifetimeFrequencyCap

`func (o *AdGroupUpdateBatchUpdate) GetLifetimeFrequencyCap() int32`

GetLifetimeFrequencyCap returns the LifetimeFrequencyCap field if non-nil, zero value otherwise.

### GetLifetimeFrequencyCapOk

`func (o *AdGroupUpdateBatchUpdate) GetLifetimeFrequencyCapOk() (*int32, bool)`

GetLifetimeFrequencyCapOk returns a tuple with the LifetimeFrequencyCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeFrequencyCap

`func (o *AdGroupUpdateBatchUpdate) SetLifetimeFrequencyCap(v int32)`

SetLifetimeFrequencyCap sets LifetimeFrequencyCap field to given value.

### HasLifetimeFrequencyCap

`func (o *AdGroupUpdateBatchUpdate) HasLifetimeFrequencyCap() bool`

HasLifetimeFrequencyCap returns a boolean if a field has been set.

### GetLocalInventoryRadiusInMiles

`func (o *AdGroupUpdateBatchUpdate) GetLocalInventoryRadiusInMiles() float32`

GetLocalInventoryRadiusInMiles returns the LocalInventoryRadiusInMiles field if non-nil, zero value otherwise.

### GetLocalInventoryRadiusInMilesOk

`func (o *AdGroupUpdateBatchUpdate) GetLocalInventoryRadiusInMilesOk() (*float32, bool)`

GetLocalInventoryRadiusInMilesOk returns a tuple with the LocalInventoryRadiusInMiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocalInventoryRadiusInMiles

`func (o *AdGroupUpdateBatchUpdate) SetLocalInventoryRadiusInMiles(v float32)`

SetLocalInventoryRadiusInMiles sets LocalInventoryRadiusInMiles field to given value.

### HasLocalInventoryRadiusInMiles

`func (o *AdGroupUpdateBatchUpdate) HasLocalInventoryRadiusInMiles() bool`

HasLocalInventoryRadiusInMiles returns a boolean if a field has been set.

### GetName

`func (o *AdGroupUpdateBatchUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdGroupUpdateBatchUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdGroupUpdateBatchUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdGroupUpdateBatchUpdate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOptimizationGoalMetadata

`func (o *AdGroupUpdateBatchUpdate) GetOptimizationGoalMetadata() NullableOptimizationGoalMetadata`

GetOptimizationGoalMetadata returns the OptimizationGoalMetadata field if non-nil, zero value otherwise.

### GetOptimizationGoalMetadataOk

`func (o *AdGroupUpdateBatchUpdate) GetOptimizationGoalMetadataOk() (*NullableOptimizationGoalMetadata, bool)`

GetOptimizationGoalMetadataOk returns a tuple with the OptimizationGoalMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptimizationGoalMetadata

`func (o *AdGroupUpdateBatchUpdate) SetOptimizationGoalMetadata(v NullableOptimizationGoalMetadata)`

SetOptimizationGoalMetadata sets OptimizationGoalMetadata field to given value.

### HasOptimizationGoalMetadata

`func (o *AdGroupUpdateBatchUpdate) HasOptimizationGoalMetadata() bool`

HasOptimizationGoalMetadata returns a boolean if a field has been set.

### SetOptimizationGoalMetadataNil

`func (o *AdGroupUpdateBatchUpdate) SetOptimizationGoalMetadataNil(b bool)`

 SetOptimizationGoalMetadataNil sets the value for OptimizationGoalMetadata to be an explicit nil

### UnsetOptimizationGoalMetadata
`func (o *AdGroupUpdateBatchUpdate) UnsetOptimizationGoalMetadata()`

UnsetOptimizationGoalMetadata ensures that no value is present for OptimizationGoalMetadata, not even an explicit nil
### GetPacingDeliveryType

`func (o *AdGroupUpdateBatchUpdate) GetPacingDeliveryType() PacingDeliveryType`

GetPacingDeliveryType returns the PacingDeliveryType field if non-nil, zero value otherwise.

### GetPacingDeliveryTypeOk

`func (o *AdGroupUpdateBatchUpdate) GetPacingDeliveryTypeOk() (*PacingDeliveryType, bool)`

GetPacingDeliveryTypeOk returns a tuple with the PacingDeliveryType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPacingDeliveryType

`func (o *AdGroupUpdateBatchUpdate) SetPacingDeliveryType(v PacingDeliveryType)`

SetPacingDeliveryType sets PacingDeliveryType field to given value.

### HasPacingDeliveryType

`func (o *AdGroupUpdateBatchUpdate) HasPacingDeliveryType() bool`

HasPacingDeliveryType returns a boolean if a field has been set.

### GetPerformancePlusCampaignSettings

`func (o *AdGroupUpdateBatchUpdate) GetPerformancePlusCampaignSettings() PerformancePlusCampaignSettings`

GetPerformancePlusCampaignSettings returns the PerformancePlusCampaignSettings field if non-nil, zero value otherwise.

### GetPerformancePlusCampaignSettingsOk

`func (o *AdGroupUpdateBatchUpdate) GetPerformancePlusCampaignSettingsOk() (*PerformancePlusCampaignSettings, bool)`

GetPerformancePlusCampaignSettingsOk returns a tuple with the PerformancePlusCampaignSettings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerformancePlusCampaignSettings

`func (o *AdGroupUpdateBatchUpdate) SetPerformancePlusCampaignSettings(v PerformancePlusCampaignSettings)`

SetPerformancePlusCampaignSettings sets PerformancePlusCampaignSettings field to given value.

### HasPerformancePlusCampaignSettings

`func (o *AdGroupUpdateBatchUpdate) HasPerformancePlusCampaignSettings() bool`

HasPerformancePlusCampaignSettings returns a boolean if a field has been set.

### SetPerformancePlusCampaignSettingsNil

`func (o *AdGroupUpdateBatchUpdate) SetPerformancePlusCampaignSettingsNil(b bool)`

 SetPerformancePlusCampaignSettingsNil sets the value for PerformancePlusCampaignSettings to be an explicit nil

### UnsetPerformancePlusCampaignSettings
`func (o *AdGroupUpdateBatchUpdate) UnsetPerformancePlusCampaignSettings()`

UnsetPerformancePlusCampaignSettings ensures that no value is present for PerformancePlusCampaignSettings, not even an explicit nil
### GetPlacementGroup

`func (o *AdGroupUpdateBatchUpdate) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *AdGroupUpdateBatchUpdate) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *AdGroupUpdateBatchUpdate) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *AdGroupUpdateBatchUpdate) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetPlacementTrafficType

`func (o *AdGroupUpdateBatchUpdate) GetPlacementTrafficType() PlacementTrafficType`

GetPlacementTrafficType returns the PlacementTrafficType field if non-nil, zero value otherwise.

### GetPlacementTrafficTypeOk

`func (o *AdGroupUpdateBatchUpdate) GetPlacementTrafficTypeOk() (*PlacementTrafficType, bool)`

GetPlacementTrafficTypeOk returns a tuple with the PlacementTrafficType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementTrafficType

`func (o *AdGroupUpdateBatchUpdate) SetPlacementTrafficType(v PlacementTrafficType)`

SetPlacementTrafficType sets PlacementTrafficType field to given value.

### HasPlacementTrafficType

`func (o *AdGroupUpdateBatchUpdate) HasPlacementTrafficType() bool`

HasPlacementTrafficType returns a boolean if a field has been set.

### SetPlacementTrafficTypeNil

`func (o *AdGroupUpdateBatchUpdate) SetPlacementTrafficTypeNil(b bool)`

 SetPlacementTrafficTypeNil sets the value for PlacementTrafficType to be an explicit nil

### UnsetPlacementTrafficType
`func (o *AdGroupUpdateBatchUpdate) UnsetPlacementTrafficType()`

UnsetPlacementTrafficType ensures that no value is present for PlacementTrafficType, not even an explicit nil
### GetPromotionApplicationLevel

`func (o *AdGroupUpdateBatchUpdate) GetPromotionApplicationLevel() PromotionApplicationLevel`

GetPromotionApplicationLevel returns the PromotionApplicationLevel field if non-nil, zero value otherwise.

### GetPromotionApplicationLevelOk

`func (o *AdGroupUpdateBatchUpdate) GetPromotionApplicationLevelOk() (*PromotionApplicationLevel, bool)`

GetPromotionApplicationLevelOk returns a tuple with the PromotionApplicationLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionApplicationLevel

`func (o *AdGroupUpdateBatchUpdate) SetPromotionApplicationLevel(v PromotionApplicationLevel)`

SetPromotionApplicationLevel sets PromotionApplicationLevel field to given value.

### HasPromotionApplicationLevel

`func (o *AdGroupUpdateBatchUpdate) HasPromotionApplicationLevel() bool`

HasPromotionApplicationLevel returns a boolean if a field has been set.

### SetPromotionApplicationLevelNil

`func (o *AdGroupUpdateBatchUpdate) SetPromotionApplicationLevelNil(b bool)`

 SetPromotionApplicationLevelNil sets the value for PromotionApplicationLevel to be an explicit nil

### UnsetPromotionApplicationLevel
`func (o *AdGroupUpdateBatchUpdate) UnsetPromotionApplicationLevel()`

UnsetPromotionApplicationLevel ensures that no value is present for PromotionApplicationLevel, not even an explicit nil
### GetPromotionId

`func (o *AdGroupUpdateBatchUpdate) GetPromotionId() string`

GetPromotionId returns the PromotionId field if non-nil, zero value otherwise.

### GetPromotionIdOk

`func (o *AdGroupUpdateBatchUpdate) GetPromotionIdOk() (*string, bool)`

GetPromotionIdOk returns a tuple with the PromotionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionId

`func (o *AdGroupUpdateBatchUpdate) SetPromotionId(v string)`

SetPromotionId sets PromotionId field to given value.

### HasPromotionId

`func (o *AdGroupUpdateBatchUpdate) HasPromotionId() bool`

HasPromotionId returns a boolean if a field has been set.

### SetPromotionIdNil

`func (o *AdGroupUpdateBatchUpdate) SetPromotionIdNil(b bool)`

 SetPromotionIdNil sets the value for PromotionId to be an explicit nil

### UnsetPromotionId
`func (o *AdGroupUpdateBatchUpdate) UnsetPromotionId()`

UnsetPromotionId ensures that no value is present for PromotionId, not even an explicit nil
### GetPromotionIds

`func (o *AdGroupUpdateBatchUpdate) GetPromotionIds() []string`

GetPromotionIds returns the PromotionIds field if non-nil, zero value otherwise.

### GetPromotionIdsOk

`func (o *AdGroupUpdateBatchUpdate) GetPromotionIdsOk() (*[]string, bool)`

GetPromotionIdsOk returns a tuple with the PromotionIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionIds

`func (o *AdGroupUpdateBatchUpdate) SetPromotionIds(v []string)`

SetPromotionIds sets PromotionIds field to given value.

### HasPromotionIds

`func (o *AdGroupUpdateBatchUpdate) HasPromotionIds() bool`

HasPromotionIds returns a boolean if a field has been set.

### GetStartTime

`func (o *AdGroupUpdateBatchUpdate) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *AdGroupUpdateBatchUpdate) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *AdGroupUpdateBatchUpdate) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *AdGroupUpdateBatchUpdate) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *AdGroupUpdateBatchUpdate) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *AdGroupUpdateBatchUpdate) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetStatus

`func (o *AdGroupUpdateBatchUpdate) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdGroupUpdateBatchUpdate) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdGroupUpdateBatchUpdate) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdGroupUpdateBatchUpdate) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTargetingSpec

`func (o *AdGroupUpdateBatchUpdate) GetTargetingSpec() TargetingSpecOptimal`

GetTargetingSpec returns the TargetingSpec field if non-nil, zero value otherwise.

### GetTargetingSpecOk

`func (o *AdGroupUpdateBatchUpdate) GetTargetingSpecOk() (*TargetingSpecOptimal, bool)`

GetTargetingSpecOk returns a tuple with the TargetingSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpec

`func (o *AdGroupUpdateBatchUpdate) SetTargetingSpec(v TargetingSpecOptimal)`

SetTargetingSpec sets TargetingSpec field to given value.

### HasTargetingSpec

`func (o *AdGroupUpdateBatchUpdate) HasTargetingSpec() bool`

HasTargetingSpec returns a boolean if a field has been set.

### GetTargetingSpecOperations

`func (o *AdGroupUpdateBatchUpdate) GetTargetingSpecOperations() []TargetingSpecOperations`

GetTargetingSpecOperations returns the TargetingSpecOperations field if non-nil, zero value otherwise.

### GetTargetingSpecOperationsOk

`func (o *AdGroupUpdateBatchUpdate) GetTargetingSpecOperationsOk() (*[]TargetingSpecOperations, bool)`

GetTargetingSpecOperationsOk returns a tuple with the TargetingSpecOperations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpecOperations

`func (o *AdGroupUpdateBatchUpdate) SetTargetingSpecOperations(v []TargetingSpecOperations)`

SetTargetingSpecOperations sets TargetingSpecOperations field to given value.

### HasTargetingSpecOperations

`func (o *AdGroupUpdateBatchUpdate) HasTargetingSpecOperations() bool`

HasTargetingSpecOperations returns a boolean if a field has been set.

### GetTargetingTemplateIds

`func (o *AdGroupUpdateBatchUpdate) GetTargetingTemplateIds() []string`

GetTargetingTemplateIds returns the TargetingTemplateIds field if non-nil, zero value otherwise.

### GetTargetingTemplateIdsOk

`func (o *AdGroupUpdateBatchUpdate) GetTargetingTemplateIdsOk() (*[]string, bool)`

GetTargetingTemplateIdsOk returns a tuple with the TargetingTemplateIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingTemplateIds

`func (o *AdGroupUpdateBatchUpdate) SetTargetingTemplateIds(v []string)`

SetTargetingTemplateIds sets TargetingTemplateIds field to given value.

### HasTargetingTemplateIds

`func (o *AdGroupUpdateBatchUpdate) HasTargetingTemplateIds() bool`

HasTargetingTemplateIds returns a boolean if a field has been set.

### SetTargetingTemplateIdsNil

`func (o *AdGroupUpdateBatchUpdate) SetTargetingTemplateIdsNil(b bool)`

 SetTargetingTemplateIdsNil sets the value for TargetingTemplateIds to be an explicit nil

### UnsetTargetingTemplateIds
`func (o *AdGroupUpdateBatchUpdate) UnsetTargetingTemplateIds()`

UnsetTargetingTemplateIds ensures that no value is present for TargetingTemplateIds, not even an explicit nil
### GetTrackingUrls

`func (o *AdGroupUpdateBatchUpdate) GetTrackingUrls() AdGroupTrackingURLs`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdGroupUpdateBatchUpdate) GetTrackingUrlsOk() (*AdGroupTrackingURLs, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdGroupUpdateBatchUpdate) SetTrackingUrls(v AdGroupTrackingURLs)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdGroupUpdateBatchUpdate) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdGroupUpdateBatchUpdate) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdGroupUpdateBatchUpdate) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


