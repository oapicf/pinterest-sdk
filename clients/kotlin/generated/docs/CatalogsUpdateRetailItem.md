
# CatalogsUpdateRetailItem

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **itemId** | **kotlin.String** | The catalog item id in the merchant namespace |  |
| **operation** | [**inline**](#Operation) |  |  |
| **attributes** | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  |  |
| **updateMask** | [**kotlin.collections.List&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional] |


<a id="Operation"></a>
## Enum: operation
| Name | Value |
| ---- | ----- |
| operation | UPDATE |



