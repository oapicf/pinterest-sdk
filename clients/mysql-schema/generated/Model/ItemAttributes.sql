--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemAttributes' definition.
--


--
-- SELECT template for table `ItemAttributes`
--
SELECT `ad_link`, `additional_image_link`, `adult`, `age_group`, `availability`, `average_review_rating`, `brand`, `color`, `condition`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `free_shipping_label`, `free_shipping_limit`, `gender`, `google_product_category`, `gtin`, `id`, `image_link`, `item_group_id`, `last_updated_time`, `link`, `material`, `min_ad_price`, `mobile_link`, `mpn`, `number_of_ratings`, `number_of_reviews`, `pattern`, `price`, `product_type`, `sale_price`, `shipping`, `shipping_height`, `shipping_weight`, `shipping_width`, `size`, `size_system`, `size_type`, `tax`, `title` FROM `ItemAttributes` WHERE 1;

--
-- INSERT template for table `ItemAttributes`
--
INSERT INTO `ItemAttributes`(`ad_link`, `additional_image_link`, `adult`, `age_group`, `availability`, `average_review_rating`, `brand`, `color`, `condition`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `free_shipping_label`, `free_shipping_limit`, `gender`, `google_product_category`, `gtin`, `id`, `image_link`, `item_group_id`, `last_updated_time`, `link`, `material`, `min_ad_price`, `mobile_link`, `mpn`, `number_of_ratings`, `number_of_reviews`, `pattern`, `price`, `product_type`, `sale_price`, `shipping`, `shipping_height`, `shipping_weight`, `shipping_width`, `size`, `size_system`, `size_type`, `tax`, `title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemAttributes`
--
UPDATE `ItemAttributes` SET `ad_link` = ?, `additional_image_link` = ?, `adult` = ?, `age_group` = ?, `availability` = ?, `average_review_rating` = ?, `brand` = ?, `color` = ?, `condition` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `description` = ?, `free_shipping_label` = ?, `free_shipping_limit` = ?, `gender` = ?, `google_product_category` = ?, `gtin` = ?, `id` = ?, `image_link` = ?, `item_group_id` = ?, `last_updated_time` = ?, `link` = ?, `material` = ?, `min_ad_price` = ?, `mobile_link` = ?, `mpn` = ?, `number_of_ratings` = ?, `number_of_reviews` = ?, `pattern` = ?, `price` = ?, `product_type` = ?, `sale_price` = ?, `shipping` = ?, `shipping_height` = ?, `shipping_weight` = ?, `shipping_width` = ?, `size` = ?, `size_system` = ?, `size_type` = ?, `tax` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `ItemAttributes`
--
DELETE FROM `ItemAttributes` WHERE 0;

