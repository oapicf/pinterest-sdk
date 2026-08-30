# Org.OpenAPITools.Model.AccountTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Template ID | [readonly] 
**AdAccountId** | **string** | ID of the Ad Account that owns the template | [optional] [readonly] 
**AdAccountIds** | **List&lt;string&gt;** | IDs of the Ad Accounts that have access to this template | [optional] 
**AdeColumns** | **List&lt;string&gt;** | A list of ADE columns | [optional] 
**AttributionType** | **Object** | Attribution type for Brand/Category/SKU reports | [optional] 
**ClickWindowDays** | **decimal** | The length of the sliding window over which click conversions will be attributed | [optional] 
**Columns** | [**List&lt;ReportingColumn&gt;**](ReportingColumn.md) | A list of columns to be included in the report | [optional] 
**ConversionReportTimeType** | **ConversionReportTimeType** | Conversion report time type | [optional] 
**CreationSource** | **CreationSource** | The surface used to create this template | [optional] 
**CustomColumnIds** | **List&lt;string&gt;** | A list of custom column IDs | [optional] 
**DisplayMetadata** | **string** | Additional metadata about this reporting template | [optional] 
**EngagementWindowDays** | **decimal** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**FiltersJson** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] 
**Granularity** | **Granularity** |  | [optional] 
**IngestionSources** | [**List&lt;IngestionSource&gt;**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**IsDefault** | **bool** | A boolean representing if this is the default view that loads for this template type | [optional] 
**IsDeleted** | **bool** | A boolean that indicates if the template has been deleted | [optional] 
**IsOwnedByUser** | **bool** | A boolean value that indicates if the user owns the template | [optional] 
**IsScheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**Name** | **string** | Template Name | [optional] 
**ReportEndRelativeDaysInPast** | **decimal** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**ReportFormat** | **DataOutputFormat** |  | [optional] 
**ReportLevel** | **MetricsReportingLevel** |  | [optional] 
**ReportStartRelativeDaysInPast** | **decimal** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**ReportingTimeZone** | **ReportingTimeZone** | Timezone for reporting data | [optional] 
**SortBy** | **Object** | Unified metric sort configuration | [optional] 
**Type** | **string** | Type of the template | [optional] 
**UpdatedTime** | **decimal** | Time of last update in seconds since Unix epoch | [optional] [readonly] 
**UserId** | **string** | ID of the user who created the template | [optional] 
**ViewWindowDays** | **decimal** | The length of the sliding window over which view conversions will be attributed | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

