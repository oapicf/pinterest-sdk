
# Table `AdsAnalyticsCreateAsyncRequest`
(mapped from: AdsAnalyticsCreateAsyncRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**endDate** | end_date | text NOT NULL |  | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | granularity | long NOT NULL |  | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. |  [foreignkey]
**startDate** | start_date | text NOT NULL |  | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**adGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of ad group ids |  [optional]
**adGroupStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupSummaryStatus&gt;**](AdGroupSummaryStatus.md) | List of values for filtering |  [optional]
**adIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of ad ids. This parameter is not supported for Product Item level reports. |  [optional]
**adStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinPromotionSummaryStatus&gt;**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. |  [optional]
**attributionTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. |  [optional]
**campaignBrandLabel** | campaign_brand_label | text |  | **kotlin.String** | Campaign brand label for filtering. |  [optional]
**campaignCustomLabel** | campaign_custom_label | text |  | **kotlin.String** | Campaign custom label for filtering. |  [optional]
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of campaign ids |  [optional]
**campaignObjectiveTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignObjectiveType&gt;**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. |  [optional]
**campaignStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) | List of status values for filtering |  [optional]
**clickWindowDays** | click_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. |  [optional] [foreignkey]
**columns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. |  [optional]
**combineTargetingTypes** | combine_targeting_types | boolean |  | **kotlin.Boolean** | Determines if the targeting types included in the request should be consolidated into a single breakdown. |  [optional]
**conversionReportTime** | conversion_report_time | long |  | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. |  [optional] [foreignkey]
**customConversionEventMetrics** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CustomConversionEventMetrics&gt;**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report |  [optional]
**endHour** | end_hour | int UNSIGNED |  | **kotlin.Int** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. |  [optional]
**engagementWindowDays** | engagement_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. |  [optional] [foreignkey]
**level** | level | long |  | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report |  [optional] [foreignkey]
**metricsFilters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdsAnalyticsMetricsFilter&gt;**](AdsAnalyticsMetricsFilter.md) | List of metrics filters |  [optional]
**primarySort** | primary_sort | long |  | [**PrimarySort**](PrimarySort.md) |  |  [optional] [foreignkey]
**productGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of product group ids |  [optional]
**productGroupStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupSummaryStatus&gt;**](ProductGroupSummaryStatus.md) | List of values for filtering |  [optional]
**productItemIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of product item ids |  [optional]
**reportFormat** | report_format | long |  | [**DataOutputFormat**](DataOutputFormat.md) |  |  [optional] [foreignkey]
**reportingTimezone** | reporting_timezone | long |  | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. |  [optional] [foreignkey]
**startHour** | start_hour | int UNSIGNED |  | **kotlin.Int** | Which hour of the start date to begin the report. Only allowed for hourly reports. |  [optional]
**targetingTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdAdsAnalyticsAsyncTargetingTypes&gt;**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. |  [optional]
**viewWindowDays** | view_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. |  [optional] [foreignkey]





# **Table `AdsAnalyticsCreateAsyncRequestAdGroupIds`**
(mapped from: AdsAnalyticsCreateAsyncRequestAdGroupIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
adGroupIds | adGroupIds | text | | kotlin.String | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestAdGroupSummaryStatus`**
(mapped from: AdsAnalyticsCreateAsyncRequestAdGroupSummaryStatus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
adGroupSummaryStatus | adGroupSummaryStatus | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestAdIds`**
(mapped from: AdsAnalyticsCreateAsyncRequestAdIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
adIds | adIds | text | | kotlin.String | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestPinPromotionSummaryStatus`**
(mapped from: AdsAnalyticsCreateAsyncRequestPinPromotionSummaryStatus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
pinPromotionSummaryStatus | pinPromotionSummaryStatus | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestConversionReportAttributionType`**
(mapped from: AdsAnalyticsCreateAsyncRequestConversionReportAttributionType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
conversionReportAttributionType | conversionReportAttributionType | long | | kotlin.Long | Foreign Key | *many*





# **Table `AdsAnalyticsCreateAsyncRequestCampaignIds`**
(mapped from: AdsAnalyticsCreateAsyncRequestCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | text | | kotlin.String | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestCampaignObjectiveType`**
(mapped from: AdsAnalyticsCreateAsyncRequestCampaignObjectiveType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
campaignObjectiveType | campaignObjectiveType | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus`**
(mapped from: AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
campaignSummaryStatus | campaignSummaryStatus | long | | kotlin.Long | Foreign Key | *many*




# **Table `AdsAnalyticsCreateAsyncRequestReportingColumnAsync`**
(mapped from: AdsAnalyticsCreateAsyncRequestReportingColumnAsync)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
reportingColumnAsync | reportingColumnAsync | long | | kotlin.Long | Foreign Key | *many*





# **Table `AdsAnalyticsCreateAsyncRequestCustomConversionEventMetrics`**
(mapped from: AdsAnalyticsCreateAsyncRequestCustomConversionEventMetrics)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
customConversionEventMetrics | customConversionEventMetrics | long | | kotlin.Long | Foreign Key | *many*






# **Table `AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter`**
(mapped from: AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
adsAnalyticsMetricsFilter | adsAnalyticsMetricsFilter | long | | kotlin.Long | Foreign Key | *many*




# **Table `AdsAnalyticsCreateAsyncRequestProductGroupIds`**
(mapped from: AdsAnalyticsCreateAsyncRequestProductGroupIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
productGroupIds | productGroupIds | text | | kotlin.String | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestProductGroupSummaryStatus`**
(mapped from: AdsAnalyticsCreateAsyncRequestProductGroupSummaryStatus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
productGroupSummaryStatus | productGroupSummaryStatus | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestProductItemIds`**
(mapped from: AdsAnalyticsCreateAsyncRequestProductItemIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
productItemIds | productItemIds | text | | kotlin.String | Foreign Key | *many*






# **Table `AdsAnalyticsCreateAsyncRequestAdAdsAnalyticsAsyncTargetingTypes`**
(mapped from: AdsAnalyticsCreateAsyncRequestAdAdsAnalyticsAsyncTargetingTypes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
adAdsAnalyticsAsyncTargetingTypes | adAdsAnalyticsAsyncTargetingTypes | long | | kotlin.Long | Foreign Key | *many*




