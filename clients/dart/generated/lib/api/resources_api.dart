//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ResourcesApi {
  ResourcesApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get ad accounts countries
  ///
  /// Get Ad Accounts countries
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> adAccountCountriesGetWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/resources/ad_account_countries';

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

  /// Get ad accounts countries
  ///
  /// Get Ad Accounts countries
  Future<AdAccountCountriesGet200Response?> adAccountCountriesGet({ Future<void>? abortTrigger, }) async {
    final response = await adAccountCountriesGetWithHttpInfo(abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccountCountriesGet200Response',) as AdAccountCountriesGet200Response;
    
    }
    return null;
  }

  /// Get available metrics' definitions
  ///
  /// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [ReportType] reportType:
  ///   Report type.
  Future<Response> deliveryMetricsGetWithHttpInfo({ ReportType? reportType, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/resources/delivery_metrics';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (reportType != null) {
      queryParams.addAll(_queryParams('', 'report_type', reportType));
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get available metrics' definitions
  ///
  /// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
  ///
  /// Parameters:
  ///
  /// * [ReportType] reportType:
  ///   Report type.
  Future<DeliveryMetricsGet200Response?> deliveryMetricsGet({ ReportType? reportType, Future<void>? abortTrigger, }) async {
    final response = await deliveryMetricsGetWithHttpInfo(reportType: reportType, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeliveryMetricsGet200Response',) as DeliveryMetricsGet200Response;
    
    }
    return null;
  }

  /// Get interest details
  ///
  /// Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] interestId (required):
  ///   Unique identifier of an interest.
  Future<Response> interestTargetingOptionsGetWithHttpInfo(String interestId, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/resources/targeting/interests/{interest_id}'
      .replaceAll('{interest_id}', interestId);

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

  /// Get interest details
  ///
  /// Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
  ///
  /// Parameters:
  ///
  /// * [String] interestId (required):
  ///   Unique identifier of an interest.
  Future<SingleInterestTargetingOption?> interestTargetingOptionsGet(String interestId, { Future<void>? abortTrigger, }) async {
    final response = await interestTargetingOptionsGetWithHttpInfo(interestId, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SingleInterestTargetingOption',) as SingleInterestTargetingOption;
    
    }
    return null;
  }

  /// Get lead form questions
  ///
  /// Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> leadFormQuestionsGetWithHttpInfo({ Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/resources/lead_form_questions';

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

  /// Get lead form questions
  ///
  /// Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
  Future<void> leadFormQuestionsGet({ Future<void>? abortTrigger, }) async {
    final response = await leadFormQuestionsGetWithHttpInfo(abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }

  /// Get metrics ready state
  ///
  /// Learn whether conversion or non-conversion metrics are finalized and ready to query.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] date (required):
  ///   Analytics reports request date (UTC). Format: YYYY-MM-DD
  Future<Response> metricsReadyStateGetWithHttpInfo(String date, { Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/resources/metrics_ready_state';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'date', date));

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

  /// Get metrics ready state
  ///
  /// Learn whether conversion or non-conversion metrics are finalized and ready to query.
  ///
  /// Parameters:
  ///
  /// * [String] date (required):
  ///   Analytics reports request date (UTC). Format: YYYY-MM-DD
  Future<BookClosed?> metricsReadyStateGet(String date, { Future<void>? abortTrigger, }) async {
    final response = await metricsReadyStateGetWithHttpInfo(date, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BookClosed',) as BookClosed;
    
    }
    return null;
  }

  /// Get targeting options
  ///
  ///     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [PublicTargetingType] targetingType (required):
  ///   Public targeting type
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] clientId:
  ///   Client ID
  ///
  /// * [String] oauthSignature:
  ///   Oauth signature
  ///
  /// * [String] timestamp:
  ///   Timestamp.
  Future<Response> targetingOptionsGetWithHttpInfo(PublicTargetingType targetingType, { String? adAccountId, String? clientId, String? oauthSignature, String? timestamp, Future<void>? abortTrigger, }) async {
    // ignore: prefer_const_declarations
    final path = r'/resources/targeting/{targeting_type}'
      .replaceAll('{targeting_type}', targetingType.toString());

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
    }
    if (clientId != null) {
      queryParams.addAll(_queryParams('', 'client_id', clientId));
    }
    if (oauthSignature != null) {
      queryParams.addAll(_queryParams('', 'oauth_signature', oauthSignature));
    }
    if (timestamp != null) {
      queryParams.addAll(_queryParams('', 'timestamp', timestamp));
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
      abortTrigger: abortTrigger,
    );
  }

  /// Get targeting options
  ///
  ///     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
  ///
  /// Parameters:
  ///
  /// * [PublicTargetingType] targetingType (required):
  ///   Public targeting type
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  ///
  /// * [String] clientId:
  ///   Client ID
  ///
  /// * [String] oauthSignature:
  ///   Oauth signature
  ///
  /// * [String] timestamp:
  ///   Timestamp.
  Future<List<Object>?> targetingOptionsGet(PublicTargetingType targetingType, { String? adAccountId, String? clientId, String? oauthSignature, String? timestamp, Future<void>? abortTrigger, }) async {
    final response = await targetingOptionsGetWithHttpInfo(targetingType, adAccountId: adAccountId, clientId: clientId, oauthSignature: oauthSignature, timestamp: timestamp, abortTrigger: abortTrigger,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      final responseBody = await _decodeBodyBytes(response);
      return (await apiClient.deserializeAsync(responseBody, 'List<Object>') as List)
        .cast<Object>()
        .toList(growable: false);

    }
    return null;
  }
}
