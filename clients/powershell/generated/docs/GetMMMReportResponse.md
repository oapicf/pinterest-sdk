# GetMMMReportResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Decimal** |  | [optional] 
**VarData** | [**GetMMMReportResponseData**](GetMMMReportResponseData.md) |  | [optional] 
**Message** | **String** |  | [optional] 
**Status** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetMMMReportResponse = Initialize-PSOpenAPIToolsGetMMMReportResponse  -Code 0 `
 -VarData null `
 -Message ok `
 -Status success
```

- Convert the resource to JSON
```powershell
$GetMMMReportResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

