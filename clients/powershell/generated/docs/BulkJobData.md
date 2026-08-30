# BulkJobData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResultUrl** | **String** | Presigned s3 file url for the bulk request result. | [optional] 
**Status** | [**BulkRequestStatus**](BulkRequestStatus.md) |  | 
**WorkloadId** | **Int32** | Bulk Workload Id. | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkJobData = Initialize-PSOpenAPIToolsBulkJobData  -ResultUrl null `
 -Status null `
 -WorkloadId null
```

- Convert the resource to JSON
```powershell
$BulkJobData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

