import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for TargetingTemplateApi
void main() {
  final instance = Openapi().getTargetingTemplateApi();

  group(TargetingTemplateApi, () {
    // Create targeting templates
    //
    // Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
    //
    //Future<TargetingTemplate> targetingTemplateCreate(String adAccountId, TargetingTemplateCreate targetingTemplateCreate) async
    test('test targetingTemplateCreate', () async {
      // TODO
    });

    // List targeting templates
    //
    // Get a list of the targeting templates in the specified `ad_account_id`
    //
    //Future<TargetingTemplateList200Response> targetingTemplateList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order, bool includeSizing, String searchQuery }) async
    test('test targetingTemplateList', () async {
      // TODO
    });

    // Update targeting templates
    //
    // Update the targeting template given advertiser ID and targeting template ID
    //
    //Future targetingTemplateUpdate(String adAccountId, TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate) async
    test('test targetingTemplateUpdate', () async {
      // TODO
    });

  });
}
