import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for OauthApi
void main() {
  final instance = Openapi().getOauthApi();

  group(OauthApi, () {
    // Generate OAuth access token for conversion API
    //
    // Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
    //
    //Future<ConversionAccessTokenResponse> oauthConversionToken() async
    test('test oauthConversionToken', () async {
      // TODO
    });

    // Generate OAuth access token
    //
    // Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for <a href='/docs/getting-started/set-up-authentication-and-authorization/' target='blank'>requesting and refreshing tokens</a>.  <strong>Note:</strong> If your app was created <strong>before September 25, 2025</strong>, make sure to set the <code>continuous_refresh</code> parameter to <code>true</code> to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use <a href='/docs/developer-tools/token-debugger/' target='blank'>Token Debugger</a> to validate and inspect your access token.
    //
    //Future<OauthAccessTokenResponse> oauthToken(String grantType) async
    test('test oauthToken', () async {
      // TODO
    });

    // Revoke a token
    //
    // Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
    //
    //Future tokenRevoke(String token, { String tokenTypeHint }) async
    test('test tokenRevoke', () async {
      // TODO
    });

  });
}
