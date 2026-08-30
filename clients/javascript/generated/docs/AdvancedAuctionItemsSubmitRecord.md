# PinterestSdk.AdvancedAuctionItemsSubmitRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bidOptions** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**country** | [**Country**](Country.md) |  | 
**errors** | [**[AdvancedAuctionOperationError]**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 
**itemId** | **String** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | 
**operation** | **String** |  | 
**updateMask** | [**[UpdateMaskBidOptionField]**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 



## Enum: OperationEnum


* `DELETE` (value: `"DELETE"`)




