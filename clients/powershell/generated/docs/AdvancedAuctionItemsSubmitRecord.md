# AdvancedAuctionItemsSubmitRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | [**AdvancedAuctionOperation**](AdvancedAuctionOperation.md) |  | 
**ItemId** | **String** | The catalog retail item id in the merchant namespace | 
**Country** | [**Country**](Country.md) |  | 
**Language** | [**Language**](Language.md) |  | 
**BidOptions** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**UpdateMask** | [**UpdateMaskBidOptionField[]**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionItemsSubmitRecord = Initialize-PSOpenAPIToolsAdvancedAuctionItemsSubmitRecord  -Operation null `
 -ItemId DS0294-M `
 -Country null `
 -Language null `
 -BidOptions null `
 -UpdateMask [BID, APP_TYPE_BID_MULTIPLIER_SET]
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionItemsSubmitRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

