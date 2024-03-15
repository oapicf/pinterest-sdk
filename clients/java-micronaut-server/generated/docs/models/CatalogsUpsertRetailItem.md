

# CatalogsUpsertRetailItem

An item to be upserted

The class is defined in **[CatalogsUpsertRetailItem.java](../../src/main/java/org/openapitools/model/CatalogsUpsertRetailItem.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | `String` | The catalog item id in the merchant namespace | 
**operation** | [**OperationEnum**](#OperationEnum) |  | 
**attributes** | [`ItemAttributes`](ItemAttributes.md) |  | 


## OperationEnum

Name | Value
---- | -----
CREATE | `"CREATE"`
UPDATE | `"UPDATE"`
UPSERT | `"UPSERT"`
DELETE | `"DELETE"`



