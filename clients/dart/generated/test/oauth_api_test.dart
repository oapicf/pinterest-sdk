//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for OauthApi
void main() {
  // final instance = OauthApi();

  group('tests for OauthApi', () {
    // Generate OAuth access token for conversion API
    //
    // Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
    //
    //Future<ConversionAccessToken> oauthConversionToken() async
    test('test oauthConversionToken', () async {
      // TODO
    });

    // Generate OAuth access token
    //
    // Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. 
    //
    //Future<OauthAccessToken> oauthToken(TokenGrantType grantType, { String code, String continuousRefresh, String redirectUri, String refreshToken, String scope }) async
    test('test oauthToken', () async {
      // TODO
    });

    // Revoke a token
    //
    // Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
    //
    //Future tokenRevoke(String token, { TokenTypeHint tokenTypeHint }) async
    test('test tokenRevoke', () async {
      // TODO
    });

  });
}
