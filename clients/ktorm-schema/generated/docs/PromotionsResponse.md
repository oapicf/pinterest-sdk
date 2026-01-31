
# Table `PromotionsResponse`
(mapped from: PromotionsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**promotions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PromotionArrayElement&gt;**](PromotionArrayElement.md) |  |  [optional]


# **Table `PromotionsResponsePromotionArrayElement`**
(mapped from: PromotionsResponsePromotionArrayElement)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
promotionsResponse | promotionsResponse | long | | kotlin.Long | Primary Key | *one*
promotionArrayElement | promotionArrayElement | long | | kotlin.Long | Foreign Key | *many*



