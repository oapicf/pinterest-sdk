
# Table `CatalogsRetailBatchRequestItemsItems`
(mapped from: CatalogsRetailBatchRequestItemsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**attributes** | attributes | long NOT NULL |  | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  |  [foreignkey]
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The catalog item id in the merchant namespace | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**updateMask** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional]
**lastUpdatedTime** | last_updated_time | long |  | **kotlin.Long** | The millisecond timestamp when the item was lastly modified by the merchant. |  [optional]





# **Table `CatalogsRetailBatchRequestItemsItemsUpdateMaskFieldType`**
(mapped from: CatalogsRetailBatchRequestItemsItemsUpdateMaskFieldType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailBatchRequestItemsItems | catalogsRetailBatchRequestItemsItems | long | | kotlin.Long | Primary Key | *one*
updateMaskFieldType | updateMaskFieldType | long | | kotlin.Long | Foreign Key | *many*




