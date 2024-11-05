import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsFeedIngestionErrors
void main() {
  final instance = CatalogsFeedIngestionErrorsBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsFeedIngestionErrors, () {
    // We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
    // int LINE_LEVEL_INTERNAL_ERROR
    test('to test the property `LINE_LEVEL_INTERNAL_ERROR`', () async {
      // TODO
    });

    // The product count has decreased by more than 99% compared to the last successful ingestion.
    // int LARGE_PRODUCT_COUNT_DECREASE
    test('to test the property `LARGE_PRODUCT_COUNT_DECREASE`', () async {
      // TODO
    });

    // We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
    // int ACCOUNT_FLAGGED
    test('to test the property `ACCOUNT_FLAGGED`', () async {
      // TODO
    });

    // We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
    // int IMAGE_LEVEL_INTERNAL_ERROR
    test('to test the property `IMAGE_LEVEL_INTERNAL_ERROR`', () async {
      // TODO
    });

    // Image files are unreadable. Please upload new files to continue.
    // int IMAGE_FILE_NOT_ACCESSIBLE
    test('to test the property `IMAGE_FILE_NOT_ACCESSIBLE`', () async {
      // TODO
    });

    // Image files are unreadable. Please check your link and upload new files to continue.
    // int IMAGE_MALFORMED_URL
    test('to test the property `IMAGE_MALFORMED_URL`', () async {
      // TODO
    });

    // Image files are unreadable. Please upload new files to continue.
    // int IMAGE_FILE_NOT_FOUND
    test('to test the property `IMAGE_FILE_NOT_FOUND`', () async {
      // TODO
    });

    // Image files are unreadable. Please upload new files to continue.
    // int IMAGE_INVALID_FILE
    test('to test the property `IMAGE_INVALID_FILE`', () async {
      // TODO
    });

  });
}
