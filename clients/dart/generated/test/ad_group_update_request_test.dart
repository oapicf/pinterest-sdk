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

// tests for AdGroupUpdateRequest
void main() {
  // final instance = AdGroupUpdateRequest();

  group('test AdGroupUpdateRequest', () {
    // Ad group name.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Ad group/entity status.
    // EntityStatus status
    test('to test the property `status`', () async {
      // TODO
    });

    // Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
    // int budgetInMicroCurrency
    test('to test the property `budgetInMicroCurrency`', () async {
      // TODO
    });

    // Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
    // int bidInMicroCurrency
    test('to test the property `bidInMicroCurrency`', () async {
      // TODO
    });

    // AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata
    test('to test the property `optimizationGoalMetadata`', () async {
      // TODO
    });

    // BudgetType budgetType
    test('to test the property `budgetType`', () async {
      // TODO
    });

    // Ad group start time. Unix timestamp in seconds. Defaults to current time.
    // int startTime
    test('to test the property `startTime`', () async {
      // TODO
    });

    // Ad group end time. Unix timestamp in seconds.
    // int endTime
    test('to test the property `endTime`', () async {
      // TODO
    });

    // TargetingSpec targetingSpec
    test('to test the property `targetingSpec`', () async {
      // TODO
    });

    // Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
    // int lifetimeFrequencyCap
    test('to test the property `lifetimeFrequencyCap`', () async {
      // TODO
    });

    // AdGroupCommonTrackingUrls trackingUrls
    test('to test the property `trackingUrls`', () async {
      // TODO
    });

    // Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    // bool autoTargetingEnabled
    test('to test the property `autoTargetingEnabled`', () async {
      // TODO
    });

    // <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
    // PlacementGroupType placementGroup
    test('to test the property `placementGroup`', () async {
      // TODO
    });

    // PacingDeliveryType pacingDeliveryType
    test('to test the property `pacingDeliveryType`', () async {
      // TODO
    });

    // Campaign ID of the ad group.
    // String campaignId
    test('to test the property `campaignId`', () async {
      // TODO
    });

    // ActionType billableEvent
    test('to test the property `billableEvent`', () async {
      // TODO
    });

    // Bid strategy type
    // String bidStrategyType
    test('to test the property `bidStrategyType`', () async {
      // TODO
    });

    // Ad group ID.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });


  });

}
