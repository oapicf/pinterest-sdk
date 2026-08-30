# AdGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | Advertiser ID. | [optional] [readonly] 
**BidInMicroCurrency** | Pointer to **NullableInt32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**BidStrategyType** | Pointer to [**NullableBidStrategyType**](BidStrategyType.md) |  | [optional] 
**BillableEvent** | [**ActionType**](ActionType.md) |  | 
**BudgetInMicroCurrency** | Pointer to **NullableInt32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**CampaignId** | **string** | Campaign ID of the ad group. | 
**ConversionLearningModeType** | [**NullableConversionLearningModeType**](ConversionLearningModeType.md) | oCPM learn mode | [readonly] 
**CreatedTime** | **int32** | Ad group creation time. Unix timestamp in seconds. | [readonly] 
**CustomerSegmentId** | Pointer to **string** | Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;. | [optional] 
**DcaAssets** | Pointer to **interface{}** | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] [readonly] 
**EndTime** | Pointer to **NullableInt32** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. | [optional] 
**ExtFeatures** | Pointer to [**NullableAdgroupTrackingFeatures**](AdgroupTrackingFeatures.md) |  | [optional] 
**FeedProfileId** | Pointer to **string** | Feed Profile ID associated to the adgroup. | [optional] 
**Id** | **string** | Ad group ID. | 
**IsCreativeOptimization** | Pointer to **NullableBool** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional] 
**IsLocalInventory** | Pointer to **bool** | Indicates whether the ad group should use the local inventory. | [optional] 
**LifetimeFrequencyCap** | Pointer to **int32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**LocalInventoryRadiusInMiles** | Pointer to **float32** | The targeting radius of the local inventory ads in miles. | [optional] 
**Name** | **string** | Ad group name. | 
**OptimizationGoalMetadata** | Pointer to [**NullableNullableOptimizationGoalMetadata**](NullableOptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. | [optional] 
**PerformancePlusCampaignSettings** | Pointer to [**NullablePerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] 
**PlacementGroup** | Pointer to [**PlacementGroupType**](PlacementGroupType.md) | [Placement group](https://help.pinterest.com/en/business/article/placement-groups). | [optional] 
**PlacementTrafficType** | Pointer to [**NullablePlacementTrafficType**](PlacementTrafficType.md) | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both | [optional] 
**PromotionApplicationLevel** | Pointer to [**NullablePromotionApplicationLevel**](PromotionApplicationLevel.md) | Specify if the promotion is applied at ad group or item level | [optional] 
**PromotionId** | Pointer to **NullableString** | Promotion ID. To clear this field, set to null. | [optional] [default to "0"]
**PromotionIds** | Pointer to **[]string** | Promotion IDs list. To clear this field, set to an empty array []. | [optional] 
**StartTime** | Pointer to **NullableInt32** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] 
**SummaryStatus** | [**SummaryStatus**](SummaryStatus.md) |  | [readonly] 
**TargetingSpec** | Pointer to [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 
**TargetingTemplateIds** | Pointer to **[]string** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] 
**TrackingUrls** | Pointer to [**NullableAdGroupTrackingURLs**](AdGroupTrackingURLs.md) |  | [optional] 
**Type** | **string** | Always \&quot;adgroup\&quot;. | [readonly] [default to "adgroup"]
**UpdatedTime** | **int32** | Ad group last update time. Unix timestamp in seconds. | [readonly] 
**AutoTargetingEnabled** | Pointer to **NullableBool** | Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] 
**BidMultiplier** | Pointer to **NullableFloat32** | [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). | [optional] 
**BudgetType** | Pointer to [**BudgetType**](BudgetType.md) |  | [optional] 
**PacingDeliveryType** | Pointer to [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] 

## Methods

### NewAdGroup

`func NewAdGroup(billableEvent ActionType, campaignId string, conversionLearningModeType NullableConversionLearningModeType, createdTime int32, id string, name string, summaryStatus SummaryStatus, type_ string, updatedTime int32, ) *AdGroup`

NewAdGroup instantiates a new AdGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupWithDefaults

`func NewAdGroupWithDefaults() *AdGroup`

NewAdGroupWithDefaults instantiates a new AdGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AdGroup) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdGroup) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdGroup) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdGroup) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetBidInMicroCurrency

`func (o *AdGroup) GetBidInMicroCurrency() int32`

