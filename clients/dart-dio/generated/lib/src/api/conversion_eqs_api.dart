//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'dart:async';

import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:dio/dio.dart';

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/api_util.dart';
import 'package:openapi/src/model/event_quality_score.dart';
import 'package:openapi/src/model/ingestion_source_options.dart';
import 'package:openapi/src/model/lookback_period_options.dart';
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:openapi/src/model/source_platform_options.dart';

class ConversionEqsApi {

  final Dio _dio;

  final Serializers _serializers;

  const ConversionEqsApi(this._dio, this._serializers);

  /// Get event quality score (EQS)
  /// Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
  ///
  /// Parameters:
  /// * [lookbackPeriod] - Lookback window (number of days).
  /// * [adAccountId] - Unique identifier of an ad account.
  /// * [sourcePlatform] - Source platform of event.
  /// * [ingestionSource] - Ingestion source of event.
  /// * [cancelToken] - A [CancelToken] that can be used to cancel the operation
  /// * [headers] - Can be used to add additional headers to the request
  /// * [extras] - Can be used to add flags to the request
  /// * [validateStatus] - A [ValidateStatus] callback that can be used to determine request success based on the HTTP status of the response
  /// * [onSendProgress] - A [ProgressCallback] that can be used to get the send progress
  /// * [onReceiveProgress] - A [ProgressCallback] that can be used to get the receive progress
  ///
  /// Returns a [Future] containing a [Response] with a [BuiltList<EventQualityScore>] as data
  /// Throws [DioException] if API call or serialization fails
  Future<Response<BuiltList<EventQualityScore>>> conversionEqsList({ 
    required LookbackPeriodOptions lookbackPeriod,
    required String adAccountId,
    SourcePlatformOptions? sourcePlatform,
    IngestionSourceOptions? ingestionSource,
    CancelToken? cancelToken,
    Map<String, dynamic>? headers,
    Map<String, dynamic>? extra,
    ValidateStatus? validateStatus,
    ProgressCallback? onSendProgress,
    ProgressCallback? onReceiveProgress,
  }) async {
    final _path = r'/ad_accounts/{ad_account_id}/conversion_eqs'.replaceAll('{' r'ad_account_id' '}', encodeQueryParameter(_serializers, adAccountId, const FullType(String)).toString());
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
      r'lookback_period': encodeQueryParameter(_serializers, lookbackPeriod, const FullType(LookbackPeriodOptions)),
      if (sourcePlatform != null) r'source_platform': encodeQueryParameter(_serializers, sourcePlatform, const FullType(SourcePlatformOptions)),
      if (ingestionSource != null) r'ingestion_source': encodeQueryParameter(_serializers, ingestionSource, const FullType(IngestionSourceOptions)),
    };

    final _response = await _dio.request<Object>(
      _path,
      options: _options,
      queryParameters: _queryParameters,
      cancelToken: cancelToken,
      onSendProgress: onSendProgress,
      onReceiveProgress: onReceiveProgress,
    );

    BuiltList<EventQualityScore>? _responseData;

    try {
      final rawResponse = _response.data;
      _responseData = rawResponse == null ? null : _serializers.deserialize(
        rawResponse,
        specifiedType: const FullType(BuiltList, [FullType(EventQualityScore)]),
      ) as BuiltList<EventQualityScore>;

    } catch (error, stackTrace) {
      throw DioException(
        requestOptions: _response.requestOptions,
        response: _response,
        type: DioExceptionType.unknown,
        error: error,
        stackTrace: stackTrace,
      );
    }

    return Response<BuiltList<EventQualityScore>>(
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
