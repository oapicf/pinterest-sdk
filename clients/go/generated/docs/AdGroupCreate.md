# AdGroupCreate

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
**AutoTargetingEnabled** | Pointer to **bool** | Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] 
**BidMultiplier** | Pointer to **float32** | [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). | [optional] 
**BudgetType** | Pointer to [**BudgetType**](BudgetType.md) |  | [optional] [default to DAILY]
**PacingDeliveryType** | Pointer to [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] [default to STANDARD]

## Methods

### NewAdGroupCreate

`func NewAdGroupCreate(billableEvent ActionType, campaignId string, conversionLearningModeType NullableConversionLearningModeType, createdTime int32, id string, name string, summaryStatus SummaryStatus, type_ string, updatedTime int32, ) *AdGroupCreate`

NewAdGroupCreate instantiates a new AdGroupCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupCreateWithDefaults

`func NewAdGroupCreateWithDefaults() *AdGroupCreate`

NewAdGroupCreateWithDefaults instantiates a new AdGroupCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AdGroupCreate) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdGroupCreate) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdGroupCreate) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdGroupCreate) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetBidInMicroCurrency

`func (o *AdGroupCreate) GetBidInMicroCurrency() int32`

GetBidInMicroCurrency returns the BidInMicroCurrency field if non-nil, zero value otherwise.

### GetBidInMicroCurrencyOk

`func (o *AdGroupCreate) GetBidInMicroCurrencyOk() (*int32, bool)`

GetBidInMicroCurrencyOk returns a tuple with the BidInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidInMicroCurrency

`func (o *AdGroupCreate) SetBidInMicroCurrency(v int32)`

SetBidInMicroCurrency sets BidInMicroCurrency field to given value.

### HasBidInMicroCurrency

`func (o *AdGroupCreate) HasBidInMicroCurrency() bool`

HasBidInMicroCurrency returns a boolean if a field has been set.

### SetBidInMicroCurrencyNil

`func (o *AdGroupCreate) SetBidInMicroCurrencyNil(b bool)`

 SetBidInMicroCurrencyNil sets the value for BidInMicroCurrency to be an explicit nil

### UnsetBidInMicroCurrency
`func (o *AdGroupCreate) UnsetBidInMicroCurrency()`

UnsetBidInMicroCurrency ensures that no value is present for BidInMicroCurrency, not even an explicit nil
### GetBidStrategyType

`func (o *AdGroupCreate) GetBidStrategyType() BidStrategyType`

GetBidStrategyType returns the BidStrategyType field if non-nil, zero value otherwise.

### GetBidStrategyTypeOk

`func (o *AdGroupCreate) GetBidStrategyTypeOk() (*BidStrategyType, bool)`

GetBidStrategyTypeOk returns a tuple with the BidStrategyType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidStrategyType

`func (o *AdGroupCreate) SetBidStrategyType(v BidStrategyType)`

SetBidStrategyType sets BidStrategyType field to given value.

### HasBidStrategyType

`func (o *AdGroupCreate) HasBidStrategyType() bool`

HasBidStrategyType returns a boolean if a field has been set.

### SetBidStrategyTypeNil

`func (o *AdGroupCreate) SetBidStrategyTypeNil(b bool)`

 SetBidStrategyTypeNil sets the value for BidStrategyType to be an explicit nil

### UnsetBidStrategyType
`func (o *AdGroupCreate) UnsetBidStrategyType()`

UnsetBidStrategyType ensures that no value is present for BidStrategyType, not even an explicit nil
### GetBillableEvent

`func (o *AdGroupCreate) GetBillableEvent() ActionType`

GetBillableEvent returns the BillableEvent field if non-nil, zero value otherwise.

### GetBillableEventOk

`func (o *AdGroupCreate) GetBillableEventOk() (*ActionType, bool)`

GetBillableEventOk returns a tuple with the BillableEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillableEvent

`func (o *AdGroupCreate) SetBillableEvent(v ActionType)`

