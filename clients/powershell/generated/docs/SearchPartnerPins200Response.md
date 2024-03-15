# SearchPartnerPins200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**SummaryPin[]**](SummaryPin.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SearchPartnerPins200Response = Initialize-PSOpenAPIToolsSearchPartnerPins200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$SearchPartnerPins200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

