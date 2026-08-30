# LeadsExportsCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdId** | **String** | ID for the ad collecting leads. | 
**EndDate** | **String** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD. | 
**StartDate** | **String** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD. | 

## Examples

- Prepare the resource
```powershell
$LeadsExportsCreate = Initialize-PSOpenAPIToolsLeadsExportsCreate  -AdId 687201361754 `
 -EndDate 2020-12-20 `
 -StartDate 2020-12-20
```

- Convert the resource to JSON
```powershell
$LeadsExportsCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

