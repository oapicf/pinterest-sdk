# AdGroupResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | Ad group name. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] 
**BudgetInMicroCurrency** | Pointer to **NullableInt32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**BidInMicroCurrency** | Pointer to **NullableInt32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**BudgetType** | Pointer to **string** | Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. | [optional] 
**StartTime** | Pointer to **NullableInt32** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Ad group end time. Unix timestamp in seconds. | [optional] 
**TargetingSpec** | Pointer to **map[string][]string** | Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39; | [optional] 
**LifetimeFrequencyCap** | Pointer to **int32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Billable-event\\\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**TrackingUrls** | Pointer to [**TrackingUrls**](TrackingUrls.md) | Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;. | [optional] 
**AutoTargetingEnabled** | Pointer to **NullableBool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] 
**PlacementGroup** | Pointer to [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Placement-group\\\&quot;&gt;Placement group&lt;/a&gt;. | [optional] 
**PacingDeliveryType** | Pointer to [**PacingDeliveryType**](PacingDeliveryType.md) | Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. | [optional] 
**ConversionLearningModeType** | Pointer to **NullableString** | oCPM learn mode | [optional] 
**SummaryStatus** | Pointer to [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. | [optional] 
**FeedProfileId** | Pointer to **string** | Feed Profile ID associated to the adgroup. | [optional] 
**CampaignId** | Pointer to **string** | Campaign ID of the ad group. | [optional] 
**BillableEvent** | Pointer to [**ActionType**](ActionType.md) |  | [optional] 
**Id** | Pointer to **string** | Ad group ID. | [optional] 
**Type** | Pointer to **string** | Always \&quot;adgroup\&quot;. | [optional] 
**AdAccountId** | Pointer to **string** | Advertiser ID. | [optional] 
**CreatedTime** | Pointer to **int32** | Ad group creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | Pointer to **int32** | Ad group last update time. Unix timestamp in seconds. | [optional] 

## Methods

### NewAdGroupResponse

`func NewAdGroupResponse() *AdGroupResponse`

NewAdGroupResponse instantiates a new AdGroupResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupResponseWithDefaults

`func NewAdGroupResponseWithDefaults() *AdGroupResponse`

NewAdGroupResponseWithDefaults instantiates a new AdGroupResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *AdGroupResponse) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdGroupResponse) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdGroupResponse) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdGroupResponse) HasName() bool`

HasName returns a boolean if a field has been set.

### GetStatus

`func (o *AdGroupResponse) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdGroupResponse) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdGroupResponse) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdGroupResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetBudgetInMicroCurrency

`func (o *AdGroupResponse) GetBudgetInMicroCurrency() int32`

GetBudgetInMicroCurrency returns the BudgetInMicroCurrency field if non-nil, zero value otherwise.

### GetBudgetInMicroCurrencyOk

`func (o *AdGroupResponse) GetBudgetInMicroCurrencyOk() (*int32, bool)`

GetBudgetInMicroCurrencyOk returns a tuple with the BudgetInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetInMicroCurrency

`func (o *AdGroupResponse) SetBudgetInMicroCurrency(v int32)`

SetBudgetInMicroCurrency sets BudgetInMicroCurrency field to given value.

### HasBudgetInMicroCurrency

`func (o *AdGroupResponse) HasBudgetInMicroCurrency() bool`

HasBudgetInMicroCurrency returns a boolean if a field has been set.

### SetBudgetInMicroCurrencyNil

`func (o *AdGroupResponse) SetBudgetInMicroCurrencyNil(b bool)`

 SetBudgetInMicroCurrencyNil sets the value for BudgetInMicroCurrency to be an explicit nil

### UnsetBudgetInMicroCurrency
`func (o *AdGroupResponse) UnsetBudgetInMicroCurrency()`

UnsetBudgetInMicroCurrency ensures that no value is present for BudgetInMicroCurrency, not even an explicit nil
### GetBidInMicroCurrency

`func (o *AdGroupResponse) GetBidInMicroCurrency() int32`

GetBidInMicroCurrency returns the BidInMicroCurrency field if non-nil, zero value otherwise.

### GetBidInMicroCurrencyOk

`func (o *AdGroupResponse) GetBidInMicroCurrencyOk() (*int32, bool)`

GetBidInMicroCurrencyOk returns a tuple with the BidInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidInMicroCurrency

`func (o *AdGroupResponse) SetBidInMicroCurrency(v int32)`

SetBidInMicroCurrency sets BidInMicroCurrency field to given value.

### HasBidInMicroCurrency

`func (o *AdGroupResponse) HasBidInMicroCurrency() bool`

HasBidInMicroCurrency returns a boolean if a field has been set.

### SetBidInMicroCurrencyNil

