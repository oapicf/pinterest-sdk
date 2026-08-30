# AdvancedAuctionItemsSubmitUpsertRecord


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`bid_options`** | [**`*AdvancedAuctionBidOptions`**](AdvancedAuctionBidOptions.md) |  | [default to nothing]
**`country`** | [**`*Country`**](Country.md) |  | [default to nothing]
**`errors`** | [**`Vector{AdvancedAuctionOperationError}`**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] [default to nothing]
**`item_id`** | **`String`** | The catalog retail item id in the merchant namespace | [default to nothing]
**`language`** | [**`*Language`**](Language.md) |  | [default to nothing]
**`operation`** | **`String`** |  | [default to nothing]
**`update_mask`** | [**`Vector{UpdateMaskBidOptionField}`**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


