# Org.OpenAPITools.Model.AdvancedAuctionItemsSubmitUpsertRecord
Object describing an item bid option upsert operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | The catalog retail item id in the merchant namespace | 
**Country** | **Country** |  | 
**Language** | **Language** |  | 
**BidOptions** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**UpdateMask** | [**List&lt;UpdateMaskBidOptionField&gt;**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

