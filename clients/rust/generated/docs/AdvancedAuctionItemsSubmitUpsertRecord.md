# AdvancedAuctionItemsSubmitUpsertRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **String** | The catalog retail item id in the merchant namespace | 
**country** | [**models::Country**](Country.md) |  | 
**language** | [**models::Language**](Language.md) |  | 
**bid_options** | [**models::AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**update_mask** | Option<[**Vec<models::UpdateMaskBidOptionField>**](UpdateMaskBidOptionField.md)> | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


