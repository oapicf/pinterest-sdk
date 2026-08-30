# MMMReportCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvertiserIds** | **String[]** | Advertiser IDs for multi-advertiser report | [optional] 
**Columns** | [**MMMReportingColumn[]**](MMMReportingColumn.md) | Metric and entity columns | 
**Countries** | [**TargetingAdvertiserCountry[]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**CustomColumnIds** | **String[]** | List of custom column IDs | [optional] 
**EndDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**Level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report | 
**ReportName** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**StartDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**TargetingTypes** | [**MMMReportingTargetingType[]**](MMMReportingTargetingType.md) | List of targeting types | 

## Examples

- Prepare the resource
```powershell
$MMMReportCreate = Initialize-PSOpenAPIToolsMMMReportCreate  -AdvertiserIds null `
 -Columns null `
 -Countries null `
 -CustomColumnIds null `
 -EndDate 2020-12-20 `
 -Granularity null `
 -Level null `
 -ReportName null `
 -StartDate 2020-12-20 `
 -TargetingTypes [&quot;GENDER&quot;]
```

- Convert the resource to JSON
```powershell
$MMMReportCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

