//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/keywords.dart';
import 'package:openapi/src/model/keywords_create.dart';
import 'package:openapi/src/model/keywords_get200_response.dart';
import 'package:openapi/src/model/keywords_metrics_array_response.dart';
import 'package:openapi/src/model/keywords_update.dart';
import 'package:openapi/src/model/match_type.dart';
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:openapi/src/model/trend_type.dart';
import 'package:openapi/src/model/trending_keywords_response.dart';
import 'package:openapi/src/model/trends_age_bucket.dart';
import 'package:openapi/src/model/trends_gender_filter.dart';
import 'package:openapi/src/model/trends_l1_interest.dart';
import 'package:openapi/src/model/trends_supported_region.dart';

class KeywordsApi {

  final Dio _dio;

  final Serializers _serializers;

  const KeywordsApi(this._dio, this._serializers);

  /// Get country&#39;s keyword metrics
  ///   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [countryCode] - Two letter country code (ISO 3166-1 alpha-2)
  /// * [keywords] - Comma-separated keywords
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [KeywordsMetricsArrayResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<KeywordsMetricsArrayResponse>> countryKeywordsMetricsGet({ 
    required String adAccountId,
    required String countryCode,
    required BuiltList<String> keywords,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/keywords/metrics'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },{
            'type': 'oauth2',
            'name': 'client_credentials',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      r'country_code': encodeQueryParameter(_serializers, countryCode, const FullType(String)),
      r'keywords': encodeCollectionQueryParameter<String>(_serializers, keywords, const FullType(BuiltList, [FullType(String)]), format: ListFormat.csv,),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    KeywordsMetricsArrayResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(KeywordsMetricsArrayResponse),
      ) as KeywordsMetricsArrayResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<KeywordsMetricsArrayResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Create keywords
  ///   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [keywordsCreate] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [Keywords] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<Keywords>> keywordsCreate({ 
    required String adAccountId,
    required KeywordsCreate keywordsCreate,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/keywords'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
    final _options = Options(
      method: r'POST',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(KeywordsCreate);
      _bodyData = _serializers.serialize(keywordsCreate, specifiedType: _type);

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    Keywords? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(Keywords),
      ) as Keywords;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<Keywords>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Get keywords
  ///     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [campaignId] - Campaign Id to use to filter the results.
  /// * [adGroupId] - Ad group Id.
  /// * [adGroupIds] - List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
  /// * [matchTypes] - Keyword [match type](/docs/api-features/targeting-overview/)
  /// * [bookmark] - Cursor used to fetch the next page of items
  /// * [pageSize] - Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [KeywordsGet200Response] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<KeywordsGet200Response>> keywordsGet({ 
    required String adAccountId,
    String? campaignId,
    String? adGroupId,
    BuiltList<String>? adGroupIds,
    BuiltList<MatchType>? matchTypes,
    String? bookmark,
    int? pageSize = 25,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/keywords'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },{
            'type': 'oauth2',
            'name': 'client_credentials',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (campaignId != null) r'campaign_id': encodeQueryParameter(_serializers, campaignId, const FullType(String)),
      if (adGroupId != null) r'ad_group_id': encodeQueryParameter(_serializers, adGroupId, const FullType(String)),
      if (adGroupIds != null) r'ad_group_ids': encodeCollectionQueryParameter<String>(_serializers, adGroupIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (matchTypes != null) r'match_types': encodeCollectionQueryParameter<MatchType>(_serializers, matchTypes, const FullType(BuiltList, [FullType(MatchType)]), format: ListFormat.multi,),
      if (bookmark != null) r'bookmark': encodeQueryParameter(_serializers, bookmark, const FullType(String)),
      if (pageSize != null) r'page_size': encodeQueryParameter(_serializers, pageSize, const FullType(int)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    KeywordsGet200Response? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(KeywordsGet200Response),
      ) as KeywordsGet200Response;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<KeywordsGet200Response>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// Update keywords
  ///   Update one or more keywords&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity&#39;s keywords list.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [keywordsUpdate] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [Keywords] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<Keywords>> keywordsUpdate({ 
    required String adAccountId,
    required KeywordsUpdate keywordsUpdate,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/keywords'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
    final _options = Options(
      method: r'PATCH',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(KeywordsUpdate);
      _bodyData = _serializers.serialize(keywordsUpdate, specifiedType: _type);

    } catch(error, stackTrace) {
      throw DioException(
         requestOptions: _options.compose(
          _dio.options,
          _path,
        ),
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    final _response = await _dio.request<Object>(
      _path,
      data: _bodyData,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    Keywords? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(Keywords),
      ) as Keywords;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<Keywords>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

  /// List trending keywords
  /// Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
  ///
  /// Parameters:
  /// * [region] -   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia
  /// * [trendType] -   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
  /// * [interests] -   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion
  /// * [genders] - If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings.
  /// * [ages] - If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.
  /// * [includeKeywords] - If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.
  /// * [normalizeAgainstGroup] -  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
  /// * [limit] - The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
  /// * [includeDemographics] - Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [TrendingKeywordsResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<TrendingKeywordsResponse>> trendingKeywordsList({ 
    required TrendsSupportedRegion region,
    required TrendType trendType,
    BuiltList<TrendsL1Interest>? interests,
    BuiltList<TrendsGenderFilter>? genders,
    BuiltList<TrendsAgeBucket>? ages,
    BuiltList<String>? includeKeywords,
    bool? normalizeAgainstGroup = false,
    int? limit = 50,
    bool? includeDemographics = false,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/trends/keywords/{region}/top/{trend_type}'.replaceAll('{' r'region' '}', encodeQueryParameter(_serializers, region, const FullType(TrendsSupportedRegion)).toString()).replaceAll('{' r'trend_type' '}', encodeQueryParameter(_serializers, trendType, const FullType(TrendType)).toString());
    final _options = Options(
      method: r'GET',
      headers: <String, dynamic>{
        ...?headers,
      },
      extra: <String, dynamic>{
        'secure': <Map<String, String>>[
          {
            'type': 'oauth2',
            'name': 'pinterest_oauth2',
          },
        ],
        ...?extra,
      },
      validateStatus: validateStatus,
    );

    final _queryParameters = <String, dynamic>{
      if (interests != null) r'interests': encodeCollectionQueryParameter<TrendsL1Interest>(_serializers, interests, const FullType(BuiltList, [FullType(TrendsL1Interest)]), format: ListFormat.multi,),
      if (genders != null) r'genders': encodeCollectionQueryParameter<TrendsGenderFilter>(_serializers, genders, const FullType(BuiltList, [FullType(TrendsGenderFilter)]), format: ListFormat.multi,),
      if (ages != null) r'ages': encodeCollectionQueryParameter<TrendsAgeBucket>(_serializers, ages, const FullType(BuiltList, [FullType(TrendsAgeBucket)]), format: ListFormat.multi,),
      if (includeKeywords != null) r'include_keywords': encodeCollectionQueryParameter<String>(_serializers, includeKeywords, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (normalizeAgainstGroup != null) r'normalize_against_group': encodeQueryParameter(_serializers, normalizeAgainstGroup, const FullType(bool)),
      if (limit != null) r'limit': encodeQueryParameter(_serializers, limit, const FullType(int)),
      if (includeDemographics != null) r'include_demographics': encodeQueryParameter(_serializers, includeDemographics, const FullType(bool)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    TrendingKeywordsResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(TrendingKeywordsResponse),
      ) as TrendingKeywordsResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<TrendingKeywordsResponse>(
      data: _responseData,
      headers: _response.headers,
      isRedirect: _response.isRedirect,
      requestOptions: _response.requestOptions,
      redirects: _response.redirects,
      statusCode: _response.statusCode,
      statusMessage: _response.statusMessage,
      extra: _response.extra,
    );
  }

}
