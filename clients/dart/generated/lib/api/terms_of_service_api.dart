//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class TermsOfServiceApi {
  TermsOfServiceApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Get terms of service
  ///
  /// Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] includeHtml:
  ///   Return HTML in TOS text.
  ///
  /// * [String] tosType:
  ///   Request type.
  Future<Response> termsOfServiceGetWithHttpInfo(String adAccountId, { bool? includeHtml, String? tosType, }) async {
    // ignore: prefer_const_declarations
    final path = r'/ad_accounts/{ad_account_id}/terms_of_service'
      .replaceAll('{ad_account_id}', adAccountId);

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    if (includeHtml != null) {
      queryParams.addAll(_queryParams('', 'include_html', includeHtml));
    }
    if (tosType != null) {
      queryParams.addAll(_queryParams('', 'tos_type', tosType));
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

  /// Get terms of service
  ///
  /// Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
  ///
  /// Parameters:
  ///
  /// * [String] adAccountId (required):
  ///   Unique identifier of an ad account.
  ///
  /// * [bool] includeHtml:
  ///   Return HTML in TOS text.
  ///
  /// * [String] tosType:
  ///   Request type.
  Future<TermsOfService?> termsOfServiceGet(String adAccountId, { bool? includeHtml, String? tosType, }) async {
    final response = await termsOfServiceGetWithHttpInfo(adAccountId,  includeHtml: includeHtml, tosType: tosType, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'TermsOfService',) as TermsOfService;
    
    }
    return null;
  }
}
