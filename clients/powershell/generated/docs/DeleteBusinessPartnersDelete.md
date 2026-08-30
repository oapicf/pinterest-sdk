# DeleteBusinessPartnersDelete
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartnerIds** | **String[]** | A list of partner ids to be deleted | 
**PartnerType** | [**NullablePartnerType**](NullablePartnerType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteBusinessPartnersDelete = Initialize-PSOpenAPIToolsDeleteBusinessPartnersDelete  -PartnerIds null `
 -PartnerType null
```

- Convert the resource to JSON
```powershell
$DeleteBusinessPartnersDelete | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

