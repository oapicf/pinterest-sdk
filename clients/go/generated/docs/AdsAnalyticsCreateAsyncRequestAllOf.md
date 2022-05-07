# AdsAnalyticsCreateAsyncRequestAllOf

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

## Methods

### NewAdsAnalyticsCreateAsyncRequestAllOf

`func NewAdsAnalyticsCreateAsyncRequestAllOf(startDate string, endDate string, granularity Granularity, ) *AdsAnalyticsCreateAsyncRequestAllOf`

NewAdsAnalyticsCreateAsyncRequestAllOf instantiates a new AdsAnalyticsCreateAsyncRequestAllOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdsAnalyticsCreateAsyncRequestAllOfWithDefaults

`func NewAdsAnalyticsCreateAsyncRequestAllOfWithDefaults() *AdsAnalyticsCreateAsyncRequestAllOf`

NewAdsAnalyticsCreateAsyncRequestAllOfWithDefaults instantiates a new AdsAnalyticsCreateAsyncRequestAllOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStartDate

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetStartDate() string`

GetStartDate returns the StartDate field if non-nil, zero value otherwise.

### GetStartDateOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetStartDateOk() (*string, bool)`

GetStartDateOk returns a tuple with the StartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDate

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) SetStartDate(v string)`

SetStartDate sets StartDate field to given value.


### GetEndDate

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetEndDate() string`

GetEndDate returns the EndDate field if non-nil, zero value otherwise.

### GetEndDateOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetEndDateOk() (*string, bool)`

GetEndDateOk returns a tuple with the EndDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDate

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) SetEndDate(v string)`

SetEndDate sets EndDate field to given value.


### GetGranularity

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetGranularity() Granularity`

GetGranularity returns the Granularity field if non-nil, zero value otherwise.

### GetGranularityOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetGranularityOk() (*Granularity, bool)`

GetGranularityOk returns a tuple with the Granularity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGranularity

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) SetGranularity(v Granularity)`

SetGranularity sets Granularity field to given value.


### GetClickWindowDays

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetClickWindowDays() ConversionAttributionWindowDays`

GetClickWindowDays returns the ClickWindowDays field if non-nil, zero value otherwise.

### GetClickWindowDaysOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetClickWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetClickWindowDaysOk returns a tuple with the ClickWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickWindowDays

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) SetClickWindowDays(v ConversionAttributionWindowDays)`

SetClickWindowDays sets ClickWindowDays field to given value.

### HasClickWindowDays

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) HasClickWindowDays() bool`

HasClickWindowDays returns a boolean if a field has been set.

### GetEngagementWindowDays

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetEngagementWindowDays() ConversionAttributionWindowDays`

GetEngagementWindowDays returns the EngagementWindowDays field if non-nil, zero value otherwise.

### GetEngagementWindowDaysOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetEngagementWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetEngagementWindowDaysOk returns a tuple with the EngagementWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagementWindowDays

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) SetEngagementWindowDays(v ConversionAttributionWindowDays)`

SetEngagementWindowDays sets EngagementWindowDays field to given value.

### HasEngagementWindowDays

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) HasEngagementWindowDays() bool`

HasEngagementWindowDays returns a boolean if a field has been set.

### GetViewWindowDays

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetViewWindowDays() ConversionAttributionWindowDays`

GetViewWindowDays returns the ViewWindowDays field if non-nil, zero value otherwise.

### GetViewWindowDaysOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetViewWindowDaysOk() (*ConversionAttributionWindowDays, bool)`

GetViewWindowDaysOk returns a tuple with the ViewWindowDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewWindowDays

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) SetViewWindowDays(v ConversionAttributionWindowDays)`

SetViewWindowDays sets ViewWindowDays field to given value.

### HasViewWindowDays

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) HasViewWindowDays() bool`

HasViewWindowDays returns a boolean if a field has been set.

### GetConversionReportTime

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetConversionReportTime() ConversionReportTimeType`

GetConversionReportTime returns the ConversionReportTime field if non-nil, zero value otherwise.

### GetConversionReportTimeOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetConversionReportTimeOk() (*ConversionReportTimeType, bool)`

GetConversionReportTimeOk returns a tuple with the ConversionReportTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionReportTime

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) SetConversionReportTime(v ConversionReportTimeType)`

SetConversionReportTime sets ConversionReportTime field to given value.

### HasConversionReportTime

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) HasConversionReportTime() bool`

HasConversionReportTime returns a boolean if a field has been set.

### GetAttributionTypes

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetAttributionTypes() []ConversionReportAttributionType`

GetAttributionTypes returns the AttributionTypes field if non-nil, zero value otherwise.

### GetAttributionTypesOk

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) GetAttributionTypesOk() (*[]ConversionReportAttributionType, bool)`

GetAttributionTypesOk returns a tuple with the AttributionTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionTypes

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) SetAttributionTypes(v []ConversionReportAttributionType)`

SetAttributionTypes sets AttributionTypes field to given value.

### HasAttributionTypes

`func (o *AdsAnalyticsCreateAsyncRequestAllOf) HasAttributionTypes() bool`

HasAttributionTypes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


