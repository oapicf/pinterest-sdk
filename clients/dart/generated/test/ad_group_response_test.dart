//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for AdGroupResponse
void main() {
  final instance = AdGroupResponse();

  group('test AdGroupResponse', () {
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

    // Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
    // String budgetType
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

    // Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
    // Map<String, List<String>> targetingSpec (default value: const {})
    test('to test the property `targetingSpec`', () async {
      // TODO
    });

    // Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
    // int lifetimeFrequencyCap
    test('to test the property `lifetimeFrequencyCap`', () async {
      // TODO
    });

    // Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
    // TrackingUrls trackingUrls
    test('to test the property `trackingUrls`', () async {
      // TODO
    });

    // Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    // bool autoTargetingEnabled
    test('to test the property `autoTargetingEnabled`', () async {
      // TODO
    });

    // <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
    // PlacementGroupType placementGroup
    test('to test the property `placementGroup`', () async {
      // TODO
    });

    // Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
    // PacingDeliveryType pacingDeliveryType
    test('to test the property `pacingDeliveryType`', () async {
      // TODO
    });

    // oCPM learn mode
    // String conversionLearningModeType
    test('to test the property `conversionLearningModeType`', () async {
      // TODO
    });

    // Ad group summary status.
    // AdGroupSummaryStatus summaryStatus
    test('to test the property `summaryStatus`', () async {
      // TODO
    });

    // Feed Profile ID associated to the adgroup.
    // String feedProfileId
    test('to test the property `feedProfileId`', () async {
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

    // Ad group ID.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Always \"adgroup\".
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // Advertiser ID.
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // Ad group creation time. Unix timestamp in seconds.
    // int createdTime
    test('to test the property `createdTime`', () async {
      // TODO
    });

    // Ad group last update time. Unix timestamp in seconds.
    // int updatedTime
    test('to test the property `updatedTime`', () async {
      // TODO
    });


  });

}
