import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for GetPartnerAssetsResponse
void main() {
  final instance = GetPartnerAssetsResponseBuilder();
  // TODO add properties to the builder and call build()

  group(GetPartnerAssetsResponse, () {
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

    // The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
    // BuiltList<String> permissions
    test('to test the property `permissions`', () async {
      // TODO
    });

    // AssetGroupBinding assetGroupInfo
    test('to test the property `assetGroupInfo`', () async {
      // TODO
    });

  });
}
