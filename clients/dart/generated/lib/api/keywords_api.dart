//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class KeywordsApi {
  KeywordsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get country's keyword metrics
  ///
  /// See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] countryCode (required):
  ///   Two letter country code (ISO 3166-1 alpha-2)
  ///
  /// * [List<String>] keywords (required):
  ///   Comma-separated keywords
  Future<Response> countryKeywordsMetricsGetWithHttpInfo(String adAccountId, String countryCode, List<String> keywords,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/keywords/metrics'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'country_code', countryCode));
      queryParams.addAll(_queryParams('csv', 'keywords', keywords));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get country's keyword metrics
  ///
  /// See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] countryCode (required):
  ///   Two letter country code (ISO 3166-1 alpha-2)
  ///
  /// * [List<String>] keywords (required):
  ///   Comma-separated keywords
  Future<KeywordsMetricsArrayResponse?> countryKeywordsMetricsGet(String adAccountId, String countryCode, List<String> keywords,) async {
    final response = await countryKeywordsMetricsGetWithHttpInfo(adAccountId, countryCode, keywords,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'KeywordsMetricsArrayResponse',) as KeywordsMetricsArrayResponse;
    
    }
    return null;
  }

  /// Create keywords
  ///
  /// <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/reference/rate-limits/\">WRITE</a>.</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [KeywordsRequest] keywordsRequest (required):
  Future<Response> keywordsCreateWithHttpInfo(String adAccountId, KeywordsRequest keywordsRequest,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/keywords'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = keywordsRequest;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'POST',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Create keywords
  ///
  /// <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/reference/rate-limits/\">WRITE</a>.</p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [KeywordsRequest] keywordsRequest (required):
  Future<KeywordsResponse?> keywordsCreate(String adAccountId, KeywordsRequest keywordsRequest,) async {
    final response = await keywordsCreateWithHttpInfo(adAccountId, keywordsRequest,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'KeywordsResponse',) as KeywordsResponse;
    
    }
    return null;
  }

  /// Get keywords
  ///
  /// <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] campaignId:
  ///   Campaign Id to use to filter the results.
  ///
  /// * [String] adGroupId:
  ///   Ad group Id.
  ///
  /// * [List<String>] adGroupIds:
  ///   List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
  ///
  /// * [List<MatchType>] matchTypes:
  ///   Keyword <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type</a>
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. Default maximum of 250. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<Response> keywordsGetWithHttpInfo(String adAccountId, { String? campaignId, String? adGroupId, List<String>? adGroupIds, List<MatchType>? matchTypes, int? pageSize, String? bookmark, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/keywords'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (campaignId != null) {
      queryParams.addAll(_queryParams('', 'campaign_id', campaignId));
    }
    if (adGroupId != null) {
      queryParams.addAll(_queryParams('', 'ad_group_id', adGroupId));
    }
    if (adGroupIds != null) {
      queryParams.addAll(_queryParams('multi', 'ad_group_ids', adGroupIds));
    }
    if (matchTypes != null) {
      queryParams.addAll(_queryParams('multi', 'match_types', matchTypes));
    }
    if (pageSize != null) {
      queryParams.addAll(_queryParams('', 'page_size', pageSize));
    }
    if (bookmark != null) {
      queryParams.addAll(_queryParams('', 'bookmark', bookmark));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Get keywords
  ///
  /// <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [String] campaignId:
  ///   Campaign Id to use to filter the results.
  ///
  /// * [String] adGroupId:
  ///   Ad group Id.
  ///
  /// * [List<String>] adGroupIds:
  ///   List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
  ///
  /// * [List<MatchType>] matchTypes:
  ///   Keyword <a target=\"_blank\" href=\"/docs/api-features/targeting-overview/\">match type</a>
  ///
  /// * [int] pageSize:
  ///   Maximum number of items to include in a single page of the response. Default maximum of 250. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ///
  /// * [String] bookmark:
  ///   Cursor used to fetch the next page of items
  Future<KeywordsGet200Response?> keywordsGet(String adAccountId, { String? campaignId, String? adGroupId, List<String>? adGroupIds, List<MatchType>? matchTypes, int? pageSize, String? bookmark, }) async {
    final response = await keywordsGetWithHttpInfo(adAccountId,  campaignId: campaignId, adGroupId: adGroupId, adGroupIds: adGroupIds, matchTypes: matchTypes, pageSize: pageSize, bookmark: bookmark, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'KeywordsGet200Response',) as KeywordsGet200Response;
    
    }
    return null;
  }

  /// Update keywords
  ///
  /// <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [KeywordUpdateBody] keywordUpdateBody (required):
  Future<Response> keywordsUpdateWithHttpInfo(String adAccountId, KeywordUpdateBody keywordUpdateBody,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/keywords'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = keywordUpdateBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/json'];


    return apiClient.invokeAPI(
      path,
      'PATCH',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// Update keywords
  ///
  /// <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [KeywordUpdateBody] keywordUpdateBody (required):
  Future<KeywordsResponse?> keywordsUpdate(String adAccountId, KeywordUpdateBody keywordUpdateBody,) async {
    final response = await keywordsUpdateWithHttpInfo(adAccountId, keywordUpdateBody,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'KeywordsResponse',) as KeywordsResponse;
    
    }
    return null;
  }

  /// List trending keywords
  ///
  /// <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>. 
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [TrendsSupportedRegion] region (required):
  ///   The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia
  ///
  /// * [TrendType] trendType (required):
  ///   The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
  ///
  /// * [List<String>] interests:
  ///   If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion
  ///
  /// * [List<String>] genders:
  ///   If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.
  ///
  /// * [List<String>] ages:
  ///   If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.
  ///
  /// * [List<String>] includeKeywords:
  ///   If set, filters the results to top trends which include at least one of the specified keywords.<br /> If unset, no keyword filtering logic is applied.
  ///
  /// * [bool] normalizeAgainstGroup:
  ///   Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
  ///
  /// * [int] limit:
  ///   The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
  ///
  /// * [bool] includePrediction:
  ///   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> Including predicted weekly search volume data for the next 90 days. By default (`false`), the response will not include predicted data.
  ///
  /// * [bool] includeDemographics:
  ///   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.
  Future<Response> trendingKeywordsListWithHttpInfo(TrendsSupportedRegion region, TrendType trendType, { List<String>? interests, List<String>? genders, List<String>? ages, List<String>? includeKeywords, bool? normalizeAgainstGroup, int? limit, bool? includePrediction, bool? includeDemographics, }) async {
    // ignore: prefer_const_declarations
    final path = r'/trends/keywords/{region}/top/{trend_type}'
      .replaceAll('{region}', region.toString())
      .replaceAll('{trend_type}', trendType.toString());

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (interests != null) {
      queryParams.addAll(_queryParams('multi', 'interests', interests));
    }
    if (genders != null) {
      queryParams.addAll(_queryParams('multi', 'genders', genders));
    }
    if (ages != null) {
      queryParams.addAll(_queryParams('multi', 'ages', ages));
    }
    if (includeKeywords != null) {
      queryParams.addAll(_queryParams('multi', 'include_keywords', includeKeywords));
    }
    if (normalizeAgainstGroup != null) {
      queryParams.addAll(_queryParams('', 'normalize_against_group', normalizeAgainstGroup));
    }
    if (limit != null) {
      queryParams.addAll(_queryParams('', 'limit', limit));
    }
    if (includePrediction != null) {
      queryParams.addAll(_queryParams('', 'include_prediction', includePrediction));
    }
    if (includeDemographics != null) {
      queryParams.addAll(_queryParams('', 'include_demographics', includeDemographics));
    }

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
    );
  }

  /// List trending keywords
  ///
  /// <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>. 
  ///
  /// Parameters:
  ///
  /// * [TrendsSupportedRegion] region (required):
  ///   The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia
  ///
  /// * [TrendType] trendType (required):
  ///   The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
  ///
  /// * [List<String>] interests:
  ///   If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion
  ///
  /// * [List<String>] genders:
  ///   If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.
  ///
  /// * [List<String>] ages:
  ///   If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.
  ///
  /// * [List<String>] includeKeywords:
  ///   If set, filters the results to top trends which include at least one of the specified keywords.<br /> If unset, no keyword filtering logic is applied.
  ///
  /// * [bool] normalizeAgainstGroup:
  ///   Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
  ///
  /// * [int] limit:
  ///   The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
  ///
  /// * [bool] includePrediction:
  ///   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> Including predicted weekly search volume data for the next 90 days. By default (`false`), the response will not include predicted data.
  ///
  /// * [bool] includeDemographics:
  ///   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.
  Future<TrendingKeywordsResponse?> trendingKeywordsList(TrendsSupportedRegion region, TrendType trendType, { List<String>? interests, List<String>? genders, List<String>? ages, List<String>? includeKeywords, bool? normalizeAgainstGroup, int? limit, bool? includePrediction, bool? includeDemographics, }) async {
    final response = await trendingKeywordsListWithHttpInfo(region, trendType,  interests: interests, genders: genders, ages: ages, includeKeywords: includeKeywords, normalizeAgainstGroup: normalizeAgainstGroup, limit: limit, includePrediction: includePrediction, includeDemographics: includeDemographics, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TrendingKeywordsResponse',) as TrendingKeywordsResponse;
    
    }
    return null;
  }
}
