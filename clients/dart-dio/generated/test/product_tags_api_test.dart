import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ProductTagsApi
void main() {
  final instance = Openapi().getProductTagsApi();

  group(ProductTagsApi, () {
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