`func (o *AdGroupResponse) SetBidInMicroCurrencyNil(b bool)`

 SetBidInMicroCurrencyNil sets the value for BidInMicroCurrency to be an explicit nil

### UnsetBidInMicroCurrency
`func (o *AdGroupResponse) UnsetBidInMicroCurrency()`

UnsetBidInMicroCurrency ensures that no value is present for BidInMicroCurrency, not even an explicit nil
### GetBudgetType

`func (o *AdGroupResponse) GetBudgetType() string`

GetBudgetType returns the BudgetType field if non-nil, zero value otherwise.

### GetBudgetTypeOk

`func (o *AdGroupResponse) GetBudgetTypeOk() (*string, bool)`

GetBudgetTypeOk returns a tuple with the BudgetType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudgetType

`func (o *AdGroupResponse) SetBudgetType(v string)`

SetBudgetType sets BudgetType field to given value.

### HasBudgetType

`func (o *AdGroupResponse) HasBudgetType() bool`

HasBudgetType returns a boolean if a field has been set.

### GetStartTime

`func (o *AdGroupResponse) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *AdGroupResponse) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *AdGroupResponse) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *AdGroupResponse) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *AdGroupResponse) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *AdGroupResponse) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetEndTime

`func (o *AdGroupResponse) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *AdGroupResponse) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *AdGroupResponse) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *AdGroupResponse) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *AdGroupResponse) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *AdGroupResponse) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetTargetingSpec

`func (o *AdGroupResponse) GetTargetingSpec() map[string][]string`

GetTargetingSpec returns the TargetingSpec field if non-nil, zero value otherwise.

### GetTargetingSpecOk

`func (o *AdGroupResponse) GetTargetingSpecOk() (*map[string][]string, bool)`

GetTargetingSpecOk returns a tuple with the TargetingSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpec

`func (o *AdGroupResponse) SetTargetingSpec(v map[string][]string)`

SetTargetingSpec sets TargetingSpec field to given value.

### HasTargetingSpec

`func (o *AdGroupResponse) HasTargetingSpec() bool`

HasTargetingSpec returns a boolean if a field has been set.

### GetLifetimeFrequencyCap

`func (o *AdGroupResponse) GetLifetimeFrequencyCap() int32`

GetLifetimeFrequencyCap returns the LifetimeFrequencyCap field if non-nil, zero value otherwise.

### GetLifetimeFrequencyCapOk

`func (o *AdGroupResponse) GetLifetimeFrequencyCapOk() (*int32, bool)`

GetLifetimeFrequencyCapOk returns a tuple with the LifetimeFrequencyCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeFrequencyCap

`func (o *AdGroupResponse) SetLifetimeFrequencyCap(v int32)`

SetLifetimeFrequencyCap sets LifetimeFrequencyCap field to given value.

### HasLifetimeFrequencyCap

`func (o *AdGroupResponse) HasLifetimeFrequencyCap() bool`

HasLifetimeFrequencyCap returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *AdGroupResponse) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdGroupResponse) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdGroupResponse) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdGroupResponse) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdGroupResponse) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdGroupResponse) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetAutoTargetingEnabled

`func (o *AdGroupResponse) GetAutoTargetingEnabled() bool`

GetAutoTargetingEnabled returns the AutoTargetingEnabled field if non-nil, zero value otherwise.

### GetAutoTargetingEnabledOk

`func (o *AdGroupResponse) GetAutoTargetingEnabledOk() (*bool, bool)`

GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoTargetingEnabled

`func (o *AdGroupResponse) SetAutoTargetingEnabled(v bool)`

SetAutoTargetingEnabled sets AutoTargetingEnabled field to given value.

### HasAutoTargetingEnabled

`func (o *AdGroupResponse) HasAutoTargetingEnabled() bool`

HasAutoTargetingEnabled returns a boolean if a field has been set.

### SetAutoTargetingEnabledNil

`func (o *AdGroupResponse) SetAutoTargetingEnabledNil(b bool)`

 SetAutoTargetingEnabledNil sets the value for AutoTargetingEnabled to be an explicit nil

### UnsetAutoTargetingEnabled
`func (o *AdGroupResponse) UnsetAutoTargetingEnabled()`

UnsetAutoTargetingEnabled ensures that no value is present for AutoTargetingEnabled, not even an explicit nil
### GetPlacementGroup

`func (o *AdGroupResponse) GetPlacementGroup() PlacementGroupType`

GetPlacementGroup returns the PlacementGroup field if non-nil, zero value otherwise.

### GetPlacementGroupOk

`func (o *AdGroupResponse) GetPlacementGroupOk() (*PlacementGroupType, bool)`

GetPlacementGroupOk returns a tuple with the PlacementGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementGroup

`func (o *AdGroupResponse) SetPlacementGroup(v PlacementGroupType)`

