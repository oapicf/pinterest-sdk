import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ItemUpdateBatchRecord
void main() {
  final instance = ItemUpdateBatchRecordBuilder();
  // TODO add properties to the builder and call build()

  group(ItemUpdateBatchRecord, () {
    // The catalog item id in the merchant namespace
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

    // UpdatableItemAttributes attributes
    test('to test the property `attributes`', () async {
      // TODO
    });

    // The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
    // BuiltList<UpdateMaskFieldType> updateMask
    test('to test the property `updateMask`', () async {
      // TODO
    });

  });
}
