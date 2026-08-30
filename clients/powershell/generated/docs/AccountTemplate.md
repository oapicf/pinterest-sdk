# AccountTemplate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | ID of the Ad Account that owns the template | [optional] [readonly] 
**AdAccountIds** | **String[]** | IDs of the Ad Accounts that have access to this template | [optional] 
**AdeColumns** | **String[]** | A list of ADE columns | [optional] 
**AttributionType** | [**AnyType**](.md) | Attribution type for Brand/Category/SKU reports | [optional] 
**ClickWindowDays** | **Decimal** | The length of the sliding window over which click conversions will be attributed | [optional] 
**Columns** | [**ReportingColumn[]**](ReportingColumn.md) | A list of columns to be included in the report | [optional] 
**ConversionReportTimeType** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional] 
**CreationSource** | [**CreationSource**](CreationSource.md) | The surface used to create this template | [optional] 
**CustomColumnIds** | **String[]** | A list of custom column IDs | [optional] 
**DisplayMetadata** | **String** | Additional metadata about this reporting template | [optional] 
**EngagementWindowDays** | **Decimal** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**FiltersJson** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\ &quot;&quot;field&quot;&quot;: The column name\ &quot;&quot;operator&quot;&quot;: The operator. Allowed operators: [&quot;&quot;&#x3D;&quot;&quot;, &quot;&quot;!&#x3D;&quot;&quot;, &quot;&quot;in&quot;&quot;, &quot;&quot;not_in&quot;&quot;, &quot;&quot;~&quot;&quot;, &quot;&quot;&gt;&quot;&quot;, &quot;&quot;&lt;&quot;&quot;, &quot;&quot;contains_substring&quot;&quot;]\ &quot;&quot;value&quot;&quot;: A single value or a list of values | [optional] 
**Granularity** | [**Granularity**](Granularity.md) |  | [optional] 
**Id** | **String** | Template ID | [readonly] 
**IngestionSources** | [**IngestionSource[]**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**IsDefault** | **Boolean** | A boolean representing if this is the default view that loads for this template type | [optional] 
**IsDeleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] 
**IsOwnedByUser** | **Boolean** | A boolean value that indicates if the user owns the template | [optional] 
**IsScheduled** | **Boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**Name** | **String** | Template Name | [optional] 
**ReportEndRelativeDaysInPast** | **Decimal** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**ReportFormat** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**ReportLevel** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**ReportStartRelativeDaysInPast** | **Decimal** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**ReportingTimeZone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional] 
**SortBy** | [**AnyType**](.md) | Unified metric sort configuration | [optional] 
**Type** | **String** | Type of the template | [optional] 
**UpdatedTime** | **Decimal** | Time of last update in seconds since Unix epoch | [optional] [readonly] 
**UserId** | **String** | ID of the user who created the template | [optional] 
**ViewWindowDays** | **Decimal** | The length of the sliding window over which view conversions will be attributed | [optional] 

## Examples

- Prepare the resource
```powershell
$AccountTemplate = Initialize-PSOpenAPIToolsAccountTemplate  -AdAccountId null `
 -AdAccountIds null `
 -AdeColumns [&quot;ADE_COST_PER_ACTION-download_picture&quot;] `
 -AttributionType ADVERTISER_LEVEL `
 -ClickWindowDays null `
 -Columns null `
 -ConversionReportTimeType null `
 -CreationSource null `
 -CustomColumnIds null `
 -DisplayMetadata null `
 -EngagementWindowDays null `
 -FiltersJson null `
 -Granularity null `
 -Id null `
 -IngestionSources null `
 -IsDefault false `
 -IsDeleted null `
 -IsOwnedByUser null `
 -IsScheduled null `
 -Name null `
 -ReportEndRelativeDaysInPast null `
 -ReportFormat null `
 -ReportLevel null `
 -ReportStartRelativeDaysInPast null `
 -ReportingTimeZone null `
 -SortBy null `
 -Type null `
 -UpdatedTime null `
 -UserId null `
 -ViewWindowDays null
```

- Convert the resource to JSON
```powershell
$AccountTemplate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