GetBidInMicroCurrency returns the BidInMicroCurrency field if non-nil, zero value otherwise.

### GetBidInMicroCurrencyOk

`func (o *AdGroup) GetBidInMicroCurrencyOk() (*int32, bool)`

GetBidInMicroCurrencyOk returns a tuple with the BidInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidInMicroCurrency

`func (o *AdGroup) SetBidInMicroCurrency(v int32)`

SetBidInMicroCurrency sets BidInMicroCurrency field to given value.

### HasBidInMicroCurrency

`func (o *AdGroup) HasBidInMicroCurrency() bool`

HasBidInMicroCurrency returns a boolean if a field has been set.

### SetBidInMicroCurrencyNil

`func (o *AdGroup) SetBidInMicroCurrencyNil(b bool)`

 SetBidInMicroCurrencyNil sets the value for BidInMicroCurrency to be an explicit nil

### UnsetBidInMicroCurrency
`func (o *AdGroup) UnsetBidInMicroCurrency()`

UnsetBidInMicroCurrency ensures that no value is present for BidInMicroCurrency, not even an explicit nil
### GetBidStrategyType

`func (o *AdGroup) GetBidStrategyType() BidStrategyType`

GetBidStrategyType returns the BidStrategyType field if non-nil, zero value otherwise.

### GetBidStrategyTypeOk

`func (o *AdGroup) GetBidStrategyTypeOk() (*BidStrategyType, bool)`

GetBidStrategyTypeOk returns a tuple with the BidStrategyType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidStrategyType

`func (o *AdGroup) SetBidStrategyType(v BidStrategyType)`

SetBidStrategyType sets BidStrategyType field to given value.

### HasBidStrategyType

`func (o *AdGroup) HasBidStrategyType() bool`

HasBidStrategyType returns a boolean if a field has been set.

### SetBidStrategyTypeNil

`func (o *AdGroup) SetBidStrategyTypeNil(b bool)`

 SetBidStrategyTypeNil sets the value for BidStrategyType to be an explicit nil

### UnsetBidStrategyType
`func (o *AdGroup) UnsetBidStrategyType()`

UnsetBidStrategyType ensures that no value is present for BidStrategyType, not even an explicit nil
### GetBillableEvent

`func (o *AdGroup) GetBillableEvent() ActionType`

GetBillableEvent returns the BillableEvent field if non-nil, zero value otherwise.

### GetBillableEventOk

`func (o *AdGroup) GetBillableEventOk() (*ActionType, bool)`

GetBillableEventOk returns a tuple with the BillableEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillableEvent

`func (o *AdGroup) SetBillableEvent(v ActionType)`

SetBillableEvent sets BillableEvent field to given value.


### GetBudgetInMicroCurrency

`func (o *AdGroup) GetBudgetInMicroCurrency() int32`

GetBudgetInMicroCurrency returns the BudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetBudgetInMicroCurrencyOk

`func (o *AdGroup) GetBudgetInMicroCurrencyOk() (*int32, bool)`

GetBudgetInMicroCurrencyOk returns a tuple with the BudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetInMicroCurrency

`func (o *AdGroup) SetBudgetInMicroCurrency(v int32)`

SetBudgetInMicroCurrency sets BudgetInMicroCurrency field to given value.

### HasBudgetInMicroCurrency

`func (o *AdGroup) HasBudgetInMicroCurrency() bool`

HasBudgetInMicroCurrency returns a boolean if a field has been set.

### SetBudgetInMicroCurrencyNil

`func (o *AdGroup) SetBudgetInMicroCurrencyNil(b bool)`

 SetBudgetInMicroCurrencyNil sets the value for BudgetInMicroCurrency to be an explicit nil

### UnsetBudgetInMicroCurrency
`func (o *AdGroup) UnsetBudgetInMicroCurrency()`

UnsetBudgetInMicroCurrency ensures that no value is present for BudgetInMicroCurrency, not even an explicit nil
### GetCampaignId

