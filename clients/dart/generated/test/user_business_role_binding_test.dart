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

// tests for UserBusinessRoleBinding
void main() {
  // final instance = UserBusinessRoleBinding();

  group('test UserBusinessRoleBinding', () {
    // BusinessMemberAssetsSummary assetsSummary
    test('to test the property `assetsSummary`', () async {
      // TODO
    });

    // The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
    // List<String> businessRoles (default value: const [])
    test('to test the property `businessRoles`', () async {
      // TODO
    });

    // Metadata for the business that created the business relationship.
    // BusinessAccessUserSummary createdByBusiness
    test('to test the property `createdByBusiness`', () async {
      // TODO
    });

    // Metadata for the user that created the business relationship.
    // BusinessAccessUserSummary createdByUser
    test('to test the property `createdByUser`', () async {
      // TODO
    });

    // The time the business relationship was created. Returned in milliseconds.
    // int createdTime
    test('to test the property `createdTime`', () async {
      // TODO
    });

    // Unique identifier of the business member/business partner/employer.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
    // bool isSharedPartner
    test('to test the property `isSharedPartner`', () async {
      // TODO
    });

    // Metadata for the business member/business partner/employer.
    // BusinessAccessUserSummary user
    test('to test the property `user`', () async {
      // TODO
    });


  });

}