SetBillableEvent sets BillableEvent field to given value.


### GetBudgetInMicroCurrency

`func (o *AdGroupCreate) GetBudgetInMicroCurrency() int32`

GetBudgetInMicroCurrency returns the BudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetBudgetInMicroCurrencyOk

`func (o *AdGroupCreate) GetBudgetInMicroCurrencyOk() (*int32, bool)`

GetBudgetInMicroCurrencyOk returns a tuple with the BudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetInMicroCurrency

`func (o *AdGroupCreate) SetBudgetInMicroCurrency(v int32)`

SetBudgetInMicroCurrency sets BudgetInMicroCurrency field to given value.

### HasBudgetInMicroCurrency

`func (o *AdGroupCreate) HasBudgetInMicroCurrency() bool`

HasBudgetInMicroCurrency returns a boolean if a field has been set.

### SetBudgetInMicroCurrencyNil

`func (o *AdGroupCreate) SetBudgetInMicroCurrencyNil(b bool)`

 SetBudgetInMicroCurrencyNil sets the value for BudgetInMicroCurrency to be an explicit nil

### UnsetBudgetInMicroCurrency
`func (o *AdGroupCreate) UnsetBudgetInMicroCurrency()`

UnsetBudgetInMicroCurrency ensures that no value is present for BudgetInMicroCurrency, not even an explicit nil
### GetCampaignId

`func (o *AdGroupCreate) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *AdGroupCreate) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *AdGroupCreate) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.


### GetConversionLearningModeType

`func (o *AdGroupCreate) GetConversionLearningModeType() ConversionLearningModeType`

GetConversionLearningModeType returns the ConversionLearningModeType field if non-nil, zero value otherwise.

### GetConversionLearningModeTypeOk

`func (o *AdGroupCreate) GetConversionLearningModeTypeOk() (*ConversionLearningModeType, bool)`

GetConversionLearningModeTypeOk returns a tuple with the ConversionLearningModeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionLearningModeType

`func (o *AdGroupCreate) SetConversionLearningModeType(v ConversionLearningModeType)`

SetConversionLearningModeType sets ConversionLearningModeType field to given value.


### SetConversionLearningModeTypeNil

`func (o *AdGroupCreate) SetConversionLearningModeTypeNil(b bool)`

 SetConversionLearningModeTypeNil sets the value for ConversionLearningModeType to be an explicit nil

### UnsetConversionLearningModeType
`func (o *AdGroupCreate) UnsetConversionLearningModeType()`

UnsetConversionLearningModeType ensures that no value is present for ConversionLearningModeType, not even an explicit nil
### GetCreatedTime

`func (o *AdGroupCreate) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *AdGroupCreate) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *AdGroupCreate) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.


### GetCustomerSegmentId

`func (o *AdGroupCreate) GetCustomerSegmentId() string`

GetCustomerSegmentId returns the CustomerSegmentId field if non-nil, zero value otherwise.

### GetCustomerSegmentIdOk

`func (o *AdGroupCreate) GetCustomerSegmentIdOk() (*string, bool)`

GetCustomerSegmentIdOk returns a tuple with the CustomerSegmentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerSegmentId

`func (o *AdGroupCreate) SetCustomerSegmentId(v string)`

SetCustomerSegmentId sets CustomerSegmentId field to given value.

### HasCustomerSegmentId

`func (o *AdGroupCreate) HasCustomerSegmentId() bool`

HasCustomerSegmentId returns a boolean if a field has been set.

### GetDcaAssets

`func (o *AdGroupCreate) GetDcaAssets() interface{}`

GetDcaAssets returns the DcaAssets field if non-nil, zero value otherwise.

### GetDcaAssetsOk

`func (o *AdGroupCreate) GetDcaAssetsOk() (*interface{}, bool)`

GetDcaAssetsOk returns a tuple with the DcaAssets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDcaAssets

`func (o *AdGroupCreate) SetDcaAssets(v interface{})`

