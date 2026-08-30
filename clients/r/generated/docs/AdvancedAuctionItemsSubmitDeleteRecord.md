# openapi::AdvancedAuctionItemsSubmitDeleteRecord

Object describing an item bid option deletion operation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [Enum: ] 
**errors** | [**array[AdvancedAuctionOperationError]**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 
**item_id** | **character** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | [Enum: ] 
**operation** | **character** |  | [Enum: [DELETE]] 


