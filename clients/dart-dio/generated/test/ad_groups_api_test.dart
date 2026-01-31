import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AdGroupsApi
void main() {
  final instance = Openapi().getAdGroupsApi();

  group(AdGroupsApi, () {
    // Get ad group analytics
    //
    // Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    //
    //Future<BuiltList<AdGroupsAnalyticsResponseInner>> adGroupsAnalytics(String adAccountId, Date startDate, Date endDate, BuiltList<String> adGroupIds, BuiltList<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime, bool aggregateReportRows, ReportingTimeZone reportingTimezone }) async
    test('test adGroupsAnalytics', () async {
      // TODO
    });

    // Get audience sizing
    //
    // Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    //
    //Future<AdGroupAudienceSizingResponse> adGroupsAudienceSizing(String adAccountId, AdGroupAudienceSizingRequest adGroupAudienceSizingRequest) async
    test('test adGroupsAudienceSizing', () async {
      // TODO
    });

    // Get bid floors
    //
    // List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
    //
    //Future<BidFloor> adGroupsBidFloorGet(String adAccountId, BidFloorRequest bidFloorRequest) async
    test('test adGroupsBidFloorGet', () async {
      // TODO
    });

    // Create ad groups
    //
    // Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>. <strong>Notes:</strong> - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">closed beta</a> access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule. 
    //
    //Future<AdGroupArrayResponse> adGroupsCreate(String adAccountId, BuiltList<AdGroupCreateRequest> adGroupCreateRequest) async
    test('test adGroupsCreate', () async {
      // TODO
    });

    // Get ad group
    //
    // Get a specific ad group given the ad group ID.
    //
    //Future<AdGroupResponse> adGroupsGet(String adAccountId, String adGroupId) async
    test('test adGroupsGet', () async {
      // TODO
    });

    // List ad groups
    //
    // List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
    //
    //Future<AdGroupsList200Response> adGroupsList(String adAccountId, { BuiltList<String> campaignIds, BuiltList<String> adGroupIds, BuiltList<String> entityStatuses, int pageSize, String order, String bookmark, bool translateInterestsToNames }) async
    test('test adGroupsList', () async {
      // TODO
    });

    // Get targeting analytics for ad groups
    //
    // Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    //
    //Future<MetricsResponse> adGroupsTargetingAnalyticsGet(String adAccountId, BuiltList<String> adGroupIds, Date startDate, Date endDate, BuiltList<AdsAnalyticsAdGroupTargetingType> targetingTypes, BuiltList<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime, BuiltList<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone }) async
    test('test adGroupsTargetingAnalyticsGet', () async {
      // TODO
    });

    // Update ad groups
    //
    // Update multiple existing ad groups.
    //
    //Future<AdGroupArrayResponse> adGroupsUpdate(String adAccountId, BuiltList<AdGroupUpdateRequest> adGroupUpdateRequest) async
    test('test adGroupsUpdate', () async {
      // TODO
    });

  });
}
