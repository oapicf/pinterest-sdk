//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/ad_array_response.dart';
import 'package:openapi/src/model/ad_create_request.dart';
import 'package:openapi/src/model/ad_preview_request.dart';
import 'package:openapi/src/model/ad_preview_url_response.dart';
import 'package:openapi/src/model/ad_response.dart';
import 'package:openapi/src/model/ad_update_request.dart';
import 'package:openapi/src/model/ads_analytics_ad_targeting_type.dart';
import 'package:openapi/src/model/ads_analytics_response_inner.dart';
import 'package:openapi/src/model/ads_list200_response.dart';
import 'package:openapi/src/model/conversion_report_attribution_type.dart';
import 'package:openapi/src/model/date.dart';
import 'package:openapi/src/model/error.dart';
import 'package:openapi/src/model/granularity.dart';
import 'package:openapi/src/model/metrics_response.dart';
import 'package:openapi/src/model/reporting_time_zone.dart';

class AdsApi {

  final Dio _dio;

  final Serializers _serializers;

  const AdsApi(this._dio, this._serializers);

  /// Create ad preview with pin or image
  /// Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.  Creating ad preview from catalog product group is currently in BETA and is not available to all users.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adPreviewRequest] - Create ad preview with pin or image.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdPreviewURLResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdPreviewURLResponse>> adPreviewsCreate({ 
    required String adAccountId,
    required AdPreviewRequest adPreviewRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ad_previews'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      const _type = FullType(AdPreviewRequest);
      _bodyData = _serializers.serialize(adPreviewRequest, specifiedType: _type);

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

    AdPreviewURLResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdPreviewURLResponse),
      ) as AdPreviewURLResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdPreviewURLResponse>(
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

  /// Get targeting analytics for ads
  /// Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adIds] - List of Ad Ids to use to filter the results.
  /// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  /// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  /// * [targetingTypes] - Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
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
  Future<Response<MetricsResponse>> adTargetingAnalyticsGet({ 
    required String adAccountId,
    required BuiltList<String> adIds,
    required Date startDate,
    required Date endDate,
    required BuiltList<AdsAnalyticsAdTargetingType> targetingTypes,
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
    final _path = r'/ad_accounts/{ad_account_id}/ads/targeting_analytics'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      r'ad_ids': encodeCollectionQueryParameter<String>(_serializers, adIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      r'start_date': encodeQueryParameter(_serializers, startDate, const FullType(Date)),
      r'end_date': encodeQueryParameter(_serializers, endDate, const FullType(Date)),
      r'targeting_types': encodeCollectionQueryParameter<AdsAnalyticsAdTargetingType>(_serializers, targetingTypes, const FullType(BuiltList, [FullType(AdsAnalyticsAdTargetingType)]), format: ListFormat.csv,),
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

  /// Get ad analytics
  /// Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  /// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  /// * [columns] - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
  /// * [granularity] - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  /// * [adIds] - List of Ad Ids to use to filter the results.
  /// * [clickWindowDays] - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  /// * [engagementWindowDays] - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.
  /// * [viewWindowDays] - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  /// * [conversionReportTime] - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  /// * [pinIds] - List of Pin IDs.
  /// * [campaignIds] - List of Campaign Ids to use to filter the results.
  /// * [reportingTimezone] - Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BuiltList<AdsAnalyticsResponseInner>] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BuiltList<AdsAnalyticsResponseInner>>> adsAnalytics({ 
    required String adAccountId,
    required Date startDate,
    required Date endDate,
    required BuiltList<String> columns,
    required Granularity granularity,
    BuiltList<String>? adIds,
    int? clickWindowDays = 30,
    int? engagementWindowDays = 30,
    int? viewWindowDays = 1,
    String? conversionReportTime = 'TIME_OF_AD_ACTION',
    BuiltList<String>? pinIds,
    BuiltList<String>? campaignIds,
    ReportingTimeZone? reportingTimezone,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ads/analytics'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      if (adIds != null) r'ad_ids': encodeCollectionQueryParameter<String>(_serializers, adIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      r'columns': encodeCollectionQueryParameter<String>(_serializers, columns, const FullType(BuiltList, [FullType(String)]), format: ListFormat.csv,),
      r'granularity': encodeQueryParameter(_serializers, granularity, const FullType(Granularity)),
      if (clickWindowDays != null) r'click_window_days': encodeQueryParameter(_serializers, clickWindowDays, const FullType(int)),
      if (engagementWindowDays != null) r'engagement_window_days': encodeQueryParameter(_serializers, engagementWindowDays, const FullType(int)),
      if (viewWindowDays != null) r'view_window_days': encodeQueryParameter(_serializers, viewWindowDays, const FullType(int)),
      if (conversionReportTime != null) r'conversion_report_time': encodeQueryParameter(_serializers, conversionReportTime, const FullType(String)),
      if (pinIds != null) r'pin_ids': encodeCollectionQueryParameter<String>(_serializers, pinIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (campaignIds != null) r'campaign_ids': encodeCollectionQueryParameter<String>(_serializers, campaignIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
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

    BuiltList<AdsAnalyticsResponseInner>? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BuiltList, [FullType(AdsAnalyticsResponseInner)]),
      ) as BuiltList<AdsAnalyticsResponseInner>;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BuiltList<AdsAnalyticsResponseInner>>(
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

  /// Create ads
  /// Create multiple new ads. Request must contain &#x60;ad_group_id&#x60;, &#x60;creative_type&#x60;, and the source Pin &#x60;pin_id&#x60;.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adCreateRequest] - List of ads to create, size limit [1, 30].
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdArrayResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdArrayResponse>> adsCreate({ 
    required String adAccountId,
    required BuiltList<AdCreateRequest> adCreateRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ads'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      const _type = FullType(BuiltList, [FullType(AdCreateRequest)]);
      _bodyData = _serializers.serialize(adCreateRequest, specifiedType: _type);

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

    AdArrayResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdArrayResponse),
      ) as AdArrayResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdArrayResponse>(
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

  /// Get ad
  /// Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adId] - Unique identifier of an ad.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdResponse>> adsGet({ 
    required String adAccountId,
    required String adId,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ads/{ad_id}'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString()).replaceAll('{' r'ad_id' '}', encodeQueryParameter(_serializers, adId, const FullType(String)).toString());
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

    AdResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdResponse),
      ) as AdResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdResponse>(
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

  /// List ads
  /// List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [campaignIds] - List of Campaign Ids to use to filter the results.
  /// * [adGroupIds] - List of Ad group Ids to use to filter the results.
  /// * [adIds] - List of Ad Ids to use to filter the results.
  /// * [entityStatuses] - Entity status
  /// * [pageSize] - Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  /// * [order] - The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  /// * [bookmark] - Cursor used to fetch the next page of items
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdsList200Response] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdsList200Response>> adsList({ 
    required String adAccountId,
    BuiltList<String>? campaignIds,
    BuiltList<String>? adGroupIds,
    BuiltList<String>? adIds,
    BuiltList<String>? entityStatuses,
    int? pageSize = 25,
    String? order,
    String? bookmark,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ads'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      if (adIds != null) r'ad_ids': encodeCollectionQueryParameter<String>(_serializers, adIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (entityStatuses != null) r'entity_statuses': encodeCollectionQueryParameter<String>(_serializers, entityStatuses, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (pageSize != null) r'page_size': encodeQueryParameter(_serializers, pageSize, const FullType(int)),
      if (order != null) r'order': encodeQueryParameter(_serializers, order, const FullType(String)),
      if (bookmark != null) r'bookmark': encodeQueryParameter(_serializers, bookmark, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    AdsList200Response? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdsList200Response),
      ) as AdsList200Response;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdsList200Response>(
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

  /// Update ads
  /// Update multiple existing ads
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [adUpdateRequest] - List of ads to update, size limit [1, 30]
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [AdArrayResponse] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<AdArrayResponse>> adsUpdate({ 
    required String adAccountId,
    required BuiltList<AdUpdateRequest> adUpdateRequest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/ads'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      const _type = FullType(BuiltList, [FullType(AdUpdateRequest)]);
      _bodyData = _serializers.serialize(adUpdateRequest, specifiedType: _type);

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

    AdArrayResponse? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(AdArrayResponse),
      ) as AdArrayResponse;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<AdArrayResponse>(
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
