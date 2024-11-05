# DeletePartnersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletedPartners** | **String[]** | List of partners whose business partnership have been terminated. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletePartnersResponse = Initialize-PSOpenAPIToolsDeletePartnersResponse  -DeletedPartners [&quot;809944451643622187&quot;,&quot;383791336903426391&quot;]
```

- Convert the resource to JSON
```powershell
$DeletePartnersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