SetDcaAssets sets DcaAssets field to given value.

### HasDcaAssets

`func (o *AdGroupCreate) HasDcaAssets() bool`

HasDcaAssets returns a boolean if a field has been set.

### SetDcaAssetsNil

`func (o *AdGroupCreate) SetDcaAssetsNil(b bool)`

 SetDcaAssetsNil sets the value for DcaAssets to be an explicit nil

### UnsetDcaAssets
`func (o *AdGroupCreate) UnsetDcaAssets()`

UnsetDcaAssets ensures that no value is present for DcaAssets, not even an explicit nil
### GetEndTime

`func (o *AdGroupCreate) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *AdGroupCreate) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *AdGroupCreate) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *AdGroupCreate) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *AdGroupCreate) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *AdGroupCreate) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetExtFeatures

`func (o *AdGroupCreate) GetExtFeatures() AdgroupTrackingFeatures`

GetExtFeatures returns the ExtFeatures field if non-nil, zero value otherwise.

### GetExtFeaturesOk

`func (o *AdGroupCreate) GetExtFeaturesOk() (*AdgroupTrackingFeatures, bool)`

GetExtFeaturesOk returns a tuple with the ExtFeatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtFeatures

`func (o *AdGroupCreate) SetExtFeatures(v AdgroupTrackingFeatures)`

SetExtFeatures sets ExtFeatures field to given value.

### HasExtFeatures

`func (o *AdGroupCreate) HasExtFeatures() bool`

HasExtFeatures returns a boolean if a field has been set.

### SetExtFeaturesNil

`func (o *AdGroupCreate) SetExtFeaturesNil(b bool)`

 SetExtFeaturesNil sets the value for ExtFeatures to be an explicit nil

### UnsetExtFeatures
`func (o *AdGroupCreate) UnsetExtFeatures()`

UnsetExtFeatures ensures that no value is present for ExtFeatures, not even an explicit nil
### GetFeedProfileId

`func (o *AdGroupCreate) GetFeedProfileId() string`

GetFeedProfileId returns the FeedProfileId field if non-nil, zero value otherwise.

### GetFeedProfileIdOk

`func (o *AdGroupCreate) GetFeedProfileIdOk() (*string, bool)`

GetFeedProfileIdOk returns a tuple with the FeedProfileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedProfileId

`func (o *AdGroupCreate) SetFeedProfileId(v string)`

SetFeedProfileId sets FeedProfileId field to given value.

### HasFeedProfileId

`func (o *AdGroupCreate) HasFeedProfileId() bool`

HasFeedProfileId returns a boolean if a field has been set.

### GetId

`func (o *AdGroupCreate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdGroupCreate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdGroupCreate) SetId(v string)`

SetId sets Id field to given value.


### GetIsCreativeOptimization

`func (o *AdGroupCreate) GetIsCreativeOptimization() bool`

GetIsCreativeOptimization returns the IsCreativeOptimization field if non-nil, zero value otherwise.

### GetIsCreativeOptimizationOk

`func (o *AdGroupCreate) GetIsCreativeOptimizationOk() (*bool, bool)`

GetIsCreativeOptimizationOk returns a tuple with the IsCreativeOptimization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCreativeOptimization

`func (o *AdGroupCreate) SetIsCreativeOptimization(v bool)`

SetIsCreativeOptimization sets IsCreativeOptimization field to given value.

### HasIsCreativeOptimization

`func (o *AdGroupCreate) HasIsCreativeOptimization() bool`

HasIsCreativeOptimization returns a boolean if a field has been set.

### SetIsCreativeOptimizationNil

`func (o *AdGroupCreate) SetIsCreativeOptimizationNil(b bool)`

 SetIsCreativeOptimizationNil sets the value for IsCreativeOptimization to be an explicit nil

### UnsetIsCreativeOptimization
`func (o *AdGroupCreate) UnsetIsCreativeOptimization()`

UnsetIsCreativeOptimization ensures that no value is present for IsCreativeOptimization, not even an explicit nil
### GetIsLocalInventory

`func (o *AdGroupCreate) GetIsLocalInventory() bool`

GetIsLocalInventory returns the IsLocalInventory field if non-nil, zero value otherwise.

### GetIsLocalInventoryOk

`func (o *AdGroupCreate) GetIsLocalInventoryOk() (*bool, bool)`

GetIsLocalInventoryOk returns a tuple with the IsLocalInventory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsLocalInventory

`func (o *AdGroupCreate) SetIsLocalInventory(v bool)`

SetIsLocalInventory sets IsLocalInventory field to given value.

### HasIsLocalInventory

`func (o *AdGroupCreate) HasIsLocalInventory() bool`

HasIsLocalInventory returns a boolean if a field has been set.

### GetLifetimeFrequencyCap

`func (o *AdGroupCreate) GetLifetimeFrequencyCap() int32`

GetLifetimeFrequencyCap returns the LifetimeFrequencyCap field if non-nil, zero value otherwise.

### GetLifetimeFrequencyCapOk

`func (o *AdGroupCreate) GetLifetimeFrequencyCapOk() (*int32, bool)`

GetLifetimeFrequencyCapOk returns a tuple with the LifetimeFrequencyCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeFrequencyCap

`func (o *AdGroupCreate) SetLifetimeFrequencyCap(v int32)`

SetLifetimeFrequencyCap sets LifetimeFrequencyCap field to given value.

### HasLifetimeFrequencyCap

`func (o *AdGroupCreate) HasLifetimeFrequencyCap() bool`

HasLifetimeFrequencyCap returns a boolean if a field has been set.

### GetLocalInventoryRadiusInMiles

`func (o *AdGroupCreate) GetLocalInventoryRadiusInMiles() float32`

GetLocalInventoryRadiusInMiles returns the LocalInventoryRadiusInMiles field if non-nil, zero value otherwise.

### GetLocalInventoryRadiusInMilesOk

`func (o *AdGroupCreate) GetLocalInventoryRadiusInMilesOk() (*float32, bool)`

GetLocalInventoryRadiusInMilesOk returns a tuple with the LocalInventoryRadiusInMiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocalInventoryRadiusInMiles

`func (o *AdGroupCreate) SetLocalInventoryRadiusInMiles(v float32)`

SetLocalInventoryRadiusInMiles sets LocalInventoryRadiusInMiles field to given value.

### HasLocalInventoryRadiusInMiles

`func (o *AdGroupCreate) HasLocalInventoryRadiusInMiles() bool`

HasLocalInventoryRadiusInMiles returns a boolean if a field has been set.

### GetName

`func (o *AdGroupCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdGroupCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdGroupCreate) SetName(v string)`

SetName sets Name field to given value.


### GetOptimizationGoalMetadata

`func (o *AdGroupCreate) GetOptimizationGoalMetadata() NullableOptimizationGoalMetadata`

GetOptimizationGoalMetadata returns the OptimizationGoalMetadata field if non-nil, zero value otherwise.

### GetOptimizationGoalMetadataOk

`func (o *AdGroupCreate) GetOptimizationGoalMetadataOk() (*NullableOptimizationGoalMetadata, bool)`

GetOptimizationGoalMetadataOk returns a tuple with the OptimizationGoalMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptimizationGoalMetadata

`func (o *AdGroupCreate) SetOptimizationGoalMetadata(v NullableOptimizationGoalMetadata)`

SetOptimizationGoalMetadata sets OptimizationGoalMetadata field to given value.

### HasOptimizationGoalMetadata

`func (o *AdGroupCreate) HasOptimizationGoalMetadata() bool`

HasOptimizationGoalMetadata returns a boolean if a field has been set.

### SetOptimizationGoalMetadataNil

`func (o *AdGroupCreate) SetOptimizationGoalMetadataNil(b bool)`

 SetOptimizationGoalMetadataNil sets the value for OptimizationGoalMetadata to be an explicit nil

### UnsetOptimizationGoalMetadata
`func (o *AdGroupCreate) UnsetOptimizationGoalMetadata()`

UnsetOptimizationGoalMetadata ensures that no value is present for OptimizationGoalMetadata, not even an explicit nil
### GetPerformancePlusCampaignSettings

`func (o *AdGroupCreate) GetPerformancePlusCampaignSettings() PerformancePlusCampaignSettings`

GetPerformancePlusCampaignSettings returns the PerformancePlusCampaignSettings field if non-nil, zero value otherwise.

### GetPerformancePlusCampaignSettingsOk

`func (o *AdGroupCreate) GetPerformancePlusCampaignSettingsOk() (*PerformancePlusCampaignSettings, bool)`

GetPerformancePlusCampaignSettingsOk returns a tuple with the PerformancePlusCampaignSettings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerformancePlusCampaignSettings

`func (o *AdGroupCreate) SetPerformancePlusCampaignSettings(v PerformancePlusCampaignSettings)`

SetPerformancePlusCampaignSettings sets PerformancePlusCampaignSettings field to given value.

### HasPerformancePlusCampaignSettings

`func (o *AdGroupCreate) HasPerformancePlusCampaignSettings() bool`

HasPerformancePlusCampaignSettings returns a boolean if a field has been set.

### SetPerformancePlusCampaignSettingsNil

`func (o *AdGroupCreate) SetPerformancePlusCampaignSettingsNil(b bool)`

 SetPerformancePlusCampaignSettingsNil sets the value for PerformancePlusCampaignSettings to be an explicit nil

### UnsetPerformancePlusCampaignSettings
`func (o *AdGroupCreate) UnsetPerformancePlusCampaignSettings()`

UnsetPerformancePlusCampaignSettings ensures that no value is present for PerformancePlusCampaignSettings, not even an explicit nil
### GetPlacementGroup

`func (o *AdGroupCreate) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *AdGroupCreate) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *AdGroupCreate) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *AdGroupCreate) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetPlacementTrafficType

