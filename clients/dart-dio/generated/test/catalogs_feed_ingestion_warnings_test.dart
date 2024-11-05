import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsFeedIngestionWarnings
void main() {
  final instance = CatalogsFeedIngestionWarningsBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsFeedIngestionWarnings, () {
    // We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    // int ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
    test('to test the property `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`', () async {
      // TODO
    });

    // Additional image files are unreadable. Please upload new files to continue.
    // int ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
    test('to test the property `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`', () async {
      // TODO
    });

    // Additional image files are unreadable. Please check your link and upload new files to continue.
    // int ADDITIONAL_IMAGE_MALFORMED_URL
    test('to test the property `ADDITIONAL_IMAGE_MALFORMED_URL`', () async {
      // TODO
    });

    // Additional image files are unreadable. Please upload new files to continue.
    // int ADDITIONAL_IMAGE_FILE_NOT_FOUND
    test('to test the property `ADDITIONAL_IMAGE_FILE_NOT_FOUND`', () async {
      // TODO
    });

    // Additional image files are unreadable. Please upload new files to continue.
    // int ADDITIONAL_IMAGE_INVALID_FILE
    test('to test the property `ADDITIONAL_IMAGE_INVALID_FILE`', () async {
      // TODO
    });

    // price is not a supported column. Use base_price and sale_price instead.
    // int HOTEL_PRICE_HEADER_IS_PRESENT
    test('to test the property `HOTEL_PRICE_HEADER_IS_PRESENT`', () async {
      // TODO
    });

  });
}
