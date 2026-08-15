//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ConversionEqsApi {
  ConversionEqsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get event quality score (EQS)
  ///
  /// Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [LookbackPeriodOptions] lookbackPeriod (required):
  ///   Lookback window (number of days).
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SourcePlatformOptions] sourcePlatform:
  ///   Source platform of event.
  ///
  /// * [IngestionSourceOptions] ingestionSource:
  ///   Ingestion source of event.
  Future<Response> conversionEqsListWithHttpInfo(LookbackPeriodOptions lookbackPeriod, String adAccountId, { SourcePlatformOptions? sourcePlatform, IngestionSourceOptions? ingestionSource, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/conversion_eqs'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'lookback_period', lookbackPeriod));
    if (sourcePlatform != null) {
      queryParams.addAll(_queryParams('', 'source_platform', sourcePlatform));
    }
    if (ingestionSource != null) {
      queryParams.addAll(_queryParams('', 'ingestion_source', ingestionSource));
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

  /// Get event quality score (EQS)
  ///
  /// Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
  ///
  /// Parameters:
  ///
  /// * [LookbackPeriodOptions] lookbackPeriod (required):
  ///   Lookback window (number of days).
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [SourcePlatformOptions] sourcePlatform:
  ///   Source platform of event.
  ///
  /// * [IngestionSourceOptions] ingestionSource:
  ///   Ingestion source of event.
  Future<List<EventQualityScore>?> conversionEqsList(LookbackPeriodOptions lookbackPeriod, String adAccountId, { SourcePlatformOptions? sourcePlatform, IngestionSourceOptions? ingestionSource, }) async {
    final response = await conversionEqsListWithHttpInfo(lookbackPeriod, adAccountId,  sourcePlatform: sourcePlatform, ingestionSource: ingestionSource, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<EventQualityScore>') as List)
        .cast<EventQualityScore>()
        .toList(growable: false);

    }
    return null;
  }
}
