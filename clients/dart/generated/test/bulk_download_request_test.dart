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

// tests for BulkDownloadRequest
void main() {
  // final instance = BulkDownloadRequest();

  group('test BulkDownloadRequest', () {
    // All entity types specified will be downloaded. Fewer types result in faster downloads.
    // List<BulkEntityType> entityTypes (default value: const [])
    test('to test the property `entityTypes`', () async {
      // TODO
    });

    // All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
    // List<String> entityIds (default value: const [])
    test('to test the property `entityIds`', () async {
      // TODO
    });

    // Unix UTC timestamp to retrieve all entities that have changed since this time.
    // String updatedSince
    test('to test the property `updatedSince`', () async {
      // TODO
    });

    // BulkDownloadRequestCampaignFilter campaignFilter
    test('to test the property `campaignFilter`', () async {
      // TODO
    });

    // BulkOutputFormat outputFormat (default value: 'JSON')
    test('to test the property `outputFormat`', () async {
      // TODO
    });


  });

}
