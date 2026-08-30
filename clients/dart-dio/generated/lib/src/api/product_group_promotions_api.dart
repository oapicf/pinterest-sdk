//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/date.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/granularity.dart';
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:openapi/src/model/pinterest_lib_pagination_order.dart';
import 'package:openapi/src/model/product_group_analytics_items.dart';
import 'package:openapi/src/model/product_group_promotion.dart';
import 'package:openapi/src/model/product_group_promotions.dart';
import 'package:openapi/src/model/product_group_promotions_create.dart';
import 'package:openapi/src/model/product_group_promotions_list200_response.dart';
import 'package:openapi/src/model/product_group_promotions_update_with_required_body.dart';
import 'package:openapi/src/model/reporting_column_sync.dart';
import 'package:openapi/src/model/reporting_time_zone.dart';

class ProductGroupPromotionsApi {

  final Dio _dio;

  final Serializers _serializers;

  const ProductGroupPromotionsApi(this._dio, this._serializers);

  /// Create product group promotions
  /// Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [productGroupPromotionsCreate] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [ProductGroupPromotions] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<ProductGroupPromotions>> productGroupPromotionsCreate({ 
    required String adAccountId,
    required ProductGroupPromotionsCreate productGroupPromotionsCreate,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/product_group_promotions'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      const _type = FullType(ProductGroupPromotionsCreate);
      _bodyData = _serializers.serialize(productGroupPromotionsCreate, specifiedType: _type);

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

    ProductGroupPromotions? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(ProductGroupPromotions),
      ) as ProductGroupPromotions;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<ProductGroupPromotions>(
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

  /// Get a product group promotion by id
  /// Get a product group promotion by id
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [productGroupPromotionId] - Unique identifier of a product group promotion
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [ProductGroupPromotion] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<ProductGroupPromotion>> productGroupPromotionsGet({ 
    required String adAccountId,
    required String productGroupPromotionId,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString()).replaceAll('{' r'product_group_promotion_id' '}', encodeQueryParameter(_serializers, productGroupPromotionId, const FullType(String)).toString());
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

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    ProductGroupPromotion? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(ProductGroupPromotion),
      ) as ProductGroupPromotion;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<ProductGroupPromotion>(
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

  /// Get product group promotions
  /// List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [bookmark] - Cursor used to fetch the next page of items
  /// * [pageSize] - Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  /// * [order] - The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  /// * [productGroupPromotionIds] - List of Product group promotion Ids.
  /// * [entityStatuses] - Entity status
  /// * [adGroupId] - Ad group Id.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [ProductGroupPromotionsList200Response] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<ProductGroupPromotionsList200Response>> productGroupPromotionsList({ 
    required String adAccountId,
    String? bookmark,
    int? pageSize = 25,
    PinterestLibPaginationOrder? order,
    BuiltList<String>? productGroupPromotionIds,
    BuiltList<EntityStatus>? entityStatuses,
    String? adGroupId,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/product_group_promotions'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      if (bookmark != null) r'bookmark': encodeQueryParameter(_serializers, bookmark, const FullType(String)),
      if (pageSize != null) r'page_size': encodeQueryParameter(_serializers, pageSize, const FullType(int)),
      if (order != null) r'order': encodeQueryParameter(_serializers, order, const FullType(PinterestLibPaginationOrder)),
      if (productGroupPromotionIds != null) r'product_group_promotion_ids': encodeCollectionQueryParameter<String>(_serializers, productGroupPromotionIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      if (entityStatuses != null) r'entity_statuses': encodeCollectionQueryParameter<EntityStatus>(_serializers, entityStatuses, const FullType(BuiltList, [FullType(EntityStatus)]), format: ListFormat.multi,),
      if (adGroupId != null) r'ad_group_id': encodeQueryParameter(_serializers, adGroupId, const FullType(String)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    ProductGroupPromotionsList200Response? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(ProductGroupPromotionsList200Response),
      ) as ProductGroupPromotionsList200Response;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<ProductGroupPromotionsList200Response>(
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

  /// Update product group promotions
  /// Update multiple existing Product Group Promotions (by product_group_id)
  ///
  /// Parameters:
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [productGroupPromotionsUpdateWithRequiredBody] 
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [ProductGroupPromotions] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<ProductGroupPromotions>> productGroupPromotionsUpdate({ 
    required String adAccountId,
    required ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/product_group_promotions'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      const _type = FullType(ProductGroupPromotionsUpdateWithRequiredBody);
      _bodyData = _serializers.serialize(productGroupPromotionsUpdateWithRequiredBody, specifiedType: _type);

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

    ProductGroupPromotions? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(ProductGroupPromotions),
      ) as ProductGroupPromotions;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<ProductGroupPromotions>(
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

  /// Get product group analytics
  /// Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  ///
  /// Parameters:
  /// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
  /// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
  /// * [productGroupIds] - List of Product group Ids to use to filter the results.
  /// * [columns] - Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
  /// * [granularity] -   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [clickWindowDays] - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  /// * [engagementWindowDays] - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
  /// * [viewWindowDays] - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  /// * [conversionReportTime] - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  /// * [reportingTimezone] - Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BuiltList<ProductGroupAnalyticsItems>] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BuiltList<ProductGroupAnalyticsItems>>> productGroupsAnalytics({ 
    required Date startDate,
    required Date endDate,
    required BuiltList<String> productGroupIds,
    required BuiltList<ReportingColumnSync> columns,
    required Granularity granularity,
    required String adAccountId,
    num? clickWindowDays = 30,
    num? engagementWindowDays = 30,
    num? viewWindowDays = 1,
    String? conversionReportTime = 'TIME_OF_AD_ACTION',
    ReportingTimeZone? reportingTimezone,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/product_groups/analytics'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      r'product_group_ids': encodeCollectionQueryParameter<String>(_serializers, productGroupIds, const FullType(BuiltList, [FullType(String)]), format: ListFormat.multi,),
      r'columns': encodeCollectionQueryParameter<ReportingColumnSync>(_serializers, columns, const FullType(BuiltList, [FullType(ReportingColumnSync)]), format: ListFormat.csv,),
      r'granularity': encodeQueryParameter(_serializers, granularity, const FullType(Granularity)),
      if (clickWindowDays != null) r'click_window_days': encodeQueryParameter(_serializers, clickWindowDays, const FullType(num)),
      if (engagementWindowDays != null) r'engagement_window_days': encodeQueryParameter(_serializers, engagementWindowDays, const FullType(num)),
      if (viewWindowDays != null) r'view_window_days': encodeQueryParameter(_serializers, viewWindowDays, const FullType(num)),
      if (conversionReportTime != null) r'conversion_report_time': encodeQueryParameter(_serializers, conversionReportTime, const FullType(String)),
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

    BuiltList<ProductGroupAnalyticsItems>? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BuiltList, [FullType(ProductGroupAnalyticsItems)]),
      ) as BuiltList<ProductGroupAnalyticsItems>;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BuiltList<ProductGroupAnalyticsItems>>(
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
