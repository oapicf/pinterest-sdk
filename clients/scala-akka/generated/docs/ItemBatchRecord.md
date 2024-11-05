

# ItemBatchRecord

Object describing an item batch record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | The catalog item id in the merchant namespace |  [optional]
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  |  [optional]
**updateMask** | **Seq&lt;UpdateMaskFieldType&gt;** | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional]



