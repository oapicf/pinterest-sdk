# AdGroupUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | Ad group name. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] 
**BudgetInMicroCurrency** | Pointer to **NullableInt32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**BidInMicroCurrency** | Pointer to **NullableInt32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**OptimizationGoalMetadata** | Pointer to [**NullableAdGroupCommonOptimizationGoalMetadata**](AdGroupCommonOptimizationGoalMetadata.md) |  | [optional] 
**BudgetType** | Pointer to [**BudgetType**](BudgetType.md) |  | [optional] 
**StartTime** | Pointer to **NullableInt32** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Ad group end time. Unix timestamp in seconds. | [optional] 
**TargetingSpec** | Pointer to [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**LifetimeFrequencyCap** | Pointer to **int32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**TrackingUrls** | Pointer to [**NullableAdGroupCommonTrackingUrls**](AdGroupCommonTrackingUrls.md) |  | [optional] 
**AutoTargetingEnabled** | Pointer to **NullableBool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] 
**PlacementGroup** | Pointer to [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] 
**PacingDeliveryType** | Pointer to [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] 
**CampaignId** | Pointer to **string** | Campaign ID of the ad group. | [optional] 
**BillableEvent** | Pointer to [**ActionType**](ActionType.md) |  | [optional] 
**BidStrategyType** | Pointer to **NullableString** | Bid strategy type | [optional] 
**Id** | **string** | Ad group ID. | 

## Methods

### NewAdGroupUpdateRequest

`func NewAdGroupUpdateRequest(id string, ) *AdGroupUpdateRequest`

NewAdGroupUpdateRequest instantiates a new AdGroupUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupUpdateRequestWithDefaults

`func NewAdGroupUpdateRequestWithDefaults() *AdGroupUpdateRequest`

NewAdGroupUpdateRequestWithDefaults instantiates a new AdGroupUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *AdGroupUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdGroupUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdGroupUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdGroupUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetStatus

