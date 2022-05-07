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

// tests for ItemAttributes
void main() {
  final instance = ItemAttributes();

  group('test ItemAttributes', () {
    // Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
    // String adLink
    test('to test the property `adLink`', () async {
      // TODO
    });

    // The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://
    // List<String> additionalImageLink (default value: const [])
    test('to test the property `additionalImageLink`', () async {
      // TODO
    });

    // Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
    // bool adult
    test('to test the property `adult`', () async {
      // TODO
    });

    // The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.
    // String ageGroup
    test('to test the property `ageGroup`', () async {
      // TODO
    });

    // The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.
    // String availability
    test('to test the property `availability`', () async {
      // TODO
    });

    // Average reviews for the item. Can be a number from 1-5.
    // num averageReviewRating
    test('to test the property `averageReviewRating`', () async {
      // TODO
    });

    // The brand of the product.
    // String brand
    test('to test the property `brand`', () async {
      // TODO
    });

    // The primary color of the product.
    // String color
    test('to test the property `color`', () async {
      // TODO
    });

    // The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.
    // String condition
    test('to test the property `condition`', () async {
      // TODO
    });

    // Custom grouping of products.
    // String customLabel0
    test('to test the property `customLabel0`', () async {
      // TODO
    });

    // Custom grouping of products.
    // String customLabel1
    test('to test the property `customLabel1`', () async {
      // TODO
    });

    // Custom grouping of products.
    // String customLabel2
    test('to test the property `customLabel2`', () async {
      // TODO
    });

    // Custom grouping of products.
    // String customLabel3
    test('to test the property `customLabel3`', () async {
      // TODO
    });

    // Custom grouping of products.
    // String customLabel4
    test('to test the property `customLabel4`', () async {
      // TODO
    });

    // The description of the product.
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // The item is free to ship.
    // bool freeShippingLabel
    test('to test the property `freeShippingLabel`', () async {
      // TODO
    });

    // The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
    // String freeShippingLimit
    test('to test the property `freeShippingLimit`', () async {
      // TODO
    });

    // The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.
    // String gender
    test('to test the property `gender`', () async {
      // TODO
    });

    // The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
    // String googleProductCategory
    test('to test the property `googleProductCategory`', () async {
      // TODO
    });

    // The unique universal product identifier.
    // int gtin
    test('to test the property `gtin`', () async {
      // TODO
    });

    // The user-created unique ID that represents the product. Only Unicode characters are accepted.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://
    // List<String> imageLink (default value: const [])
    test('to test the property `imageLink`', () async {
      // TODO
    });

    // The parent ID of the product.
    // String itemGroupId
    test('to test the property `itemGroupId`', () async {
      // TODO
    });

    // The millisecond timestamp when the item was lastly modified by the merchant.
    // int lastUpdatedTime
    test('to test the property `lastUpdatedTime`', () async {
      // TODO
    });

    // The landing page for the product.
    // String link
    test('to test the property `link`', () async {
      // TODO
    });

    // The material used to make the product.
    // String material
    test('to test the property `material`', () async {
      // TODO
    });

    // The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
    // String minAdPrice
    test('to test the property `minAdPrice`', () async {
      // TODO
    });

    // The mobile-optimized version of your landing page. Must begin with http:// or https://.
    // String mobileLink
    test('to test the property `mobileLink`', () async {
      // TODO
    });

    // Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
    // String mpn
    test('to test the property `mpn`', () async {
      // TODO
    });

    // The number of ratings for the item.
    // int numberOfRatings
    test('to test the property `numberOfRatings`', () async {
      // TODO
    });

    // The number of reviews available for the item.
    // int numberOfReviews
    test('to test the property `numberOfReviews`', () async {
      // TODO
    });

    // The description of the pattern used for the product.
    // String pattern
    test('to test the property `pattern`', () async {
      // TODO
    });

    // The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
    // String price
    test('to test the property `price`', () async {
      // TODO
    });

    // The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.
    // String productType
    test('to test the property `productType`', () async {
      // TODO
    });

    // The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
    // String salePrice
    test('to test the property `salePrice`', () async {
      // TODO
    });

    // Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
    // String shipping
    test('to test the property `shipping`', () async {
      // TODO
    });

    // The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    // String shippingHeight
    test('to test the property `shippingHeight`', () async {
      // TODO
    });

    // The weight of the product. Ensure there is a space between the numeric string and the metric.
    // String shippingWeight
    test('to test the property `shippingWeight`', () async {
      // TODO
    });

    // The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
    // String shippingWidth
    test('to test the property `shippingWidth`', () async {
      // TODO
    });

    // The size of the product.
    // String size
    test('to test the property `size`', () async {
      // TODO
    });

    // Indicates the country’s sizing system in which you are submitting your product.
    // String sizeSystem
    test('to test the property `sizeSystem`', () async {
      // TODO
    });

    // Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
    // String sizeType
    test('to test the property `sizeType`', () async {
      // TODO
    });

    // Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
    // String tax
    test('to test the property `tax`', () async {
      // TODO
    });

    // The name of the product.
    // String title
    test('to test the property `title`', () async {
      // TODO
    });


  });

}
