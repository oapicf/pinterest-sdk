# ADVANCED_AUCTION_ITEMS_SUBMIT_DELETE_RECORD

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**COUNTRY**](Country.md) |  | [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | The catalog retail item id in the merchant namespace | [default to null]
**language** | [**LANGUAGE**](Language.md) |  | [default to null]
**errors** | [**LIST [ADVANCED_AUCTION_OPERATION_ERROR]**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


