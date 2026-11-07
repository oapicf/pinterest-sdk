import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for KeywordsApi
void main() {
  final instance = Openapi().getKeywordsApi();

  group(KeywordsApi, () {
    // Get country's keyword metrics
    //
    //   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
    //
    //Future<KeywordsMetricsArrayResponse> countryKeywordsMetricsGet(String adAccountId, String countryCode, BuiltList<String> keywords) async
    test('test countryKeywordsMetricsGet', () async {
      // TODO
    });

    // Create keywords
    //
    //   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }
    //
    //Future<Keywords> keywordsCreate(String adAccountId, KeywordsCreate keywordsCreate) async
    test('test keywordsCreate', () async {
      // TODO
    });

    // Get keywords
    //
    //     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }
    //
    //Future<KeywordsGet200Response> keywordsGet(String adAccountId, { String campaignId, String adGroupId, BuiltList<String> adGroupIds, BuiltList<MatchType> matchTypes, String bookmark, int pageSize }) async
    test('test keywordsGet', () async {
      // TODO
    });

    // Update keywords
    //
    //   Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.
    //
    //Future<Keywords> keywordsUpdate(String adAccountId, KeywordsUpdate keywordsUpdate) async
    test('test keywordsUpdate', () async {
      // TODO
    });

    // List trending keywords
    //
    // Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
    //
    //Future<TrendingKeywordsResponse> trendingKeywordsList(TrendsSupportedRegion region, TrendType trendType, { BuiltList<TrendsL1Interest> interests, BuiltList<TrendsGenderFilter> genders, BuiltList<TrendsAgeBucket> ages, BuiltList<String> includeKeywords, bool normalizeAgainstGroup, int limit, bool includeDemographics }) async
    test('test trendingKeywordsList', () async {
      // TODO
    });

  });
}