`func (o *AdGroup) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *AdGroup) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *AdGroup) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.


### GetConversionLearningModeType

`func (o *AdGroup) GetConversionLearningModeType() ConversionLearningModeType`

GetConversionLearningModeType returns the ConversionLearningModeType field if non-nil, zero value otherwise.

### GetConversionLearningModeTypeOk

`func (o *AdGroup) GetConversionLearningModeTypeOk() (*ConversionLearningModeType, bool)`

GetConversionLearningModeTypeOk returns a tuple with the ConversionLearningModeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionLearningModeType

`func (o *AdGroup) SetConversionLearningModeType(v ConversionLearningModeType)`

SetConversionLearningModeType sets ConversionLearningModeType field to given value.


### SetConversionLearningModeTypeNil

`func (o *AdGroup) SetConversionLearningModeTypeNil(b bool)`

 SetConversionLearningModeTypeNil sets the value for ConversionLearningModeType to be an explicit nil

### UnsetConversionLearningModeType
`func (o *AdGroup) UnsetConversionLearningModeType()`

UnsetConversionLearningModeType ensures that no value is present for ConversionLearningModeType, not even an explicit nil
### GetCreatedTime

`func (o *AdGroup) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *AdGroup) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *AdGroup) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.


### GetCustomerSegmentId

`func (o *AdGroup) GetCustomerSegmentId() string`

GetCustomerSegmentId returns the CustomerSegmentId field if non-nil, zero value otherwise.

### GetCustomerSegmentIdOk

`func (o *AdGroup) GetCustomerSegmentIdOk() (*string, bool)`

GetCustomerSegmentIdOk returns a tuple with the CustomerSegmentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerSegmentId

`func (o *AdGroup) SetCustomerSegmentId(v string)`

SetCustomerSegmentId sets CustomerSegmentId field to given value.

### HasCustomerSegmentId

`func (o *AdGroup) HasCustomerSegmentId() bool`

HasCustomerSegmentId returns a boolean if a field has been set.

### GetDcaAssets

`func (o *AdGroup) GetDcaAssets() interface{}`

GetDcaAssets returns the DcaAssets field if non-nil, zero value otherwise.

### GetDcaAssetsOk

`func (o *AdGroup) GetDcaAssetsOk() (*interface{}, bool)`

GetDcaAssetsOk returns a tuple with the DcaAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDcaAssets

`func (o *AdGroup) SetDcaAssets(v interface{})`

SetDcaAssets sets DcaAssets field to given value.

### HasDcaAssets

`func (o *AdGroup) HasDcaAssets() bool`

HasDcaAssets returns a boolean if a field has been set.

### SetDcaAssetsNil

`func (o *AdGroup) SetDcaAssetsNil(b bool)`

 SetDcaAssetsNil sets the value for DcaAssets to be an explicit nil

### UnsetDcaAssets
`func (o *AdGroup) UnsetDcaAssets()`

UnsetDcaAssets ensures that no value is present for DcaAssets, not even an explicit nil
### GetEndTime

