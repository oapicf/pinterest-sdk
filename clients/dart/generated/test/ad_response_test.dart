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

// tests for AdResponse
void main() {
  final instance = AdResponse();

  group('test AdResponse', () {
    // ID of the ad group that contains the ad.
    // String adGroupId
    test('to test the property `adGroupId`', () async {
      // TODO
    });

    // Deep link URL for Android devices. Not currently available. Using this field will generate an error.
    // String androidDeepLink
    test('to test the property `androidDeepLink`', () async {
      // TODO
    });

    // Comma-separated deep links for the carousel pin on Android.
    // List<String> carouselAndroidDeepLinks (default value: const [])
    test('to test the property `carouselAndroidDeepLinks`', () async {
      // TODO
    });

    // Comma-separated destination URLs for the carousel pin to promote.
    // List<String> carouselDestinationUrls (default value: const [])
    test('to test the property `carouselDestinationUrls`', () async {
      // TODO
    });

    // Comma-separated deep links for the carousel pin on iOS.
    // List<String> carouselIosDeepLinks (default value: const [])
    test('to test the property `carouselIosDeepLinks`', () async {
      // TODO
    });

    // Tracking url for the ad clicks.
    // String clickTrackingUrl
    test('to test the property `clickTrackingUrl`', () async {
      // TODO
    });

    // Ad creative type enum
    // String creativeType
    test('to test the property `creativeType`', () async {
      // TODO
    });

    // Destination URL.
    // String destinationUrl
    test('to test the property `destinationUrl`', () async {
      // TODO
    });

    // Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
    // String iosDeepLink
    test('to test the property `iosDeepLink`', () async {
      // TODO
    });

    // Is original pin deleted?
    // bool isPinDeleted
    test('to test the property `isPinDeleted`', () async {
      // TODO
    });

    // Is pin repinnable?
    // bool isRemovable
    test('to test the property `isRemovable`', () async {
      // TODO
    });

    // Name of the ad - 255 chars max.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Pin ID.
    // String pinId
    test('to test the property `pinId`', () async {
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

    // Tracking URL for ad impressions.
    // String viewTrackingUrl
    test('to test the property `viewTrackingUrl`', () async {
      // TODO
    });

    // The ID of the advertiser that this ad belongs to.
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // ID of the ad campaign that contains this ad.
    // String campaignId
    test('to test the property `campaignId`', () async {
      // TODO
    });

    // Destination URL template for all items within a collections drawer.
    // String collectionItemsDestinationUrlTemplate
    test('to test the property `collectionItemsDestinationUrlTemplate`', () async {
      // TODO
    });

    // Pin creation time. Unix timestamp in seconds.
    // int createdTime
    test('to test the property `createdTime`', () async {
      // TODO
    });

    // The ID of this ad.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
    // List<String> rejectedReasons (default value: const [])
    test('to test the property `rejectedReasons`', () async {
      // TODO
    });

    // Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
    // List<String> rejectionLabels (default value: const [])
    test('to test the property `rejectionLabels`', () async {
      // TODO
    });

    // Ad review status
    // String reviewStatus
    test('to test the property `reviewStatus`', () async {
      // TODO
    });

    // Always \"ad\".
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // Last update time. Unix timestamp in seconds.
    // int updatedTime
    test('to test the property `updatedTime`', () async {
      // TODO
    });

    // Ad summary status
    // PinPromotionSummaryStatus summaryStatus
    test('to test the property `summaryStatus`', () async {
      // TODO
    });


  });

}
