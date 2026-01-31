# TemplateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | ID of the Ad Account that owns the template | [optional] 
**adAccountIds** | **string** | IDs of the Ad Accounts that have access to this template | [optional] 
**clickWindowDays** | **float** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | **string** | A list of columns to be included in the report | [optional] 
**conversionReportTimeType** | **string** | Conversion report time type | [optional] 
**creationSource** | **string** | The surface used to create this template | [optional] 
**customColumnIds** | **string** | A list of custom column IDs | [optional] 
**dateRange** | [**OpenAPI\Server\Model\TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] 
**engagementWindowDays** | **float** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filtersJson** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | [**OpenAPI\Server\Model\Granularity**](Granularity.md) |  | [optional] 
**id** | **string** | Template ID | [optional] 
**ingestionSources** | **string** | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**isDeleted** | **bool** | A boolean that indicates if the template has been deleted | [optional] 
**isOwnedByUser** | **bool** | A boolean value that indicates if the user owns the template | [optional] 
**isScheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **string** | Template Name | [optional] 
**reportEndRelativeDaysInPast** | **float** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**reportFormat** | [**OpenAPI\Server\Model\DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**reportLevel** | [**OpenAPI\Server\Model\MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**reportStartRelativeDaysInPast** | **float** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**type** | **string** | Reporting template type | [optional] 
**updatedTime** | **float** | Time of last update in seconds since Unix epoch | [optional] 
**userId** | **string** | ID of the user who created the template | [optional] 
**viewWindowDays** | **float** | The length of the sliding window over which view conversions will be attributed | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