`func (o *AdGroup) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *AdGroup) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *AdGroup) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *AdGroup) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *AdGroup) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *AdGroup) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetExtFeatures

`func (o *AdGroup) GetExtFeatures() AdgroupTrackingFeatures`

GetExtFeatures returns the ExtFeatures field if non-nil, zero value otherwise.

### GetExtFeaturesOk

`func (o *AdGroup) GetExtFeaturesOk() (*AdgroupTrackingFeatures, bool)`

GetExtFeaturesOk returns a tuple with the ExtFeatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtFeatures

`func (o *AdGroup) SetExtFeatures(v AdgroupTrackingFeatures)`

SetExtFeatures sets ExtFeatures field to given value.

### HasExtFeatures

`func (o *AdGroup) HasExtFeatures() bool`

HasExtFeatures returns a boolean if a field has been set.

### SetExtFeaturesNil

`func (o *AdGroup) SetExtFeaturesNil(b bool)`

 SetExtFeaturesNil sets the value for ExtFeatures to be an explicit nil

### UnsetExtFeatures
`func (o *AdGroup) UnsetExtFeatures()`

UnsetExtFeatures ensures that no value is present for ExtFeatures, not even an explicit nil
### GetFeedProfileId

`func (o *AdGroup) GetFeedProfileId() string`

GetFeedProfileId returns the FeedProfileId field if non-nil, zero value otherwise.

### GetFeedProfileIdOk

`func (o *AdGroup) GetFeedProfileIdOk() (*string, bool)`

GetFeedProfileIdOk returns a tuple with the FeedProfileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedProfileId

`func (o *AdGroup) SetFeedProfileId(v string)`

SetFeedProfileId sets FeedProfileId field to given value.

### HasFeedProfileId

`func (o *AdGroup) HasFeedProfileId() bool`

HasFeedProfileId returns a boolean if a field has been set.

### GetId

`func (o *AdGroup) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdGroup) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdGroup) SetId(v string)`

SetId sets Id field to given value.


### GetIsCreativeOptimization

`func (o *AdGroup) GetIsCreativeOptimization() bool`

GetIsCreativeOptimization returns the IsCreativeOptimization field if non-nil, zero value otherwise.

### GetIsCreativeOptimizationOk

`func (o *AdGroup) GetIsCreativeOptimizationOk() (*bool, bool)`

GetIsCreativeOptimizationOk returns a tuple with the IsCreativeOptimization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCreativeOptimization

`func (o *AdGroup) SetIsCreativeOptimization(v bool)`

SetIsCreativeOptimization sets IsCreativeOptimization field to given value.

### HasIsCreativeOptimization

`func (o *AdGroup) HasIsCreativeOptimization() bool`

HasIsCreativeOptimization returns a boolean if a field has been set.

### SetIsCreativeOptimizationNil

`func (o *AdGroup) SetIsCreativeOptimizationNil(b bool)`

 SetIsCreativeOptimizationNil sets the value for IsCreativeOptimization to be an explicit nil

### UnsetIsCreativeOptimization
`func (o *AdGroup) UnsetIsCreativeOptimization()`

UnsetIsCreativeOptimization ensures that no value is present for IsCreativeOptimization, not even an explicit nil
### GetIsLocalInventory

`func (o *AdGroup) GetIsLocalInventory() bool`

GetIsLocalInventory returns the IsLocalInventory field if non-nil, zero value otherwise.

### GetIsLocalInventoryOk

`func (o *AdGroup) GetIsLocalInventoryOk() (*bool, bool)`

GetIsLocalInventoryOk returns a tuple with the IsLocalInventory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLocalInventory

`func (o *AdGroup) SetIsLocalInventory(v bool)`

SetIsLocalInventory sets IsLocalInventory field to given value.

### HasIsLocalInventory

`func (o *AdGroup) HasIsLocalInventory() bool`

HasIsLocalInventory returns a boolean if a field has been set.

### GetLifetimeFrequencyCap

`func (o *AdGroup) GetLifetimeFrequencyCap() int32`

GetLifetimeFrequencyCap returns the LifetimeFrequencyCap field if non-nil, zero value otherwise.

### GetLifetimeFrequencyCapOk

`func (o *AdGroup) GetLifetimeFrequencyCapOk() (*int32, bool)`

GetLifetimeFrequencyCapOk returns a tuple with the LifetimeFrequencyCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeFrequencyCap

`func (o *AdGroup) SetLifetimeFrequencyCap(v int32)`

SetLifetimeFrequencyCap sets LifetimeFrequencyCap field to given value.

### HasLifetimeFrequencyCap

`func (o *AdGroup) HasLifetimeFrequencyCap() bool`

HasLifetimeFrequencyCap returns a boolean if a field has been set.

### GetLocalInventoryRadiusInMiles

`func (o *AdGroup) GetLocalInventoryRadiusInMiles() float32`

GetLocalInventoryRadiusInMiles returns the LocalInventoryRadiusInMiles field if non-nil, zero value otherwise.

### GetLocalInventoryRadiusInMilesOk

`func (o *AdGroup) GetLocalInventoryRadiusInMilesOk() (*float32, bool)`

GetLocalInventoryRadiusInMilesOk returns a tuple with the LocalInventoryRadiusInMiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocalInventoryRadiusInMiles

`func (o *AdGroup) SetLocalInventoryRadiusInMiles(v float32)`

SetLocalInventoryRadiusInMiles sets LocalInventoryRadiusInMiles field to given value.

### HasLocalInventoryRadiusInMiles

`func (o *AdGroup) HasLocalInventoryRadiusInMiles() bool`

HasLocalInventoryRadiusInMiles returns a boolean if a field has been set.

### GetName

`func (o *AdGroup) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdGroup) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdGroup) SetName(v string)`

SetName sets Name field to given value.


### GetOptimizationGoalMetadata

`func (o *AdGroup) GetOptimizationGoalMetadata() NullableOptimizationGoalMetadata`

GetOptimizationGoalMetadata returns the OptimizationGoalMetadata field if non-nil, zero value otherwise.

### GetOptimizationGoalMetadataOk

`func (o *AdGroup) GetOptimizationGoalMetadataOk() (*NullableOptimizationGoalMetadata, bool)`

GetOptimizationGoalMetadataOk returns a tuple with the OptimizationGoalMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptimizationGoalMetadata

`func (o *AdGroup) SetOptimizationGoalMetadata(v NullableOptimizationGoalMetadata)`

SetOptimizationGoalMetadata sets OptimizationGoalMetadata field to given value.

### HasOptimizationGoalMetadata

`func (o *AdGroup) HasOptimizationGoalMetadata() bool`

HasOptimizationGoalMetadata returns a boolean if a field has been set.

### SetOptimizationGoalMetadataNil

`func (o *AdGroup) SetOptimizationGoalMetadataNil(b bool)`

 SetOptimizationGoalMetadataNil sets the value for OptimizationGoalMetadata to be an explicit nil

### UnsetOptimizationGoalMetadata
`func (o *AdGroup) UnsetOptimizationGoalMetadata()`

UnsetOptimizationGoalMetadata ensures that no value is present for OptimizationGoalMetadata, not even an explicit nil
### GetPerformancePlusCampaignSettings

`func (o *AdGroup) GetPerformancePlusCampaignSettings() PerformancePlusCampaignSettings`

GetPerformancePlusCampaignSettings returns the PerformancePlusCampaignSettings field if non-nil, zero value otherwise.

### GetPerformancePlusCampaignSettingsOk

`func (o *AdGroup) GetPerformancePlusCampaignSettingsOk() (*PerformancePlusCampaignSettings, bool)`

GetPerformancePlusCampaignSettingsOk returns a tuple with the PerformancePlusCampaignSettings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerformancePlusCampaignSettings

`func (o *AdGroup) SetPerformancePlusCampaignSettings(v PerformancePlusCampaignSettings)`

SetPerformancePlusCampaignSettings sets PerformancePlusCampaignSettings field to given value.

### HasPerformancePlusCampaignSettings

`func (o *AdGroup) HasPerformancePlusCampaignSettings() bool`

HasPerformancePlusCampaignSettings returns a boolean if a field has been set.

### SetPerformancePlusCampaignSettingsNil

`func (o *AdGroup) SetPerformancePlusCampaignSettingsNil(b bool)`

 SetPerformancePlusCampaignSettingsNil sets the value for PerformancePlusCampaignSettings to be an explicit nil

### UnsetPerformancePlusCampaignSettings
`func (o *AdGroup) UnsetPerformancePlusCampaignSettings()`

UnsetPerformancePlusCampaignSettings ensures that no value is present for PerformancePlusCampaignSettings, not even an explicit nil
### GetPlacementGroup

`func (o *AdGroup) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *AdGroup) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *AdGroup) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *AdGroup) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetPlacementTrafficType

