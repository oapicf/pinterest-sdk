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
  Future<Response> adAccountCountriesGetWithHttpInfo() async {
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
    );
  }

  /// Get ad accounts countries
  ///
  /// Get Ad Accounts countries
  Future<AdAccountsCountryResponse?> adAccountCountriesGet() async {
    final response = await adAccountCountriesGetWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AdAccountsCountryResponse',) as AdAccountsCountryResponse;
    
    }
    return null;
  }

  /// Get available metrics' definitions
  ///
  /// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/api-features/analytics-overview/'>Organic Analytics</a> and <a href='/docs/api-features/ads-reporting/'>Ads Analytics</a> for more information.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] reportType:
  ///   Report type.
  Future<Response> deliveryMetricsGetWithHttpInfo({ String? reportType, }) async {
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
    );
  }

  /// Get available metrics' definitions
  ///
  /// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/api-features/analytics-overview/'>Organic Analytics</a> and <a href='/docs/api-features/ads-reporting/'>Ads Analytics</a> for more information.
  ///
  /// Parameters:
  ///
  /// * [String] reportType:
  ///   Report type.
  Future<DeliveryMetricsResponse?> deliveryMetricsGet({ String? reportType, }) async {
    final response = await deliveryMetricsGetWithHttpInfo( reportType: reportType, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'DeliveryMetricsResponse',) as DeliveryMetricsResponse;
    
    }
    return null;
  }

  /// Get interest details
  ///
  /// <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] interestId (required):
  ///   Unique identifier of an interest.
  Future<Response> interestTargetingOptionsGetWithHttpInfo(String interestId,) async {
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
    );
  }

  /// Get interest details
  ///
  /// <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
  ///
  /// Parameters:
  ///
  /// * [String] interestId (required):
  ///   Unique identifier of an interest.
  Future<SingleInterestTargetingOptionResponse?> interestTargetingOptionsGet(String interestId,) async {
    final response = await interestTargetingOptionsGetWithHttpInfo(interestId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'SingleInterestTargetingOptionResponse',) as SingleInterestTargetingOptionResponse;
    
    }
    return null;
  }

  /// Get lead form questions
  ///
  /// Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> leadFormQuestionsGetWithHttpInfo() async {
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
    );
  }

  /// Get lead form questions
  ///
  /// Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
  Future<void> leadFormQuestionsGet() async {
    final response = await leadFormQuestionsGetWithHttpInfo();
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
  Future<Response> metricsReadyStateGetWithHttpInfo(String date,) async {
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
  Future<BookClosedResponse?> metricsReadyStateGet(String date,) async {
    final response = await metricsReadyStateGetWithHttpInfo(date,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'BookClosedResponse',) as BookClosedResponse;
    
    }
    return null;
  }

  /// Get targeting options
  ///
  /// <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] targetingType (required):
  ///   Public targeting type.
  ///
  /// * [String] clientId:
  ///   Client ID.
  ///
  /// * [String] oauthSignature:
  ///   Oauth signature
  ///
  /// * [String] timestamp:
  ///   Timestamp
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<Response> targetingOptionsGetWithHttpInfo(String targetingType, { String? clientId, String? oauthSignature, String? timestamp, String? adAccountId, }) async {
    // ignore: prefer_const_declarations
    final path = r'/resources/targeting/{targeting_type}'
      .replaceAll('{targeting_type}', targetingType);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (clientId != null) {
      queryParams.addAll(_queryParams('', 'client_id', clientId));
    }
    if (oauthSignature != null) {
      queryParams.addAll(_queryParams('', 'oauth_signature', oauthSignature));
    }
    if (timestamp != null) {
      queryParams.addAll(_queryParams('', 'timestamp', timestamp));
    }
    if (adAccountId != null) {
      queryParams.addAll(_queryParams('', 'ad_account_id', adAccountId));
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

  /// Get targeting options
  ///
  /// <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
  ///
  /// Parameters:
  ///
  /// * [String] targetingType (required):
  ///   Public targeting type.
  ///
  /// * [String] clientId:
  ///   Client ID.
  ///
  /// * [String] oauthSignature:
  ///   Oauth signature
  ///
  /// * [String] timestamp:
  ///   Timestamp
  ///
  /// * [String] adAccountId:
  ///   Unique identifier of an ad account.
  Future<List<Object>?> targetingOptionsGet(String targetingType, { String? clientId, String? oauthSignature, String? timestamp, String? adAccountId, }) async {
    final response = await targetingOptionsGetWithHttpInfo(targetingType,  clientId: clientId, oauthSignature: oauthSignature, timestamp: timestamp, adAccountId: adAccountId, );
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
