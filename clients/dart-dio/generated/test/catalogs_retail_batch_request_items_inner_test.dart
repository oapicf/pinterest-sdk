import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsRetailBatchRequestItemsInner
void main() {
  final instance = CatalogsRetailBatchRequestItemsInnerBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsRetailBatchRequestItemsInner, () {
    // ItemAttributesRequest attributes
    test('to test the property `attributes`', () async {
      // TODO
    });

    // The catalog item id in the merchant namespace
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

    // String operation
    test('to test the property `operation`', () async {
      // TODO
    });

    // The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
    // BuiltList<UpdateMaskFieldType> updateMask
    test('to test the property `updateMask`', () async {
      // TODO
    });

    // The millisecond timestamp when the item was lastly modified by the merchant.
    // int lastUpdatedTime
    test('to test the property `lastUpdatedTime`', () async {
      // TODO
    });

  });
}