`func (o *AdGroup) GetPlacementTrafficType() PlacementTrafficType`

GetPlacementTrafficType returns the PlacementTrafficType field if non-nil, zero value otherwise.

### GetPlacementTrafficTypeOk

`func (o *AdGroup) GetPlacementTrafficTypeOk() (*PlacementTrafficType, bool)`

GetPlacementTrafficTypeOk returns a tuple with the PlacementTrafficType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementTrafficType

`func (o *AdGroup) SetPlacementTrafficType(v PlacementTrafficType)`

SetPlacementTrafficType sets PlacementTrafficType field to given value.

### HasPlacementTrafficType

`func (o *AdGroup) HasPlacementTrafficType() bool`

HasPlacementTrafficType returns a boolean if a field has been set.

### SetPlacementTrafficTypeNil

`func (o *AdGroup) SetPlacementTrafficTypeNil(b bool)`

 SetPlacementTrafficTypeNil sets the value for PlacementTrafficType to be an explicit nil

### UnsetPlacementTrafficType
`func (o *AdGroup) UnsetPlacementTrafficType()`

UnsetPlacementTrafficType ensures that no value is present for PlacementTrafficType, not even an explicit nil
### GetPromotionApplicationLevel

`func (o *AdGroup) GetPromotionApplicationLevel() PromotionApplicationLevel`

