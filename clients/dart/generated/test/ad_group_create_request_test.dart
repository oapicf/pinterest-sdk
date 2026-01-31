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
    // Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
    // bool autoTargetingEnabled
    test('to test the property `autoTargetingEnabled`', () async {
      // TODO
    });

    // Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
    // int bidInMicroCurrency
    test('to test the property `bidInMicroCurrency`', () async {
      // TODO
    });

    // Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
    // String bidStrategyType
    test('to test the property `bidStrategyType`', () async {
      // TODO
    });

    // ActionType billableEvent
    test('to test the property `billableEvent`', () async {
      // TODO
    });

    // Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
    // int budgetInMicroCurrency
    test('to test the property `budgetInMicroCurrency`', () async {
      // TODO
    });

    // BudgetType budgetType (default value: 'DAILY')
    test('to test the property `budgetType`', () async {
      // TODO
    });

    // Campaign ID of the ad group.
    // String campaignId
    test('to test the property `campaignId`', () async {
      // TODO
    });

    // Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
    // int endTime
    test('to test the property `endTime`', () async {
      // TODO
    });

    // Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
    // bool isCreativeOptimization
    test('to test the property `isCreativeOptimization`', () async {
      // TODO
    });

    // Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
    // int lifetimeFrequencyCap
    test('to test the property `lifetimeFrequencyCap`', () async {
      // TODO
    });

    // Ad group name.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
    // OptimizationGoalMetadata optimizationGoalMetadata
    test('to test the property `optimizationGoalMetadata`', () async {
      // TODO
    });

    // PacingDeliveryType pacingDeliveryType (default value: 'STANDARD')
    test('to test the property `pacingDeliveryType`', () async {
      // TODO
    });

    // <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
    // PlacementGroupType placementGroup
    test('to test the property `placementGroup`', () async {
      // TODO
    });

    // Specify if the promotion is applied at ad group or item level
    // String promotionApplicationLevel
    test('to test the property `promotionApplicationLevel`', () async {
      // TODO
    });

    // Promotion ID. To clear this field, set to null.
    // String promotionId (default value: '0')
    test('to test the property `promotionId`', () async {
      // TODO
    });

    // Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
    // int startTime
    test('to test the property `startTime`', () async {
      // TODO
    });

    // Ad group/entity status.
    // EntityStatus status
    test('to test the property `status`', () async {
      // TODO
    });

    // TargetingSpec targetingSpec
    test('to test the property `targetingSpec`', () async {
      // TODO
    });

    // Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
    // List<String> targetingTemplateIds (default value: const [])
    test('to test the property `targetingTemplateIds`', () async {
      // TODO
    });

    // Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
    // TrackingUrls trackingUrls
    test('to test the property `trackingUrls`', () async {
      // TODO
    });

    // <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
    // num bidMultiplier
    test('to test the property `bidMultiplier`', () async {
      // TODO
    });


  });

}
