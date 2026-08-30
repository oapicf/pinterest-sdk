--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedValidationErrors' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_validation_errors'
--
SELECT adult_invalid, adwords_format_invalid, availability_invalid, blocklisted_image_signature, delimiter_error, description_missing, duplicate_products, encoding_error, feed_length_too_long, feed_too_small, fetch_error, fetch_inactive_feed_error, image_link_invalid, image_link_length_too_long, image_link_missing, internal_service_error, invalid_domain, item_main_image_download_failure, itemid_missing, link_format_invalid, link_length_too_long, list_price_invalid, malformed_xml, max_items_per_item_group_exceeded, no_verified_domain, parse_line_error, pinjoin_content_unsafe, price_cannot_be_determined, price_missing, product_link_missing, product_price_invalid, required_columns_missing, title_missing FROM catalogs_feed_validation_errors WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_validation_errors'
--
INSERT INTO catalogs_feed_validation_errors (adult_invalid, adwords_format_invalid, availability_invalid, blocklisted_image_signature, delimiter_error, description_missing, duplicate_products, encoding_error, feed_length_too_long, feed_too_small, fetch_error, fetch_inactive_feed_error, image_link_invalid, image_link_length_too_long, image_link_missing, internal_service_error, invalid_domain, item_main_image_download_failure, itemid_missing, link_format_invalid, link_length_too_long, list_price_invalid, malformed_xml, max_items_per_item_group_exceeded, no_verified_domain, parse_line_error, pinjoin_content_unsafe, price_cannot_be_determined, price_missing, product_link_missing, product_price_invalid, required_columns_missing, title_missing) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_feed_validation_errors'
--
UPDATE catalogs_feed_validation_errors SET adult_invalid = ?, adwords_format_invalid = ?, availability_invalid = ?, blocklisted_image_signature = ?, delimiter_error = ?, description_missing = ?, duplicate_products = ?, encoding_error = ?, feed_length_too_long = ?, feed_too_small = ?, fetch_error = ?, fetch_inactive_feed_error = ?, image_link_invalid = ?, image_link_length_too_long = ?, image_link_missing = ?, internal_service_error = ?, invalid_domain = ?, item_main_image_download_failure = ?, itemid_missing = ?, link_format_invalid = ?, link_length_too_long = ?, list_price_invalid = ?, malformed_xml = ?, max_items_per_item_group_exceeded = ?, no_verified_domain = ?, parse_line_error = ?, pinjoin_content_unsafe = ?, price_cannot_be_determined = ?, price_missing = ?, product_link_missing = ?, product_price_invalid = ?, required_columns_missing = ?, title_missing = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_validation_errors'
--
DELETE FROM catalogs_feed_validation_errors WHERE 1=2;

