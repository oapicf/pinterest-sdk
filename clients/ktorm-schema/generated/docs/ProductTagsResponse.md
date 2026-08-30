
# Table `ProductTagsResponse`
(mapped from: ProductTagsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**productTags** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductTagItem&gt;**](ProductTagItem.md) | List of product tags on the pin. | 


# **Table `ProductTagsResponseProductTagItem`**
(mapped from: ProductTagsResponseProductTagItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productTagsResponse | productTagsResponse | long | | kotlin.Long | Primary Key | *one*
productTagItem | productTagItem | long | | kotlin.Long | Foreign Key | *many*



