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

// tests for CustomerList
void main() {
  // final instance = CustomerList();

  group('test CustomerList', () {
    // Associated ad account ID.
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // Creation time. Unix timestamp in seconds.
    // num createdTime
    test('to test the property `createdTime`', () async {
      // TODO
    });

    // Customer list ID.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Customer list name.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
    // num numBatches
    test('to test the property `numBatches`', () async {
      // TODO
    });

    // Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
    // num numRemovedUserRecords
    test('to test the property `numRemovedUserRecords`', () async {
      // TODO
    });

    // Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
    // num numUploadedUserRecords
    test('to test the property `numUploadedUserRecords`', () async {
      // TODO
    });

    // Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // Always \"customerlist\".
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // Last update time. Unix timestamp in seconds.
    // num updatedTime
    test('to test the property `updatedTime`', () async {
      // TODO
    });

    // Customer list errors
    // Object exceptions
    test('to test the property `exceptions`', () async {
      // TODO
    });


  });

}
