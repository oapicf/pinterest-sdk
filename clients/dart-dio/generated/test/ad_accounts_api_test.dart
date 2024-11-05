import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AdAccountsApi
void main() {
  final instance = Openapi().getAdAccountsApi();

  group(AdAccountsApi, () {
    // Get ad account analytics
    //
    // Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
    //
    //Future<BuiltList<AdAccountAnalyticsResponseInner>> adAccountAnalytics(String adAccountId, Date startDate, Date endDate, BuiltList<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime }) async
    test('test adAccountAnalytics', () async {
      // TODO
    });

    // Get targeting analytics for an ad account
    //
    // Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
    //
    //Future<MetricsResponse> adAccountTargetingAnalyticsGet(String adAccountId, Date startDate, Date endDate, BuiltList<AdsAnalyticsTargetingType> targetingTypes, BuiltList<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes }) async
    test('test adAccountTargetingAnalyticsGet', () async {
      // TODO
    });

    // Create ad account
    //
    // Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.
    //
    //Future<AdAccount> adAccountsCreate(AdAccountCreateRequest adAccountCreateRequest) async
    test('test adAccountsCreate', () async {
      // TODO
    });

    // Get ad account
    //
    // Get an ad account
    //
    //Future<AdAccount> adAccountsGet(String adAccountId) async
    test('test adAccountsGet', () async {
      // TODO
    });

    // List ad accounts
    //
    // Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.
    //
    //Future<AdAccountsList200Response> adAccountsList({ String bookmark, int pageSize, bool includeSharedAccounts }) async
    test('test adAccountsList', () async {
      // TODO
    });

    // Create a request for a Marketing Mix Modeling (MMM) report
    //
    // This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.
    //
    //Future<CreateMMMReportResponse> analyticsCreateMmmReport(String adAccountId, CreateMMMReportRequest createMMMReportRequest) async
    test('test analyticsCreateMmmReport', () async {
      // TODO
    });

    // Create async request for an account analytics report
    //
    // This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
    //
    //Future<AdsAnalyticsCreateAsyncResponse> analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) async
    test('test analyticsCreateReport', () async {
      // TODO
    });

    // Create async request for an analytics report using a template
    //
    // This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
    //
    //Future<AdsAnalyticsCreateAsyncResponse> analyticsCreateTemplateReport(String adAccountId, String templateId, { Date startDate, Date endDate, Granularity granularity }) async
    test('test analyticsCreateTemplateReport', () async {
      // TODO
    });

    // Get advertiser Marketing Mix Modeling (MMM) report.
    //
    // Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
    //
    //Future<GetMMMReportResponse> analyticsGetMmmReport(String adAccountId, String token) async
    test('test analyticsGetMmmReport', () async {
      // TODO
    });

    // Get the account analytics report created by the async call
    //
    // This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
    //
    //Future<AdsAnalyticsGetAsyncResponse> analyticsGetReport(String adAccountId, String token) async
    test('test analyticsGetReport', () async {
      // TODO
    });

    // Delete ads data for ad account in API Sandbox
    //
    // Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
    //
    //Future<String> sandboxDelete(String adAccountId) async
    test('test sandboxDelete', () async {
      // TODO
    });

    // List templates
    //
    // Gets all Templates associated with an ad account ID.
    //
    //Future<TemplatesList200Response> templatesList(String adAccountId, { int pageSize, String order, String bookmark }) async
    test('test templatesList', () async {
      // TODO
    });

  });
}
