import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateAssetAccessRequestBodyAssetRequestsInner
void main() {
  final instance = CreateAssetAccessRequestBodyAssetRequestsInnerBuilder();
  // TODO add properties to the builder and call build()

  group(CreateAssetAccessRequestBodyAssetRequestsInner, () {
    // Unique identifier of a business partner to request asset access to.
    // String partnerId
    test('to test the property `partnerId`', () async {
      // TODO
    });

    // An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
    // BuiltMap<String, BuiltList<Permissions>> assetIdToPermissions
    test('to test the property `assetIdToPermissions`', () async {
      // TODO
    });

  });
}
