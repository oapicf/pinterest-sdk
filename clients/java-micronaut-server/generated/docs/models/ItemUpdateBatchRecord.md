

# ItemUpdateBatchRecord

Object describing an item batch record to update items

The class is defined in **[ItemUpdateBatchRecord.java](../../src/main/java/org/openapitools/model/ItemUpdateBatchRecord.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | `String` | The catalog item id in the merchant namespace |  [optional property]
**attributes** | [`UpdatableItemAttributes`](UpdatableItemAttributes.md) |  |  [optional property]
**updateMask** | `List&lt;UpdateMaskFieldType&gt;` | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional property]





