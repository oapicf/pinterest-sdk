# AdvancedAuctionItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | The catalog retail item id in the merchant namespace | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**BidOptions** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionItem = Initialize-PSOpenAPIToolsAdvancedAuctionItem  -ItemId DS0294-M `
 -Country null `
 -Language null `
 -BidOptions null
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

