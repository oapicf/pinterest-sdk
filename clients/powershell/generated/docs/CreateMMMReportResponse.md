# CreateMMMReportResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Decimal** |  | [optional] 
**VarData** | [**CreateMMMReportResponseData**](CreateMMMReportResponseData.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateMMMReportResponse = Initialize-PSOpenAPIToolsCreateMMMReportResponse  -Code 0 `
 -VarData null
```

- Convert the resource to JSON
```powershell
$CreateMMMReportResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

