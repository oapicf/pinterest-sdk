# AdvancedAuctionItemsSubmitDeleteRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Errors** | [**AdvancedAuctionOperationError[]**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 
**ItemId** | **String** | The catalog retail item id in the merchant namespace | 
**Language** | [**Language**](Language.md) |  | 
**Operation** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionItemsSubmitDeleteRecord = Initialize-PSOpenAPIToolsAdvancedAuctionItemsSubmitDeleteRecord  -Country null `
 -Errors null `
 -ItemId DS0294-M `
 -Language null `
 -Operation null
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionItemsSubmitDeleteRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

