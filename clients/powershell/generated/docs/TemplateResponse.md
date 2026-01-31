# TemplateResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | ID of the Ad Account that owns the template | [optional] 
**AdAccountIds** | **String[]** | IDs of the Ad Accounts that have access to this template | [optional] 
**ClickWindowDays** | **Decimal** | The length of the sliding window over which click conversions will be attributed | [optional] 
**Columns** | **String[]** | A list of columns to be included in the report | [optional] 
**ConversionReportTimeType** | **String** | Conversion report time type | [optional] 
**CreationSource** | **String** | The surface used to create this template | [optional] 
**CustomColumnIds** | **String[]** | A list of custom column IDs | [optional] 
**DateRange** | [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] 
**EngagementWindowDays** | **Decimal** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**FiltersJson** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; &quot;&quot;field&quot;&quot;: The column name&lt;br&gt; &quot;&quot;operator&quot;&quot;: The operator. Allowed operators: [&quot;&quot;&#x3D;&quot;&quot;, &quot;&quot;!&#x3D;&quot;&quot;, &quot;&quot;in&quot;&quot;, &quot;&quot;not_in&quot;&quot;, &quot;&quot;~&quot;&quot;, &quot;&quot;&gt;&quot;&quot;, &quot;&quot;&lt;&quot;&quot;, &quot;&quot;contains_substring&quot;&quot;]&lt;br&gt; &quot;&quot;value&quot;&quot;: A single value or a list of values | [optional] 
**Granularity** | [**Granularity**](Granularity.md) |  | [optional] 
**Id** | **String** | Template ID | [optional] 
**IngestionSources** | **String[]** | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**IsDeleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] 
**IsOwnedByUser** | **Boolean** | A boolean value that indicates if the user owns the template | [optional] 
**IsScheduled** | **Boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**Name** | **String** | Template Name | [optional] 
**ReportEndRelativeDaysInPast** | **Decimal** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**ReportFormat** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**ReportLevel** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**ReportStartRelativeDaysInPast** | **Decimal** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**Type** | **String** | Reporting template type | [optional] 
**UpdatedTime** | **Decimal** | Time of last update in seconds since Unix epoch | [optional] 
**UserId** | **String** | ID of the user who created the template | [optional] 
**ViewWindowDays** | **Decimal** | The length of the sliding window over which view conversions will be attributed | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponse = Initialize-PSOpenAPIToolsTemplateResponse  -AdAccountId 547664674848 `
 -AdAccountIds [&quot;547664674848&quot;] `
 -ClickWindowDays 7 `
 -Columns [&quot;SPEND_IN_DOLLAR&quot;] `
 -ConversionReportTimeType TIME_OF_AD_ACTION `
 -CreationSource ADS_MANAGER_REPORT_BUILDER `
 -CustomColumnIds [&quot;1597252063&quot;] `
 -DateRange null `
 -EngagementWindowDays 7 `
 -FiltersJson [{&quot;field&quot;: &quot;SPEND_IN_DOLLAR&quot;, &quot;operator&quot;: &quot;&#x3D;&quot;, &quot;value&quot;: 100}] `
 -Granularity null `
 -Id 6739202847590 `
 -IngestionSources null `
 -IsDeleted false `
 -IsOwnedByUser true `
 -IsScheduled true `
 -Name Week over week spend `
 -ReportEndRelativeDaysInPast 7 `
 -ReportFormat null `
 -ReportLevel null `
 -ReportStartRelativeDaysInPast 7 `
 -Type BULK `
 -UpdatedTime 1432744744 `
 -UserId 784762938748396 `
 -ViewWindowDays 7
```

- Convert the resource to JSON
```powershell
$TemplateResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

