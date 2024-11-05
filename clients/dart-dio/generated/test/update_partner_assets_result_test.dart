import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for UpdatePartnerAssetsResult
void main() {
  final instance = UpdatePartnerAssetsResultBuilder();
  // TODO add properties to the builder and call build()

  group(UpdatePartnerAssetsResult, () {
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

    // Unique identifier of a business partner.
    // String partnerId
    test('to test the property `partnerId`', () async {
      // TODO
    });

    // Permission levels member or partner has on an asset.
    // BuiltList<String> permissions
    test('to test the property `permissions`', () async {
      // TODO
    });

  });
}
