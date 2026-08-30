
# Table `ProductTagsBulkDeleteRequest`
(mapped from: ProductTagsBulkDeleteRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**productTags** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductTagItem&gt;**](ProductTagItem.md) | List of product tags to delete. | 


# **Table `ProductTagsBulkDeleteRequestProductTagItem`**
(mapped from: ProductTagsBulkDeleteRequestProductTagItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productTagsBulkDeleteRequest | productTagsBulkDeleteRequest | long | | kotlin.Long | Primary Key | *one*
productTagItem | productTagItem | long | | kotlin.Long | Foreign Key | *many*



