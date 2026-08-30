# AccountTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String!** | ID of the Ad Account that owns the template | [optional] [readonly] [default to null]
**adAccountIds** | **String!** | IDs of the Ad Accounts that have access to this template | [optional] [default to null]
**adeColumns** | **String!** | A list of ADE columns | [optional] [default to null]
**attributionType** | [***AnyType**](.md) | Attribution type for Brand/Category/SKU reports | [optional] [default to null]
**clickWindowDays** | **Float!** | The length of the sliding window over which click conversions will be attributed | [optional] [default to null]
**columns** | [**ReportingColumn**](ReportingColumn.md) | A list of columns to be included in the report | [optional] [default to null]
**conversionReportTimeType** | [***ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional] [default to null]
**creationSource** | [***CreationSource**](CreationSource.md) | The surface used to create this template | [optional] [default to null]
**customColumnIds** | **String!** | A list of custom column IDs | [optional] [default to null]
**displayMetadata** | **String!** | Additional metadata about this reporting template | [optional] [default to null]
**engagementWindowDays** | **Float!** | The length of the sliding window over which engagement conversions will be attributed | [optional] [default to null]
**filtersJson** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] [default to null]
**granularity** | [***Granularity**](Granularity.md) |  | [optional] [default to null]
**Id_** | **String!** | Template ID | [readonly] [default to null]
**ingestionSources** | [**IngestionSource**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] [default to null]
**isDefault** | **Boolean!** | A boolean representing if this is the default view that loads for this template type | [optional] [default to null]
**isDeleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] [default to null]
**isOwnedByUser** | **Boolean!** | A boolean value that indicates if the user owns the template | [optional] [default to null]
**isScheduled** | **Boolean!** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] [default to null]
**name** | **String** | Template Name | [optional] [default to null]
**reportEndRelativeDaysInPast** | **Float!** | The number of days prior to the day the report will be delivered at which the report will end | [optional] [default to null]
**reportFormat** | [***DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to null]
**reportLevel** | [***MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] [default to null]
**reportStartRelativeDaysInPast** | **Float!** | The number of days prior to the day the report will be delivered at which the report will start | [optional] [default to null]
**reportingTimeZone** | [***ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional] [default to null]
**sortBy** | [***AnyType**](.md) | Unified metric sort configuration | [optional] [default to null]
**Type_** | **String!** | Type of the template | [optional] [default to null]
**updatedTime** | **Float!** | Time of last update in seconds since Unix epoch | [optional] [readonly] [default to null]
**userId** | **String!** | ID of the user who created the template | [optional] [default to null]
**viewWindowDays** | **Float!** | The length of the sliding window over which view conversions will be attributed | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


