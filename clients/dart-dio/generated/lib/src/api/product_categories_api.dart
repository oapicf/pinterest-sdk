//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/age_trends_bucket.dart';
import 'package:openapi/src/model/featured_trend.dart';
import 'package:openapi/src/model/gender_bucket.dart';
import 'package:openapi/src/model/interests_enum.dart';
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:openapi/src/model/product_categories_engagement_type.dart';
import 'package:openapi/src/model/product_category_detail_lookback_window.dart';
import 'package:openapi/src/model/product_category_details.dart';
import 'package:openapi/src/model/product_category_enum.dart';
import 'package:openapi/src/model/product_category_region.dart';
import 'package:openapi/src/model/trending_product_category.dart';
import 'package:openapi/src/model/vertical_product_category.dart';

class ProductCategoriesApi {

  final Dio _dio;

  final Serializers _serializers;

  const ProductCategoriesApi(this._dio, this._serializers);

  /// Get featured topics
  ///   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
  ///
  /// Parameters:
  /// * [region] -       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  /// * [interest] - Interest to filter by
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BuiltList<FeaturedTrend>] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BuiltList<FeaturedTrend>>> trendsFeaturedTopicsList({ 
    required ProductCategoryRegion region,
    InterestsEnum? interest,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/trends/topics/featured';
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
      if (interest != null) r'interest': encodeQueryParameter(_serializers, interest, const FullType(InterestsEnum)),
      r'region': encodeQueryParameter(_serializers, region, const FullType(ProductCategoryRegion)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    BuiltList<FeaturedTrend>? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BuiltList, [FullType(FeaturedTrend)]),
      ) as BuiltList<FeaturedTrend>;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BuiltList<FeaturedTrend>>(
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

  /// Get product category details
  ///   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
  ///
  /// Parameters:
  /// * [productCategories] - List of product categories
  /// * [region] -       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  /// * [lookbackWindow] -    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
  /// * [engagementType] -      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BuiltList<ProductCategoryDetails>] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BuiltList<ProductCategoryDetails>>> trendsProductCategoriesDetailsList({ 
    required BuiltList<ProductCategoryEnum> productCategories,
    required ProductCategoryRegion region,
    ProductCategoryDetailLookbackWindow? lookbackWindow,
    ProductCategoriesEngagementType? engagementType,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/trends/product_categories/details';
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
      r'product_categories': encodeCollectionQueryParameter<ProductCategoryEnum>(_serializers, productCategories, const FullType(BuiltList, [FullType(ProductCategoryEnum)]), format: ListFormat.multi,),
      r'region': encodeQueryParameter(_serializers, region, const FullType(ProductCategoryRegion)),
      if (lookbackWindow != null) r'lookback_window': encodeQueryParameter(_serializers, lookbackWindow, const FullType(ProductCategoryDetailLookbackWindow)),
      if (engagementType != null) r'engagement_type': encodeQueryParameter(_serializers, engagementType, const FullType(ProductCategoriesEngagementType)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    BuiltList<ProductCategoryDetails>? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BuiltList, [FullType(ProductCategoryDetails)]),
      ) as BuiltList<ProductCategoryDetails>;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BuiltList<ProductCategoryDetails>>(
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

  /// Get a list of growing Shopping Product Categories
  ///   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
  ///
  /// Parameters:
  /// * [region] -       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
  /// * [verticals] - List of verticals to filter by
  /// * [ages] - Age to filter by. If not provided, the results will be filtered by all ages.
  /// * [genders] - Gender to filter by, If not provided, the results will be filtered by all genders.
  /// * [engagementType] -      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BuiltList<TrendingProductCategory>] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BuiltList<TrendingProductCategory>>> trendsProductCategoriesTrendingList({ 
    required ProductCategoryRegion region,
    BuiltList<VerticalProductCategory>? verticals,
    BuiltList<AgeTrendsBucket>? ages,
    BuiltList<GenderBucket>? genders,
    ProductCategoriesEngagementType? engagementType,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/trends/product_categories/trending';
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
      r'region': encodeQueryParameter(_serializers, region, const FullType(ProductCategoryRegion)),
      if (verticals != null) r'verticals': encodeCollectionQueryParameter<VerticalProductCategory>(_serializers, verticals, const FullType(BuiltList, [FullType(VerticalProductCategory)]), format: ListFormat.multi,),
      if (ages != null) r'ages': encodeCollectionQueryParameter<AgeTrendsBucket>(_serializers, ages, const FullType(BuiltList, [FullType(AgeTrendsBucket)]), format: ListFormat.multi,),
      if (genders != null) r'genders': encodeCollectionQueryParameter<GenderBucket>(_serializers, genders, const FullType(BuiltList, [FullType(GenderBucket)]), format: ListFormat.multi,),
      if (engagementType != null) r'engagement_type': encodeQueryParameter(_serializers, engagementType, const FullType(ProductCategoriesEngagementType)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    BuiltList<TrendingProductCategory>? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BuiltList, [FullType(TrendingProductCategory)]),
      ) as BuiltList<TrendingProductCategory>;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BuiltList<TrendingProductCategory>>(
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