`func (o *AdGroupCreate) GetPlacementTrafficType() PlacementTrafficType`

GetPlacementTrafficType returns the PlacementTrafficType field if non-nil, zero value otherwise.

### GetPlacementTrafficTypeOk

`func (o *AdGroupCreate) GetPlacementTrafficTypeOk() (*PlacementTrafficType, bool)`

GetPlacementTrafficTypeOk returns a tuple with the PlacementTrafficType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementTrafficType

`func (o *AdGroupCreate) SetPlacementTrafficType(v PlacementTrafficType)`

SetPlacementTrafficType sets PlacementTrafficType field to given value.

### HasPlacementTrafficType

`func (o *AdGroupCreate) HasPlacementTrafficType() bool`

HasPlacementTrafficType returns a boolean if a field has been set.

### SetPlacementTrafficTypeNil

`func (o *AdGroupCreate) SetPlacementTrafficTypeNil(b bool)`

 SetPlacementTrafficTypeNil sets the value for PlacementTrafficType to be an explicit nil

### UnsetPlacementTrafficType
`func (o *AdGroupCreate) UnsetPlacementTrafficType()`

UnsetPlacementTrafficType ensures that no value is present for PlacementTrafficType, not even an explicit nil
### GetPromotionApplicationLevel

`func (o *AdGroupCreate) GetPromotionApplicationLevel() PromotionApplicationLevel`

