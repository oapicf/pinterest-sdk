# AdvancedAuctionOperationError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** | The error code for the item bid option operation validation error | [optional] 
**Message** | **String** | Message describing the item bid option operation validation error | [optional] 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionOperationError = Initialize-PSOpenAPIToolsAdvancedAuctionOperationError  -Code 6 `
 -Message Bid in micro currency should be non-negative
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionOperationError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

