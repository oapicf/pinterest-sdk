import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AdsApi
void main() {
  final instance = Openapi().getAdsApi();

  group(AdsApi, () {
    // Create ad preview with pin or image
    //
    // Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
    //
    //Future<AdPreviewURLResponse> adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest) async
    test('test adPreviewsCreate', () async {
      // TODO
    });

    // Get targeting analytics for ads
    //
    // Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    //
    //Future<MetricsResponse> adTargetingAnalyticsGet(String adAccountId, BuiltList<String> adIds, Date startDate, Date endDate, BuiltList<AdsAnalyticsAdTargetingType> targetingTypes, BuiltList<ReportingColumnSync> columns, Granularity granularity, { ConversionAttributionWindowDays clickWindowDays, ConversionAttributionWindowDays engagementWindowDays, ConversionAttributionWindowDays viewWindowDays, ConversionReportTimeType conversionReportTime, BuiltList<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, BuiltList<String> sortColumns, bool sortAscending }) async
    test('test adTargetingAnalyticsGet', () async {
      // TODO
    });

    // Get ad analytics
    //
    //     Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    //
    //Future<BuiltList<AdsAnalytics>> adsAnalytics(Date startDate, Date endDate, BuiltList<ReportingColumnSync> columns, Granularity granularity, String adAccountId, { BuiltList<String> pinIds, BuiltList<String> adIds, num clickWindowDays, num engagementWindowDays, num viewWindowDays, String conversionReportTime, BuiltList<String> campaignIds, ReportingTimeZone reportingTimezone }) async
    test('test adsAnalytics', () async {
      // TODO
    });

    // Create ads
    //
    // Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
    //
    //Future<AdBatchWriteResponseModel> adsCreate(String adAccountId, BuiltList<AdCreate> adCreate) async
    test('test adsCreate', () async {
      // TODO
    });

    // Get ad
    //
    // Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
    //
    //Future<Ad> adsGet(String adId, String adAccountId) async
    test('test adsGet', () async {
      // TODO
    });

    // List ads
    //
    // List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
    //
    //Future<AdsList200Response> adsList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order, BuiltList<String> campaignIds, BuiltList<String> adGroupIds, BuiltList<String> adIds, BuiltList<EntityStatus> entityStatuses }) async
    test('test adsList', () async {
      // TODO
    });

    // Update ads
    //
    // Update multiple existing ads
    //
    //Future<AdBatchWriteResponseModel> adsUpdate(String adAccountId, BuiltList<AdBatchUpdate> adBatchUpdate) async
    test('test adsUpdate', () async {
      // TODO
    });

    // Create ad preview records for one or more ad groups
    //
    // Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
    //
    //Future<BuiltList<CampaignAdPreviewCreate200ResponseInner>> campaignAdPreviewCreate(String adAccountId, BuiltList<CampaignAdPreviewCreate> campaignAdPreviewCreate) async
    test('test campaignAdPreviewCreate', () async {
      // TODO
    });

    // Delete ad preview records for one or more ad groups
    //
    // Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
    //
    //Future<BuiltList<CampaignAdPreviewDelete200ResponseInner>> campaignAdPreviewDelete(BuiltList<String> adGroupIds, String adAccountId) async
    test('test campaignAdPreviewDelete', () async {
      // TODO
    });

    // Fetch ad preview records for one or more ad groups
    //
    // Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
    //
    //Future<BuiltList<CampaignAdPreview>> campaignAdPreviewRead(BuiltList<String> adGroupIds, String adAccountId) async
    test('test campaignAdPreviewRead', () async {
      // TODO
    });

  });
}
