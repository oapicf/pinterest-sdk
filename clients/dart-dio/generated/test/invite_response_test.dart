import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for InviteResponse
void main() {
  final instance = InviteResponseBuilder();
  // TODO add properties to the builder and call build()

  group(InviteResponse, () {
    // InviteAssetsSummary assetsSummary
    test('to test the property `assetsSummary`', () async {
      // TODO
    });

    // The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
    // BuiltList<String> businessRoles
    test('to test the property `businessRoles`', () async {
      // TODO
    });

    // Metadata for the business that created the invite/request.
    // BusinessAccessUserSummary createdByBusiness
    test('to test the property `createdByBusiness`', () async {
      // TODO
    });

    // Metadata for the user that created the invite/request.
    // BusinessAccessUserSummary createdByUser
    test('to test the property `createdByUser`', () async {
      // TODO
    });

    // The time the invite/request was created. Returned in milliseconds.
    // int createdTime
    test('to test the property `createdTime`', () async {
      // TODO
    });

    // Unique identifier of the invite/request.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // BaseInviteDataResponseInviteData inviteData
    test('to test the property `inviteData`', () async {
      // TODO
    });

    // Indicates whether the invite/request was received.
    // bool isReceivedInvite
    test('to test the property `isReceivedInvite`', () async {
      // TODO
    });

    // Metadata for the member/partner that was sent the invite/request.
    // BusinessAccessUserSummary user
    test('to test the property `user`', () async {
      // TODO
    });

  });
}
