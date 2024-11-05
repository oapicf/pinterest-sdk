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


/// tests for BillingApi
void main() {
  // final instance = BillingApi();

  group('tests for BillingApi', () {
    // Redeem ad credits
    //
    // Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
    //
    //Future<AdsCreditRedeemResponse> adsCreditRedeem(String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest) async
    test('test adsCreditRedeem', () async {
      // TODO
    });

    // Get ads credit discounts
    //
    // Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
    //
    //Future<AdsCreditsDiscountsGet200Response> adsCreditsDiscountsGet(String adAccountId, { String bookmark, int pageSize }) async
    test('test adsCreditsDiscountsGet', () async {
      // TODO
    });

    // Get billing profiles
    //
    // Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
    //
    //Future<BillingProfilesGet200Response> billingProfilesGet(String adAccountId, bool isActive, { String bookmark, int pageSize }) async
    test('test billingProfilesGet', () async {
      // TODO
    });

    // Get Salesforce account details including bill-to information.
    //
    // Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    //
    //Future<SSIOAccountResponse> ssioAccountsGet(String adAccountId) async
    test('test ssioAccountsGet', () async {
      // TODO
    });

    // Create insertion order through SSIO.
    //
    // Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    //
    //Future<SSIOCreateInsertionOrderResponse> ssioInsertionOrderCreate(String adAccountId, SSIOCreateInsertionOrderRequest sSIOCreateInsertionOrderRequest) async
    test('test ssioInsertionOrderCreate', () async {
      // TODO
    });

    // Edit insertion order through SSIO.
    //
    // Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    //
    //Future<SSIOEditInsertionOrderResponse> ssioInsertionOrderEdit(String adAccountId, SSIOEditInsertionOrderRequest sSIOEditInsertionOrderRequest) async
    test('test ssioInsertionOrderEdit', () async {
      // TODO
    });

    // Get insertion order status by ad account id.
    //
    // Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    //
    //Future<SsioInsertionOrdersStatusGetByAdAccount200Response> ssioInsertionOrdersStatusGetByAdAccount(String adAccountId, { String bookmark, int pageSize }) async
    test('test ssioInsertionOrdersStatusGetByAdAccount', () async {
      // TODO
    });

    // Get insertion order status by pin order id.
    //
    // Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    //
    //Future<SSIOInsertionOrderStatusResponse> ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId, String pinOrderId) async
    test('test ssioInsertionOrdersStatusGetByPinOrderId', () async {
      // TODO
    });

    // Get Salesforce order lines by ad account id.
    //
    // Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    //
    //Future<SsioOrderLinesGetByAdAccount200Response> ssioOrderLinesGetByAdAccount(String adAccountId, { String bookmark, int pageSize, String pinOrderId }) async
    test('test ssioOrderLinesGetByAdAccount', () async {
      // TODO
    });

  });
}
