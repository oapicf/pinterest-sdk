import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for BulkDownloadRequest
void main() {
  final instance = BulkDownloadRequestBuilder();
  // TODO add properties to the builder and call build()

  group(BulkDownloadRequest, () {
    // All entity types specified will be downloaded. Fewer types result in faster downloads.
    // BuiltList<BulkEntityType> entityTypes
    test('to test the property `entityTypes`', () async {
      // TODO
    });

    // All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
    // BuiltList<String> entityIds
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
