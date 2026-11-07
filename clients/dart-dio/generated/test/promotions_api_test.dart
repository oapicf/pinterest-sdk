import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for PromotionsApi
void main() {
  final instance = Openapi().getPromotionsApi();

  group(PromotionsApi, () {
    // Create promotions
    //
    // Create multiple new promotions.
    //
    //Future<PromotionsResponse> promotionsCreate(String adAccountId, BuiltList<PromotionCreate> promotionCreate) async
    test('test promotionsCreate', () async {
      // TODO
    });

    // Delete promotion by id
    //
    // Delete a promotion within Pinterest.
    //
    //Future<Promotion> promotionsDelete(String promotionId, String adAccountId) async
    test('test promotionsDelete', () async {
      // TODO
    });

    // Get promotion by id
    //
    // Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
    //
    //Future<Promotion> promotionsGet(String promotionId, String adAccountId) async
    test('test promotionsGet', () async {
      // TODO
    });

    // Get promotions
    //
    // Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
    //
    //Future<PromotionsList200Response> promotionsList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order }) async
    test('test promotionsList', () async {
      // TODO
    });

    // Update promotions
    //
    // Update multiple promotions.
    //
    //Future<PromotionsResponse> promotionsUpdate(String adAccountId, BuiltList<PromotionBatchUpdate> promotionBatchUpdate) async
    test('test promotionsUpdate', () async {
      // TODO
    });

  });
}
