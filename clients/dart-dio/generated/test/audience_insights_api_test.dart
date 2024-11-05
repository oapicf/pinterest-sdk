import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AudienceInsightsApi
void main() {
  final instance = Openapi().getAudienceInsightsApi();

  group(AudienceInsightsApi, () {
    // Get audience insights
    //
    // Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
    //
    //Future<AudienceInsightsResponse> audienceInsightsGet(String adAccountId, AudienceInsightType audienceInsightType) async
    test('test audienceInsightsGet', () async {
      // TODO
    });

    // Get audience insights scope and type
    //
    // Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
    //
    //Future<AudienceDefinitionResponse> audienceInsightsScopeAndTypeGet(String adAccountId) async
    test('test audienceInsightsScopeAndTypeGet', () async {
      // TODO
    });

  });
}
