
# Table `ProductGroupPromotions`
(mapped from: ProductGroupPromotions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotionResponseItem&gt;**](ProductGroupPromotionResponseItem.md) | Response-only: created or updated product group promotions, or exceptions. |  [optional] [readonly]


# **Table `ProductGroupPromotionsProductGroupPromotionResponseItem`**
(mapped from: ProductGroupPromotionsProductGroupPromotionResponseItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productGroupPromotions | productGroupPromotions | long | | kotlin.Long | Primary Key | *one*
productGroupPromotionResponseItem | productGroupPromotionResponseItem | long | | kotlin.Long | Foreign Key | *many*



