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

// tests for CampaignCreateCommon
void main() {
  // final instance = CampaignCreateCommon();

  group('test CampaignCreateCommon', () {
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

    // When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
    // int defaultAdGroupBudgetInMicroCurrency
    test('to test the property `defaultAdGroupBudgetInMicroCurrency`', () async {
      // TODO
    });

    // Specifies whether the campaign was created in the automated campaign flow
    // bool isAutomatedCampaign
    test('to test the property `isAutomatedCampaign`', () async {
      // TODO
    });


  });

}
