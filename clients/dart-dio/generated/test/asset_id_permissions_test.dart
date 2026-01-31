import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AssetIdPermissions
void main() {
  final instance = AssetIdPermissionsBuilder();
  // TODO add properties to the builder and call build()

  group(AssetIdPermissions, () {
    // AssetGroupBinding assetGroupInfo
    test('to test the property `assetGroupInfo`', () async {
      // TODO
    });

    // Unique identifier of a business asset.
    // String assetId
    test('to test the property `assetId`', () async {
      // TODO
    });

    // Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
    // String assetType
    test('to test the property `assetType`', () async {
      // TODO
    });

    // Permission levels member or partner has on an asset.
    // BuiltList<String> permissions
    test('to test the property `permissions`', () async {
      // TODO
    });

  });
}
