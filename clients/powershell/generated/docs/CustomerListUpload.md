# CustomerListUpload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Advertiser ID. | 
**CreationTime** | **Int32** | Customer List Upload creation_time. Epoch (seconds). | 
**CustomerListId** | **String** | ID of the customer list associated with this upload. | 
**ErrorCounts** | [**ErrorDetail[]**](ErrorDetail.md) | Error counts by error code | [optional] 
**Id** | **String** | Customer List Upload ID. | 
**Operation** | [**UserListOperationType**](UserListOperationType.md) |  | 
**RecordCounts** | [**RecordCounts**](RecordCounts.md) |  | [optional] 
**State** | **String** | Workload processing state | 
**UpdatedTime** | **Int32** | Customer List Upload updated_time. Epoch (seconds). | 

## Examples

- Prepare the resource
```powershell
$CustomerListUpload = Initialize-PSOpenAPIToolsCustomerListUpload  -AdAccountId 9876543210 `
 -CreationTime 1728606435 `
 -CustomerListId 59854745824 `
 -ErrorCounts [{&quot;error_code&quot;:42,&quot;message&quot;:&quot;Invalid email&quot;,&quot;count&quot;:20}] `
 -Id 1234567890 `
 -Operation null `
 -RecordCounts null `
 -State RUNNING `
 -UpdatedTime 1728606435
```

- Convert the resource to JSON
```powershell
$CustomerListUpload | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

