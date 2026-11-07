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
    // Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    //
    //Future<AdsCreditRedeem> adsCreditRedeem(String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate) async
    test('test adsCreditRedeem', () async {
      // TODO
    });

    // Get ads credit discounts
    //
    // Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    //
    //Future<AdsCreditsDiscountsGet200Response> adsCreditsDiscountsGet(String adAccountId, { String bookmark, int pageSize }) async
    test('test adsCreditsDiscountsGet', () async {
      // TODO
    });

    // Get download url for a billing invoice
    //
    // Get download url for a billing invoice.
    //
    //Future<BillingInvoiceDownloadResponse> billingInvoiceDownloadGet(String adAccountId, String billingInvoiceId) async
    test('test billingInvoiceDownloadGet', () async {
      // TODO
    });

    // Get billing invoices
    //
    // Get billing invoices in the advertiser account.
    //
    //Future<BillingInvoicesGet200Response> billingInvoicesGet(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order, BillingInvoiceSortField sort, BillingInvoiceStatus status, BillingInvoiceDocumentType documentType, DateTime startDueDate, DateTime endDueDate }) async
    test('test billingInvoicesGet', () async {
      // TODO
    });

    // Get billing profiles
    //
    // Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    //
    //Future<BillingProfilesGet200Response> billingProfilesGet(bool isActive, String adAccountId, { String bookmark, int pageSize }) async
    test('test billingProfilesGet', () async {
      // TODO
    });

    // Get Salesforce account details including bill-to information.
    //
    //   Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    //
    //Future<SSIOAccount> ssioAccountsGet(String adAccountId) async
    test('test ssioAccountsGet', () async {
      // TODO
    });

    // Create insertion order through SSIO.
    //
    //   Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    //
    //Future<SSIOInsertionOrder> ssioInsertionOrderCreate(String adAccountId, SSIOInsertionOrderCreate sSIOInsertionOrderCreate) async
    test('test ssioInsertionOrderCreate', () async {
      // TODO
    });

    // Edit insertion order through SSIO.
    //
    //   Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    //
    //Future<SSIOInsertionOrder> ssioInsertionOrderEdit(String adAccountId, SSIOInsertionOrderUpdate sSIOInsertionOrderUpdate) async
    test('test ssioInsertionOrderEdit', () async {
      // TODO
    });

    // Get insertion order status by ad account id.
    //
    //   Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    //
    //Future<SsioInsertionOrdersStatusGetByAdAccount200Response> ssioInsertionOrdersStatusGetByAdAccount(String adAccountId, { String bookmark, int pageSize }) async
    test('test ssioInsertionOrdersStatusGetByAdAccount', () async {
      // TODO
    });

    // Get insertion order status by pin order id.
    //
    //   Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    //
    //Future<SSIOInsertionOrderStatusResponse> ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId, String pinOrderId) async
    test('test ssioInsertionOrdersStatusGetByPinOrderId', () async {
      // TODO
    });

    // Get Salesforce order lines by ad account id.
    //
    //   Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    //
    //Future<SsioOrderLinesGetByAdAccount200Response> ssioOrderLinesGetByAdAccount(String adAccountId, { String pinOrderId, String bookmark, int pageSize }) async
    test('test ssioOrderLinesGetByAdAccount', () async {
      // TODO
    });

  });
}
