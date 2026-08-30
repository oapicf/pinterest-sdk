# CatalogsRetailBatchRequestItemsItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [***models::ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**item_id** | **String** | The catalog item id in the merchant namespace | 
**operation** | [***models::AdvancedAuctionItemsSubmitDeleteRecordOperation**](AdvancedAuctionItemsSubmitDeleteRecord_operation.md) |  | 
**update_mask** | [**swagger::Nullable<Vec<models::UpdateMaskFieldType>>**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] [default to None]
**last_updated_time** | **i64** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