GetPromotionApplicationLevel returns the PromotionApplicationLevel field if non-nil, zero value otherwise.

### GetPromotionApplicationLevelOk

`func (o *AdGroup) GetPromotionApplicationLevelOk() (*PromotionApplicationLevel, bool)`

GetPromotionApplicationLevelOk returns a tuple with the PromotionApplicationLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionApplicationLevel

`func (o *AdGroup) SetPromotionApplicationLevel(v PromotionApplicationLevel)`

SetPromotionApplicationLevel sets PromotionApplicationLevel field to given value.

### HasPromotionApplicationLevel

`func (o *AdGroup) HasPromotionApplicationLevel() bool`

HasPromotionApplicationLevel returns a boolean if a field has been set.

### SetPromotionApplicationLevelNil

`func (o *AdGroup) SetPromotionApplicationLevelNil(b bool)`

 SetPromotionApplicationLevelNil sets the value for PromotionApplicationLevel to be an explicit nil

### UnsetPromotionApplicationLevel
`func (o *AdGroup) UnsetPromotionApplicationLevel()`

UnsetPromotionApplicationLevel ensures that no value is present for PromotionApplicationLevel, not even an explicit nil
### GetPromotionId

`func (o *AdGroup) GetPromotionId() string`

GetPromotionId returns the PromotionId field if non-nil, zero value otherwise.

### GetPromotionIdOk

`func (o *AdGroup) GetPromotionIdOk() (*string, bool)`

GetPromotionIdOk returns a tuple with the PromotionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionId

`func (o *AdGroup) SetPromotionId(v string)`

SetPromotionId sets PromotionId field to given value.

### HasPromotionId

`func (o *AdGroup) HasPromotionId() bool`

HasPromotionId returns a boolean if a field has been set.

### SetPromotionIdNil

`func (o *AdGroup) SetPromotionIdNil(b bool)`

 SetPromotionIdNil sets the value for PromotionId to be an explicit nil

### UnsetPromotionId
`func (o *AdGroup) UnsetPromotionId()`

UnsetPromotionId ensures that no value is present for PromotionId, not even an explicit nil
### GetPromotionIds

`func (o *AdGroup) GetPromotionIds() []string`

GetPromotionIds returns the PromotionIds field if non-nil, zero value otherwise.

### GetPromotionIdsOk

`func (o *AdGroup) GetPromotionIdsOk() (*[]string, bool)`

GetPromotionIdsOk returns a tuple with the PromotionIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionIds

`func (o *AdGroup) SetPromotionIds(v []string)`

SetPromotionIds sets PromotionIds field to given value.

### HasPromotionIds

`func (o *AdGroup) HasPromotionIds() bool`

HasPromotionIds returns a boolean if a field has been set.

### GetStartTime

`func (o *AdGroup) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *AdGroup) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *AdGroup) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *AdGroup) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *AdGroup) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *AdGroup) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetStatus

`func (o *AdGroup) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdGroup) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdGroup) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdGroup) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSummaryStatus

`func (o *AdGroup) GetSummaryStatus() SummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *AdGroup) GetSummaryStatusOk() (*SummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *AdGroup) SetSummaryStatus(v SummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.


### GetTargetingSpec

`func (o *AdGroup) GetTargetingSpec() TargetingSpecOptimal`

GetTargetingSpec returns the TargetingSpec field if non-nil, zero value otherwise.

### GetTargetingSpecOk

`func (o *AdGroup) GetTargetingSpecOk() (*TargetingSpecOptimal, bool)`

GetTargetingSpecOk returns a tuple with the TargetingSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpec

`func (o *AdGroup) SetTargetingSpec(v TargetingSpecOptimal)`

SetTargetingSpec sets TargetingSpec field to given value.

### HasTargetingSpec

`func (o *AdGroup) HasTargetingSpec() bool`

HasTargetingSpec returns a boolean if a field has been set.

### GetTargetingTemplateIds

`func (o *AdGroup) GetTargetingTemplateIds() []string`

GetTargetingTemplateIds returns the TargetingTemplateIds field if non-nil, zero value otherwise.

### GetTargetingTemplateIdsOk

`func (o *AdGroup) GetTargetingTemplateIdsOk() (*[]string, bool)`

GetTargetingTemplateIdsOk returns a tuple with the TargetingTemplateIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingTemplateIds

`func (o *AdGroup) SetTargetingTemplateIds(v []string)`

SetTargetingTemplateIds sets TargetingTemplateIds field to given value.

### HasTargetingTemplateIds

`func (o *AdGroup) HasTargetingTemplateIds() bool`

HasTargetingTemplateIds returns a boolean if a field has been set.

### SetTargetingTemplateIdsNil

`func (o *AdGroup) SetTargetingTemplateIdsNil(b bool)`

 SetTargetingTemplateIdsNil sets the value for TargetingTemplateIds to be an explicit nil

### UnsetTargetingTemplateIds
`func (o *AdGroup) UnsetTargetingTemplateIds()`

UnsetTargetingTemplateIds ensures that no value is present for TargetingTemplateIds, not even an explicit nil
### GetTrackingUrls

`func (o *AdGroup) GetTrackingUrls() AdGroupTrackingURLs`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdGroup) GetTrackingUrlsOk() (*AdGroupTrackingURLs, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdGroup) SetTrackingUrls(v AdGroupTrackingURLs)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdGroup) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdGroup) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdGroup) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetType

`func (o *AdGroup) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AdGroup) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AdGroup) SetType(v string)`

SetType sets Type field to given value.


### GetUpdatedTime

`func (o *AdGroup) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *AdGroup) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *AdGroup) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.


