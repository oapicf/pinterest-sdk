# AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**EndDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**ClickWindowDays** | Pointer to [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**EngagementWindowDays** | Pointer to [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**ViewWindowDays** | Pointer to [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**ConversionReportTime** | Pointer to [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to "TIME_OF_AD_ACTION"]
**AttributionTypes** | Pointer to [**[]ConversionReportAttributionType**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**Columns** | [**[]ReportingColumnAsync**](ReportingColumnAsync.md) | Metric and entity columns | 
**Level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**ReportFormat** | Pointer to [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data | [optional] [default to "JSON"]
**CampaignIds** | Pointer to **[]string** | List of campaign ids | [optional] 
**CampaignStatuses** | Pointer to [**[]CampaignSummaryStatus**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**CampaignObjectiveTypes** | Pointer to [**[]ObjectiveType**](ObjectiveType.md) | List of values for filtering | [optional] 
**AdGroupIds** | Pointer to **[]string** | List of ad group ids | [optional] 
**AdGroupStatuses** | Pointer to [**[]AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**AdIds** | Pointer to **[]string** | List of ad ids | [optional] 
**AdStatuses** | Pointer to [**[]PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | List of values for filtering | [optional] 
**ProductGroupIds** | Pointer to **[]string** | List of product group ids | [optional] 
**ProductGroupStatuses** | Pointer to [**[]ProductGroupSummaryStatus**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**ProductItemIds** | Pointer to **[]string** | List of product item ids | [optional] 
**TargetingTypes** | Pointer to [**[]AdsAnalyticsTargetingType**](AdsAnalyticsTargetingType.md) | List of targeting types | [optional] 
**MetricsFilters** | Pointer to [**[]AdsAnalyticsMetricsFilter**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 

## Methods

### NewAdsAnalyticsCreateAsyncRequest

`func NewAdsAnalyticsCreateAsyncRequest(startDate string, endDate string, granularity Granularity, columns []ReportingColumnAsync, level MetricsReportingLevel, ) *AdsAnalyticsCreateAsyncRequest`

NewAdsAnalyticsCreateAsyncRequest instantiates a new AdsAnalyticsCreateAsyncRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdsAnalyticsCreateAsyncRequestWithDefaults

`func NewAdsAnalyticsCreateAsyncRequestWithDefaults() *AdsAnalyticsCreateAsyncRequest`

NewAdsAnalyticsCreateAsyncRequestWithDefaults instantiates a new AdsAnalyticsCreateAsyncRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStartDate

`func (o *AdsAnalyticsCreateAsyncRequest) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *AdsAnalyticsCreateAsyncRequest) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.


### GetEndDate

`func (o *AdsAnalyticsCreateAsyncRequest) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *AdsAnalyticsCreateAsyncRequest) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.


### GetGranularity

`func (o *AdsAnalyticsCreateAsyncRequest) GetGranularity() Granularity`

GetGranularity returns the Granularity field if non-nil, zero value otherwise.

### GetGranularityOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetGranularityOk() (*Granularity, bool)`

GetGranularityOk returns a tuple with the Granularity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGranularity

`func (o *AdsAnalyticsCreateAsyncRequest) SetGranularity(v Granularity)`

SetGranularity sets Granularity field to given value.


### GetClickWindowDays

`func (o *AdsAnalyticsCreateAsyncRequest) GetClickWindowDays() ConversionAttributionWindowDays`

GetClickWindowDays returns the ClickWindowDays field if non-nil, zero value otherwise.

### GetClickWindowDaysOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetClickWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetClickWindowDaysOk returns a tuple with the ClickWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickWindowDays

`func (o *AdsAnalyticsCreateAsyncRequest) SetClickWindowDays(v ConversionAttributionWindowDays)`

SetClickWindowDays sets ClickWindowDays field to given value.

### HasClickWindowDays

`func (o *AdsAnalyticsCreateAsyncRequest) HasClickWindowDays() bool`

HasClickWindowDays returns a boolean if a field has been set.

### GetEngagementWindowDays

`func (o *AdsAnalyticsCreateAsyncRequest) GetEngagementWindowDays() ConversionAttributionWindowDays`

GetEngagementWindowDays returns the EngagementWindowDays field if non-nil, zero value otherwise.

### GetEngagementWindowDaysOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetEngagementWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetEngagementWindowDaysOk returns a tuple with the EngagementWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagementWindowDays

`func (o *AdsAnalyticsCreateAsyncRequest) SetEngagementWindowDays(v ConversionAttributionWindowDays)`

SetEngagementWindowDays sets EngagementWindowDays field to given value.

### HasEngagementWindowDays

`func (o *AdsAnalyticsCreateAsyncRequest) HasEngagementWindowDays() bool`

HasEngagementWindowDays returns a boolean if a field has been set.

### GetViewWindowDays

`func (o *AdsAnalyticsCreateAsyncRequest) GetViewWindowDays() ConversionAttributionWindowDays`

GetViewWindowDays returns the ViewWindowDays field if non-nil, zero value otherwise.

### GetViewWindowDaysOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetViewWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetViewWindowDaysOk returns a tuple with the ViewWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewWindowDays

`func (o *AdsAnalyticsCreateAsyncRequest) SetViewWindowDays(v ConversionAttributionWindowDays)`

SetViewWindowDays sets ViewWindowDays field to given value.

### HasViewWindowDays

`func (o *AdsAnalyticsCreateAsyncRequest) HasViewWindowDays() bool`

HasViewWindowDays returns a boolean if a field has been set.

### GetConversionReportTime

`func (o *AdsAnalyticsCreateAsyncRequest) GetConversionReportTime() ConversionReportTimeType`

GetConversionReportTime returns the ConversionReportTime field if non-nil, zero value otherwise.

### GetConversionReportTimeOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetConversionReportTimeOk() (*ConversionReportTimeType, bool)`

GetConversionReportTimeOk returns a tuple with the ConversionReportTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionReportTime

`func (o *AdsAnalyticsCreateAsyncRequest) SetConversionReportTime(v ConversionReportTimeType)`

SetConversionReportTime sets ConversionReportTime field to given value.

### HasConversionReportTime

`func (o *AdsAnalyticsCreateAsyncRequest) HasConversionReportTime() bool`

HasConversionReportTime returns a boolean if a field has been set.

### GetAttributionTypes

`func (o *AdsAnalyticsCreateAsyncRequest) GetAttributionTypes() []ConversionReportAttributionType`

GetAttributionTypes returns the AttributionTypes field if non-nil, zero value otherwise.

### GetAttributionTypesOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetAttributionTypesOk() (*[]ConversionReportAttributionType, bool)`

GetAttributionTypesOk returns a tuple with the AttributionTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionTypes

`func (o *AdsAnalyticsCreateAsyncRequest) SetAttributionTypes(v []ConversionReportAttributionType)`

SetAttributionTypes sets AttributionTypes field to given value.

### HasAttributionTypes

`func (o *AdsAnalyticsCreateAsyncRequest) HasAttributionTypes() bool`

HasAttributionTypes returns a boolean if a field has been set.

### GetColumns

`func (o *AdsAnalyticsCreateAsyncRequest) GetColumns() []ReportingColumnAsync`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetColumnsOk() (*[]ReportingColumnAsync, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *AdsAnalyticsCreateAsyncRequest) SetColumns(v []ReportingColumnAsync)`

SetColumns sets Columns field to given value.


### GetLevel

`func (o *AdsAnalyticsCreateAsyncRequest) GetLevel() MetricsReportingLevel`

GetLevel returns the Level field if non-nil, zero value otherwise.

### GetLevelOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetLevelOk() (*MetricsReportingLevel, bool)`

GetLevelOk returns a tuple with the Level field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevel

`func (o *AdsAnalyticsCreateAsyncRequest) SetLevel(v MetricsReportingLevel)`

SetLevel sets Level field to given value.


### GetReportFormat

`func (o *AdsAnalyticsCreateAsyncRequest) GetReportFormat() DataOutputFormat`

GetReportFormat returns the ReportFormat field if non-nil, zero value otherwise.

### GetReportFormatOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetReportFormatOk() (*DataOutputFormat, bool)`

GetReportFormatOk returns a tuple with the ReportFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportFormat

`func (o *AdsAnalyticsCreateAsyncRequest) SetReportFormat(v DataOutputFormat)`

SetReportFormat sets ReportFormat field to given value.

### HasReportFormat

`func (o *AdsAnalyticsCreateAsyncRequest) HasReportFormat() bool`

HasReportFormat returns a boolean if a field has been set.

### GetCampaignIds

`func (o *AdsAnalyticsCreateAsyncRequest) GetCampaignIds() []string`

GetCampaignIds returns the CampaignIds field if non-nil, zero value otherwise.

### GetCampaignIdsOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetCampaignIdsOk() (*[]string, bool)`

GetCampaignIdsOk returns a tuple with the CampaignIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignIds

`func (o *AdsAnalyticsCreateAsyncRequest) SetCampaignIds(v []string)`

SetCampaignIds sets CampaignIds field to given value.

### HasCampaignIds

`func (o *AdsAnalyticsCreateAsyncRequest) HasCampaignIds() bool`

HasCampaignIds returns a boolean if a field has been set.

### GetCampaignStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) GetCampaignStatuses() []CampaignSummaryStatus`

GetCampaignStatuses returns the CampaignStatuses field if non-nil, zero value otherwise.

### GetCampaignStatusesOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetCampaignStatusesOk() (*[]CampaignSummaryStatus, bool)`

GetCampaignStatusesOk returns a tuple with the CampaignStatuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) SetCampaignStatuses(v []CampaignSummaryStatus)`

SetCampaignStatuses sets CampaignStatuses field to given value.

### HasCampaignStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) HasCampaignStatuses() bool`

HasCampaignStatuses returns a boolean if a field has been set.

### GetCampaignObjectiveTypes

`func (o *AdsAnalyticsCreateAsyncRequest) GetCampaignObjectiveTypes() []ObjectiveType`

GetCampaignObjectiveTypes returns the CampaignObjectiveTypes field if non-nil, zero value otherwise.

### GetCampaignObjectiveTypesOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetCampaignObjectiveTypesOk() (*[]ObjectiveType, bool)`

GetCampaignObjectiveTypesOk returns a tuple with the CampaignObjectiveTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignObjectiveTypes

`func (o *AdsAnalyticsCreateAsyncRequest) SetCampaignObjectiveTypes(v []ObjectiveType)`

SetCampaignObjectiveTypes sets CampaignObjectiveTypes field to given value.

### HasCampaignObjectiveTypes

`func (o *AdsAnalyticsCreateAsyncRequest) HasCampaignObjectiveTypes() bool`

HasCampaignObjectiveTypes returns a boolean if a field has been set.

### GetAdGroupIds

`func (o *AdsAnalyticsCreateAsyncRequest) GetAdGroupIds() []string`

GetAdGroupIds returns the AdGroupIds field if non-nil, zero value otherwise.

### GetAdGroupIdsOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetAdGroupIdsOk() (*[]string, bool)`

GetAdGroupIdsOk returns a tuple with the AdGroupIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupIds

`func (o *AdsAnalyticsCreateAsyncRequest) SetAdGroupIds(v []string)`

SetAdGroupIds sets AdGroupIds field to given value.

### HasAdGroupIds

`func (o *AdsAnalyticsCreateAsyncRequest) HasAdGroupIds() bool`

HasAdGroupIds returns a boolean if a field has been set.

### GetAdGroupStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) GetAdGroupStatuses() []AdGroupSummaryStatus`

GetAdGroupStatuses returns the AdGroupStatuses field if non-nil, zero value otherwise.

### GetAdGroupStatusesOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetAdGroupStatusesOk() (*[]AdGroupSummaryStatus, bool)`

GetAdGroupStatusesOk returns a tuple with the AdGroupStatuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) SetAdGroupStatuses(v []AdGroupSummaryStatus)`

SetAdGroupStatuses sets AdGroupStatuses field to given value.

### HasAdGroupStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) HasAdGroupStatuses() bool`

HasAdGroupStatuses returns a boolean if a field has been set.

### GetAdIds

`func (o *AdsAnalyticsCreateAsyncRequest) GetAdIds() []string`

GetAdIds returns the AdIds field if non-nil, zero value otherwise.

### GetAdIdsOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetAdIdsOk() (*[]string, bool)`

GetAdIdsOk returns a tuple with the AdIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdIds

`func (o *AdsAnalyticsCreateAsyncRequest) SetAdIds(v []string)`

SetAdIds sets AdIds field to given value.

### HasAdIds

`func (o *AdsAnalyticsCreateAsyncRequest) HasAdIds() bool`

HasAdIds returns a boolean if a field has been set.

### GetAdStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) GetAdStatuses() []PinPromotionSummaryStatus`

GetAdStatuses returns the AdStatuses field if non-nil, zero value otherwise.

### GetAdStatusesOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetAdStatusesOk() (*[]PinPromotionSummaryStatus, bool)`

GetAdStatusesOk returns a tuple with the AdStatuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) SetAdStatuses(v []PinPromotionSummaryStatus)`

SetAdStatuses sets AdStatuses field to given value.

### HasAdStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) HasAdStatuses() bool`

HasAdStatuses returns a boolean if a field has been set.

### GetProductGroupIds

`func (o *AdsAnalyticsCreateAsyncRequest) GetProductGroupIds() []string`

GetProductGroupIds returns the ProductGroupIds field if non-nil, zero value otherwise.

### GetProductGroupIdsOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetProductGroupIdsOk() (*[]string, bool)`

GetProductGroupIdsOk returns a tuple with the ProductGroupIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupIds

`func (o *AdsAnalyticsCreateAsyncRequest) SetProductGroupIds(v []string)`

SetProductGroupIds sets ProductGroupIds field to given value.

### HasProductGroupIds

`func (o *AdsAnalyticsCreateAsyncRequest) HasProductGroupIds() bool`

HasProductGroupIds returns a boolean if a field has been set.

### GetProductGroupStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) GetProductGroupStatuses() []ProductGroupSummaryStatus`

GetProductGroupStatuses returns the ProductGroupStatuses field if non-nil, zero value otherwise.

### GetProductGroupStatusesOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetProductGroupStatusesOk() (*[]ProductGroupSummaryStatus, bool)`

GetProductGroupStatusesOk returns a tuple with the ProductGroupStatuses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductGroupStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) SetProductGroupStatuses(v []ProductGroupSummaryStatus)`

SetProductGroupStatuses sets ProductGroupStatuses field to given value.

### HasProductGroupStatuses

`func (o *AdsAnalyticsCreateAsyncRequest) HasProductGroupStatuses() bool`

HasProductGroupStatuses returns a boolean if a field has been set.

### GetProductItemIds

`func (o *AdsAnalyticsCreateAsyncRequest) GetProductItemIds() []string`

GetProductItemIds returns the ProductItemIds field if non-nil, zero value otherwise.

### GetProductItemIdsOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetProductItemIdsOk() (*[]string, bool)`

GetProductItemIdsOk returns a tuple with the ProductItemIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductItemIds

`func (o *AdsAnalyticsCreateAsyncRequest) SetProductItemIds(v []string)`

SetProductItemIds sets ProductItemIds field to given value.

### HasProductItemIds

`func (o *AdsAnalyticsCreateAsyncRequest) HasProductItemIds() bool`

HasProductItemIds returns a boolean if a field has been set.

### GetTargetingTypes

`func (o *AdsAnalyticsCreateAsyncRequest) GetTargetingTypes() []AdsAnalyticsTargetingType`

GetTargetingTypes returns the TargetingTypes field if non-nil, zero value otherwise.

### GetTargetingTypesOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetTargetingTypesOk() (*[]AdsAnalyticsTargetingType, bool)`

GetTargetingTypesOk returns a tuple with the TargetingTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingTypes

`func (o *AdsAnalyticsCreateAsyncRequest) SetTargetingTypes(v []AdsAnalyticsTargetingType)`

SetTargetingTypes sets TargetingTypes field to given value.

### HasTargetingTypes

`func (o *AdsAnalyticsCreateAsyncRequest) HasTargetingTypes() bool`

HasTargetingTypes returns a boolean if a field has been set.

### GetMetricsFilters

`func (o *AdsAnalyticsCreateAsyncRequest) GetMetricsFilters() []AdsAnalyticsMetricsFilter`

GetMetricsFilters returns the MetricsFilters field if non-nil, zero value otherwise.

### GetMetricsFiltersOk

`func (o *AdsAnalyticsCreateAsyncRequest) GetMetricsFiltersOk() (*[]AdsAnalyticsMetricsFilter, bool)`

GetMetricsFiltersOk returns a tuple with the MetricsFilters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetricsFilters

`func (o *AdsAnalyticsCreateAsyncRequest) SetMetricsFilters(v []AdsAnalyticsMetricsFilter)`

SetMetricsFilters sets MetricsFilters field to given value.

### HasMetricsFilters

`func (o *AdsAnalyticsCreateAsyncRequest) HasMetricsFilters() bool`

HasMetricsFilters returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


