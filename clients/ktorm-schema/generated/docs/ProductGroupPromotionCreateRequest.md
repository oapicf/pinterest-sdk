
# Table `ProductGroupPromotionCreateRequest`
(mapped from: ProductGroupPromotionCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroupId** | ad_group_id | text NOT NULL |  | **kotlin.String** | ID of the Ad Group the Product Group Promotion belongs to. | 
**productGroupPromotion** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotionCreateRequestElement&gt;**](ProductGroupPromotionCreateRequestElement.md) |  | 



# **Table `ProductGroupPromotionCreateRequestProductGroupPromotionCreateRequestElement`**
(mapped from: ProductGroupPromotionCreateRequestProductGroupPromotionCreateRequestElement)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productGroupPromotionCreateRequest | productGroupPromotionCreateRequest | long | | kotlin.Long | Primary Key | *one*
productGroupPromotionCreateRequestElement | productGroupPromotionCreateRequestElement | long | | kotlin.Long | Foreign Key | *many*



