# CreateMMMReportRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Countries** | [**TargetingAdvertiserCountry[]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**Columns** | [**MMMReportingColumn[]**](MMMReportingColumn.md) | Metric and entity columns | 
**EndDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | **String** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**Level** | **String** | Level of the report | 
**ReportName** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**StartDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**TargetingTypes** | [**MMMReportingTargetingType[]**](MMMReportingTargetingType.md) | List of targeting types | 

## Examples

- Prepare the resource
```powershell
$CreateMMMReportRequest = Initialize-PSOpenAPIToolsCreateMMMReportRequest  -Countries null `
 -Columns null `
 -EndDate 2020-12-20 `
 -Granularity null `
 -Level null `
 -ReportName null `
 -StartDate 2020-12-20 `
 -TargetingTypes [&quot;GENDER&quot;]
```

- Convert the resource to JSON
```powershell
$CreateMMMReportRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

