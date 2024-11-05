import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ConversionTagsApi
void main() {
  final instance = Openapi().getConversionTagsApi();

  group(ConversionTagsApi, () {
    // Create conversion tag
    //
    // Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/#enhanced-match\">Enhanced match</a>
    //
    //Future<ConversionTagResponse> conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate) async
    test('test conversionTagsCreate', () async {
      // TODO
    });

    // Get conversion tag
    //
    // Get information about an existing conversion tag.
    //
    //Future<ConversionTagResponse> conversionTagsGet(String adAccountId, String conversionTagId) async
    test('test conversionTagsGet', () async {
      // TODO
    });

    // Get conversion tags
    //
    // List conversion tags associated with an ad account.
    //
    //Future<ConversionTagListResponse> conversionTagsList(String adAccountId, { bool filterDeleted }) async
    test('test conversionTagsList', () async {
      // TODO
    });

    // Get Ocpm eligible conversion tags
    //
    // Get Ocpm eligible conversion tag events for an ad account.
    //
    //Future<BuiltMap<String, BuiltList<ConversionEventResponse>>> ocpmEligibleConversionTagsGet(String adAccountId) async
    test('test ocpmEligibleConversionTagsGet', () async {
      // TODO
    });

    // Get page visit conversion tags
    //
    // Get all page visit conversion tag events for an ad account.
    //
    //Future<PageVisitConversionTagsGet200Response> pageVisitConversionTagsGet(String adAccountId, { int pageSize, String order, String bookmark }) async
    test('test pageVisitConversionTagsGet', () async {
      // TODO
    });

  });
}
