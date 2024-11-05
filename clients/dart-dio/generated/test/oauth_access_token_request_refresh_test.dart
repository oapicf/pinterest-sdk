import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for OauthAccessTokenRequestRefresh
void main() {
  final instance = OauthAccessTokenRequestRefreshBuilder();
  // TODO add properties to the builder and call build()

  group(OauthAccessTokenRequestRefresh, () {
    // String grantType
    test('to test the property `grantType`', () async {
      // TODO
    });

    // String refreshToken
    test('to test the property `refreshToken`', () async {
      // TODO
    });

    // String scope
    test('to test the property `scope`', () async {
      // TODO
    });

    // Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
    // bool refreshOn
    test('to test the property `refreshOn`', () async {
      // TODO
    });

  });
}
