import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CampaignResponse
void main() {
  //final instance = CampaignResponseBuilder();
  // TODO add properties to the builder and call build()

  group(CampaignResponse, () {
    // Campaign ID.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // Campaign name.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // EntityStatus status
    test('to test the property `status`', () async {
      // TODO
    });

    // Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
    // int lifetimeSpendCap
    test('to test the property `lifetimeSpendCap`', () async {
      // TODO
    });

    // Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
    // int dailySpendCap
    test('to test the property `dailySpendCap`', () async {
      // TODO
    });

    // Order line ID that appears on the invoice.
    // String orderLineId
    test('to test the property `orderLineId`', () async {
      // TODO
    });

    // TrackingUrls trackingUrls
    test('to test the property `trackingUrls`', () async {
      // TODO
    });

    // Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    // int startTime
    test('to test the property `startTime`', () async {
      // TODO
    });

    // Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    // int endTime
    test('to test the property `endTime`', () async {
      // TODO
    });

    // Determine if a campaign has flexible daily budgets setup.
    // bool isFlexibleDailyBudgets
    test('to test the property `isFlexibleDailyBudgets`', () async {
      // TODO
    });

    // ObjectiveType objectiveType
    test('to test the property `objectiveType`', () async {
      // TODO
    });

    // Campaign creation time. Unix timestamp in seconds.
    // int createdTime
    test('to test the property `createdTime`', () async {
      // TODO
    });

    // UTC timestamp. Last update time.
    // int updatedTime
    test('to test the property `updatedTime`', () async {
      // TODO
    });

    // Always \"campaign\".
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
    // bool isCampaignBudgetOptimization
    test('to test the property `isCampaignBudgetOptimization`', () async {
      // TODO
    });

    // CampaignSummaryStatus summaryStatus
    test('to test the property `summaryStatus`', () async {
      // TODO
    });

  });
}
