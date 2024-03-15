
# Table `CatalogsItems`
(mapped from: CatalogsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemResponse&gt;**](ItemResponse.md) | Array with catalogs items |  [optional]


# **Table `CatalogsItemsItemResponse`**
(mapped from: CatalogsItemsItemResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsItems | catalogsItems | long | | kotlin.Long | Primary Key | *one*
itemResponse | itemResponse | long | | kotlin.Long | Foreign Key | *many*