GetPromotionApplicationLevel returns the PromotionApplicationLevel field if non-nil, zero value otherwise.

### GetPromotionApplicationLevelOk

`func (o *AdGroupCreate) GetPromotionApplicationLevelOk() (*PromotionApplicationLevel, bool)`

GetPromotionApplicationLevelOk returns a tuple with the PromotionApplicationLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionApplicationLevel

`func (o *AdGroupCreate) SetPromotionApplicationLevel(v PromotionApplicationLevel)`

SetPromotionApplicationLevel sets PromotionApplicationLevel field to given value.

### HasPromotionApplicationLevel

`func (o *AdGroupCreate) HasPromotionApplicationLevel() bool`

HasPromotionApplicationLevel returns a boolean if a field has been set.

### SetPromotionApplicationLevelNil

`func (o *AdGroupCreate) SetPromotionApplicationLevelNil(b bool)`

 SetPromotionApplicationLevelNil sets the value for PromotionApplicationLevel to be an explicit nil

### UnsetPromotionApplicationLevel
`func (o *AdGroupCreate) UnsetPromotionApplicationLevel()`

UnsetPromotionApplicationLevel ensures that no value is present for PromotionApplicationLevel, not even an explicit nil
### GetPromotionId

`func (o *AdGroupCreate) GetPromotionId() string`

