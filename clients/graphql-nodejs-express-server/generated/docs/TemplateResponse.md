# TemplateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | Template ID | [optional] [default to null]
**adAccountId** | **String!** | ID of the Ad Account that owns the template | [optional] [default to null]
**adAccountIds** | **String!** | IDs of the Ad Accounts that have access to this template | [optional] [default to null]
**userId** | **String!** | ID of the user who created the template | [optional] [default to null]
**name** | **String** | Template Name | [optional] [default to null]
**reportStartRelativeDaysInPast** | **Float!** | The number of days prior to the day the report will be delivered at which the report will start | [optional] [default to null]
**reportEndRelativeDaysInPast** | **Float!** | The number of days prior to the day the report will be delivered at which the report will end | [optional] [default to null]
**dateRange** | [***TemplateResponseDateRange**](TemplateResponse_date_range.md) |  | [optional] [default to null]
**reportLevel** | [***MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] [default to null]
**reportFormat** | [***DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to null]
**columns** | **String!** | A list of columns to be included in the report | [optional] [default to null]
**granularity** | [***Granularity**](Granularity.md) |  | [optional] [default to null]
**viewWindowDays** | **Float!** | The length of the sliding window over which view conversions will be attributed | [optional] [default to null]
**clickWindowDays** | **Float!** | The length of the sliding window over which click conversions will be attributed | [optional] [default to null]
**engagementWindowDays** | **Float!** | The length of the sliding window over which engagement conversions will be attributed | [optional] [default to null]
**conversionReportTimeType** | **String!** | Conversion report time type | [optional] [default to null]
**filtersJson** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] [default to null]
**isOwnedByUser** | **Boolean!** | A boolean value that indicates if the user owns the template | [optional] [default to null]
**isScheduled** | **Boolean!** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] [default to null]
**creationSource** | **String!** | The surface used to create this template | [optional] [default to null]
**isDeleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] [default to null]
**updatedTime** | **Float!** | Time of last update in seconds since Unix epoch | [optional] [default to null]
**customColumnIds** | **String!** | A list of custom column IDs | [optional] [default to null]
**Type_** | **String!** | Reporting template type | [optional] [default to null]
**ingestionSources** | **String!** | The filter on the conversion ingestion source method for conversion metrics | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


