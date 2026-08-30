# SupplementalItemsBatchResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | **String** | Id of the batch operation | [readonly] 
**CompletedTime** | **System.DateTime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**CreatedTime** | **System.DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [readonly] 
**OperationResults** | [**SupplementalOperationResult[]**](SupplementalOperationResult.md) | Array of operation results | [readonly] 
**Status** | [**SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED | [readonly] 

## Examples

- Prepare the resource
```powershell
$SupplementalItemsBatchResponse = Initialize-PSOpenAPIToolsSupplementalItemsBatchResponse  -BatchId 66753b9bb65c46c49bd `
 -CompletedTime 2022-03-14T15:16:34Z `
 -CreatedTime 2022-03-14T15:15:22Z `
 -OperationResults null `
 -Status null
```

- Convert the resource to JSON
```powershell
$SupplementalItemsBatchResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