`func (o *AdGroupUpdateRequest) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdGroupUpdateRequest) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdGroupUpdateRequest) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdGroupUpdateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetBudgetInMicroCurrency

`func (o *AdGroupUpdateRequest) GetBudgetInMicroCurrency() int32`

GetBudgetInMicroCurrency returns the BudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetBudgetInMicroCurrencyOk

`func (o *AdGroupUpdateRequest) GetBudgetInMicroCurrencyOk() (*int32, bool)`

GetBudgetInMicroCurrencyOk returns a tuple with the BudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetInMicroCurrency

`func (o *AdGroupUpdateRequest) SetBudgetInMicroCurrency(v int32)`

SetBudgetInMicroCurrency sets BudgetInMicroCurrency field to given value.

### HasBudgetInMicroCurrency

`func (o *AdGroupUpdateRequest) HasBudgetInMicroCurrency() bool`

HasBudgetInMicroCurrency returns a boolean if a field has been set.

### SetBudgetInMicroCurrencyNil

`func (o *AdGroupUpdateRequest) SetBudgetInMicroCurrencyNil(b bool)`

 SetBudgetInMicroCurrencyNil sets the value for BudgetInMicroCurrency to be an explicit nil

### UnsetBudgetInMicroCurrency
`func (o *AdGroupUpdateRequest) UnsetBudgetInMicroCurrency()`

UnsetBudgetInMicroCurrency ensures that no value is present for BudgetInMicroCurrency, not even an explicit nil
### GetBidInMicroCurrency

`func (o *AdGroupUpdateRequest) GetBidInMicroCurrency() int32`

GetBidInMicroCurrency returns the BidInMicroCurrency field if non-nil, zero value otherwise.

### GetBidInMicroCurrencyOk

`func (o *AdGroupUpdateRequest) GetBidInMicroCurrencyOk() (*int32, bool)`

GetBidInMicroCurrencyOk returns a tuple with the BidInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidInMicroCurrency

`func (o *AdGroupUpdateRequest) SetBidInMicroCurrency(v int32)`

SetBidInMicroCurrency sets BidInMicroCurrency field to given value.

### HasBidInMicroCurrency

`func (o *AdGroupUpdateRequest) HasBidInMicroCurrency() bool`

HasBidInMicroCurrency returns a boolean if a field has been set.

### SetBidInMicroCurrencyNil

`func (o *AdGroupUpdateRequest) SetBidInMicroCurrencyNil(b bool)`

 SetBidInMicroCurrencyNil sets the value for BidInMicroCurrency to be an explicit nil

### UnsetBidInMicroCurrency
`func (o *AdGroupUpdateRequest) UnsetBidInMicroCurrency()`

UnsetBidInMicroCurrency ensures that no value is present for BidInMicroCurrency, not even an explicit nil
### GetOptimizationGoalMetadata

`func (o *AdGroupUpdateRequest) GetOptimizationGoalMetadata() AdGroupCommonOptimizationGoalMetadata`

GetOptimizationGoalMetadata returns the OptimizationGoalMetadata field if non-nil, zero value otherwise.

### GetOptimizationGoalMetadataOk

`func (o *AdGroupUpdateRequest) GetOptimizationGoalMetadataOk() (*AdGroupCommonOptimizationGoalMetadata, bool)`

GetOptimizationGoalMetadataOk returns a tuple with the OptimizationGoalMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptimizationGoalMetadata

`func (o *AdGroupUpdateRequest) SetOptimizationGoalMetadata(v AdGroupCommonOptimizationGoalMetadata)`

SetOptimizationGoalMetadata sets OptimizationGoalMetadata field to given value.

### HasOptimizationGoalMetadata

`func (o *AdGroupUpdateRequest) HasOptimizationGoalMetadata() bool`

HasOptimizationGoalMetadata returns a boolean if a field has been set.

### SetOptimizationGoalMetadataNil

`func (o *AdGroupUpdateRequest) SetOptimizationGoalMetadataNil(b bool)`

 SetOptimizationGoalMetadataNil sets the value for OptimizationGoalMetadata to be an explicit nil

### UnsetOptimizationGoalMetadata
`func (o *AdGroupUpdateRequest) UnsetOptimizationGoalMetadata()`

UnsetOptimizationGoalMetadata ensures that no value is present for OptimizationGoalMetadata, not even an explicit nil
### GetBudgetType

`func (o *AdGroupUpdateRequest) GetBudgetType() BudgetType`

GetBudgetType returns the BudgetType field if non-nil, zero value otherwise.

### GetBudgetTypeOk

`func (o *AdGroupUpdateRequest) GetBudgetTypeOk() (*BudgetType, bool)`

GetBudgetTypeOk returns a tuple with the BudgetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetType

`func (o *AdGroupUpdateRequest) SetBudgetType(v BudgetType)`

SetBudgetType sets BudgetType field to given value.

### HasBudgetType

`func (o *AdGroupUpdateRequest) HasBudgetType() bool`

HasBudgetType returns a boolean if a field has been set.

### GetStartTime

`func (o *AdGroupUpdateRequest) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *AdGroupUpdateRequest) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *AdGroupUpdateRequest) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *AdGroupUpdateRequest) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *AdGroupUpdateRequest) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *AdGroupUpdateRequest) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetEndTime

`func (o *AdGroupUpdateRequest) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *AdGroupUpdateRequest) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *AdGroupUpdateRequest) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *AdGroupUpdateRequest) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *AdGroupUpdateRequest) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *AdGroupUpdateRequest) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetTargetingSpec

`func (o *AdGroupUpdateRequest) GetTargetingSpec() TargetingSpec`

GetTargetingSpec returns the TargetingSpec field if non-nil, zero value otherwise.

### GetTargetingSpecOk

`func (o *AdGroupUpdateRequest) GetTargetingSpecOk() (*TargetingSpec, bool)`

GetTargetingSpecOk returns a tuple with the TargetingSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpec

`func (o *AdGroupUpdateRequest) SetTargetingSpec(v TargetingSpec)`

SetTargetingSpec sets TargetingSpec field to given value.

### HasTargetingSpec

`func (o *AdGroupUpdateRequest) HasTargetingSpec() bool`

HasTargetingSpec returns a boolean if a field has been set.

### GetLifetimeFrequencyCap

`func (o *AdGroupUpdateRequest) GetLifetimeFrequencyCap() int32`

GetLifetimeFrequencyCap returns the LifetimeFrequencyCap field if non-nil, zero value otherwise.

### GetLifetimeFrequencyCapOk

`func (o *AdGroupUpdateRequest) GetLifetimeFrequencyCapOk() (*int32, bool)`

GetLifetimeFrequencyCapOk returns a tuple with the LifetimeFrequencyCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeFrequencyCap

`func (o *AdGroupUpdateRequest) SetLifetimeFrequencyCap(v int32)`

SetLifetimeFrequencyCap sets LifetimeFrequencyCap field to given value.

### HasLifetimeFrequencyCap

`func (o *AdGroupUpdateRequest) HasLifetimeFrequencyCap() bool`

HasLifetimeFrequencyCap returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *AdGroupUpdateRequest) GetTrackingUrls() AdGroupCommonTrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdGroupUpdateRequest) GetTrackingUrlsOk() (*AdGroupCommonTrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdGroupUpdateRequest) SetTrackingUrls(v AdGroupCommonTrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdGroupUpdateRequest) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdGroupUpdateRequest) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdGroupUpdateRequest) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetAutoTargetingEnabled

`func (o *AdGroupUpdateRequest) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *AdGroupUpdateRequest) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *AdGroupUpdateRequest) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *AdGroupUpdateRequest) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### SetAutoTargetingEnabledNil

