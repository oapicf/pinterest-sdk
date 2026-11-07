import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AdGroupsApi
void main() {
  final instance = Openapi().getAdGroupsApi();

  group(AdGroupsApi, () {
    // Get ad group analytics
    //
    // Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    //
    //Future<BuiltList<AdGroupsAnalyticsMetrics>> adGroupsAnalytics(Date startDate, Date endDate, BuiltList<String> adGroupIds, BuiltList<ReportingColumnSync> columns, Granularity granularity, String adAccountId, { num clickWindowDays, num engagementWindowDays, num viewWindowDays, String conversionReportTime, bool aggregateReportRows, ReportingTimeZone reportingTimezone }) async
    test('test adGroupsAnalytics', () async {
      // TODO
    });

    // Get audience sizing
    //
    // Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    //
    //Future<AdGroupAudienceSizing> adGroupsAudienceSizing(String adAccountId, AdGroupAudienceSizingCreate adGroupAudienceSizingCreate) async
    test('test adGroupsAudienceSizing', () async {
      // TODO
    });

    // Get bid floors
    //
    // List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
    //
    //Future<BidFloor> adGroupsBidFloorGet(String adAccountId, BidFloorCreate bidFloorCreate) async
    test('test adGroupsBidFloorGet', () async {
      // TODO
    });

    // Create ad groups
    //
    // Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
    //
    //Future<AdGroupsCreate200Response> adGroupsCreate(String adAccountId, BuiltList<AdGroupCreateCreate> adGroupCreateCreate) async
    test('test adGroupsCreate', () async {
      // TODO
    });

    // Get dynamic titles CSV download URL
    //
    // Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
    //
    //Future<DynamicTitlesDownloadCSV> adGroupsDynamicTitlesDownloadCsv(String adAccountId, String adGroupId) async
    test('test adGroupsDynamicTitlesDownloadCsv', () async {
      // TODO
    });

    // Get dynamic titles status
    //
    // Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
    //
    //Future<DynamicTitlesGetStatus> adGroupsDynamicTitlesGetStatus(String adAccountId, String adGroupId) async
    test('test adGroupsDynamicTitlesGetStatus', () async {
      // TODO
    });

    // Get dynamic titles upload URL
    //
    // Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
    //
    //Future<DynamicTitlesUploadURL> adGroupsDynamicTitlesGetUploadUrl(String adAccountId, String adGroupId) async
    test('test adGroupsDynamicTitlesGetUploadUrl', () async {
      // TODO
    });

    // Process dynamic titles CSV
    //
    // Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
    //
    //Future<DynamicTitlesProcessCSV> adGroupsDynamicTitlesProcessCsv(String adAccountId, String adGroupId, DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate) async
    test('test adGroupsDynamicTitlesProcessCsv', () async {
      // TODO
    });

    // Get ad group
    //
    // Get a specific ad group given the ad group ID.
    //
    //Future<AdGroup> adGroupsGet(String adGroupId, String adAccountId) async
    test('test adGroupsGet', () async {
      // TODO
    });

    // List ad groups
    //
    // List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
    //
    //Future<AdGroupsList200Response> adGroupsList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order, BuiltList<String> campaignIds, BuiltList<String> adGroupIds, BuiltList<EntityStatus> entityStatuses, bool translateInterestsToNames }) async
    test('test adGroupsList', () async {
      // TODO
    });

    // Get targeting analytics for ad groups
    //
    // Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    //
    //Future<MetricsResponse> adGroupsTargetingAnalyticsGet(String adAccountId, BuiltList<String> adGroupIds, Date startDate, Date endDate, BuiltList<AdsAnalyticsAdGroupTargetingType> targetingTypes, BuiltList<ReportingColumnSync> columns, Granularity granularity, { num clickWindowDays, num engagementWindowDays, num viewWindowDays, String conversionReportTime, BuiltList<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, BuiltList<String> sortColumns, bool sortAscending }) async
    test('test adGroupsTargetingAnalyticsGet', () async {
      // TODO
    });

    // Update ad groups
    //
    // Update multiple existing ad groups.
    //
    //Future<AdGroupsCreate200Response> adGroupsUpdate(String adAccountId, BuiltList<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate) async
    test('test adGroupsUpdate', () async {
      // TODO
    });

    // List of ad groups using promotions IDs.
    //
    //   Get a list of ad groups that are associated with those promotion ids
    //
    //Future<AdGroupsList200Response> getAdGroupsByPromotionIdsList(String adAccountId, BuiltList<String> promotionIds, { String bookmark, int pageSize, PinterestLibPaginationOrder order }) async
    test('test getAdGroupsByPromotionIdsList', () async {
      // TODO
    });

  });
}
