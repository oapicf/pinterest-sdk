
# Table `ProductTagsBulkAddRequest`
(mapped from: ProductTagsBulkAddRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**productTags** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductTagItem&gt;**](ProductTagItem.md) | List of product tags to add. Maximum 24 items allowed. | 


# **Table `ProductTagsBulkAddRequestProductTagItem`**
(mapped from: ProductTagsBulkAddRequestProductTagItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productTagsBulkAddRequest | productTagsBulkAddRequest | long | | kotlin.Long | Primary Key | *one*
productTagItem | productTagItem | long | | kotlin.Long | Foreign Key | *many*



