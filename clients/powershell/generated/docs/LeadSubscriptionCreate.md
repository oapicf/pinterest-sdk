# LeadSubscriptionCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LeadFormId** | **String** | Lead form ID. | [optional] 
**WebhookUrl** | **String** | Standard HTTPS webhook URL. | 

## Examples

- Prepare the resource
```powershell
$LeadSubscriptionCreate = Initialize-PSOpenAPIToolsLeadSubscriptionCreate  -LeadFormId null `
 -WebhookUrl null
```

- Convert the resource to JSON
```powershell
$LeadSubscriptionCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

