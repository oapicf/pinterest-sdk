# AdvancedAuctionItemsSubmitUpsertRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidOptions** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**Country** | [**Country**](Country.md) |  | 
**Errors** | [**AdvancedAuctionOperationError[]**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 
**ItemId** | **String** | The catalog retail item id in the merchant namespace | 
**Language** | [**Language**](Language.md) |  | 
**Operation** | **String** |  | 
**UpdateMask** | [**UpdateMaskBidOptionField[]**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionItemsSubmitUpsertRecord = Initialize-PSOpenAPIToolsAdvancedAuctionItemsSubmitUpsertRecord  -BidOptions null `
 -Country null `
 -Errors null `
 -ItemId DS0294-M `
 -Language null `
 -Operation null `
 -UpdateMask [&quot;BID&quot;,&quot;APP_TYPE_BID_MULTIPLIER_SET&quot;]
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionItemsSubmitUpsertRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

