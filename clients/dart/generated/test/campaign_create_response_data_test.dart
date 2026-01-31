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

// tests for CampaignCreateResponseData
void main() {
  // final instance = CampaignCreateResponseData();

  group('test CampaignCreateResponseData', () {
    // Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
    // int dailySpendCap
    test('to test the property `dailySpendCap`', () async {
      // TODO
    });

    // Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
    // int endTime
    test('to test the property `endTime`', () async {
      // TODO
    });

    // Specifies whether the campaign was created in the automated campaign flow
    // bool isAutomatedCampaign
    test('to test the property `isAutomatedCampaign`', () async {
      // TODO
    });

    // Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
    // bool isFlexibleDailyBudgets
    test('to test the property `isFlexibleDailyBudgets`', () async {
      // TODO
    });

    // Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
    // int lifetimeSpendCap
    test('to test the property `lifetimeSpendCap`', () async {
      // TODO
    });

    // Campaign name.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Order line ID that appears on the invoice.
    // String orderLineId
    test('to test the property `orderLineId`', () async {
      // TODO
    });

    // Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
    // int startTime
    test('to test the property `startTime`', () async {
      // TODO
    });

    // EntityStatus status
    test('to test the property `status`', () async {
      // TODO
    });

    // TrackingUrls trackingUrls
    test('to test the property `trackingUrls`', () async {
      // TODO
    });

    // When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
    // int defaultAdGroupBudgetInMicroCurrency
    test('to test the property `defaultAdGroupBudgetInMicroCurrency`', () async {
      // TODO
    });

    // Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
    // bool isCampaignBudgetOptimization
    test('to test the property `isCampaignBudgetOptimization`', () async {
      // TODO
    });

    // Campaign ID.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // CampaignBidOptions bidOptions
    test('to test the property `bidOptions`', () async {
      // TODO
    });

    // Campaign creation time. Unix timestamp in seconds.
    // int createdTime
    test('to test the property `createdTime`', () async {
      // TODO
    });

    // Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
    // bool isPerformancePlus
    test('to test the property `isPerformancePlus`', () async {
      // TODO
    });

    // ObjectiveType objectiveType
    test('to test the property `objectiveType`', () async {
      // TODO
    });

    // CampaignSummaryStatus summaryStatus
    test('to test the property `summaryStatus`', () async {
      // TODO
    });

    // Always \"campaign\".
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // UTC timestamp. Last update time.
    // int updatedTime
    test('to test the property `updatedTime`', () async {
      // TODO
    });


  });

}
