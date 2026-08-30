# AccountTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | ID of the Ad Account that owns the template | [optional] [readonly] 
**adAccountIds** | **string** | IDs of the Ad Accounts that have access to this template | [optional] 
**adeColumns** | **string** | A list of ADE columns | [optional] 
**attributionType** | [**AnyType**](.md) | Attribution type for Brand/Category/SKU reports | [optional] 
**clickWindowDays** | **float** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | [**OpenAPI\Server\Model\ReportingColumn**](ReportingColumn.md) | A list of columns to be included in the report | [optional] 
**conversionReportTimeType** | [**OpenAPI\Server\Model\ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional] 
**creationSource** | [**OpenAPI\Server\Model\CreationSource**](CreationSource.md) | The surface used to create this template | [optional] 
**customColumnIds** | **string** | A list of custom column IDs | [optional] 
**displayMetadata** | **string** | Additional metadata about this reporting template | [optional] 
**engagementWindowDays** | **float** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filtersJson** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | [**OpenAPI\Server\Model\Granularity**](Granularity.md) |  | [optional] 
**id** | **string** | Template ID | [readonly] 
**ingestionSources** | [**OpenAPI\Server\Model\IngestionSource**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**isDefault** | **bool** | A boolean representing if this is the default view that loads for this template type | [optional] 
**isDeleted** | **bool** | A boolean that indicates if the template has been deleted | [optional] 
**isOwnedByUser** | **bool** | A boolean value that indicates if the user owns the template | [optional] 
**isScheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **string** | Template Name | [optional] 
**reportEndRelativeDaysInPast** | **float** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**reportFormat** | [**OpenAPI\Server\Model\DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**reportLevel** | [**OpenAPI\Server\Model\MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**reportStartRelativeDaysInPast** | **float** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**reportingTimeZone** | [**OpenAPI\Server\Model\ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional] 
**sortBy** | [**AnyType**](.md) | Unified metric sort configuration | [optional] 
**type** | **string** | Type of the template | [optional] 
**updatedTime** | **float** | Time of last update in seconds since Unix epoch | [optional] [readonly] 
**userId** | **string** | ID of the user who created the template | [optional] 
**viewWindowDays** | **float** | The length of the sliding window over which view conversions will be attributed | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


