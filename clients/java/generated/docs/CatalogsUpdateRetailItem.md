

# CatalogsUpdateRetailItem

An item to be updated

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemId** | **String** | The catalog item id in the merchant namespace |  |
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**attributes** | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  |  |
|**updateMask** | **List&lt;UpdateMaskFieldType&gt;** | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| UPSERT | &quot;UPSERT&quot; |
| DELETE | &quot;DELETE&quot; |



