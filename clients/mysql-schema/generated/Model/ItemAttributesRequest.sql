--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemAttributesRequest' definition.
--


--
-- SELECT template for table `ItemAttributesRequest`
--
SELECT `ad_link`, `adult`, `age_group`, `availability`, `average_review_rating`, `brand`, `checkout_enabled`, `color`, `condition`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `free_shipping_label`, `free_shipping_limit`, `gender`, `google_product_category`, `gtin`, `id`, `item_group_id`, `last_updated_time`, `link`, `material`, `min_ad_price`, `mobile_link`, `mpn`, `number_of_ratings`, `number_of_reviews`, `pattern`, `price`, `product_type`, `sale_price`, `shipping`, `shipping_height`, `shipping_weight`, `shipping_width`, `size`, `size_system`, `size_type`, `tax`, `title`, `variant_names`, `variant_values`, `additional_image_link`, `image_link`, `video_link` FROM `ItemAttributesRequest` WHERE 1;

--
-- INSERT template for table `ItemAttributesRequest`
--
INSERT INTO `ItemAttributesRequest`(`ad_link`, `adult`, `age_group`, `availability`, `average_review_rating`, `brand`, `checkout_enabled`, `color`, `condition`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `free_shipping_label`, `free_shipping_limit`, `gender`, `google_product_category`, `gtin`, `id`, `item_group_id`, `last_updated_time`, `link`, `material`, `min_ad_price`, `mobile_link`, `mpn`, `number_of_ratings`, `number_of_reviews`, `pattern`, `price`, `product_type`, `sale_price`, `shipping`, `shipping_height`, `shipping_weight`, `shipping_width`, `size`, `size_system`, `size_type`, `tax`, `title`, `variant_names`, `variant_values`, `additional_image_link`, `image_link`, `video_link`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemAttributesRequest`
--
UPDATE `ItemAttributesRequest` SET `ad_link` = ?, `adult` = ?, `age_group` = ?, `availability` = ?, `average_review_rating` = ?, `brand` = ?, `checkout_enabled` = ?, `color` = ?, `condition` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `description` = ?, `free_shipping_label` = ?, `free_shipping_limit` = ?, `gender` = ?, `google_product_category` = ?, `gtin` = ?, `id` = ?, `item_group_id` = ?, `last_updated_time` = ?, `link` = ?, `material` = ?, `min_ad_price` = ?, `mobile_link` = ?, `mpn` = ?, `number_of_ratings` = ?, `number_of_reviews` = ?, `pattern` = ?, `price` = ?, `product_type` = ?, `sale_price` = ?, `shipping` = ?, `shipping_height` = ?, `shipping_weight` = ?, `shipping_width` = ?, `size` = ?, `size_system` = ?, `size_type` = ?, `tax` = ?, `title` = ?, `variant_names` = ?, `variant_values` = ?, `additional_image_link` = ?, `image_link` = ?, `video_link` = ? WHERE 1;

--
-- DELETE template for table `ItemAttributesRequest`
--
DELETE FROM `ItemAttributesRequest` WHERE 0;

