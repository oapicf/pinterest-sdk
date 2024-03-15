--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdatableItemAttributes' definition.
--


--
-- SELECT template for table `UpdatableItemAttributes`
--
SELECT `ad_link`, `adult`, `age_group`, `availability`, `average_review_rating`, `brand`, `checkout_enabled`, `color`, `condition`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `free_shipping_label`, `free_shipping_limit`, `gender`, `google_product_category`, `gtin`, `id`, `item_group_id`, `last_updated_time`, `link`, `material`, `min_ad_price`, `mobile_link`, `mpn`, `number_of_ratings`, `number_of_reviews`, `pattern`, `price`, `product_type`, `sale_price`, `shipping`, `shipping_height`, `shipping_weight`, `shipping_width`, `size`, `size_system`, `size_type`, `tax`, `title`, `variant_names`, `variant_values` FROM `UpdatableItemAttributes` WHERE 1;

--
-- INSERT template for table `UpdatableItemAttributes`
--
INSERT INTO `UpdatableItemAttributes`(`ad_link`, `adult`, `age_group`, `availability`, `average_review_rating`, `brand`, `checkout_enabled`, `color`, `condition`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `free_shipping_label`, `free_shipping_limit`, `gender`, `google_product_category`, `gtin`, `id`, `item_group_id`, `last_updated_time`, `link`, `material`, `min_ad_price`, `mobile_link`, `mpn`, `number_of_ratings`, `number_of_reviews`, `pattern`, `price`, `product_type`, `sale_price`, `shipping`, `shipping_height`, `shipping_weight`, `shipping_width`, `size`, `size_system`, `size_type`, `tax`, `title`, `variant_names`, `variant_values`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `UpdatableItemAttributes`
--
UPDATE `UpdatableItemAttributes` SET `ad_link` = ?, `adult` = ?, `age_group` = ?, `availability` = ?, `average_review_rating` = ?, `brand` = ?, `checkout_enabled` = ?, `color` = ?, `condition` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `description` = ?, `free_shipping_label` = ?, `free_shipping_limit` = ?, `gender` = ?, `google_product_category` = ?, `gtin` = ?, `id` = ?, `item_group_id` = ?, `last_updated_time` = ?, `link` = ?, `material` = ?, `min_ad_price` = ?, `mobile_link` = ?, `mpn` = ?, `number_of_ratings` = ?, `number_of_reviews` = ?, `pattern` = ?, `price` = ?, `product_type` = ?, `sale_price` = ?, `shipping` = ?, `shipping_height` = ?, `shipping_weight` = ?, `shipping_width` = ?, `size` = ?, `size_system` = ?, `size_type` = ?, `tax` = ?, `title` = ?, `variant_names` = ?, `variant_values` = ? WHERE 1;

--
-- DELETE template for table `UpdatableItemAttributes`
--
DELETE FROM `UpdatableItemAttributes` WHERE 0;

