# TotalCountByEntityStatus
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ACTIVE** | **Int32** | Count of ACTIVE assets | [optional] 
**ARCHIVED** | **Int32** | Count of ARCHIVED assets | [optional] 
**PAUSED** | **Int32** | Count of PAUSED assets | [optional] 

## Examples

- Prepare the resource
```powershell
$TotalCountByEntityStatus = Initialize-PSOpenAPIToolsTotalCountByEntityStatus  -ACTIVE null `
 -ARCHIVED null `
 -PAUSED null
```

- Convert the resource to JSON
```powershell
$TotalCountByEntityStatus | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

