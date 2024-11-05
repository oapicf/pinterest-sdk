import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for DeletePartnerAssetsResult
void main() {
  final instance = DeletePartnerAssetsResultBuilder();
  // TODO add properties to the builder and call build()

  group(DeletePartnerAssetsResult, () {
    // Unique identifier of a business asset.
    // String assetId
    test('to test the property `assetId`', () async {
      // TODO
    });

    // Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
    // String assetType
    test('to test the property `assetType`', () async {
      // TODO
    });

    // Permission levels member or partner has on an asset.
    // BuiltList<String> permissions
    test('to test the property `permissions`', () async {
      // TODO
    });

    // If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
    // bool isSharedPartner
    test('to test the property `isSharedPartner`', () async {
      // TODO
    });

    // Unique identifier of a business partner.
    // String partnerId
    test('to test the property `partnerId`', () async {
      // TODO
    });

  });
}
