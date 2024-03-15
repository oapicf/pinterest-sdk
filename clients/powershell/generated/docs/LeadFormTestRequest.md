# LeadFormTestRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Answers** | **String[]** | Test lead answers. Should follow the creation order. | 

## Examples

- Prepare the resource
```powershell
$LeadFormTestRequest = Initialize-PSOpenAPIToolsLeadFormTestRequest  -Answers [&quot;John&quot;,&quot;Doe&quot;,&quot;abc@email.com&quot;,&quot;987654321&quot;]
```

- Convert the resource to JSON
```powershell
$LeadFormTestRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

