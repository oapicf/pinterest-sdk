# DeletePartnersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartnerIds** | **String[]** |  | 
**PartnerType** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletePartnersRequest = Initialize-PSOpenAPIToolsDeletePartnersRequest  -PartnerIds null `
 -PartnerType null
```

- Convert the resource to JSON
```powershell
$DeletePartnersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

