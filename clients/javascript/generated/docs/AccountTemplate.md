# PinterestSdk.AccountTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | ID of the Ad Account that owns the template | [optional] [readonly] 
**adAccountIds** | **[String]** | IDs of the Ad Accounts that have access to this template | [optional] 
**adeColumns** | **[String]** | A list of ADE columns | [optional] 
**attributionType** | **Object** | Attribution type for Brand/Category/SKU reports | [optional] 
**clickWindowDays** | **Number** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | [**[ReportingColumn]**](ReportingColumn.md) | A list of columns to be included in the report | [optional] 
**conversionReportTimeType** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional] 
**creationSource** | [**CreationSource**](CreationSource.md) | The surface used to create this template | [optional] 
**customColumnIds** | **[String]** | A list of custom column IDs | [optional] 
**displayMetadata** | **String** | Additional metadata about this reporting template | [optional] 
**engagementWindowDays** | **Number** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filtersJson** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | [**Granularity**](Granularity.md) |  | [optional] 
**id** | **String** | Template ID | [readonly] 
**ingestionSources** | [**[IngestionSource]**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**isDefault** | **Boolean** | A boolean representing if this is the default view that loads for this template type | [optional] 
**isDeleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] 
**isOwnedByUser** | **Boolean** | A boolean value that indicates if the user owns the template | [optional] 
**isScheduled** | **Boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **String** | Template Name | [optional] 
**reportEndRelativeDaysInPast** | **Number** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**reportFormat** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**reportLevel** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**reportStartRelativeDaysInPast** | **Number** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**reportingTimeZone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional] 
**sortBy** | **Object** | Unified metric sort configuration | [optional] 
**type** | **String** | Type of the template | [optional] 
**updatedTime** | **Number** | Time of last update in seconds since Unix epoch | [optional] [readonly] 
**userId** | **String** | ID of the user who created the template | [optional] 
**viewWindowDays** | **Number** | The length of the sliding window over which view conversions will be attributed | [optional] 


