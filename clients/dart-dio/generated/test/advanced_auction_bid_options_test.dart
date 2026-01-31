import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AdvancedAuctionBidOptions
void main() {
  final instance = AdvancedAuctionBidOptionsBuilder();
  // TODO add properties to the builder and call build()

  group(AdvancedAuctionBidOptions, () {
    // AppTypeMultipliers appTypeMultipliers
    test('to test the property `appTypeMultipliers`', () async {
      // TODO
    });

    // Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
    // int bidInMicroCurrency
    test('to test the property `bidInMicroCurrency`', () async {
      // TODO
    });

    // PlacementMultipliers placementMultipliers
    test('to test the property `placementMultipliers`', () async {
      // TODO
    });

  });
}
