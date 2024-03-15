

# CatalogsUpdateRetailItem

An item to be updated

The class is defined in **[CatalogsUpdateRetailItem.java](../../src/main/java/org/openapitools/model/CatalogsUpdateRetailItem.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | `String` | The catalog item id in the merchant namespace | 
**operation** | [**OperationEnum**](#OperationEnum) |  | 
**attributes** | [`UpdatableItemAttributes`](UpdatableItemAttributes.md) |  | 
**updateMask** | `List&lt;UpdateMaskFieldType&gt;` | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional property]


## OperationEnum

Name | Value
---- | -----
CREATE | `"CREATE"`
UPDATE | `"UPDATE"`
UPSERT | `"UPSERT"`
DELETE | `"DELETE"`




