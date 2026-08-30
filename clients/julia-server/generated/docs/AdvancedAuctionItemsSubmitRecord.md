# AdvancedAuctionItemsSubmitRecord



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: AdvancedAuctionItemsSubmitDeleteRecord, AdvancedAuctionItemsSubmitUpsertRecord | Object describing an item bid option operation | [optional] 

The discriminator field is `operation` with the following mapping:
 - `DELETE`: `AdvancedAuctionItemsSubmitDeleteRecord`
 - `UPSERT`: `AdvancedAuctionItemsSubmitUpsertRecord`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