`func (o *AdGroupUpdateRequest) SetAutoTargetingEnabledNil(b bool)`

 SetAutoTargetingEnabledNil sets the value for AutoTargetingEnabled to be an explicit nil

### UnsetAutoTargetingEnabled
`func (o *AdGroupUpdateRequest) UnsetAutoTargetingEnabled()`

UnsetAutoTargetingEnabled ensures that no value is present for AutoTargetingEnabled, not even an explicit nil
### GetPlacementGroup

`func (o *AdGroupUpdateRequest) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *AdGroupUpdateRequest) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *AdGroupUpdateRequest) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *AdGroupUpdateRequest) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetPacingDeliveryType

`func (o *AdGroupUpdateRequest) GetPacingDeliveryType() PacingDeliveryType`

GetPacingDeliveryType returns the PacingDeliveryType field if non-nil, zero value otherwise.

### GetPacingDeliveryTypeOk

`func (o *AdGroupUpdateRequest) GetPacingDeliveryTypeOk() (*PacingDeliveryType, bool)`

GetPacingDeliveryTypeOk returns a tuple with the PacingDeliveryType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPacingDeliveryType

`func (o *AdGroupUpdateRequest) SetPacingDeliveryType(v PacingDeliveryType)`

SetPacingDeliveryType sets PacingDeliveryType field to given value.

### HasPacingDeliveryType

`func (o *AdGroupUpdateRequest) HasPacingDeliveryType() bool`

HasPacingDeliveryType returns a boolean if a field has been set.

### GetCampaignId

`func (o *AdGroupUpdateRequest) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *AdGroupUpdateRequest) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *AdGroupUpdateRequest) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *AdGroupUpdateRequest) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetBillableEvent

`func (o *AdGroupUpdateRequest) GetBillableEvent() ActionType`

GetBillableEvent returns the BillableEvent field if non-nil, zero value otherwise.

### GetBillableEventOk

`func (o *AdGroupUpdateRequest) GetBillableEventOk() (*ActionType, bool)`

GetBillableEventOk returns a tuple with the BillableEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillableEvent

`func (o *AdGroupUpdateRequest) SetBillableEvent(v ActionType)`

SetBillableEvent sets BillableEvent field to given value.

### HasBillableEvent

`func (o *AdGroupUpdateRequest) HasBillableEvent() bool`

HasBillableEvent returns a boolean if a field has been set.

### GetBidStrategyType

`func (o *AdGroupUpdateRequest) GetBidStrategyType() string`

GetBidStrategyType returns the BidStrategyType field if non-nil, zero value otherwise.

### GetBidStrategyTypeOk

`func (o *AdGroupUpdateRequest) GetBidStrategyTypeOk() (*string, bool)`

GetBidStrategyTypeOk returns a tuple with the BidStrategyType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidStrategyType

`func (o *AdGroupUpdateRequest) SetBidStrategyType(v string)`

SetBidStrategyType sets BidStrategyType field to given value.

### HasBidStrategyType

`func (o *AdGroupUpdateRequest) HasBidStrategyType() bool`

HasBidStrategyType returns a boolean if a field has been set.

### SetBidStrategyTypeNil

`func (o *AdGroupUpdateRequest) SetBidStrategyTypeNil(b bool)`

 SetBidStrategyTypeNil sets the value for BidStrategyType to be an explicit nil

### UnsetBidStrategyType
`func (o *AdGroupUpdateRequest) UnsetBidStrategyType()`

UnsetBidStrategyType ensures that no value is present for BidStrategyType, not even an explicit nil
### GetId

`func (o *AdGroupUpdateRequest) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdGroupUpdateRequest) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdGroupUpdateRequest) SetId(v string)`

SetId sets Id field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


