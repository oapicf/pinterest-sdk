
# AccountTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Template ID |  [readonly]
**adAccountId** | **kotlin.String** | ID of the Ad Account that owns the template |  [optional] [readonly]
**adAccountIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | IDs of the Ad Accounts that have access to this template |  [optional]
**adeColumns** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of ADE columns |  [optional]
**attributionType** | [**kotlin.Any**](.md) | Attribution type for Brand/Category/SKU reports |  [optional]
**clickWindowDays** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The length of the sliding window over which click conversions will be attributed |  [optional]
**columns** | [**kotlin.collections.List&lt;ReportingColumn&gt;**](ReportingColumn.md) | A list of columns to be included in the report |  [optional]
**conversionReportTimeType** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type |  [optional]
**creationSource** | [**CreationSource**](CreationSource.md) | The surface used to create this template |  [optional]
**customColumnIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of custom column IDs |  [optional]
**displayMetadata** | **kotlin.String** | Additional metadata about this reporting template |  [optional]
**engagementWindowDays** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The length of the sliding window over which engagement conversions will be attributed |  [optional]
**filtersJson** | **kotlin.String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values |  [optional]
**granularity** | [**Granularity**](Granularity.md) |  |  [optional]
**ingestionSources** | [**kotlin.collections.List&lt;IngestionSource&gt;**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics |  [optional]
**isDefault** | **kotlin.Boolean** | A boolean representing if this is the default view that loads for this template type |  [optional]
**isDeleted** | **kotlin.Boolean** | A boolean that indicates if the template has been deleted |  [optional]
**isOwnedByUser** | **kotlin.Boolean** | A boolean value that indicates if the user owns the template |  [optional]
**isScheduled** | **kotlin.Boolean** | A boolean value that indicates if this template has been used to create a scheduled report |  [optional]
**name** | **kotlin.String** | Template Name |  [optional]
**reportEndRelativeDaysInPast** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of days prior to the day the report will be delivered at which the report will end |  [optional]
**reportFormat** | [**DataOutputFormat**](DataOutputFormat.md) |  |  [optional]
**reportLevel** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  |  [optional]
**reportStartRelativeDaysInPast** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of days prior to the day the report will be delivered at which the report will start |  [optional]
**reportingTimeZone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data |  [optional]
**sortBy** | [**kotlin.Any**](.md) | Unified metric sort configuration |  [optional]
**type** | **kotlin.String** | Type of the template |  [optional]
**updatedTime** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Time of last update in seconds since Unix epoch |  [optional] [readonly]
**userId** | **kotlin.String** | ID of the user who created the template |  [optional]
**viewWindowDays** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The length of the sliding window over which view conversions will be attributed |  [optional]



