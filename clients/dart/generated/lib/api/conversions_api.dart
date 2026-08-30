//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ConversionsApi {
  ConversionsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Create advertiser defined events
  ///
  /// Map advertiser defined events to standard events for the given ad account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdvertiserDefinedEventsCreateRequest] advertiserDefinedEventsCreateRequest (required):
  Future<Response> advertiserDefinedEventsCreateWithHttpInfo(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/advertiser_defined_events'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = advertiserDefinedEventsCreateRequest;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Create advertiser defined events
  ///
  /// Map advertiser defined events to standard events for the given ad account.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdvertiserDefinedEventsCreateRequest] advertiserDefinedEventsCreateRequest (required):
  Future<AdvertiserDefinedEventsCreate200Response?> advertiserDefinedEventsCreate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest, { Future<void>? abortTrigger, }) async {
    final response = await advertiserDefinedEventsCreateWithHttpInfo(adAccountId, advertiserDefinedEventsCreateRequest, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdvertiserDefinedEventsCreate200Response',) as AdvertiserDefinedEventsCreate200Response;
    
    }
    return null;
  }

  /// Delete advertiser defined events
  ///
  /// Untrack advertiser defined events for the given ad account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] eventNames (required):
  ///   List of event names to delete
  Future<Response> advertiserDefinedEventsDeleteWithHttpInfo(String adAccountId, List<String> eventNames, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/advertiser_defined_events'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('csv', 'event_names', eventNames));

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'DELETE',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Delete advertiser defined events
  ///
  /// Untrack advertiser defined events for the given ad account.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [List<String>] eventNames (required):
  ///   List of event names to delete
  Future<AdvertiserDefinedEventsCreate200Response?> advertiserDefinedEventsDelete(String adAccountId, List<String> eventNames, { Future<void>? abortTrigger, }) async {
    final response = await advertiserDefinedEventsDeleteWithHttpInfo(adAccountId, eventNames, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdvertiserDefinedEventsCreate200Response',) as AdvertiserDefinedEventsCreate200Response;
    
    }
    return null;
  }

  /// Get advertiser defined events
  ///
  /// Get advertiser defined events for the given ad account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> advertiserDefinedEventsGetWithHttpInfo(String adAccountId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/advertiser_defined_events'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


    return apiClient.invokeAPI(
      path,
      'GET',
      queryParams,
      postBody,
      headerParams,
      formParams,
      contentTypes.isEmpty ? null : contentTypes.first,
      abortTrigger: abortTrigger,
    );
  }

  /// Get advertiser defined events
  ///
  /// Get advertiser defined events for the given ad account.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<AdvertiserDefinedEventsGet200Response?> advertiserDefinedEventsGet(String adAccountId, { Future<void>? abortTrigger, }) async {
    final response = await advertiserDefinedEventsGetWithHttpInfo(adAccountId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdvertiserDefinedEventsGet200Response',) as AdvertiserDefinedEventsGet200Response;
    
    }
    return null;
  }

  /// Update advertiser defined events
  ///
  /// Update advertiser defined event names or mappings for the given ad account.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdvertiserDefinedEventsCreateRequest] advertiserDefinedEventsCreateRequest (required):
  Future<Response> advertiserDefinedEventsUpdateWithHttpInfo(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/advertiser_defined_events'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody = advertiserDefinedEventsCreateRequest;

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
      abortTrigger: abortTrigger,
    );
  }

  /// Update advertiser defined events
  ///
  /// Update advertiser defined event names or mappings for the given ad account.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AdvertiserDefinedEventsCreateRequest] advertiserDefinedEventsCreateRequest (required):
  Future<AdvertiserDefinedEventsCreate200Response?> advertiserDefinedEventsUpdate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest, { Future<void>? abortTrigger, }) async {
    final response = await advertiserDefinedEventsUpdateWithHttpInfo(adAccountId, advertiserDefinedEventsCreateRequest, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdvertiserDefinedEventsCreate200Response',) as AdvertiserDefinedEventsCreate200Response;
    
    }
    return null;
  }
}
