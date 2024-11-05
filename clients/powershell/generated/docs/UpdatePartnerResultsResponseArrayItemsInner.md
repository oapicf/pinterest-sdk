# UpdatePartnerResultsResponseArrayItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | [**BusinessAccessError**](BusinessAccessError.md) |  | [optional] 
**MemberOrPartnerId** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdatePartnerResultsResponseArrayItemsInner = Initialize-PSOpenAPIToolsUpdatePartnerResultsResponseArrayItemsInner  -Exception null `
 -MemberOrPartnerId 1234567890123
```

- Convert the resource to JSON
```powershell
$UpdatePartnerResultsResponseArrayItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

