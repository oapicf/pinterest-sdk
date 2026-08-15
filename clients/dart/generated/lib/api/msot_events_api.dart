//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class MsotEventsApi {
  MsotEventsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Send Measurement Source Of Truth (MSOT) attributed conversion events
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [ConversionMSOTEvents] conversionMSOTEvents (required):
  ///   Attributed MSOT conversion events
  Future<Response> msotEventsCreateWithHttpInfo(String adAccountId, ConversionMSOTEvents conversionMSOTEvents,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/msot/events'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = conversionMSOTEvents;

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

  /// Send Measurement Source Of Truth (MSOT) attributed conversion events
  ///
  /// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [ConversionMSOTEvents] conversionMSOTEvents (required):
  ///   Attributed MSOT conversion events
  Future<void> msotEventsCreate(String adAccountId, ConversionMSOTEvents conversionMSOTEvents,) async {
    final response = await msotEventsCreateWithHttpInfo(adAccountId, conversionMSOTEvents,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }
}
