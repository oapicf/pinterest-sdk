

# ItemBatchRecord

Object describing an item batch record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  |  [optional] |
|**itemId** | **String** | The catalog item id in the merchant namespace |  [optional] |
|**updateMask** | **List&lt;UpdateMaskFieldType&gt;** | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional] |



