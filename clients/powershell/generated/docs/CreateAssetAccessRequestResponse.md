# CreateAssetAccessRequestResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exceptions** | [**CreateAssetAccessRequestErrorMessageInner[]**](CreateAssetAccessRequestErrorMessageInner.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional] 
**Invites** | **System.Collections.Hashtable** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateAssetAccessRequestResponse = Initialize-PSOpenAPIToolsCreateAssetAccessRequestResponse  -Exceptions null `
 -Invites {&quot;766456567741825556&quot;:&quot;5349280584552211583&quot;,&quot;733242520489967216&quot;:&quot;5349280584552211845&quot;}
```

- Convert the resource to JSON
```powershell
$CreateAssetAccessRequestResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

