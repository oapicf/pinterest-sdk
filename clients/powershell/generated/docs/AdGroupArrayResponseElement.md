# AdGroupArrayResponseElement
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**AdGroupResponse**](AdGroupResponse.md) |  | [optional] 
**Exceptions** | [**Exception[]**](Exception.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupArrayResponseElement = Initialize-PSOpenAPIToolsAdGroupArrayResponseElement  -VarData null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$AdGroupArrayResponseElement | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

