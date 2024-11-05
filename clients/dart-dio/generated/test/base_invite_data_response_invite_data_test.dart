import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for BaseInviteDataResponseInviteData
void main() {
  final instance = BaseInviteDataResponseInviteDataBuilder();
  // TODO add properties to the builder and call build()

  group(BaseInviteDataResponseInviteData, () {
    // The date and time when the invite/request will expire. Returned in milliseconds.
    // int inviteExpiration
    test('to test the property `inviteExpiration`', () async {
      // TODO
    });

    // The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
    // String inviteStatus
    test('to test the property `inviteStatus`', () async {
      // TODO
    });

    // The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
    // String inviteType
    test('to test the property `inviteType`', () async {
      // TODO
    });

    // The date and time the invite/request was last updated. Returned in milliseconds.
    // int lastUpdatedTime
    test('to test the property `lastUpdatedTime`', () async {
      // TODO
    });

    // The date and time the invite/request was sent/created. Returned in milliseconds.
    // int sentAt
    test('to test the property `sentAt`', () async {
      // TODO
    });

  });
}
