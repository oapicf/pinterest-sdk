# LeadsExportCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **String** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD | 
**EndDate** | **String** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD | 
**AdId** | **String** | ID for the ad collecting leads | 

## Examples

- Prepare the resource
```powershell
$LeadsExportCreateRequest = Initialize-PSOpenAPIToolsLeadsExportCreateRequest  -StartDate 2020-12-20 `
 -EndDate 2020-12-20 `
 -AdId 687201361754
```

- Convert the resource to JSON
```powershell
$LeadsExportCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