GetPromotionId returns the PromotionId field if non-nil, zero value otherwise.

### GetPromotionIdOk

`func (o *AdGroupCreate) GetPromotionIdOk() (*string, bool)`

GetPromotionIdOk returns a tuple with the PromotionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionId

`func (o *AdGroupCreate) SetPromotionId(v string)`

SetPromotionId sets PromotionId field to given value.

### HasPromotionId

`func (o *AdGroupCreate) HasPromotionId() bool`

HasPromotionId returns a boolean if a field has been set.

### SetPromotionIdNil

`func (o *AdGroupCreate) SetPromotionIdNil(b bool)`

 SetPromotionIdNil sets the value for PromotionId to be an explicit nil

### UnsetPromotionId
`func (o *AdGroupCreate) UnsetPromotionId()`

UnsetPromotionId ensures that no value is present for PromotionId, not even an explicit nil
### GetPromotionIds

`func (o *AdGroupCreate) GetPromotionIds() []string`

GetPromotionIds returns the PromotionIds field if non-nil, zero value otherwise.

### GetPromotionIdsOk

`func (o *AdGroupCreate) GetPromotionIdsOk() (*[]string, bool)`

GetPromotionIdsOk returns a tuple with the PromotionIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionIds

`func (o *AdGroupCreate) SetPromotionIds(v []string)`

SetPromotionIds sets PromotionIds field to given value.

### HasPromotionIds

`func (o *AdGroupCreate) HasPromotionIds() bool`

HasPromotionIds returns a boolean if a field has been set.

### GetStartTime

`func (o *AdGroupCreate) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *AdGroupCreate) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *AdGroupCreate) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *AdGroupCreate) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *AdGroupCreate) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *AdGroupCreate) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetStatus

`func (o *AdGroupCreate) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdGroupCreate) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdGroupCreate) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdGroupCreate) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSummaryStatus

