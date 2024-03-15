package org.openapitools.server.model


/**
 * Object describing an item batch record
 *
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param attributes  for example: ''null''
 * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. for example: ''[ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values]''
*/
final case class ItemBatchRecord (
  itemId: Option[String] = None,
  attributes: Option[ItemAttributes] = None,
  updateMask: Option[Seq[UpdateMaskFieldType]] = None
)

