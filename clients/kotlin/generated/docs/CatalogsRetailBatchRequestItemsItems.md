
# CatalogsRetailBatchRequestItemsItems

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  |  |
| **itemId** | **kotlin.String** | The catalog item id in the merchant namespace |  |
| **operation** | [**inline**](#Operation) |  |  |
| **updateMask** | [**kotlin.collections.List&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional] |
| **lastUpdatedTime** | **kotlin.Long** | The millisecond timestamp when the item was lastly modified by the merchant. |  [optional] |


<a id="Operation"></a>
## Enum: operation
| Name | Value |
| ---- | ----- |
| operation | DELETE |



