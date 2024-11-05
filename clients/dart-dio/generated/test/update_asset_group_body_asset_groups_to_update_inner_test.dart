import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for UpdateAssetGroupBodyAssetGroupsToUpdateInner
void main() {
  final instance = UpdateAssetGroupBodyAssetGroupsToUpdateInnerBuilder();
  // TODO add properties to the builder and call build()

  group(UpdateAssetGroupBodyAssetGroupsToUpdateInner, () {
    // Unique identifier of the asset group to update.
    // String assetGroupId
    test('to test the property `assetGroupId`', () async {
      // TODO
    });

    // Asset Group name
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Asset group description
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
    // BuiltList<AssetGroupType> assetGroupTypes
    test('to test the property `assetGroupTypes`', () async {
      // TODO
    });

    // A list of asset ids to add to the asset group.
    // BuiltList<String> assetsToAdd
    test('to test the property `assetsToAdd`', () async {
      // TODO
    });

    // A list of asset ids to remove from the asset group.
    // BuiltList<String> assetsToRemove
    test('to test the property `assetsToRemove`', () async {
      // TODO
    });

  });
}
