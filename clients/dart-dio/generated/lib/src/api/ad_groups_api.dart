//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/ad_group_array_response.dart';
import 'package:openapi/src/model/ad_group_audience_sizing_request.dart';
import 'package:openapi/src/model/ad_group_audience_sizing_response.dart';
import 'package:openapi/src/model/ad_group_create_request.dart';
import 'package:openapi/src/model/ad_group_response.dart';
import 'package:openapi/src/model/ad_group_update_request.dart';
import 'package:openapi/src/model/ad_groups_analytics_response_inner.dart';
import 'package:openapi/src/model/ad_groups_list200_response.dart';
import 'package:openapi/src/model/ads_analytics_ad_group_targeting_type.dart';
import 'package:openapi/src/model/bid_floor.dart';
import 'package:openapi/src/model/bid_floor_request.dart';
import 'package:openapi/src/model/conversion_report_attribution_type.dart';
import 'package:openapi/src/model/date.dart';
import 'package:openapi/src/model/error.dart';
import 'package:openapi/src/model/granularity.dart';
import 'package:openapi/src/model/metrics_response.dart';
import 'package:openapi/src/model/reporting_time_zone.dart';

class AdGroupsApi {

  final Dio _dio;

  final Serializers _serializers;

  const AdGroupsApi(this._dio, this._serializers);

