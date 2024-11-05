import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for OauthApi
void main() {
  final instance = Openapi().getOauthApi();

  group(OauthApi, () {
    // Generate OAuth access token
    //
    // Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See <a href='/docs/getting-started/authentication-and-scopes/'>Authentication</a> for more.  <strong>Parameter <i>refresh_on</i> and its corresponding response type <i>everlasting_refresh</i> are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  <strong>Grant type <i>client_credentials</i> and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.</strong>
    //
    //Future<OauthAccessTokenResponse> oauthToken(String grantType) async
    test('test oauthToken', () async {
      // TODO
    });

  });
}
