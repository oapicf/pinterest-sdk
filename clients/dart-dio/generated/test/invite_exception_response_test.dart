import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for InviteExceptionResponse
void main() {
  final instance = InviteExceptionResponseBuilder();
  // TODO add properties to the builder and call build()

  group(InviteExceptionResponse, () {
    // Unique identifier of the invite/request.
    // String inviteOrRequestId
    test('to test the property `inviteOrRequestId`', () async {
      // TODO
    });

    // Error code associated with the error in performing the action on the invite/request.
    // int code
    test('to test the property `code`', () async {
      // TODO
    });

    // Error message associated with the error in performing the action on the invite/request.
    // String message
    test('to test the property `message`', () async {
      // TODO
    });

    // A list of users' usernames or emails OR a list of partner ids that caused the error.
    // BuiltList<String> usersOrPartnerIds
    test('to test the property `usersOrPartnerIds`', () async {
      // TODO
    });

  });
}
