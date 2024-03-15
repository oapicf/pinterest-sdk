# PinterestSdk.CatalogsRetailBatchRequestItemsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | The catalog item id in the merchant namespace | 
**operation** | **String** |  | 
**attributes** | [**ItemAttributes**](ItemAttributes.md) |  | 
**updateMask** | [**[UpdateMaskFieldType]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 



## Enum: OperationEnum


* `CREATE` (value: `"CREATE"`)

* `UPDATE` (value: `"UPDATE"`)

* `UPSERT` (value: `"UPSERT"`)

* `DELETE` (value: `"DELETE"`)




