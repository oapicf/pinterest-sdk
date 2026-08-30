

# CatalogsRetailBatchRequestItemsItems

The class is defined in **[CatalogsRetailBatchRequestItemsItems.java](../../src/main/java/org/openapitools/model/CatalogsRetailBatchRequestItemsItems.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [`ItemAttributesRequest`](ItemAttributesRequest.md) |  | 
**itemId** | `String` | The catalog item id in the merchant namespace | 
**operation** | [**OperationEnum**](#OperationEnum) |  | 
**updateMask** | `List&lt;UpdateMaskFieldType&gt;` | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional property]
**lastUpdatedTime** | `Long` | The millisecond timestamp when the item was lastly modified by the merchant. |  [optional property]



## OperationEnum

Name | Value
---- | -----
DELETE | `"DELETE"`




