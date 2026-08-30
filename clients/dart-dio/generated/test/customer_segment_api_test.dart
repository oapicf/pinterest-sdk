import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CustomerSegmentApi
void main() {
  final instance = Openapi().getCustomerSegmentApi();

  group(CustomerSegmentApi, () {
    // Create customer segments
    //
    // Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
    //
    //Future<CustomerSegment> customerSegmentCreate(String adAccountId, CustomerSegmentCreate customerSegmentCreate) async
    test('test customerSegmentCreate', () async {
      // TODO
    });

    // List customer segments
    //
    // Get a list of the customer segments in the specified `ad_account_id`.
    //
    //Future<CustomerSegmentList200Response> customerSegmentList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order, bool includeSizing, String searchQuery }) async
    test('test customerSegmentList', () async {
      // TODO
    });

    // Update customer segments
    //
    // Update the customer segment given advertiser ID and customer segment ID
    //
    //Future customerSegmentUpdate(String adAccountId, CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody) async
    test('test customerSegmentUpdate', () async {
      // TODO
    });

  });
}
