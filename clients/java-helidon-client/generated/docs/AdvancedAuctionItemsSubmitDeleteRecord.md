

# AdvancedAuctionItemsSubmitDeleteRecord

Object describing an item bid option deletion operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**country** | **Country** |  |  |
|**errors** | [**List&lt;AdvancedAuctionOperationError&gt;**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. |  [optional] |
|**itemId** | **String** | The catalog retail item id in the merchant namespace |  |
|**language** | **Language** |  |  |
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| DELETE | &quot;DELETE&quot; |



