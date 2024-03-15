
# Table `product_group_promotions_list_200_response`
(mapped from: ProductGroupPromotionsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotionResponseItem&gt;**](ProductGroupPromotionResponseItem.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `ProductGroupPromotionsList200ResponseProductGroupPromotionResponseItem`**
(mapped from: ProductGroupPromotionsList200ResponseProductGroupPromotionResponseItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productGroupPromotionsList200Response | productGroupPromotionsList200Response | long | | kotlin.Long | Primary Key | *one*
productGroupPromotionResponseItem | productGroupPromotionResponseItem | long | | kotlin.Long | Foreign Key | *many*




