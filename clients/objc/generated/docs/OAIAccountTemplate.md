# OAIAccountTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | ID of the Ad Account that owns the template | [optional] [readonly] 
**adAccountIds** | **NSArray&lt;NSString*&gt;*** | IDs of the Ad Accounts that have access to this template | [optional] 
**adeColumns** | **NSArray&lt;NSString*&gt;*** | A list of ADE columns | [optional] 
**attributionType** | [**OAIAnyType***](.md) | Attribution type for Brand/Category/SKU reports | [optional] 
**clickWindowDays** | **NSNumber*** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | [**NSArray&lt;OAIReportingColumn&gt;***](OAIReportingColumn.md) | A list of columns to be included in the report | [optional] 
**conversionReportTimeType** | [**OAIConversionReportTimeType***](OAIConversionReportTimeType.md) | Conversion report time type | [optional] 
**creationSource** | [**OAICreationSource***](OAICreationSource.md) | The surface used to create this template | [optional] 
**customColumnIds** | **NSArray&lt;NSString*&gt;*** | A list of custom column IDs | [optional] 
**displayMetadata** | **NSString*** | Additional metadata about this reporting template | [optional] 
**engagementWindowDays** | **NSNumber*** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filtersJson** | **NSString*** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | [**OAIGranularity***](OAIGranularity.md) |  | [optional] 
**_id** | **NSString*** | Template ID | [readonly] 
**ingestionSources** | [**NSArray&lt;OAIIngestionSource&gt;***](OAIIngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**isDefault** | **NSNumber*** | A boolean representing if this is the default view that loads for this template type | [optional] 
**isDeleted** | **NSNumber*** | A boolean that indicates if the template has been deleted | [optional] 
**isOwnedByUser** | **NSNumber*** | A boolean value that indicates if the user owns the template | [optional] 
**isScheduled** | **NSNumber*** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **NSString*** | Template Name | [optional] 
**reportEndRelativeDaysInPast** | **NSNumber*** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**reportFormat** | [**OAIDataOutputFormat***](OAIDataOutputFormat.md) |  | [optional] 
**reportLevel** | [**OAIMetricsReportingLevel***](OAIMetricsReportingLevel.md) |  | [optional] 
**reportStartRelativeDaysInPast** | **NSNumber*** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**reportingTimeZone** | [**OAIReportingTimeZone***](OAIReportingTimeZone.md) | Timezone for reporting data | [optional] 
**sortBy** | [**OAIAnyType***](.md) | Unified metric sort configuration | [optional] 
**type** | **NSString*** | Type of the template | [optional] 
**updatedTime** | **NSNumber*** | Time of last update in seconds since Unix epoch | [optional] [readonly] 
**userId** | **NSString*** | ID of the user who created the template | [optional] 
**viewWindowDays** | **NSNumber*** | The length of the sliding window over which view conversions will be attributed | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


