import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ProductCategoriesApi
void main() {
  final instance = Openapi().getProductCategoriesApi();

  group(ProductCategoriesApi, () {
    // Get featured topics
    //
    //   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
    //
    //Future<BuiltList<FeaturedTrend>> trendsFeaturedTopicsList(ProductCategoryRegion region, { InterestsEnum interest }) async
    test('test trendsFeaturedTopicsList', () async {
      // TODO
    });

    // Get product category details
    //
    //   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
    //
    //Future<BuiltList<ProductCategoryDetails>> trendsProductCategoriesDetailsList(BuiltList<ProductCategoryEnum> productCategories, ProductCategoryRegion region, { ProductCategoryDetailLookbackWindow lookbackWindow, ProductCategoriesEngagementType engagementType }) async
    test('test trendsProductCategoriesDetailsList', () async {
      // TODO
    });

    // Get a list of growing Shopping Product Categories
    //
    //   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
    //
    //Future<BuiltList<TrendingProductCategory>> trendsProductCategoriesTrendingList(ProductCategoryRegion region, { BuiltList<VerticalProductCategory> verticals, BuiltList<AgeTrendsBucket> ages, BuiltList<GenderBucket> genders, ProductCategoriesEngagementType engagementType }) async
    test('test trendsProductCategoriesTrendingList', () async {
      // TODO
    });

  });
}
