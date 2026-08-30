
# Table `ProductGroupPromotionsCreate`
(mapped from: ProductGroupPromotionsCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroupId** | ad_group_id | text NOT NULL |  | **kotlin.String** | ID of the ad group the product group promotion belongs to. | 
**productGroupPromotion** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotion&gt;**](ProductGroupPromotion.md) | List of product group promotions to create or update. | 



# **Table `ProductGroupPromotionsCreateProductGroupPromotion`**
(mapped from: ProductGroupPromotionsCreateProductGroupPromotion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
productGroupPromotionsCreate | productGroupPromotionsCreate | long | | kotlin.Long | Primary Key | *one*
productGroupPromotion | productGroupPromotion | long | | kotlin.Long | Foreign Key | *many*



