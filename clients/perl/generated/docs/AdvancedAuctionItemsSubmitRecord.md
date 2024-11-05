# WWW::OpenAPIClient::Object::AdvancedAuctionItemsSubmitRecord

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdvancedAuctionItemsSubmitRecord;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**AdvancedAuctionOperation**](AdvancedAuctionOperation.md) |  | 
**item_id** | **string** | The catalog retail item id in the merchant namespace | 
**country** | [**Country**](Country.md) |  | 
**language** | [**Language**](Language.md) |  | 
**bid_options** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**update_mask** | [**ARRAY[UpdateMaskBidOptionField]**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


