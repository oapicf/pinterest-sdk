import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for TargetingTemplateApi
void main() {
  final instance = Openapi().getTargetingTemplateApi();

  group(TargetingTemplateApi, () {
    // Create targeting templates
    //
    // <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
    //
    //Future<TargetingTemplateGetResponseData> targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate) async
    test('test targetingTemplateCreate', () async {
      // TODO
    });

    // List targeting templates
    //
    // Get a list of the targeting templates in the specified <code>ad_account_id</code>
    //
    //Future<TargetingTemplateList200Response> targetingTemplateList(String adAccountId, { String order, bool includeSizing, String searchQuery, int pageSize, String bookmark }) async
    test('test targetingTemplateList', () async {
      // TODO
    });

    // Update targeting templates
    //
    // <p>Update the targeting template given advertiser ID and targeting template ID</p>
    //
    //Future targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest) async
    test('test targetingTemplateUpdate', () async {
      // TODO
    });

  });
}
