
# Table `ProductGroupPromotionResponse`
(mapped from: ProductGroupPromotionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotionResponseItem&gt;**](ProductGroupPromotionResponseItem.md) |  |  [optional]


# **Table `ProductGroupPromotionResponseProductGroupPromotionResponseItem`**
(mapped from: ProductGroupPromotionResponseProductGroupPromotionResponseItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productGroupPromotionResponse | productGroupPromotionResponse | long | | kotlin.Long | Primary Key | *one*
productGroupPromotionResponseItem | productGroupPromotionResponseItem | long | | kotlin.Long | Foreign Key | *many*



