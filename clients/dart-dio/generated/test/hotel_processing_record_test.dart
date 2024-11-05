import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for HotelProcessingRecord
void main() {
  final instance = HotelProcessingRecordBuilder();
  // TODO add properties to the builder and call build()

  group(HotelProcessingRecord, () {
    // The catalog hotel id in the merchant namespace
    // String hotelId
    test('to test the property `hotelId`', () async {
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
