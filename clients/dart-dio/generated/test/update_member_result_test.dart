import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for UpdateMemberResult
void main() {
  final instance = UpdateMemberResultBuilder();
  // TODO add properties to the builder and call build()

  group(UpdateMemberResult, () {
    // The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
    // String businessRole
    test('to test the property `businessRole`', () async {
      // TODO
    });

    // Unique identifier of the business member.
    // String memberId
    test('to test the property `memberId`', () async {
      // TODO
    });

  });
}
