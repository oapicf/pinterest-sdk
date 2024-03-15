
# Table `ProductGroupPromotionUpdateRequest`
(mapped from: ProductGroupPromotionUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroupId** | ad_group_id | text NOT NULL |  | **kotlin.String** | ID of the ad group the product group belongs to. | 
**productGroupPromotion** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotion&gt;**](ProductGroupPromotion.md) |  | 



# **Table `ProductGroupPromotionUpdateRequestProductGroupPromotion`**
(mapped from: ProductGroupPromotionUpdateRequestProductGroupPromotion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productGroupPromotionUpdateRequest | productGroupPromotionUpdateRequest | long | | kotlin.Long | Primary Key | *one*
productGroupPromotion | productGroupPromotion | long | | kotlin.Long | Foreign Key | *many*



