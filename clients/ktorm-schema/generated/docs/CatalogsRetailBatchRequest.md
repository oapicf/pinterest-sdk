
# Table `CatalogsRetailBatchRequest`
(mapped from: CatalogsRetailBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | long NOT NULL |  | [**Language**](Language.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsRetailBatchRequestItemsInner&gt;**](CatalogsRetailBatchRequestItemsInner.md) | Array with catalogs item operations | 





# **Table `CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsInner`**
(mapped from: CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailBatchRequest | catalogsRetailBatchRequest | long | | kotlin.Long | Primary Key | *one*
catalogsRetailBatchRequestItemsInner | catalogsRetailBatchRequestItemsInner | long | | kotlin.Long | Foreign Key | *many*



