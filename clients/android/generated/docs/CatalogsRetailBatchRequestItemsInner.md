

# CatalogsRetailBatchRequestItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | The catalog item id in the merchant namespace | 
**operation** | [**OperationEnum**](#OperationEnum) |  | 
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**updateMask** | [**List&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional]


## Enum: OperationEnum

Name | Value
---- | -----




