//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for AdAccountsApi
void main() {
  final instance = AdAccountsApi();

  group('tests for AdAccountsApi', () {
    // Get ad account analytics
    //
    // Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<List<Map<String, Object>>> adAccountAnalytics(String adAccountId, DateTime startDate, DateTime endDate, List<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime }) async
    test('test adAccountAnalytics', () async {
      // TODO
    });

    // List ad accounts
    //
    // Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
    //
    //Future<Paginated> adAccountsList({ String bookmark, int pageSize, bool includeSharedAccounts }) async
    test('test adAccountsList', () async {
      // TODO
    });

    // Get ad group analytics
    //
    // Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<List<Map<String, Object>>> adGroupsAnalytics(String adAccountId, DateTime startDate, DateTime endDate, List<String> adGroupIds, List<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime }) async
    test('test adGroupsAnalytics', () async {
      // TODO
    });

    // List ad groups
    //
    // Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<Paginated> adGroupsList(String adAccountId, { List<String> campaignIds, List<String> adGroupIds, List<String> entityStatuses, int pageSize, String order, String bookmark, bool translateInterestsToNames }) async
    test('test adGroupsList', () async {
      // TODO
    });

    // Get ad analytics
    //
    // Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<List<Map<String, Object>>> adsAnalytics(String adAccountId, DateTime startDate, DateTime endDate, List<String> adIds, List<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime }) async
    test('test adsAnalytics', () async {
      // TODO
    });

    // List ads
    //
    // Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<Paginated> adsList(String adAccountId, { List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<String> entityStatuses, int pageSize, String order, String bookmark }) async
    test('test adsList', () async {
      // TODO
    });

    // Create async request for an account analytics report
    //
    // This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<AdsAnalyticsCreateAsyncResponse> analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) async
    test('test analyticsCreateReport', () async {
      // TODO
    });

    // Get the account analytics report created by the async call
    //
    // This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<AdsAnalyticsGetAsyncResponse> analyticsGetReport(String adAccountId, String token) async
    test('test analyticsGetReport', () async {
      // TODO
    });

    // Get campaign analytics
    //
    // Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<List<Map<String, Object>>> campaignsAnalytics(String adAccountId, DateTime startDate, DateTime endDate, List<String> campaignIds, List<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime }) async
    test('test campaignsAnalytics', () async {
      // TODO
    });

    // List campaigns
    //
    // Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<Paginated> campaignsList(String adAccountId, { List<String> campaignIds, List<String> entityStatuses, int pageSize, String order, String bookmark }) async
    test('test campaignsList', () async {
      // TODO
    });

    // Get product group analytics
    //
    // Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<List<Map<String, Object>>> productGroupsAnalytics(String adAccountId, DateTime startDate, DateTime endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime }) async
    test('test productGroupsAnalytics', () async {
      // TODO
    });

  });
}
