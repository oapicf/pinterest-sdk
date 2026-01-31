# TemplateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | ID of the Ad Account that owns the template | [optional] 
**adAccountIds** | **[String]** | IDs of the Ad Accounts that have access to this template | [optional] 
**clickWindowDays** | **Double** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | **[String]** | A list of columns to be included in the report | [optional] 
**conversionReportTimeType** | **String** | Conversion report time type | [optional] 
**creationSource** | **String** | The surface used to create this template | [optional] 
**customColumnIds** | **[String]** | A list of custom column IDs | [optional] 
**dateRange** | [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] 
**engagementWindowDays** | **Double** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filtersJson** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | [**Granularity**](Granularity.md) |  | [optional] 
**id** | **String** | Template ID | [optional] 
**ingestionSources** | **[String]** | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**isDeleted** | **Bool** | A boolean that indicates if the template has been deleted | [optional] 
**isOwnedByUser** | **Bool** | A boolean value that indicates if the user owns the template | [optional] 
**isScheduled** | **Bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **String** | Template Name | [optional] 
**reportEndRelativeDaysInPast** | **Double** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**reportFormat** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**reportLevel** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**reportStartRelativeDaysInPast** | **Double** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**type** | **String** | Reporting template type | [optional] 
**updatedTime** | **Double** | Time of last update in seconds since Unix epoch | [optional] 
**userId** | **String** | ID of the user who created the template | [optional] 
**viewWindowDays** | **Double** | The length of the sliding window over which view conversions will be attributed | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


