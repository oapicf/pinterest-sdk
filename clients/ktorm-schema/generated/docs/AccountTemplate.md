
# Table `AccountTemplate`
(mapped from: AccountTemplate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Template ID |  [readonly]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | ID of the Ad Account that owns the template |  [optional] [readonly]
**adAccountIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | IDs of the Ad Accounts that have access to this template |  [optional]
**adeColumns** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of ADE columns |  [optional]
**attributionType** | attribution_type | blob |  | [**kotlin.Any**](.md) | Attribution type for Brand/Category/SKU reports |  [optional]
**clickWindowDays** | click_window_days | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The length of the sliding window over which click conversions will be attributed |  [optional]
**columns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ReportingColumn&gt;**](ReportingColumn.md) | A list of columns to be included in the report |  [optional]
**conversionReportTimeType** | conversion_report_time_type | long |  | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type |  [optional] [foreignkey]
**creationSource** | creation_source | long |  | [**CreationSource**](CreationSource.md) | The surface used to create this template |  [optional] [foreignkey]
**customColumnIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of custom column IDs |  [optional]
**displayMetadata** | display_metadata | text |  | **kotlin.String** | Additional metadata about this reporting template |  [optional]
**engagementWindowDays** | engagement_window_days | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The length of the sliding window over which engagement conversions will be attributed |  [optional]
**filtersJson** | filters_json | text |  | **kotlin.String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values |  [optional]
**granularity** | granularity | long |  | [**Granularity**](Granularity.md) |  |  [optional] [foreignkey]
**ingestionSources** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;IngestionSource&gt;**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics |  [optional]
**isDefault** | is_default | boolean |  | **kotlin.Boolean** | A boolean representing if this is the default view that loads for this template type |  [optional]
**isDeleted** | is_deleted | boolean |  | **kotlin.Boolean** | A boolean that indicates if the template has been deleted |  [optional]
**isOwnedByUser** | is_owned_by_user | boolean |  | **kotlin.Boolean** | A boolean value that indicates if the user owns the template |  [optional]
**isScheduled** | is_scheduled | boolean |  | **kotlin.Boolean** | A boolean value that indicates if this template has been used to create a scheduled report |  [optional]
**name** | name | text |  | **kotlin.String** | Template Name |  [optional]
**reportEndRelativeDaysInPast** | report_end_relative_days_in_past | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of days prior to the day the report will be delivered at which the report will end |  [optional]
**reportFormat** | report_format | long |  | [**DataOutputFormat**](DataOutputFormat.md) |  |  [optional] [foreignkey]
**reportLevel** | report_level | long |  | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  |  [optional] [foreignkey]
**reportStartRelativeDaysInPast** | report_start_relative_days_in_past | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of days prior to the day the report will be delivered at which the report will start |  [optional]
**reportingTimeZone** | reporting_time_zone | long |  | [**ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data |  [optional] [foreignkey]
**sortBy** | sort_by | blob |  | [**kotlin.Any**](.md) | Unified metric sort configuration |  [optional]
**type** | type | text |  | **kotlin.String** | Type of the template |  [optional]
**updatedTime** | updated_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Time of last update in seconds since Unix epoch |  [optional] [readonly]
**userId** | user_id | text |  | **kotlin.String** | ID of the user who created the template |  [optional]
**viewWindowDays** | view_window_days | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The length of the sliding window over which view conversions will be attributed |  [optional]




# **Table `AccountTemplateAdAccountIds`**
(mapped from: AccountTemplateAdAccountIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
accountTemplate | accountTemplate | long | | kotlin.Long | Primary Key | *one*
adAccountIds | adAccountIds | text | | kotlin.String | Foreign Key | *many*



# **Table `AccountTemplateAdeColumns`**
(mapped from: AccountTemplateAdeColumns)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
accountTemplate | accountTemplate | long | | kotlin.Long | Primary Key | *one*
adeColumns | adeColumns | text | | kotlin.String | Foreign Key | *many*





# **Table `AccountTemplateReportingColumn`**
(mapped from: AccountTemplateReportingColumn)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
accountTemplate | accountTemplate | long | | kotlin.Long | Primary Key | *one*
reportingColumn | reportingColumn | long | | kotlin.Long | Foreign Key | *many*





# **Table `AccountTemplateCustomColumnIds`**
(mapped from: AccountTemplateCustomColumnIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
accountTemplate | accountTemplate | long | | kotlin.Long | Primary Key | *one*
customColumnIds | customColumnIds | text | | kotlin.String | Foreign Key | *many*







# **Table `AccountTemplateIngestionSource`**
(mapped from: AccountTemplateIngestionSource)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
accountTemplate | accountTemplate | long | | kotlin.Long | Primary Key | *one*
ingestionSource | ingestionSource | long | | kotlin.Long | Foreign Key | *many*


















