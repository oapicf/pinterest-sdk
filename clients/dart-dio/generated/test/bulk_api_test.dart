import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for BulkApi
void main() {
  final instance = Openapi().getBulkApi();

  group(BulkApi, () {
    // Get advertiser entities in bulk
    //
    // Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
    //
    //Future<BulkDownloadResponse> bulkDownloadCreate(String adAccountId, BulkDownloadRequest bulkDownloadRequest) async
    test('test bulkDownloadCreate', () async {
      // TODO
    });

    // Download advertiser entities in bulk
    //
    // Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
    //
    //Future<BulkUpsertStatusResponse> bulkRequestGet(String adAccountId, String bulkRequestId, { bool includeDetails }) async
    test('test bulkRequestGet', () async {
      // TODO
    });

    // Create/update ad entities in bulk
    //
    // Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
    //
    //Future<BulkUpsertResponse> bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest) async
    test('test bulkUpsertCreate', () async {
      // TODO
    });

  });
}
