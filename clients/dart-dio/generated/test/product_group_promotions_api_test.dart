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
    //Future<ProductGroupPromotionResponse> productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest) async
    test('test productGroupPromotionsCreate', () async {
      // TODO
    });

    // Get a product group promotion by id
    //
    // Get a product group promotion by id
    //
    //Future<ProductGroupPromotionResponse> productGroupPromotionsGet(String adAccountId, String productGroupPromotionId) async
    test('test productGroupPromotionsGet', () async {
      // TODO
    });

    // Get product group promotions
    //
    // List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
    //
    //Future<ProductGroupPromotionsList200Response> productGroupPromotionsList(String adAccountId, { BuiltList<String> productGroupPromotionIds, BuiltList<String> entityStatuses, String adGroupId, int pageSize, String order, String bookmark }) async
    test('test productGroupPromotionsList', () async {
      // TODO
    });

    // Update product group promotions
    //
    // Update multiple existing Product Group Promotions (by product_group_id)
    //
    //Future<ProductGroupPromotionResponse> productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest) async
    test('test productGroupPromotionsUpdate', () async {
      // TODO
    });

    // Get product group analytics
    //
    // Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
    //
    //Future<BuiltList<ProductGroupAnalyticsResponseInner>> productGroupsAnalytics(String adAccountId, Date startDate, Date endDate, BuiltList<String> productGroupIds, BuiltList<String> columns, Granularity granularity, { int clickWindowDays, int engagementWindowDays, int viewWindowDays, String conversionReportTime }) async
    test('test productGroupsAnalytics', () async {
      // TODO
    });

  });
}
