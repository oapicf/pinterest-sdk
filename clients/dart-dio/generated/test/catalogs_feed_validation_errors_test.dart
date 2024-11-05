import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsFeedValidationErrors
void main() {
  final instance = CatalogsFeedValidationErrorsBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsFeedValidationErrors, () {
    // Pinterest couldn't download your feed.
    // int FETCH_ERROR
    test('to test the property `FETCH_ERROR`', () async {
      // TODO
    });

    // Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
    // int FETCH_INACTIVE_FEED_ERROR
    test('to test the property `FETCH_INACTIVE_FEED_ERROR`', () async {
      // TODO
    });

    // Your feed includes data with an unsupported encoding format.
    // int ENCODING_ERROR
    test('to test the property `ENCODING_ERROR`', () async {
      // TODO
    });

    // Your feed includes data with formatting errors.
    // int DELIMITER_ERROR
    test('to test the property `DELIMITER_ERROR`', () async {
      // TODO
    });

    // Your feed is missing some required column headers.
    // int REQUIRED_COLUMNS_MISSING
    test('to test the property `REQUIRED_COLUMNS_MISSING`', () async {
      // TODO
    });

    // Some products are duplicated.
    // int DUPLICATE_PRODUCTS
    test('to test the property `DUPLICATE_PRODUCTS`', () async {
      // TODO
    });

    // Some image links are formatted incorrectly.
    // int IMAGE_LINK_INVALID
    test('to test the property `IMAGE_LINK_INVALID`', () async {
      // TODO
    });

    // Some items are missing an item id in their product metadata, those items will not be published.
    // int ITEMID_MISSING
    test('to test the property `ITEMID_MISSING`', () async {
      // TODO
    });

    // Some items are missing a title in their product metadata, those items will not be published.
    // int TITLE_MISSING
    test('to test the property `TITLE_MISSING`', () async {
      // TODO
    });

    // Some items are missing a description in their product metadata, those items will not be published.
    // int DESCRIPTION_MISSING
    test('to test the property `DESCRIPTION_MISSING`', () async {
      // TODO
    });

    // Some items are missing a link URL in their product metadata, those items will not be published.
    // int PRODUCT_LINK_MISSING
    test('to test the property `PRODUCT_LINK_MISSING`', () async {
      // TODO
    });

    // Some items are missing an image link URL in their product metadata, those items will not be published.
    // int IMAGE_LINK_MISSING
    test('to test the property `IMAGE_LINK_MISSING`', () async {
      // TODO
    });

    // Some items are missing an availability value in their product metadata, those items will not be published.
    // int AVAILABILITY_INVALID
    test('to test the property `AVAILABILITY_INVALID`', () async {
      // TODO
    });

    // Some items have price formatting errors in their product metadata, those items will not be published.
    // int PRODUCT_PRICE_INVALID
    test('to test the property `PRODUCT_PRICE_INVALID`', () async {
      // TODO
    });

    // Some link values are formatted incorrectly.
    // int LINK_FORMAT_INVALID
    test('to test the property `LINK_FORMAT_INVALID`', () async {
      // TODO
    });

    // Your feed contains formatting errors for some items.
    // int PARSE_LINE_ERROR
    test('to test the property `PARSE_LINE_ERROR`', () async {
      // TODO
    });

    // Some adwords links contain too many characters.
    // int ADWORDS_FORMAT_INVALID
    test('to test the property `ADWORDS_FORMAT_INVALID`', () async {
      // TODO
    });

    // We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
    // int INTERNAL_SERVICE_ERROR
    test('to test the property `INTERNAL_SERVICE_ERROR`', () async {
      // TODO
    });

    // Your merchant domain needs to be claimed.
    // int NO_VERIFIED_DOMAIN
    test('to test the property `NO_VERIFIED_DOMAIN`', () async {
      // TODO
    });

    // Some items have invalid adult values.
    // int ADULT_INVALID
    test('to test the property `ADULT_INVALID`', () async {
      // TODO
    });

    // Some items have image_link URLs that contain too many characters, so those items will not be published.
    // int IMAGE_LINK_LENGTH_TOO_LONG
    test('to test the property `IMAGE_LINK_LENGTH_TOO_LONG`', () async {
      // TODO
    });

    // Some of your product link values don't match the verified domain associated with this account.
    // int INVALID_DOMAIN
    test('to test the property `INVALID_DOMAIN`', () async {
      // TODO
    });

    // Your feed contains too many items, some items will not be published.
    // int FEED_LENGTH_TOO_LONG
    test('to test the property `FEED_LENGTH_TOO_LONG`', () async {
      // TODO
    });

    // Some product links contain too many characters, those items will not be published.
    // int LINK_LENGTH_TOO_LONG
    test('to test the property `LINK_LENGTH_TOO_LONG`', () async {
      // TODO
    });

    // Your feed couldn't be validated because the xml file is formatted incorrectly.
    // int MALFORMED_XML
    test('to test the property `MALFORMED_XML`', () async {
      // TODO
    });

    // Some products are missing a price, those items will not be published.
    // int PRICE_MISSING
    test('to test the property `PRICE_MISSING`', () async {
      // TODO
    });

    // Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
    // int FEED_TOO_SMALL
    test('to test the property `FEED_TOO_SMALL`', () async {
      // TODO
    });

    // Some items exceed the maximum number of items per item group, those items will not be published.
    // int MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
    test('to test the property `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`', () async {
      // TODO
    });

    // Some items' main images can't be found.
    // int ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
    test('to test the property `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`', () async {
      // TODO
    });

    // Some items were not published because they don't meet Pinterest's Merchant Guidelines.
    // int PINJOIN_CONTENT_UNSAFE
    test('to test the property `PINJOIN_CONTENT_UNSAFE`', () async {
      // TODO
    });

    // Some items were not published because they don't meet Pinterest's Merchant Guidelines.
    // int BLOCKLISTED_IMAGE_SIGNATURE
    test('to test the property `BLOCKLISTED_IMAGE_SIGNATURE`', () async {
      // TODO
    });

    // Some items have list price formatting errors in their product metadata, those items will not be published.
    // int LIST_PRICE_INVALID
    test('to test the property `LIST_PRICE_INVALID`', () async {
      // TODO
    });

    // Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
    // int PRICE_CANNOT_BE_DETERMINED
    test('to test the property `PRICE_CANNOT_BE_DETERMINED`', () async {
      // TODO
    });

  });
}
