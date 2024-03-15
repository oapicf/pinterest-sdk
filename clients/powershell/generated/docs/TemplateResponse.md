# TemplateResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Template ID | [optional] 
**AdAccountId** | **String** | ID of the Ad Account that owns the template | [optional] 
**AdAccountIds** | **String[]** | IDs of the Ad Accounts that have access to this template | [optional] 
**UserId** | **String** | ID of the user who created the template | [optional] 
**Name** | **String** | Template Name | [optional] 
**ReportStartRelativeDaysInPast** | **Decimal** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**ReportEndRelativeDaysInPast** | **Decimal** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**DateRange** | [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] 
**ReportLevel** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**ReportFormat** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**Columns** | **String[]** | A list of columns to be included in the report | [optional] 
**Granularity** | [**Granularity**](Granularity.md) |  | [optional] 
**ViewWindowDays** | **Decimal** | The length of the sliding window over which view conversions will be attributed | [optional] 
**ClickWindowDays** | **Decimal** | The length of the sliding window over which click conversions will be attributed | [optional] 
**EngagementWindowDays** | **Decimal** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**ConversionReportTimeType** | **String** | Conversion report time type | [optional] 
**FiltersJson** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; &quot;&quot;field&quot;&quot;: The column name&lt;br&gt; &quot;&quot;operator&quot;&quot;: The operator. Allowed operators: [&quot;&quot;&#x3D;&quot;&quot;, &quot;&quot;!&#x3D;&quot;&quot;, &quot;&quot;in&quot;&quot;, &quot;&quot;not_in&quot;&quot;, &quot;&quot;~&quot;&quot;, &quot;&quot;&gt;&quot;&quot;, &quot;&quot;&lt;&quot;&quot;, &quot;&quot;contains_substring&quot;&quot;]&lt;br&gt; &quot;&quot;value&quot;&quot;: A single value or a list of values | [optional] 
**IsOwnedByUser** | **Boolean** | A boolean value that indicates if the user owns the template | [optional] 
**IsScheduled** | **Boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**CreationSource** | **String** | The surface used to create this template | [optional] 
**IsDeleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] 
**UpdatedTime** | **Decimal** | Time of last update in seconds since Unix epoch | [optional] 
**CustomColumnIds** | **String[]** | A list of custom column IDs | [optional] 
**Type** | **String** | Reporting template type | [optional] 
**IngestionSources** | **String[]** | The filter on the conversion ingestion source method for conversion metrics | [optional] 

## Examples

- Prepare the resource
```powershell
$TemplateResponse = Initialize-PSOpenAPIToolsTemplateResponse  -Id 6739202847590 `
 -AdAccountId 547664674848 `
 -AdAccountIds [&quot;547664674848&quot;] `
 -UserId 784762938748396 `
 -Name Week over week spend `
 -ReportStartRelativeDaysInPast 7 `
 -ReportEndRelativeDaysInPast 7 `
 -DateRange null `
 -ReportLevel null `
 -ReportFormat null `
 -Columns [&quot;SPEND_IN_DOLLAR&quot;] `
 -Granularity null `
 -ViewWindowDays 7 `
 -ClickWindowDays 7 `
 -EngagementWindowDays 7 `
 -ConversionReportTimeType TIME_OF_AD_ACTION `
 -FiltersJson [{&quot;field&quot;: &quot;SPEND_IN_DOLLAR&quot;, &quot;operator&quot;: &quot;&#x3D;&quot;, &quot;value&quot;: 100}] `
 -IsOwnedByUser true `
 -IsScheduled true `
 -CreationSource ADS_MANAGER_REPORT_BUILDER `
 -IsDeleted false `
 -UpdatedTime 1432744744 `
 -CustomColumnIds [&quot;1597252063&quot;] `
 -Type BULK `
 -IngestionSources null
```

- Convert the resource to JSON
```powershell
$TemplateResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

