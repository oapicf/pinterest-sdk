import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateAssetInvitesRequestItem
void main() {
  final instance = CreateAssetInvitesRequestItemBuilder();
  // TODO add properties to the builder and call build()

  group(CreateAssetInvitesRequestItem, () {
    // Unique identifier of an invite.
    // String inviteId
    test('to test the property `inviteId`', () async {
      // TODO
    });

    // InviteType inviteType
    test('to test the property `inviteType`', () async {
      // TODO
    });

    // An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
    // BuiltMap<String, BuiltList<Permissions>> assetIdToPermissions
    test('to test the property `assetIdToPermissions`', () async {
      // TODO
    });

  });
}
