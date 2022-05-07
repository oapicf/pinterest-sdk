
# Table `AdsAnalyticsCreateAsyncRequest`
(mapped from: AdsAnalyticsCreateAsyncRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**startDate** | start_date | text NOT NULL |  | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | end_date | text NOT NULL |  | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | granularity | long NOT NULL |  | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  [foreignkey]
**columns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns | 
**level** | level | long NOT NULL |  | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report |  [foreignkey]
**clickWindowDays** | click_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] [foreignkey]
**engagementWindowDays** | engagement_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] [foreignkey]
**viewWindowDays** | view_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. |  [optional] [foreignkey]
**conversionReportTime** | conversion_report_time | long |  | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional] [foreignkey]
**attributionTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report |  [optional]
**reportFormat** | report_format | long |  | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data |  [optional] [foreignkey]
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of campaign ids |  [optional]
**campaignStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) | List of status values for filtering |  [optional]
**campaignObjectiveTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ObjectiveType&gt;**](ObjectiveType.md) | List of values for filtering |  [optional]
**adGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of ad group ids |  [optional]
**adGroupStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupSummaryStatus&gt;**](AdGroupSummaryStatus.md) | List of values for filtering |  [optional]
**adIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of ad ids |  [optional]
**adStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinPromotionSummaryStatus&gt;**](PinPromotionSummaryStatus.md) | List of values for filtering |  [optional]
**productGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of product group ids |  [optional]
**productGroupStatuses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupSummaryStatus&gt;**](ProductGroupSummaryStatus.md) | List of values for filtering |  [optional]
**productItemIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of product item ids |  [optional]
**targetingTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md) | List of targeting types |  [optional]
**metricsFilters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdsAnalyticsMetricsFilter&gt;**](AdsAnalyticsMetricsFilter.md) | List of metrics filters |  [optional]





# **Table `AdsAnalyticsCreateAsyncRequestReportingColumnAsync`**
(mapped from: AdsAnalyticsCreateAsyncRequestReportingColumnAsync)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
reportingColumnAsync | reportingColumnAsync | long | | kotlin.Long | Foreign Key | *many*








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



# **Table `AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus`**
(mapped from: AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
campaignSummaryStatus | campaignSummaryStatus | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestObjectiveType`**
(mapped from: AdsAnalyticsCreateAsyncRequestObjectiveType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
objectiveType | objectiveType | long | | kotlin.Long | Foreign Key | *many*



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



# **Table `AdsAnalyticsCreateAsyncRequestAdsAnalyticsTargetingType`**
(mapped from: AdsAnalyticsCreateAsyncRequestAdsAnalyticsTargetingType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
adsAnalyticsTargetingType | adsAnalyticsTargetingType | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter`**
(mapped from: AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequest | adsAnalyticsCreateAsyncRequest | long | | kotlin.Long | Primary Key | *one*
adsAnalyticsMetricsFilter | adsAnalyticsMetricsFilter | long | | kotlin.Long | Foreign Key | *many*