### GetAutoTargetingEnabled

`func (o *AdGroup) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *AdGroup) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *AdGroup) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *AdGroup) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### SetAutoTargetingEnabledNil

`func (o *AdGroup) SetAutoTargetingEnabledNil(b bool)`

 SetAutoTargetingEnabledNil sets the value for AutoTargetingEnabled to be an explicit nil

### UnsetAutoTargetingEnabled
`func (o *AdGroup) UnsetAutoTargetingEnabled()`

UnsetAutoTargetingEnabled ensures that no value is present for AutoTargetingEnabled, not even an explicit nil
### GetBidMultiplier

`func (o *AdGroup) GetBidMultiplier() float32`

GetBidMultiplier returns the BidMultiplier field if non-nil, zero value otherwise.

### GetBidMultiplierOk

`func (o *AdGroup) GetBidMultiplierOk() (*float32, bool)`

GetBidMultiplierOk returns a tuple with the BidMultiplier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidMultiplier

`func (o *AdGroup) SetBidMultiplier(v float32)`

SetBidMultiplier sets BidMultiplier field to given value.

### HasBidMultiplier

`func (o *AdGroup) HasBidMultiplier() bool`

HasBidMultiplier returns a boolean if a field has been set.

### SetBidMultiplierNil

`func (o *AdGroup) SetBidMultiplierNil(b bool)`

 SetBidMultiplierNil sets the value for BidMultiplier to be an explicit nil

### UnsetBidMultiplier
`func (o *AdGroup) UnsetBidMultiplier()`

UnsetBidMultiplier ensures that no value is present for BidMultiplier, not even an explicit nil
### GetBudgetType

`func (o *AdGroup) GetBudgetType() BudgetType`

GetBudgetType returns the BudgetType field if non-nil, zero value otherwise.

### GetBudgetTypeOk

`func (o *AdGroup) GetBudgetTypeOk() (*BudgetType, bool)`

GetBudgetTypeOk returns a tuple with the BudgetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetType

`func (o *AdGroup) SetBudgetType(v BudgetType)`

SetBudgetType sets BudgetType field to given value.

### HasBudgetType

`func (o *AdGroup) HasBudgetType() bool`

HasBudgetType returns a boolean if a field has been set.

### GetPacingDeliveryType

`func (o *AdGroup) GetPacingDeliveryType() PacingDeliveryType`

GetPacingDeliveryType returns the PacingDeliveryType field if non-nil, zero value otherwise.

### GetPacingDeliveryTypeOk

`func (o *AdGroup) GetPacingDeliveryTypeOk() (*PacingDeliveryType, bool)`

GetPacingDeliveryTypeOk returns a tuple with the PacingDeliveryType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPacingDeliveryType

`func (o *AdGroup) SetPacingDeliveryType(v PacingDeliveryType)`

SetPacingDeliveryType sets PacingDeliveryType field to given value.

### HasPacingDeliveryType

`func (o *AdGroup) HasPacingDeliveryType() bool`

HasPacingDeliveryType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


