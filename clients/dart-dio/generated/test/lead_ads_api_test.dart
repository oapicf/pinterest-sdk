import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for LeadAdsApi
void main() {
  final instance = Openapi().getLeadAdsApi();

  group(LeadAdsApi, () {
    // Delete lead ads subscription
    //
    // Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
    //
    //Future adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId) async
    test('test adAccountsSubscriptionsDelById', () async {
      // TODO
    });

    // Get lead ads subscription by ID
    //
    // Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
    //
    //Future<LeadSubscription> adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId) async
    test('test adAccountsSubscriptionsGetById', () async {
      // TODO
    });

    // Get lead ads subscriptions
    //
    // Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
    //
    //Future<AdAccountsSubscriptionsGetList200Response> adAccountsSubscriptionsGetList(String adAccountId, { String bookmark, int pageSize }) async
    test('test adAccountsSubscriptionsGetList', () async {
      // TODO
    });

    // Create lead ads subscription
    //
    // Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
    //
    //Future<LeadSubscription> adAccountsSubscriptionsPost(String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate) async
    test('test adAccountsSubscriptionsPost', () async {
      // TODO
    });

  });
}
