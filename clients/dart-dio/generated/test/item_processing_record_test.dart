import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ItemProcessingRecord
void main() {
  final instance = ItemProcessingRecordBuilder();
  // TODO add properties to the builder and call build()

  group(ItemProcessingRecord, () {
    // The catalog item id in the merchant namespace
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

    // Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
    // BuiltList<ItemValidationEvent> errors
    test('to test the property `errors`', () async {
      // TODO
    });

    // Array with the validation warnings for the item processing record
    // BuiltList<ItemValidationEvent> warnings
    test('to test the property `warnings`', () async {
      // TODO
    });

    // ItemProcessingStatus status
    test('to test the property `status`', () async {
      // TODO
    });

  });
}
