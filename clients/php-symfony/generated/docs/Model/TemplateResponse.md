# TemplateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Template ID | [optional] 
**adAccountId** | **string** | ID of the Ad Account that owns the template | [optional] 
**adAccountIds** | **string** | IDs of the Ad Accounts that have access to this template | [optional] 
**userId** | **string** | ID of the user who created the template | [optional] 
**name** | **string** | Template Name | [optional] 
**reportStartRelativeDaysInPast** | **float** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**reportEndRelativeDaysInPast** | **float** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**dateRange** | [**OpenAPI\Server\Model\TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] 
**reportLevel** | [**OpenAPI\Server\Model\MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**reportFormat** | [**OpenAPI\Server\Model\DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**columns** | **string** | A list of columns to be included in the report | [optional] 
**granularity** | [**OpenAPI\Server\Model\Granularity**](Granularity.md) |  | [optional] 
**viewWindowDays** | **float** | The length of the sliding window over which view conversions will be attributed | [optional] 
**clickWindowDays** | **float** | The length of the sliding window over which click conversions will be attributed | [optional] 
**engagementWindowDays** | **float** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**conversionReportTimeType** | **string** | Conversion report time type | [optional] 
**filtersJson** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] 
**isOwnedByUser** | **bool** | A boolean value that indicates if the user owns the template | [optional] 
**isScheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**creationSource** | **string** | The surface used to create this template | [optional] 
**isDeleted** | **bool** | A boolean that indicates if the template has been deleted | [optional] 
**updatedTime** | **float** | Time of last update in seconds since Unix epoch | [optional] 
**customColumnIds** | **string** | A list of custom column IDs | [optional] 
**type** | **string** | Reporting template type | [optional] 
**ingestionSources** | **string** | The filter on the conversion ingestion source method for conversion metrics | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


