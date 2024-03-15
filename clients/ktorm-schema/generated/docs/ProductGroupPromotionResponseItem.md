
# Table `ProductGroupPromotionResponseItem`
(mapped from: ProductGroupPromotionResponseItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**ProductGroupPromotion**](ProductGroupPromotion.md) |  |  [optional] [foreignkey]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Exception&gt;**](Exception.md) |  |  [optional]



# **Table `ProductGroupPromotionResponseItemException`**
(mapped from: ProductGroupPromotionResponseItemException)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productGroupPromotionResponseItem | productGroupPromotionResponseItem | long | | kotlin.Long | Primary Key | *one*
exception | exception | long | | kotlin.Long | Foreign Key | *many*



