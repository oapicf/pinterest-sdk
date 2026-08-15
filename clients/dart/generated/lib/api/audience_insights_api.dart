//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AudienceInsightsApi {
  AudienceInsightsApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get audience insights
  ///
  /// Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AudienceInsightType] audienceInsightType (required):
  ///   Type of audience insights.
  Future<Response> audienceInsightsGetWithHttpInfo(String adAccountId, AudienceInsightType audienceInsightType,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/audience_insights'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

      queryParams.addAll(_queryParams('', 'audience_insight_type', audienceInsightType));

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

  /// Get audience insights
  ///
  /// Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [AudienceInsightType] audienceInsightType (required):
  ///   Type of audience insights.
  Future<AudienceInsightsResponse?> audienceInsightsGet(String adAccountId, AudienceInsightType audienceInsightType,) async {
    final response = await audienceInsightsGetWithHttpInfo(adAccountId, audienceInsightType,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AudienceInsightsResponse',) as AudienceInsightsResponse;
    
    }
    return null;
  }

  /// Get audience insights scope and type
  ///
  /// Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<Response> audienceInsightsScopeAndTypeGetWithHttpInfo(String adAccountId,) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/insights/audiences'
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
    );
  }

  /// Get audience insights scope and type
  ///
  /// Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  Future<AudienceDefinitionResponse?> audienceInsightsScopeAndTypeGet(String adAccountId,) async {
    final response = await audienceInsightsScopeAndTypeGetWithHttpInfo(adAccountId,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'AudienceDefinitionResponse',) as AudienceDefinitionResponse;
    
    }
    return null;
  }
}
