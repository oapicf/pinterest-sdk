import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AdsCreditRedeemRequest
void main() {
  final instance = AdsCreditRedeemRequestBuilder();
  // TODO add properties to the builder and call build()

  group(AdsCreditRedeemRequest, () {
    // Takes in a SHA256 hash of the offerCode.
    // String offerCodeHash
    test('to test the property `offerCodeHash`', () async {
      // TODO
    });

    // If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
    // bool validateOnly
    test('to test the property `validateOnly`', () async {
      // TODO
    });

  });
}
