
# Table `CatalogsRetailItemResponse`
(mapped from: CatalogsRetailItemResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**itemId** | item_id | text |  | **kotlin.String** | The catalog retail item id in the merchant namespace |  [optional]
**pins** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]
**attributes** | attributes | long |  | [**ItemAttributes**](ItemAttributes.md) |  |  [optional] [foreignkey]




# **Table `CatalogsRetailItemResponsePin`**
(mapped from: CatalogsRetailItemResponsePin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailItemResponse | catalogsRetailItemResponse | long | | kotlin.Long | Primary Key | *one*
pin | pin | long | | kotlin.Long | Foreign Key | *many*




