
# AdvancedAuctionItemsSubmitDeleteRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | 
**itemId** | **kotlin.String** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | 
**operation** | [**inline**](#Operation) |  | 
**errors** | [**kotlin.collections.List&lt;AdvancedAuctionOperationError&gt;**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. |  [optional]


<a id="Operation"></a>
## Enum: operation
Name | Value
---- | -----
operation | DELETE



