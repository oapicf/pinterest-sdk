import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for DeletePartnerAssetAccessBodyAccessesInner
void main() {
  final instance = DeletePartnerAssetAccessBodyAccessesInnerBuilder();
  // TODO add properties to the builder and call build()

  group(DeletePartnerAssetAccessBodyAccessesInner, () {
    // Unique identifier of a business partner to update asset access to.
    // String partnerId
    test('to test the property `partnerId`', () async {
      // TODO
    });

    // Unique identifier of the business asset.
    // String assetId
    test('to test the property `assetId`', () async {
      // TODO
    });

    // If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
    // String partnerType (default value: 'INTERNAL')
    test('to test the property `partnerType`', () async {
      // TODO
    });

  });
}
