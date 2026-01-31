# Label
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Label ID. | [optional] 
**LabelType** | [**LabelType**](LabelType.md) |  | [optional] 
**ParentId** | **String** | Label parent entity ID. | [optional] 
**ParentType** | **String** | Label parent entity type. | [optional] 
**Status** | [**LabelStatus**](LabelStatus.md) |  | [optional] 
**Value** | **String** | Label name. | [optional] 

## Examples

- Prepare the resource
```powershell
$Label = Initialize-PSOpenAPIToolsLabel  -Id 1106385754497 `
 -LabelType null `
 -ParentId 626753052072 `
 -ParentType CAMPAIGN `
 -Status null `
 -Value null
```

- Convert the resource to JSON
```powershell
$Label | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

