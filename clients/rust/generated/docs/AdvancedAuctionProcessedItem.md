# AdvancedAuctionProcessedItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**models::AdvancedAuctionOperation**](AdvancedAuctionOperation.md) |  | 
**item_id** | **String** | The catalog retail item id in the merchant namespace | 
**country** | [**models::Country**](Country.md) |  | 
**language** | [**models::Language**](Language.md) |  | 
**bid_options** | [**models::AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**update_mask** | Option<[**Vec<models::UpdateMaskBidOptionField>**](UpdateMaskBidOptionField.md)> | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. | 
**errors** | Option<[**Vec<models::AdvancedAuctionOperationError>**](AdvancedAuctionOperationError.md)> | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


