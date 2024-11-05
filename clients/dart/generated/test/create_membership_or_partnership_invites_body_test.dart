//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for CreateMembershipOrPartnershipInvitesBody
void main() {
  // final instance = CreateMembershipOrPartnershipInvitesBody();

  group('test CreateMembershipOrPartnershipInvitesBody', () {
    // The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
    // String businessRole
    test('to test the property `businessRole`', () async {
      // TODO
    });

    // InviteType inviteType
    test('to test the property `inviteType`', () async {
      // TODO
    });

    // A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
    // List<String> members (default value: const [])
    test('to test the property `members`', () async {
      // TODO
    });

    // A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
    // List<String> partners (default value: const [])
    test('to test the property `partners`', () async {
      // TODO
    });


  });

}
