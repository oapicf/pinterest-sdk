
# Table `ConversionProductReportRequest`
(mapped from: ConversionProductReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**columns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionProductReportingColumn&gt;**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**endDate** | end_date | text NOT NULL |  | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | granularity | text NOT NULL |  | [**granularity**](#Granularity) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly. | 
**level** | level | text NOT NULL |  | [**level**](#Level) | Level of the report | 
**reportName** | report_name | text NOT NULL |  | **kotlin.String** | Name of the conversion product report. | 
**startDate** | start_date | text NOT NULL |  | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**adGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP. |  [optional]
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN. |  [optional]
**campaignObjectiveTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ObjectiveType&gt;**](ObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. |  [optional]
**clickWindowDays** | click_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] [foreignkey]
**conversionProductAttributionType** | conversion_product_attribution_type | text |  | [**conversion_product_attribution_type**](#ConversionProductAttributionType) |  |  [optional]
**conversionProductBreakdown** | conversion_product_breakdown | text |  | [**conversion_product_breakdown**](#ConversionProductBreakdown) |  |  [optional]
**conversionReportTime** | conversion_report_time | long |  | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional] [foreignkey]
**productSkuIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. |  [optional]
**viewWindowDays** | view_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day. |  [optional] [foreignkey]


# **Table `ConversionProductReportRequestConversionProductReportingColumn`**
(mapped from: ConversionProductReportRequestConversionProductReportingColumn)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportRequest | conversionProductReportRequest | long | | kotlin.Long | Primary Key | *one*
conversionProductReportingColumn | conversionProductReportingColumn | long | | kotlin.Long | Foreign Key | *many*








# **Table `ConversionProductReportRequestAdGroupIds`**
(mapped from: ConversionProductReportRequestAdGroupIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportRequest | conversionProductReportRequest | long | | kotlin.Long | Primary Key | *one*
adGroupIds | adGroupIds | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionProductReportRequestCampaignIds`**
(mapped from: ConversionProductReportRequestCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportRequest | conversionProductReportRequest | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionProductReportRequestObjectiveType`**
(mapped from: ConversionProductReportRequestObjectiveType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportRequest | conversionProductReportRequest | long | | kotlin.Long | Primary Key | *one*
objectiveType | objectiveType | long | | kotlin.Long | Foreign Key | *many*







# **Table `ConversionProductReportRequestProductSkuIds`**
(mapped from: ConversionProductReportRequestProductSkuIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportRequest | conversionProductReportRequest | long | | kotlin.Long | Primary Key | *one*
productSkuIds | productSkuIds | text | | kotlin.String | Foreign Key | *many*




