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


/// tests for LeadAdsApi
void main() {
  // final instance = LeadAdsApi();

  group('tests for LeadAdsApi', () {
    // Delete lead ads subscription
    //
    // Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
    //
    //Future adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId) async
    test('test adAccountsSubscriptionsDelById', () async {
      // TODO
    });

    // Get lead ads subscription
    //
    // Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
    //
    //Future<AdAccountGetSubscriptionResponse> adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId) async
    test('test adAccountsSubscriptionsGetById', () async {
      // TODO
    });

    // Get lead ads subscriptions
    //
    // Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
    //
    //Future<AdAccountsSubscriptionsGetList200Response> adAccountsSubscriptionsGetList(String adAccountId, { int pageSize, String bookmark }) async
    test('test adAccountsSubscriptionsGetList', () async {
      // TODO
    });

    // Create lead ads subscription
    //
    // Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
    //
    //Future<AdAccountCreateSubscriptionResponse> adAccountsSubscriptionsPost(String adAccountId, AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest) async
    test('test adAccountsSubscriptionsPost', () async {
      // TODO
    });

  });
}
