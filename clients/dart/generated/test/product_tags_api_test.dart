//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for ProductTagsApi
void main() {
  // final instance = ProductTagsApi();

  group('tests for ProductTagsApi', () {
    // Add product tags to pin
    //
    // Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
    //
    //Future<ProductTagsResponse> productTagsBulkAdd(String pinId, ProductTagsBulkAddRequest productTagsBulkAddRequest) async
    test('test productTagsBulkAdd', () async {
      // TODO
    });

    // Delete product tags from pin
    //
    // Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
    //
    //Future productTagsBulkDelete(String pinId, ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest) async
    test('test productTagsBulkDelete', () async {
      // TODO
    });

    // Get product tags for pin
    //
    // Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
    //
    //Future<ProductTagsResponse> productTagsList(String pinId) async
    test('test productTagsList', () async {
      // TODO
    });

  });
}
