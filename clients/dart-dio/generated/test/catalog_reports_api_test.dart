import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CatalogReportsApi
void main() {
  final instance = Openapi().getCatalogReportsApi();

  group(CatalogReportsApi, () {
    // Build catalogs report
    //
    // Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    //
    //Future<CatalogsCreateReportResponse> reportsCreate(CatalogsReportParameters catalogsReportParameters, { String adAccountId }) async
    test('test reportsCreate', () async {
      // TODO
    });

    // Get catalogs report
    //
    // This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
    //
    //Future<CatalogsReport> reportsGet(String token, { String adAccountId }) async
    test('test reportsGet', () async {
      // TODO
    });

    // List report stats
    //
    // List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
    //
    //Future<ReportsStats200Response> reportsStats(ReportsStatsParametersParameter parameters, { String adAccountId, int pageSize, String bookmark }) async
    test('test reportsStats', () async {
      // TODO
    });

  });
}
