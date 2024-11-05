# AdvancedAuctionItemsGetRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | The catalog retail item id in the merchant namespace | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionItemsGetRecord = Initialize-PSOpenAPIToolsAdvancedAuctionItemsGetRecord  -ItemId DS0294-M `
 -Country null `
 -Language null
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionItemsGetRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