`func (o *AdGroupCreate) GetSummaryStatus() SummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *AdGroupCreate) GetSummaryStatusOk() (*SummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *AdGroupCreate) SetSummaryStatus(v SummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.


### GetTargetingSpec

`func (o *AdGroupCreate) GetTargetingSpec() TargetingSpecOptimal`

GetTargetingSpec returns the TargetingSpec field if non-nil, zero value otherwise.

### GetTargetingSpecOk

`func (o *AdGroupCreate) GetTargetingSpecOk() (*TargetingSpecOptimal, bool)`

GetTargetingSpecOk returns a tuple with the TargetingSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpec

`func (o *AdGroupCreate) SetTargetingSpec(v TargetingSpecOptimal)`

SetTargetingSpec sets TargetingSpec field to given value.

### HasTargetingSpec

`func (o *AdGroupCreate) HasTargetingSpec() bool`

HasTargetingSpec returns a boolean if a field has been set.

### GetTargetingTemplateIds

`func (o *AdGroupCreate) GetTargetingTemplateIds() []string`

GetTargetingTemplateIds returns the TargetingTemplateIds field if non-nil, zero value otherwise.

### GetTargetingTemplateIdsOk

`func (o *AdGroupCreate) GetTargetingTemplateIdsOk() (*[]string, bool)`

GetTargetingTemplateIdsOk returns a tuple with the TargetingTemplateIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingTemplateIds

`func (o *AdGroupCreate) SetTargetingTemplateIds(v []string)`

SetTargetingTemplateIds sets TargetingTemplateIds field to given value.

### HasTargetingTemplateIds

`func (o *AdGroupCreate) HasTargetingTemplateIds() bool`

HasTargetingTemplateIds returns a boolean if a field has been set.

### SetTargetingTemplateIdsNil

`func (o *AdGroupCreate) SetTargetingTemplateIdsNil(b bool)`

 SetTargetingTemplateIdsNil sets the value for TargetingTemplateIds to be an explicit nil

### UnsetTargetingTemplateIds
`func (o *AdGroupCreate) UnsetTargetingTemplateIds()`

UnsetTargetingTemplateIds ensures that no value is present for TargetingTemplateIds, not even an explicit nil
### GetTrackingUrls

`func (o *AdGroupCreate) GetTrackingUrls() AdGroupTrackingURLs`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdGroupCreate) GetTrackingUrlsOk() (*AdGroupTrackingURLs, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdGroupCreate) SetTrackingUrls(v AdGroupTrackingURLs)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdGroupCreate) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdGroupCreate) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdGroupCreate) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetType

`func (o *AdGroupCreate) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AdGroupCreate) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AdGroupCreate) SetType(v string)`

SetType sets Type field to given value.


### GetUpdatedTime

`func (o *AdGroupCreate) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *AdGroupCreate) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *AdGroupCreate) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.


### GetAutoTargetingEnabled

`func (o *AdGroupCreate) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *AdGroupCreate) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *AdGroupCreate) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *AdGroupCreate) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### GetBidMultiplier

`func (o *AdGroupCreate) GetBidMultiplier() float32`

GetBidMultiplier returns the BidMultiplier field if non-nil, zero value otherwise.

### GetBidMultiplierOk

`func (o *AdGroupCreate) GetBidMultiplierOk() (*float32, bool)`

GetBidMultiplierOk returns a tuple with the BidMultiplier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidMultiplier

`func (o *AdGroupCreate) SetBidMultiplier(v float32)`

SetBidMultiplier sets BidMultiplier field to given value.

### HasBidMultiplier

`func (o *AdGroupCreate) HasBidMultiplier() bool`

HasBidMultiplier returns a boolean if a field has been set.

### GetBudgetType

`func (o *AdGroupCreate) GetBudgetType() BudgetType`

GetBudgetType returns the BudgetType field if non-nil, zero value otherwise.

### GetBudgetTypeOk

`func (o *AdGroupCreate) GetBudgetTypeOk() (*BudgetType, bool)`

GetBudgetTypeOk returns a tuple with the BudgetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetType

`func (o *AdGroupCreate) SetBudgetType(v BudgetType)`

SetBudgetType sets BudgetType field to given value.

### HasBudgetType

`func (o *AdGroupCreate) HasBudgetType() bool`

HasBudgetType returns a boolean if a field has been set.

### GetPacingDeliveryType

`func (o *AdGroupCreate) GetPacingDeliveryType() PacingDeliveryType`

GetPacingDeliveryType returns the PacingDeliveryType field if non-nil, zero value otherwise.

### GetPacingDeliveryTypeOk

`func (o *AdGroupCreate) GetPacingDeliveryTypeOk() (*PacingDeliveryType, bool)`

GetPacingDeliveryTypeOk returns a tuple with the PacingDeliveryType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPacingDeliveryType

`func (o *AdGroupCreate) SetPacingDeliveryType(v PacingDeliveryType)`

SetPacingDeliveryType sets PacingDeliveryType field to given value.

### HasPacingDeliveryType

`func (o *AdGroupCreate) HasPacingDeliveryType() bool`

HasPacingDeliveryType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


