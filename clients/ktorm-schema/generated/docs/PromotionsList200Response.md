
# Table `promotions_list_200_response`
(mapped from: PromotionsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Promotion&gt;**](Promotion.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `PromotionsList200ResponsePromotion`**
(mapped from: PromotionsList200ResponsePromotion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
promotionsList200Response | promotionsList200Response | long | | kotlin.Long | Primary Key | *one*
promotion | promotion | long | | kotlin.Long | Foreign Key | *many*




