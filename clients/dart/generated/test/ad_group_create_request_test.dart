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

// tests for AdGroupCreateRequest
void main() {
  // final instance = AdGroupCreateRequest();

  group('test AdGroupCreateRequest', () {
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

    // Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
    // OptimizationGoalMetadata optimizationGoalMetadata
    test('to test the property `optimizationGoalMetadata`', () async {
      // TODO
    });

    // BudgetType budgetType (default value: 'DAILY')
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

    // Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
    // int lifetimeFrequencyCap
    test('to test the property `lifetimeFrequencyCap`', () async {
      // TODO
    });

    // Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
    // TrackingUrls trackingUrls
    test('to test the property `trackingUrls`', () async {
      // TODO
    });

    // Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    // bool autoTargetingEnabled
    test('to test the property `autoTargetingEnabled`', () async {
      // TODO
    });

    // <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
    // PlacementGroupType placementGroup
    test('to test the property `placementGroup`', () async {
      // TODO
    });

    // PacingDeliveryType pacingDeliveryType (default value: 'STANDARD')
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

    // Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
    // String bidStrategyType
    test('to test the property `bidStrategyType`', () async {
      // TODO
    });

    // Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
    // List<String> targetingTemplateIds (default value: const [])
    test('to test the property `targetingTemplateIds`', () async {
      // TODO
    });


  });

}
