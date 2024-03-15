
# Table `TemplateResponse`
(mapped from: TemplateResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Template ID |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | ID of the Ad Account that owns the template |  [optional]
**adAccountIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | IDs of the Ad Accounts that have access to this template |  [optional]
**userId** | user_id | text |  | **kotlin.String** | ID of the user who created the template |  [optional]
**name** | name | text |  | **kotlin.String** | Template Name |  [optional]
**reportStartRelativeDaysInPast** | report_start_relative_days_in_past | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of days prior to the day the report will be delivered at which the report will start |  [optional]
**reportEndRelativeDaysInPast** | report_end_relative_days_in_past | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of days prior to the day the report will be delivered at which the report will end |  [optional]
**dateRange** | date_range | long |  | [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  |  [optional] [foreignkey]
**reportLevel** | report_level | long |  | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  |  [optional] [foreignkey]
**reportFormat** | report_format | long |  | [**DataOutputFormat**](DataOutputFormat.md) |  |  [optional] [foreignkey]
**columns** | `One-To-Many` | `----` | `----`  | [**columns**](#kotlin.Array&lt;Columns&gt;) | A list of columns to be included in the report |  [optional]
**granularity** | granularity | long |  | [**Granularity**](Granularity.md) |  |  [optional] [foreignkey]
**viewWindowDays** | view_window_days | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The length of the sliding window over which view conversions will be attributed |  [optional]
**clickWindowDays** | click_window_days | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The length of the sliding window over which click conversions will be attributed |  [optional]
**engagementWindowDays** | engagement_window_days | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The length of the sliding window over which engagement conversions will be attributed |  [optional]
**conversionReportTimeType** | conversion_report_time_type | text |  | [**conversion_report_time_type**](#ConversionReportTimeType) | Conversion report time type |  [optional]
**filtersJson** | filters_json | text |  | **kotlin.String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values |  [optional]
**isOwnedByUser** | is_owned_by_user | boolean |  | **kotlin.Boolean** | A boolean value that indicates if the user owns the template |  [optional]
**isScheduled** | is_scheduled | boolean |  | **kotlin.Boolean** | A boolean value that indicates if this template has been used to create a scheduled report |  [optional]
**creationSource** | creation_source | text |  | [**creation_source**](#CreationSource) | The surface used to create this template |  [optional]
**isDeleted** | is_deleted | boolean |  | **kotlin.Boolean** | A boolean that indicates if the template has been deleted |  [optional]
**updatedTime** | updated_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Time of last update in seconds since Unix epoch |  [optional]
**customColumnIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of custom column IDs |  [optional]
**type** | type | text |  | [**type**](#Type) | Reporting template type |  [optional]
**ingestionSources** | `One-To-Many` | `----` | `----`  | [**ingestion_sources**](#kotlin.Array&lt;IngestionSources&gt;) | The filter on the conversion ingestion source method for conversion metrics |  [optional]




# **Table `TemplateResponseAdAccountIds`**
(mapped from: TemplateResponseAdAccountIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
templateResponse | templateResponse | long | | kotlin.Long | Primary Key | *one*
adAccountIds | adAccountIds | text | | kotlin.String | Foreign Key | *many*










# **Table `TemplateResponseColumns`**
(mapped from: TemplateResponseColumns)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
templateResponse | templateResponse | long | | kotlin.Long | Primary Key | *one*
columns | columns | text | | kotlin.String | Foreign Key | *many*














# **Table `TemplateResponseCustomColumnIds`**
(mapped from: TemplateResponseCustomColumnIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
templateResponse | templateResponse | long | | kotlin.Long | Primary Key | *one*
customColumnIds | customColumnIds | text | | kotlin.String | Foreign Key | *many*




# **Table `TemplateResponseIngestionSources`**
(mapped from: TemplateResponseIngestionSources)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
templateResponse | templateResponse | long | | kotlin.Long | Primary Key | *one*
ingestionSources | ingestionSources | text | | kotlin.String | Foreign Key | *many*



