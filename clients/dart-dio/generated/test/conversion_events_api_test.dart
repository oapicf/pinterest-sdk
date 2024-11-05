import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ConversionEventsApi
void main() {
  final instance = Openapi().getConversionEventsApi();

  group(ConversionEventsApi, () {
    // Send conversions
    //
    // The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/api-features/conversion-overview/\">Conversions Guide</a> for more details. (Note that the authorization header required is <code>Authorization: Bearer &lt;access_token&gt;</code>). - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
    //
    //Future<ConversionApiResponse> eventsCreate(String adAccountId, ConversionEvents conversionEvents, { bool test }) async
    test('test eventsCreate', () async {
      // TODO
    });

  });
}
