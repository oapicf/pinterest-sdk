import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AdsCreditDiscountsResponse
void main() {
  final instance = AdsCreditDiscountsResponseBuilder();
  // TODO add properties to the builder and call build()

  group(AdsCreditDiscountsResponse, () {
    // True if the offer code is currently active.
    // bool active
    test('to test the property `active`', () async {
      // TODO
    });

    // Advertiser ID the offer was applied to.
    // String advertiserId
    test('to test the property `advertiserId`', () async {
      // TODO
    });

    // The type of discount of this credit
    // String discountType
    test('to test the property `discountType`', () async {
      // TODO
    });

    // The discount applied in the offer’s currency value.
    // num discountInMicroCurrency
    test('to test the property `discountInMicroCurrency`', () async {
      // TODO
    });

    // Currency value for the discount.
    // String discountCurrency
    test('to test the property `discountCurrency`', () async {
      // TODO
    });

    // Human readable title of the offer code.
    // String title
    test('to test the property `title`', () async {
      // TODO
    });

    // The credits left to spend.
    // num remainingDiscountInMicroCurrency
    test('to test the property `remainingDiscountInMicroCurrency`', () async {
      // TODO
    });

  });
}
