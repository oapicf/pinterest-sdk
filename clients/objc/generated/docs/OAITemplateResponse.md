# OAITemplateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | Template ID | [optional] 
**adAccountId** | **NSString*** | ID of the Ad Account that owns the template | [optional] 
**adAccountIds** | **NSArray&lt;NSString*&gt;*** | IDs of the Ad Accounts that have access to this template | [optional] 
**userId** | **NSString*** | ID of the user who created the template | [optional] 
**name** | **NSString*** | Template Name | [optional] 
**reportStartRelativeDaysInPast** | **NSNumber*** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**reportEndRelativeDaysInPast** | **NSNumber*** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**dateRange** | [**OAITemplateResponseDateRange***](OAITemplateResponseDateRange.md) |  | [optional] 
**reportLevel** | [**OAIMetricsReportingLevel***](OAIMetricsReportingLevel.md) |  | [optional] 
**reportFormat** | [**OAIDataOutputFormat***](OAIDataOutputFormat.md) |  | [optional] 
**columns** | **NSArray&lt;NSString*&gt;*** | A list of columns to be included in the report | [optional] 
**granularity** | [**OAIGranularity***](OAIGranularity.md) |  | [optional] 
**viewWindowDays** | **NSNumber*** | The length of the sliding window over which view conversions will be attributed | [optional] 
**clickWindowDays** | **NSNumber*** | The length of the sliding window over which click conversions will be attributed | [optional] 
**engagementWindowDays** | **NSNumber*** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**conversionReportTimeType** | **NSString*** | Conversion report time type | [optional] 
**filtersJson** | **NSString*** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] 
**isOwnedByUser** | **NSNumber*** | A boolean value that indicates if the user owns the template | [optional] 
**isScheduled** | **NSNumber*** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**creationSource** | **NSString*** | The surface used to create this template | [optional] 
**isDeleted** | **NSNumber*** | A boolean that indicates if the template has been deleted | [optional] 
**updatedTime** | **NSNumber*** | Time of last update in seconds since Unix epoch | [optional] 
**customColumnIds** | **NSArray&lt;NSString*&gt;*** | A list of custom column IDs | [optional] 
**type** | **NSString*** | Reporting template type | [optional] 
**ingestionSources** | **NSArray&lt;NSString*&gt;*** | The filter on the conversion ingestion source method for conversion metrics | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


