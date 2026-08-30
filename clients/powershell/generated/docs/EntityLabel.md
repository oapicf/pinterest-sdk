# EntityLabel
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | **String** | Entity ID to apply label to. | 
**EntityType** | [**LabelParentType**](LabelParentType.md) |  | [optional] 
**LabelId** | **String** | Label ID. | 
**Status** | [**EntityLabelStatus**](EntityLabelStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$EntityLabel = Initialize-PSOpenAPIToolsEntityLabel  -EntityId null `
 -EntityType null `
 -LabelId null `
 -Status null
```

- Convert the resource to JSON
```powershell
$EntityLabel | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