  /// Get ad group analytics
  /// Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  /// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  /// * [adGroupIds] - List of Ad group Ids to use to filter the results.
  /// * [columns] - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
  /// * [granularity] - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  /// * [clickWindowDays] - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  /// * [engagementWindowDays] - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.
  /// * [viewWindowDays] - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  /// * [conversionReportTime] - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  /// * [aggregateReportRows] - Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
  /// * [reportingTimezone] - Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BuiltList<AdGroupsAnalyticsResponseInner>] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BuiltList<AdGroupsAnalyticsResponseInner>>> adGroupsAnalytics({ 
    required String adAccountId,
    required Date startDate,
    required Date endDate,
    required BuiltList<String> adGroupIds,
    required BuiltList<String> columns,
    required Granularity granularity,
    int? clickWindowDays = 30,
    int? engagementWindowDays = 30,
    int? viewWindowDays = 1,
    String? conversionReportTime = 'TIME_OF_AD_ACTION',
    bool? aggregateReportRows = false,
    ReportingTimeZone? reportingTimezone,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ad_groups/analytics'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      r'start_date': encodeQueryParameter(_serializers, startDate, const FullType(Date)),
      r'end_date': encodeQueryParameter(_serializers, endDate, const FullType(Date)),
      r'ad_group_ids': encodeCollectionQueryParameter<String>(_serializers, adGroupIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      r'columns': encodeCollectionQueryParameter<String>(_serializers, columns, const FullType(BuiltList, [FullType(String)]), format: ListFormat.csv,),
      r'granularity': encodeQueryParameter(_serializers, granularity, const FullType(Granularity)),
      if (clickWindowDays != null) r'click_window_days': encodeQueryParameter(_serializers, clickWindowDays, const FullType(int)),
      if (engagementWindowDays != null) r'engagement_window_days': encodeQueryParameter(_serializers, engagementWindowDays, const FullType(int)),
      if (viewWindowDays != null) r'view_window_days': encodeQueryParameter(_serializers, viewWindowDays, const FullType(int)),
      if (conversionReportTime != null) r'conversion_report_time': encodeQueryParameter(_serializers, conversionReportTime, const FullType(String)),
      if (aggregateReportRows != null) r'aggregate_report_rows': encodeQueryParameter(_serializers, aggregateReportRows, const FullType(bool)),
      if (reportingTimezone != null) r'reporting_timezone': encodeQueryParameter(_serializers, reportingTimezone, const FullType(ReportingTimeZone)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    BuiltList<AdGroupsAnalyticsResponseInner>? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BuiltList, [FullType(AdGroupsAnalyticsResponseInner)]),
      ) as BuiltList<AdGroupsAnalyticsResponseInner>;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BuiltList<AdGroupsAnalyticsResponseInner>>(
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

  /// Get audience sizing
  /// Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adGroupAudienceSizingRequest] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdGroupAudienceSizingResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdGroupAudienceSizingResponse>> adGroupsAudienceSizing({ 
    required String adAccountId,
    required AdGroupAudienceSizingRequest adGroupAudienceSizingRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ad_groups/audience_sizing'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
          },{
            'type': 'oauth2',
            'name': 'client_credentials',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(AdGroupAudienceSizingRequest);
      _bodyData = _serializers.serialize(adGroupAudienceSizingRequest, specifiedType: _type);

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

    AdGroupAudienceSizingResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdGroupAudienceSizingResponse),
      ) as AdGroupAudienceSizingResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdGroupAudienceSizingResponse>(
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

  /// Get bid floors
  /// List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; For more on bid floors see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-your-bid\&quot;&gt; Set your bid&lt;/a&gt;.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [bidFloorRequest] - Parameters to get bid_floor info
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BidFloor] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BidFloor>> adGroupsBidFloorGet({ 
    required String adAccountId,
    required BidFloorRequest bidFloorRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/bid_floor'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
          },{
            'type': 'oauth2',
            'name': 'client_credentials',
          },
        ],
        ...?extra,
      },
      contentType: 'application/json',
      validateStatus: validateStatus,
    );

    dynamic _bodyData;

    try {
      const _type = FullType(BidFloorRequest);
      _bodyData = _serializers.serialize(bidFloorRequest, specifiedType: _type);

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

    BidFloor? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BidFloor),
      ) as BidFloor;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BidFloor>(
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

  /// Create ad groups
  /// Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/campaign-structure\&quot; target&#x3D;\&quot;_blank\&quot;&gt; click here&lt;/a&gt;. &lt;strong&gt;Notes:&lt;/strong&gt; - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.&lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt; - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;closed beta&lt;/a&gt; access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule. 
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adGroupCreateRequest] - List of ad groups to create, size limit [1, 30].
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdGroupArrayResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdGroupArrayResponse>> adGroupsCreate({ 
    required String adAccountId,
    required BuiltList<AdGroupCreateRequest> adGroupCreateRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ad_groups'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      const _type = FullType(BuiltList, [FullType(AdGroupCreateRequest)]);
      _bodyData = _serializers.serialize(adGroupCreateRequest, specifiedType: _type);

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

    AdGroupArrayResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdGroupArrayResponse),
      ) as AdGroupArrayResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdGroupArrayResponse>(
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

  /// Get ad group
  /// Get a specific ad group given the ad group ID.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adGroupId] - Unique identifier of an ad group.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdGroupResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdGroupResponse>> adGroupsGet({ 
    required String adAccountId,
    required String adGroupId,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString()).replaceAll('{' r'ad_group_id' '}', encodeQueryParameter(_serializers, adGroupId, const FullType(String)).toString());
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

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    AdGroupResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdGroupResponse),
      ) as AdGroupResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdGroupResponse>(
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

  /// List ad groups
  /// List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id. Do not provide both.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [campaignIds] - List of Campaign Ids to use to filter the results.
  /// * [adGroupIds] - List of Ad group Ids to use to filter the results.
  /// * [entityStatuses] - Entity status
  /// * [pageSize] - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  /// * [order] - The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  /// * [bookmark] - Cursor used to fetch the next page of items
  /// * [translateInterestsToNames] - Return interests as text names (if value is true) rather than topic IDs.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdGroupsList200Response] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdGroupsList200Response>> adGroupsList({ 
    required String adAccountId,
    BuiltList<String>? campaignIds,
    BuiltList<String>? adGroupIds,
    BuiltList<String>? entityStatuses,
    int? pageSize = 25,
    String? order,
    String? bookmark,
    bool? translateInterestsToNames = false,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ad_groups'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      if (campaignIds != null) r'campaign_ids': encodeCollectionQueryParameter<String>(_serializers, campaignIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (adGroupIds != null) r'ad_group_ids': encodeCollectionQueryParameter<String>(_serializers, adGroupIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (entityStatuses != null) r'entity_statuses': encodeCollectionQueryParameter<String>(_serializers, entityStatuses, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (pageSize != null) r'page_size': encodeQueryParameter(_serializers, pageSize, const FullType(int)),
      if (order != null) r'order': encodeQueryParameter(_serializers, order, const FullType(String)),
      if (bookmark != null) r'bookmark': encodeQueryParameter(_serializers, bookmark, const FullType(String)),
      if (translateInterestsToNames != null) r'translate_interests_to_names': encodeQueryParameter(_serializers, translateInterestsToNames, const FullType(bool)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    AdGroupsList200Response? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdGroupsList200Response),
      ) as AdGroupsList200Response;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdGroupsList200Response>(
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

  /// Get targeting analytics for ad groups
  /// Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adGroupIds] - List of Ad group Ids to use to filter the results.
  /// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  /// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  /// * [targetingTypes] - Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
  /// * [columns] - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
  /// * [granularity] - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  /// * [clickWindowDays] - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  /// * [engagementWindowDays] - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.
  /// * [viewWindowDays] - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  /// * [conversionReportTime] - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  /// * [attributionTypes] - List of types of attribution for the conversion report
  /// * [reportingTimezone] - Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [MetricsResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<MetricsResponse>> adGroupsTargetingAnalyticsGet({ 
    required String adAccountId,
    required BuiltList<String> adGroupIds,
    required Date startDate,
    required Date endDate,
    required BuiltList<AdsAnalyticsAdGroupTargetingType> targetingTypes,
    required BuiltList<String> columns,
    required Granularity granularity,
    int? clickWindowDays = 30,
    int? engagementWindowDays = 30,
    int? viewWindowDays = 1,
    String? conversionReportTime = 'TIME_OF_AD_ACTION',
    BuiltList<ConversionReportAttributionType>? attributionTypes,
    ReportingTimeZone? reportingTimezone,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      r'ad_group_ids': encodeCollectionQueryParameter<String>(_serializers, adGroupIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      r'start_date': encodeQueryParameter(_serializers, startDate, const FullType(Date)),
      r'end_date': encodeQueryParameter(_serializers, endDate, const FullType(Date)),
      r'targeting_types': encodeCollectionQueryParameter<AdsAnalyticsAdGroupTargetingType>(_serializers, targetingTypes, const FullType(BuiltList, [FullType(AdsAnalyticsAdGroupTargetingType)]), format: ListFormat.csv,),
      r'columns': encodeCollectionQueryParameter<String>(_serializers, columns, const FullType(BuiltList, [FullType(String)]), format: ListFormat.csv,),
      r'granularity': encodeQueryParameter(_serializers, granularity, const FullType(Granularity)),
      if (clickWindowDays != null) r'click_window_days': encodeQueryParameter(_serializers, clickWindowDays, const FullType(int)),
      if (engagementWindowDays != null) r'engagement_window_days': encodeQueryParameter(_serializers, engagementWindowDays, const FullType(int)),
      if (viewWindowDays != null) r'view_window_days': encodeQueryParameter(_serializers, viewWindowDays, const FullType(int)),
      if (conversionReportTime != null) r'conversion_report_time': encodeQueryParameter(_serializers, conversionReportTime, const FullType(String)),
      if (attributionTypes != null) r'attribution_types': encodeCollectionQueryParameter<ConversionReportAttributionType>(_serializers, attributionTypes, const FullType(BuiltList, [FullType(ConversionReportAttributionType)]), format: ListFormat.csv,),
      if (reportingTimezone != null) r'reporting_timezone': encodeQueryParameter(_serializers, reportingTimezone, const FullType(ReportingTimeZone)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    MetricsResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(MetricsResponse),
      ) as MetricsResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<MetricsResponse>(
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

  /// Update ad groups
  /// Update multiple existing ad groups.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adGroupUpdateRequest] - List of ad groups to update, size limit [1, 30].
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdGroupArrayResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdGroupArrayResponse>> adGroupsUpdate({ 
    required String adAccountId,
    required BuiltList<AdGroupUpdateRequest> adGroupUpdateRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ad_groups'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      const _type = FullType(BuiltList, [FullType(AdGroupUpdateRequest)]);
      _bodyData = _serializers.serialize(adGroupUpdateRequest, specifiedType: _type);

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

    AdGroupArrayResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdGroupArrayResponse),
      ) as AdGroupArrayResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdGroupArrayResponse>(
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
