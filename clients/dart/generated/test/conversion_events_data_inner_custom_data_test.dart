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

// tests for ConversionEventsDataInnerCustomData
void main() {
  // final instance = ConversionEventsDataInnerCustomData();

  group('test ConversionEventsDataInnerCustomData', () {
    // The brand of the content associated with the event.
    // String contentBrand
    test('to test the property `contentBrand`', () async {
      // TODO
    });

    // The category of the content associated with the event.
    // String contentCategory
    test('to test the property `contentCategory`', () async {
      // TODO
    });

    // List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    // List<String> contentIds (default value: const [])
    test('to test the property `contentIds`', () async {
      // TODO
    });

    // The name of the page or product associated with the event.
    // String contentName
    test('to test the property `contentName`', () async {
      // TODO
    });

    // A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    // List<ConversionEventsDataInnerCustomDataContentsInner> contents (default value: const [])
    test('to test the property `contents`', () async {
      // TODO
    });

    // The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
    // String currency
    test('to test the property `currency`', () async {
      // TODO
    });

    // Only use when instructed.
    // String externalMeasurementId
    test('to test the property `externalMeasurementId`', () async {
      // TODO
    });

    // Only use when instructed.
    // int externalMeasurementVendorId
    test('to test the property `externalMeasurementVendorId`', () async {
      // TODO
    });

    // Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
    // String np
    test('to test the property `np`', () async {
      // TODO
    });

    // Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    // int numItems
    test('to test the property `numItems`', () async {
      // TODO
    });

    // Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
    // String optOutType
    test('to test the property `optOutType`', () async {
      // TODO
    });

    // The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
    // String orderId
    test('to test the property `orderId`', () async {
      // TODO
    });

    // Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
    // String predictedLtv
    test('to test the property `predictedLtv`', () async {
      // TODO
    });

    // The search string related to the user conversion event.
    // String searchString
    test('to test the property `searchString`', () async {
      // TODO
    });

    // Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
    // String value
    test('to test the property `value`', () async {
      // TODO
    });


  });

}
