
# Table `CatalogsRetailBatchRequest_items_inner`
(mapped from: CatalogsRetailBatchRequestItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The catalog item id in the merchant namespace | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**attributes** | attributes | long NOT NULL |  | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  |  [foreignkey]
**updateMask** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional]





# **Table `CatalogsRetailBatchRequestItemsInnerUpdateMaskFieldType`**
(mapped from: CatalogsRetailBatchRequestItemsInnerUpdateMaskFieldType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailBatchRequestItemsInner | catalogsRetailBatchRequestItemsInner | long | | kotlin.Long | Primary Key | *one*
updateMaskFieldType | updateMaskFieldType | long | | kotlin.Long | Foreign Key | *many*



