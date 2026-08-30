package org.openapitools.server.model


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 *
 * @param adGroupId ID of the ad group the product group promotion belongs to. for example: ''2680059592705''
 * @param productGroupPromotion List of product group promotions to create or update. for example: ''[{"slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName to create","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE","is_mdl":true},{"id":"2680059592705","catalog_product_group_id":"1234123","slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName to update","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE"}]''
*/
final case class ProductGroupPromotionsUpdateWithRequiredBody (
  adGroupId: String,
  productGroupPromotion: Seq[ProductGroupPromotion]
)

