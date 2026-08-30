# AdvancedAuctionItemsSubmitDeleteRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**models::Country**](Country.md) |  | 
**errors** | Option<[**Vec<models::AdvancedAuctionOperationError>**](AdvancedAuctionOperationError.md)> | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional]
**item_id** | **String** | The catalog retail item id in the merchant namespace | 
**language** | [**models::Language**](Language.md) |  | 
**operation** | **Operation** |  (enum: DELETE) | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


