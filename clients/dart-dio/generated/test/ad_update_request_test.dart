import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AdUpdateRequest
void main() {
  final instance = AdUpdateRequestBuilder();
  // TODO add properties to the builder and call build()

  group(AdUpdateRequest, () {
    // ID of the ad group that contains the ad.
    // String adGroupId
    test('to test the property `adGroupId`', () async {
      // TODO
    });

    // Deep link URL for Android devices.
    // String androidDeepLink
    test('to test the property `androidDeepLink`', () async {
      // TODO
    });

    // Comma-separated deep links for the carousel pin on Android.
    // BuiltList<String> carouselAndroidDeepLinks
    test('to test the property `carouselAndroidDeepLinks`', () async {
      // TODO
    });

    // Comma-separated destination URLs for the carousel pin to promote.
    // BuiltList<String> carouselDestinationUrls
    test('to test the property `carouselDestinationUrls`', () async {
      // TODO
    });

    // Comma-separated deep links for the carousel pin on iOS.
    // BuiltList<String> carouselIosDeepLinks
    test('to test the property `carouselIosDeepLinks`', () async {
      // TODO
    });

    // Tracking url for the ad clicks.
    // String clickTrackingUrl
    test('to test the property `clickTrackingUrl`', () async {
      // TODO
    });

    // CreativeType creativeType
    test('to test the property `creativeType`', () async {
      // TODO
    });

    // Destination URL.
    // String destinationUrl
    test('to test the property `destinationUrl`', () async {
      // TODO
    });

    // Deep link URL for iOS devices.
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

    // Lead form ID for lead ad generation.
    // String leadFormId
    test('to test the property `leadFormId`', () async {
      // TODO
    });

    // GridClickType gridClickType
    test('to test the property `gridClickType`', () async {
      // TODO
    });

    // Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
    // String customizableCtaType
    test('to test the property `customizableCtaType`', () async {
      // TODO
    });

    // Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
    // QuizPinData quizPinData
    test('to test the property `quizPinData`', () async {
      // TODO
    });

    // The ID of this ad.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Pin ID. This field may only be updated for draft ads.
    // String pinId
    test('to test the property `pinId`', () async {
      // TODO
    });

  });
}
