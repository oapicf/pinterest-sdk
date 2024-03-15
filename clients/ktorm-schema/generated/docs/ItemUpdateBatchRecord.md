
# Table `ItemUpdateBatchRecord`
(mapped from: ItemUpdateBatchRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemId** | item_id | text |  | **kotlin.String** | The catalog item id in the merchant namespace |  [optional]
**attributes** | attributes | long |  | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  |  [optional] [foreignkey]
**updateMask** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional]




# **Table `ItemUpdateBatchRecordUpdateMaskFieldType`**
(mapped from: ItemUpdateBatchRecordUpdateMaskFieldType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemUpdateBatchRecord | itemUpdateBatchRecord | long | | kotlin.Long | Primary Key | *one*
updateMaskFieldType | updateMaskFieldType | long | | kotlin.Long | Foreign Key | *many*



