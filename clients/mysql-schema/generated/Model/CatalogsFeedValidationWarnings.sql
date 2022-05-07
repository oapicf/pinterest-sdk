--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedValidationWarnings' definition.
--


--
-- SELECT template for table `CatalogsFeedValidationWarnings`
--
SELECT `title_length_too_long`, `description_length_too_long`, `gender_invalid`, `age_group_invalid`, `size_type_invalid`, `link_format_warning`, `duplicate_products`, `duplicate_links`, `sales_price_invalid`, `product_category_depth_warning`, `adwords_same_as_link`, `duplicate_headers`, `fetch_same_signature`, `adwords_format_warning`, `additional_image_link_warning`, `image_link_warning`, `shipping_invalid`, `tax_invalid`, `shipping_weight_invalid`, `expiration_date_invalid`, `availability_date_invalid`, `sale_date_invalid`, `weight_unit_invalid`, `is_bundle_invalid`, `updated_time_invalid`, `custom_label_length_too_long`, `product_type_length_too_long`, `too_many_additional_image_links`, `multipack_invalid`, `indexed_product_count_large_delta`, `item_additional_image_download_failure`, `optional_product_category_missing`, `optional_product_category_invalid`, `optional_condition_missing`, `optional_condition_invalid`, `ios_deep_link_invalid`, `android_deep_link_invalid`, `availability_normalized`, `condition_normalized`, `gender_normalized`, `size_type_normalized`, `age_group_normalized`, `utm_source_auto_corrected`, `country_does_not_map_to_currency`, `min_ad_price_invalid` FROM `CatalogsFeedValidationWarnings` WHERE 1;

--
-- INSERT template for table `CatalogsFeedValidationWarnings`
--
INSERT INTO `CatalogsFeedValidationWarnings`(`title_length_too_long`, `description_length_too_long`, `gender_invalid`, `age_group_invalid`, `size_type_invalid`, `link_format_warning`, `duplicate_products`, `duplicate_links`, `sales_price_invalid`, `product_category_depth_warning`, `adwords_same_as_link`, `duplicate_headers`, `fetch_same_signature`, `adwords_format_warning`, `additional_image_link_warning`, `image_link_warning`, `shipping_invalid`, `tax_invalid`, `shipping_weight_invalid`, `expiration_date_invalid`, `availability_date_invalid`, `sale_date_invalid`, `weight_unit_invalid`, `is_bundle_invalid`, `updated_time_invalid`, `custom_label_length_too_long`, `product_type_length_too_long`, `too_many_additional_image_links`, `multipack_invalid`, `indexed_product_count_large_delta`, `item_additional_image_download_failure`, `optional_product_category_missing`, `optional_product_category_invalid`, `optional_condition_missing`, `optional_condition_invalid`, `ios_deep_link_invalid`, `android_deep_link_invalid`, `availability_normalized`, `condition_normalized`, `gender_normalized`, `size_type_normalized`, `age_group_normalized`, `utm_source_auto_corrected`, `country_does_not_map_to_currency`, `min_ad_price_invalid`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedValidationWarnings`
--
UPDATE `CatalogsFeedValidationWarnings` SET `title_length_too_long` = ?, `description_length_too_long` = ?, `gender_invalid` = ?, `age_group_invalid` = ?, `size_type_invalid` = ?, `link_format_warning` = ?, `duplicate_products` = ?, `duplicate_links` = ?, `sales_price_invalid` = ?, `product_category_depth_warning` = ?, `adwords_same_as_link` = ?, `duplicate_headers` = ?, `fetch_same_signature` = ?, `adwords_format_warning` = ?, `additional_image_link_warning` = ?, `image_link_warning` = ?, `shipping_invalid` = ?, `tax_invalid` = ?, `shipping_weight_invalid` = ?, `expiration_date_invalid` = ?, `availability_date_invalid` = ?, `sale_date_invalid` = ?, `weight_unit_invalid` = ?, `is_bundle_invalid` = ?, `updated_time_invalid` = ?, `custom_label_length_too_long` = ?, `product_type_length_too_long` = ?, `too_many_additional_image_links` = ?, `multipack_invalid` = ?, `indexed_product_count_large_delta` = ?, `item_additional_image_download_failure` = ?, `optional_product_category_missing` = ?, `optional_product_category_invalid` = ?, `optional_condition_missing` = ?, `optional_condition_invalid` = ?, `ios_deep_link_invalid` = ?, `android_deep_link_invalid` = ?, `availability_normalized` = ?, `condition_normalized` = ?, `gender_normalized` = ?, `size_type_normalized` = ?, `age_group_normalized` = ?, `utm_source_auto_corrected` = ?, `country_does_not_map_to_currency` = ?, `min_ad_price_invalid` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedValidationWarnings`
--
DELETE FROM `CatalogsFeedValidationWarnings` WHERE 0;

