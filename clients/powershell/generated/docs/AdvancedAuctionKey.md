# AdvancedAuctionKey
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**ItemId** | **String** | The catalog retail item id in the merchant namespace | 
**Language** | [**Language**](Language.md) |  | 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionKey = Initialize-PSOpenAPIToolsAdvancedAuctionKey  -Country null `
 -ItemId DS0294-M `
 -Language null
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionKey | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

