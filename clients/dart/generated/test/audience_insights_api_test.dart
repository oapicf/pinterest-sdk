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


/// tests for AudienceInsightsApi
void main() {
  // final instance = AudienceInsightsApi();

  group('tests for AudienceInsightsApi', () {
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
