import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ProductGroupPromotionsApi
void main() {
  final instance = Openapi().getProductGroupPromotionsApi();

  group(ProductGroupPromotionsApi, () {
    // Create product group promotions
    //
    // Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
    //
    //Future<ProductGroupPromotions> productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionsCreate productGroupPromotionsCreate) async
    test('test productGroupPromotionsCreate', () async {
      // TODO
    });

    // Get a product group promotion by id
    //
    // Get a product group promotion by id
    //
    //Future<ProductGroupPromotion> productGroupPromotionsGet(String adAccountId, String productGroupPromotionId) async
    test('test productGroupPromotionsGet', () async {
      // TODO
    });

    // Get product group promotions
    //
    // List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
    //
    //Future<ProductGroupPromotionsList200Response> productGroupPromotionsList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order, BuiltList<String> productGroupPromotionIds, BuiltList<EntityStatus> entityStatuses, String adGroupId }) async
    test('test productGroupPromotionsList', () async {
      // TODO
    });

    // Update product group promotions
    //
    // Update multiple existing Product Group Promotions (by product_group_id)
    //
    //Future<ProductGroupPromotions> productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody) async
    test('test productGroupPromotionsUpdate', () async {
      // TODO
    });

    // Get product group analytics
    //
    // Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    //
    //Future<BuiltList<ProductGroupAnalyticsItems>> productGroupsAnalytics(Date startDate, Date endDate, BuiltList<String> productGroupIds, BuiltList<ReportingColumnSync> columns, Granularity granularity, String adAccountId, { num clickWindowDays, num engagementWindowDays, num viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone }) async
    test('test productGroupsAnalytics', () async {
      // TODO
    });

  });
}
