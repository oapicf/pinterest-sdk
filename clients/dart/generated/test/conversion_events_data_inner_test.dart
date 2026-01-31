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

// tests for ConversionEventsDataInner
void main() {
  // final instance = ConversionEventsDataInner();

  group('test ConversionEventsDataInner', () {
    // <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`
    // String actionSource
    test('to test the property `actionSource`', () async {
      // TODO
    });

    // The app store app ID.
    // String appId
    test('to test the property `appId`', () async {
      // TODO
    });

    // ConversionEventAppInfo appInfo
    test('to test the property `appInfo`', () async {
      // TODO
    });

    // Name of the app.
    // String appName
    test('to test the property `appName`', () async {
      // TODO
    });

    // Version of the app.
    // String appVersion
    test('to test the property `appVersion`', () async {
      // TODO
    });

    // ConversionEventsDataInnerCustomData customData
    test('to test the property `customData`', () async {
      // TODO
    });

    // Brand of the user device.
    // String deviceBrand
    test('to test the property `deviceBrand`', () async {
      // TODO
    });

    // User device's mobile carrier.
    // String deviceCarrier
    test('to test the property `deviceCarrier`', () async {
      // TODO
    });

    // ConversionEventDeviceInfo deviceInfo
    test('to test the property `deviceInfo`', () async {
      // TODO
    });

    // Model of the user device.
    // String deviceModel
    test('to test the property `deviceModel`', () async {
      // TODO
    });

    // Type of the user device.
    // String deviceType
    test('to test the property `deviceType`', () async {
      // TODO
    });

    // A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`
    // String eventName
    test('to test the property `eventName`', () async {
      // TODO
    });

    // URL of the web conversion event.
    // String eventSourceUrl
    test('to test the property `eventSourceUrl`', () async {
      // TODO
    });

    // The time when the event happened. Unix timestamp in seconds.
    // int eventTime
    test('to test the property `eventTime`', () async {
      // TODO
    });

    // Two-character ISO-639-1 language code indicating the user's language.
    // String language
    test('to test the property `language`', () async {
      // TODO
    });

    // When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
    // bool optOut
    test('to test the property `optOut`', () async {
      // TODO
    });

    // Version of the device operating system.
    // String osVersion
    test('to test the property `osVersion`', () async {
      // TODO
    });

    // The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
    // String partnerName
    test('to test the property `partnerName`', () async {
      // TODO
    });

    // ConversionEventsUserData userData
    test('to test the property `userData`', () async {
      // TODO
    });

    // Whether the event occurred when the user device was connected to wifi.
    // bool wifi
    test('to test the property `wifi`', () async {
      // TODO
    });


  });

}
