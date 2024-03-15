
# Table `CatalogsUpdateRetailItem`
(mapped from: CatalogsUpdateRetailItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The catalog item id in the merchant namespace | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**attributes** | attributes | long NOT NULL |  | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  |  [foreignkey]
**updateMask** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. |  [optional]





# **Table `CatalogsUpdateRetailItemUpdateMaskFieldType`**
(mapped from: CatalogsUpdateRetailItemUpdateMaskFieldType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsUpdateRetailItem | catalogsUpdateRetailItem | long | | kotlin.Long | Primary Key | *one*
updateMaskFieldType | updateMaskFieldType | long | | kotlin.Long | Foreign Key | *many*



