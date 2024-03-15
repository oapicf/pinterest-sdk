# Org.OpenAPITools.Model.TemplateResponse
Template fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Template ID | [optional] 
**AdAccountId** | **string** | ID of the Ad Account that owns the template | [optional] 
**AdAccountIds** | **List&lt;string&gt;** | IDs of the Ad Accounts that have access to this template | [optional] 
**UserId** | **string** | ID of the user who created the template | [optional] 
**Name** | **string** | Template Name | [optional] 
**ReportStartRelativeDaysInPast** | **decimal** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**ReportEndRelativeDaysInPast** | **decimal** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**DateRange** | [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] 
**ReportLevel** | **MetricsReportingLevel** |  | [optional] 
**ReportFormat** | **DataOutputFormat** |  | [optional] 
**Columns** | **List&lt;TemplateResponse.ColumnsEnum&gt;** | A list of columns to be included in the report | [optional] 
**Granularity** | **Granularity** |  | [optional] 
**ViewWindowDays** | **decimal** | The length of the sliding window over which view conversions will be attributed | [optional] 
**ClickWindowDays** | **decimal** | The length of the sliding window over which click conversions will be attributed | [optional] 
**EngagementWindowDays** | **decimal** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**ConversionReportTimeType** | **string** | Conversion report time type | [optional] 
**FiltersJson** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] 
**IsOwnedByUser** | **bool** | A boolean value that indicates if the user owns the template | [optional] 
**IsScheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**CreationSource** | **string** | The surface used to create this template | [optional] 
**IsDeleted** | **bool?** | A boolean that indicates if the template has been deleted | [optional] 
**UpdatedTime** | **decimal** | Time of last update in seconds since Unix epoch | [optional] 
**CustomColumnIds** | **List&lt;string&gt;** | A list of custom column IDs | [optional] 
**Type** | **string** | Reporting template type | [optional] 
**IngestionSources** | **List&lt;TemplateResponse.IngestionSourcesEnum&gt;** | The filter on the conversion ingestion source method for conversion metrics | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

