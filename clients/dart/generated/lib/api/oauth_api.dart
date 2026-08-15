//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class OauthApi {
  OauthApi([ApiClient? apiClient]) : apiClient = apiClient ?? defaultApiClient;

  final ApiClient apiClient;

  /// Generate OAuth access token for conversion API
  ///
  /// Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
  ///
  /// Note: This method returns the HTTP [Response].
  Future<Response> oauthConversionTokenWithHttpInfo() async {
    // ignore: prefer_const_declarations
    final path = r'/oauth/conversion_token';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>[];


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

  /// Generate OAuth access token for conversion API
  ///
  /// Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
  Future<ConversionAccessTokenResponse?> oauthConversionToken() async {
    final response = await oauthConversionTokenWithHttpInfo();
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'ConversionAccessTokenResponse',) as ConversionAccessTokenResponse;
    
    }
    return null;
  }

  /// Generate OAuth access token
  ///
  /// Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] grantType (required):
  Future<Response> oauthTokenWithHttpInfo(String grantType,) async {
    // ignore: prefer_const_declarations
    final path = r'/oauth/token';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/x-www-form-urlencoded'];

    if (grantType != null) {
      formParams[r'grant_type'] = parameterToString(grantType);
    }

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

  /// Generate OAuth access token
  ///
  /// Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.
  ///
  /// Parameters:
  ///
  /// * [String] grantType (required):
  Future<OauthAccessTokenResponse?> oauthToken(String grantType,) async {
    final response = await oauthTokenWithHttpInfo(grantType,);
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
    // When a remote server returns no body with a status of 204, we shall not decode it.
    // At the time of writing this, `dart:convert` will throw an "Unexpected end of input"
    // FormatException when trying to decode an empty string.
    if (response.body.isNotEmpty && response.statusCode != HttpStatus.noContent) {
      return await apiClient.deserializeAsync(await _decodeBodyBytes(response), 'OauthAccessTokenResponse',) as OauthAccessTokenResponse;
    
    }
    return null;
  }

  /// Revoke a token
  ///
  /// Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
  ///
  /// Note: This method returns the HTTP [Response].
  ///
  /// Parameters:
  ///
  /// * [String] token (required):
  ///   The token to revoke.
  ///
  /// * [String] tokenTypeHint:
  ///   The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
  Future<Response> tokenRevokeWithHttpInfo(String token, { String? tokenTypeHint, }) async {
    // ignore: prefer_const_declarations
    final path = r'/oauth/token/revoke';

    // ignore: prefer_final_locals
    Object? postBody;

    final queryParams = <QueryParam>[];
    final headerParams = <String, String>{};
    final formParams = <String, String>{};

    const contentTypes = <String>['application/x-www-form-urlencoded'];

    if (token != null) {
      formParams[r'token'] = parameterToString(token);
    }
    if (tokenTypeHint != null) {
      formParams[r'token_type_hint'] = parameterToString(tokenTypeHint);
    }

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

  /// Revoke a token
  ///
  /// Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
  ///
  /// Parameters:
  ///
  /// * [String] token (required):
  ///   The token to revoke.
  ///
  /// * [String] tokenTypeHint:
  ///   The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
  Future<void> tokenRevoke(String token, { String? tokenTypeHint, }) async {
    final response = await tokenRevokeWithHttpInfo(token,  tokenTypeHint: tokenTypeHint, );
    if (response.statusCode >= HttpStatus.badRequest) {
      throw ApiException(response.statusCode, await _decodeBodyBytes(response));
    }
  }
}
