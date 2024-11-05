# ADVANCED_AUCTION_ITEMS_SUBMIT_UPSERT_RECORD

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | [**STRING_32**](STRING_32.md) | The catalog retail item id in the merchant namespace | [default to null]
**country** | [**COUNTRY**](Country.md) |  | [default to null]
**language** | [**LANGUAGE**](Language.md) |  | [default to null]
**bid_options** | [**ADVANCED_AUCTION_BID_OPTIONS**](AdvancedAuctionBidOptions.md) |  | [default to null]
**update_mask** | [**LIST [UPDATE_MASK_BID_OPTION_FIELD]**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


