

# CatalogsRetailBatchRequestItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | The catalog item id in the merchant namespace | 
**operation** | [**Operation**](#Operation) |  | 
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**updateMask** | **Seq&lt;UpdateMaskFieldType&gt;** | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional]


## Enum: Operation
Allowed values: [DELETE]




