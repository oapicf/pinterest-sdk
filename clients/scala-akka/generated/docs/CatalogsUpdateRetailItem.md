

# CatalogsUpdateRetailItem

An item to be updated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | The catalog item id in the merchant namespace | 
**operation** | [**Operation**](#Operation) |  | 
**attributes** | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  | 
**updateMask** | **Seq&lt;UpdateMaskFieldType&gt;** | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional]


## Enum: Operation
Allowed values: [CREATE, UPDATE, UPSERT, DELETE]




