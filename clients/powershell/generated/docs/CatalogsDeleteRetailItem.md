# CatalogsDeleteRetailItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | The catalog item id in the merchant namespace | 
**LastUpdatedTime** | **Int64** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 
**Operation** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsDeleteRetailItem = Initialize-PSOpenAPIToolsCatalogsDeleteRetailItem  -ItemId DS0294-M `
 -LastUpdatedTime 1641483432072 `
 -Operation null
```

- Convert the resource to JSON
```powershell
$CatalogsDeleteRetailItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

