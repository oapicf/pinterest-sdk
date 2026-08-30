# LabeledEntities
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntitiesLabels** | [**EntityLabel[]**](EntityLabel.md) |  | [optional] [readonly] 
**Errors** | [**EntityLabelError[]**](EntityLabelError.md) | Labels that were not successfully applied. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$LabeledEntities = Initialize-PSOpenAPIToolsLabeledEntities  -EntitiesLabels null `
 -Errors null
```

- Convert the resource to JSON
```powershell
$LabeledEntities | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

