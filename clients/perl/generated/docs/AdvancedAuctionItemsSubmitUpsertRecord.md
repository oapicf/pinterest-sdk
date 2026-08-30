# WWW::OpenAPIClient::Object::AdvancedAuctionItemsSubmitUpsertRecord

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdvancedAuctionItemsSubmitUpsertRecord;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_options** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**country** | [**Country**](Country.md) |  | 
**errors** | [**ARRAY[AdvancedAuctionOperationError]**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 
**item_id** | **string** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | 
**operation** | **string** |  | 
**update_mask** | [**ARRAY[UpdateMaskBidOptionField]**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


