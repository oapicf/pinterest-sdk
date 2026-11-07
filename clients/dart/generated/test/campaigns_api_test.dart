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


/// tests for CampaignsApi
void main() {
  // final instance = CampaignsApi();

  group('tests for CampaignsApi', () {
    // Get pins analytics
    //
    // Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
    //
    //Future<List<AdPinAnalytics>> adPinsAnalytics(String campaignId, List<String> pinIds, DateTime startDate, DateTime endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, { num clickWindowDays, num engagementWindowDays, num viewWindowDays, String conversionReportTime }) async
    test('test adPinsAnalytics', () async {
      // TODO
    });

    // Get targeting analytics for campaigns
    //
    // Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    //
    //Future<MetricsResponse> campaignTargetingAnalyticsGet(String adAccountId, List<String> campaignIds, DateTime startDate, DateTime endDate, List<AdsAnalyticsCampaignTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, { num clickWindowDays, num engagementWindowDays, num viewWindowDays, String conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone }) async
    test('test campaignTargetingAnalyticsGet', () async {
      // TODO
    });

    // Get campaign analytics
    //
    // Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    //
    //Future<List<CampaignsAnalyticsMetrics>> campaignsAnalytics(DateTime startDate, DateTime endDate, List<String> campaignIds, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, { num clickWindowDays, num engagementWindowDays, num viewWindowDays, String conversionReportTime, bool aggregateReportRows, ReportingTimeZone reportingTimezone }) async
    test('test campaignsAnalytics', () async {
      // TODO
    });

    // Create campaigns
    //
    // Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
    //
    //Future<CampaignBatchWriteResponseModel> campaignsCreate(String adAccountId, List<CampaignCreateItem> campaignCreateItem) async
    test('test campaignsCreate', () async {
      // TODO
    });

    // Get campaign
    //
    // Get a specific campaign given the campaign ID.
    //
    //Future<Campaign> campaignsGet(String campaignId, String adAccountId) async
    test('test campaignsGet', () async {
      // TODO
    });

    // List campaigns
    //
    // Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
    //
    //Future<CampaignsList200Response> campaignsList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order, List<String> campaignIds, List<EntityStatus> entityStatuses }) async
    test('test campaignsList', () async {
      // TODO
    });

    // Update campaigns
    //
    // Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
    //
    //Future<CampaignBatchWriteResponseModel> campaignsUpdate(String adAccountId, List<CampaignBatchUpdateItem> campaignBatchUpdateItem) async
    test('test campaignsUpdate', () async {
      // TODO
    });

    // Get campaign delivery estimates
    //
    // Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
    //
    //Future<CampaignDeliveryEstimatesResponse> getCampaignDeliveryEstimates(String adAccountId, List<CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign) async
    test('test getCampaignDeliveryEstimates', () async {
      // TODO
    });

  });
}
