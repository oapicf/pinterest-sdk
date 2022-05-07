--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedValidationErrors' definition.
--


--
-- SELECT template for table `CatalogsFeedValidationErrors`
--
SELECT `fetch_error`, `fetch_inactive_feed_error`, `encoding_error`, `delimiter_error`, `required_columns_missing`, `image_link_invalid`, `itemid_missing`, `title_missing`, `description_missing`, `product_category_invalid`, `product_link_missing`, `image_link_missing`, `availability_invalid`, `product_price_invalid`, `link_format_invalid`, `parse_line_error`, `adwords_format_invalid`, `product_category_missing`, `internal_service_error`, `no_verified_domain`, `adult_invalid`, `invalid_domain`, `feed_length_too_long`, `link_length_too_long`, `malformed_xml`, `redirect_invalid`, `price_missing`, `feed_too_small`, `condition_invalid`, `shopify_no_products`, `max_items_per_item_group_exceeded`, `item_main_image_download_failure`, `pinjoin_content_unsafe`, `blocklisted_image_signature` FROM `CatalogsFeedValidationErrors` WHERE 1;

--
-- INSERT template for table `CatalogsFeedValidationErrors`
--
INSERT INTO `CatalogsFeedValidationErrors`(`fetch_error`, `fetch_inactive_feed_error`, `encoding_error`, `delimiter_error`, `required_columns_missing`, `image_link_invalid`, `itemid_missing`, `title_missing`, `description_missing`, `product_category_invalid`, `product_link_missing`, `image_link_missing`, `availability_invalid`, `product_price_invalid`, `link_format_invalid`, `parse_line_error`, `adwords_format_invalid`, `product_category_missing`, `internal_service_error`, `no_verified_domain`, `adult_invalid`, `invalid_domain`, `feed_length_too_long`, `link_length_too_long`, `malformed_xml`, `redirect_invalid`, `price_missing`, `feed_too_small`, `condition_invalid`, `shopify_no_products`, `max_items_per_item_group_exceeded`, `item_main_image_download_failure`, `pinjoin_content_unsafe`, `blocklisted_image_signature`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedValidationErrors`
--
UPDATE `CatalogsFeedValidationErrors` SET `fetch_error` = ?, `fetch_inactive_feed_error` = ?, `encoding_error` = ?, `delimiter_error` = ?, `required_columns_missing` = ?, `image_link_invalid` = ?, `itemid_missing` = ?, `title_missing` = ?, `description_missing` = ?, `product_category_invalid` = ?, `product_link_missing` = ?, `image_link_missing` = ?, `availability_invalid` = ?, `product_price_invalid` = ?, `link_format_invalid` = ?, `parse_line_error` = ?, `adwords_format_invalid` = ?, `product_category_missing` = ?, `internal_service_error` = ?, `no_verified_domain` = ?, `adult_invalid` = ?, `invalid_domain` = ?, `feed_length_too_long` = ?, `link_length_too_long` = ?, `malformed_xml` = ?, `redirect_invalid` = ?, `price_missing` = ?, `feed_too_small` = ?, `condition_invalid` = ?, `shopify_no_products` = ?, `max_items_per_item_group_exceeded` = ?, `item_main_image_download_failure` = ?, `pinjoin_content_unsafe` = ?, `blocklisted_image_signature` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedValidationErrors`
--
DELETE FROM `CatalogsFeedValidationErrors` WHERE 0;

