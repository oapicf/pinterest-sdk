# ConversionDeletionRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedTime** | **System.DateTime** | Timestamp when the conversion deletion request was succesfully created. | [readonly] 
**ProcessedTime** | **System.DateTime** | Timestamp when the conversion deletion request was processed. | [optional] [readonly] 
**RequestId** | **String** | Unique identifier of the conversion deletion request | 
**Status** | [**ConversionDeletionRequestStatus**](ConversionDeletionRequestStatus.md) | Represents the status of the conversion deletion request. &quot;&quot;PENDING&quot;&quot; or &quot;&quot;SUBMITTED&quot;&quot;. &quot;&quot;PENDING&quot;&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. &quot;&quot;SUBMITTED&quot;&quot; meaning that the Data Deletion process has begun and can no longer be canceled. | [readonly] 

## Examples

- Prepare the resource
```powershell
$ConversionDeletionRequest = Initialize-PSOpenAPIToolsConversionDeletionRequest  -CreatedTime null `
 -ProcessedTime null `
 -RequestId null `
 -Status null
```

- Convert the resource to JSON
```powershell
$ConversionDeletionRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

