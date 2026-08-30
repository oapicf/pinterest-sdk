
# Table `ConversionProductReportCreate`
(mapped from: ConversionProductReportCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**columns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionProductReportingColumn&gt;**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**endDate** | end_date | text NOT NULL |  | **kotlin.String** |   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | granularity | long NOT NULL |  | [**ConversionProductReportGranularity**](ConversionProductReportGranularity.md) | Report granularity for time-based metric aggregation |  [foreignkey]
**level** | level | long NOT NULL |  | [**ConversionProductReportLevel**](ConversionProductReportLevel.md) | Level of the report |  [foreignkey]
**reportName** | report_name | text NOT NULL |  | **kotlin.String** | Name of the conversion product report | 
**startDate** | start_date | text NOT NULL |  | **kotlin.String** |   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**adGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. |  [optional]
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. |  [optional]
**campaignObjectiveTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionObjectiveType&gt;**](ConversionObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. |  [optional]
**clickWindowDays** | click_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] [foreignkey]
**conversionProductAttributionType** | conversion_product_attribution_type | long |  | [**ConversionProductAttributionType**](ConversionProductAttributionType.md) |   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. |  [optional] [foreignkey]
**conversionProductBreakdown** | conversion_product_breakdown | long |  | [**ConversionProductReportBreakdownType**](ConversionProductReportBreakdownType.md) | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. |  [optional] [foreignkey]
**conversionReportTime** | conversion_report_time | long |  | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional] [foreignkey]
**productSkuIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. |  [optional]
**viewWindowDays** | view_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. |  [optional] [foreignkey]


# **Table `ConversionProductReportCreateConversionProductReportingColumn`**
(mapped from: ConversionProductReportCreateConversionProductReportingColumn)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportCreate | conversionProductReportCreate | long | | kotlin.Long | Primary Key | *one*
conversionProductReportingColumn | conversionProductReportingColumn | long | | kotlin.Long | Foreign Key | *many*








# **Table `ConversionProductReportCreateAdGroupIds`**
(mapped from: ConversionProductReportCreateAdGroupIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportCreate | conversionProductReportCreate | long | | kotlin.Long | Primary Key | *one*
adGroupIds | adGroupIds | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionProductReportCreateCampaignIds`**
(mapped from: ConversionProductReportCreateCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportCreate | conversionProductReportCreate | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionProductReportCreateConversionObjectiveType`**
(mapped from: ConversionProductReportCreateConversionObjectiveType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportCreate | conversionProductReportCreate | long | | kotlin.Long | Primary Key | *one*
conversionObjectiveType | conversionObjectiveType | long | | kotlin.Long | Foreign Key | *many*







# **Table `ConversionProductReportCreateProductSkuIds`**
(mapped from: ConversionProductReportCreateProductSkuIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionProductReportCreate | conversionProductReportCreate | long | | kotlin.Long | Primary Key | *one*
productSkuIds | productSkuIds | text | | kotlin.String | Foreign Key | *many*




