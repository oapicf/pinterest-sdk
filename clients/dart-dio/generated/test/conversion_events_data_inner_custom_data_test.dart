import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ConversionEventsDataInnerCustomData
void main() {
  final instance = ConversionEventsDataInnerCustomDataBuilder();
  // TODO add properties to the builder and call build()

  group(ConversionEventsDataInnerCustomData, () {
    // The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
    // String currency
    test('to test the property `currency`', () async {
      // TODO
    });

    // Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
    // String value
    test('to test the property `value`', () async {
      // TODO
    });

    // List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    // BuiltList<String> contentIds
    test('to test the property `contentIds`', () async {
      // TODO
    });

    // The name of the page or product associated with the event.
    // String contentName
    test('to test the property `contentName`', () async {
      // TODO
    });

    // The category of the content associated with the event.
    // String contentCategory
    test('to test the property `contentCategory`', () async {
      // TODO
    });

    // The brand of the content associated with the event.
    // String contentBrand
    test('to test the property `contentBrand`', () async {
      // TODO
    });

    // A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    // BuiltList<ConversionEventsDataInnerCustomDataContentsInner> contents
    test('to test the property `contents`', () async {
      // TODO
    });

    // Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    // int numItems
    test('to test the property `numItems`', () async {
      // TODO
    });

    // The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
    // String orderId
    test('to test the property `orderId`', () async {
      // TODO
    });

    // The search string related to the user conversion event.
    // String searchString
    test('to test the property `searchString`', () async {
      // TODO
    });

    // Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
    // String optOutType
    test('to test the property `optOutType`', () async {
      // TODO
    });

    // Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
    // String np
    test('to test the property `np`', () async {
      // TODO
    });

  });
}