SetPlacementGroup sets PlacementGroup field to given value.

### HasPlacementGroup

`func (o *AdGroupResponse) HasPlacementGroup() bool`

HasPlacementGroup returns a boolean if a field has been set.

### GetPacingDeliveryType

`func (o *AdGroupResponse) GetPacingDeliveryType() PacingDeliveryType`

GetPacingDeliveryType returns the PacingDeliveryType field if non-nil, zero value otherwise.

### GetPacingDeliveryTypeOk

`func (o *AdGroupResponse) GetPacingDeliveryTypeOk() (*PacingDeliveryType, bool)`

GetPacingDeliveryTypeOk returns a tuple with the PacingDeliveryType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPacingDeliveryType

`func (o *AdGroupResponse) SetPacingDeliveryType(v PacingDeliveryType)`

SetPacingDeliveryType sets PacingDeliveryType field to given value.

### HasPacingDeliveryType

`func (o *AdGroupResponse) HasPacingDeliveryType() bool`

HasPacingDeliveryType returns a boolean if a field has been set.

### GetConversionLearningModeType

`func (o *AdGroupResponse) GetConversionLearningModeType() string`

GetConversionLearningModeType returns the ConversionLearningModeType field if non-nil, zero value otherwise.

### GetConversionLearningModeTypeOk

`func (o *AdGroupResponse) GetConversionLearningModeTypeOk() (*string, bool)`

GetConversionLearningModeTypeOk returns a tuple with the ConversionLearningModeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionLearningModeType

`func (o *AdGroupResponse) SetConversionLearningModeType(v string)`

SetConversionLearningModeType sets ConversionLearningModeType field to given value.

### HasConversionLearningModeType

`func (o *AdGroupResponse) HasConversionLearningModeType() bool`

HasConversionLearningModeType returns a boolean if a field has been set.

### SetConversionLearningModeTypeNil

`func (o *AdGroupResponse) SetConversionLearningModeTypeNil(b bool)`

 SetConversionLearningModeTypeNil sets the value for ConversionLearningModeType to be an explicit nil

### UnsetConversionLearningModeType
`func (o *AdGroupResponse) UnsetConversionLearningModeType()`

UnsetConversionLearningModeType ensures that no value is present for ConversionLearningModeType, not even an explicit nil
### GetSummaryStatus

`func (o *AdGroupResponse) GetSummaryStatus() AdGroupSummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *AdGroupResponse) GetSummaryStatusOk() (*AdGroupSummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *AdGroupResponse) SetSummaryStatus(v AdGroupSummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.

### HasSummaryStatus

`func (o *AdGroupResponse) HasSummaryStatus() bool`

HasSummaryStatus returns a boolean if a field has been set.

### GetFeedProfileId

`func (o *AdGroupResponse) GetFeedProfileId() string`

GetFeedProfileId returns the FeedProfileId field if non-nil, zero value otherwise.

### GetFeedProfileIdOk

`func (o *AdGroupResponse) GetFeedProfileIdOk() (*string, bool)`

GetFeedProfileIdOk returns a tuple with the FeedProfileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedProfileId

`func (o *AdGroupResponse) SetFeedProfileId(v string)`

SetFeedProfileId sets FeedProfileId field to given value.

### HasFeedProfileId

`func (o *AdGroupResponse) HasFeedProfileId() bool`

HasFeedProfileId returns a boolean if a field has been set.

### GetCampaignId

`func (o *AdGroupResponse) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *AdGroupResponse) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *AdGroupResponse) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *AdGroupResponse) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetBillableEvent

`func (o *AdGroupResponse) GetBillableEvent() ActionType`

GetBillableEvent returns the BillableEvent field if non-nil, zero value otherwise.

### GetBillableEventOk

`func (o *AdGroupResponse) GetBillableEventOk() (*ActionType, bool)`

GetBillableEventOk returns a tuple with the BillableEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillableEvent

`func (o *AdGroupResponse) SetBillableEvent(v ActionType)`

SetBillableEvent sets BillableEvent field to given value.

### HasBillableEvent

`func (o *AdGroupResponse) HasBillableEvent() bool`

HasBillableEvent returns a boolean if a field has been set.

### GetId

`func (o *AdGroupResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdGroupResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdGroupResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AdGroupResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *AdGroupResponse) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AdGroupResponse) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AdGroupResponse) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *AdGroupResponse) HasType() bool`

HasType returns a boolean if a field has been set.

### GetAdAccountId

`func (o *AdGroupResponse) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdGroupResponse) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdGroupResponse) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdGroupResponse) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *AdGroupResponse) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *AdGroupResponse) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *AdGroupResponse) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *AdGroupResponse) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *AdGroupResponse) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *AdGroupResponse) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *AdGroupResponse) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *AdGroupResponse) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


