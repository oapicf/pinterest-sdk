import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ItemAttributes
void main() {
  final instance = ItemAttributesBuilder();
  // TODO add properties to the builder and call build()

  group(ItemAttributes, () {
    // Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
    // String adLink
    test('to test the property `adLink`', () async {
      // TODO
    });

    // Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
    // bool adult
    test('to test the property `adult`', () async {
      // TODO
    });

    // The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
    // String ageGroup
    test('to test the property `ageGroup`', () async {
      // TODO
    });

    // The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.
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

    // This attribute is not supported anymore.
    // bool checkoutEnabled
    test('to test the property `checkoutEnabled`', () async {
      // TODO
    });

    // The primary color of the product.
    // String color
    test('to test the property `color`', () async {
      // TODO
    });

    // The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
    // String condition
    test('to test the property `condition`', () async {
      // TODO
    });

    // <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    // String customLabel0
    test('to test the property `customLabel0`', () async {
      // TODO
    });

    // <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    // String customLabel1
    test('to test the property `customLabel1`', () async {
      // TODO
    });

    // <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    // String customLabel2
    test('to test the property `customLabel2`', () async {
      // TODO
    });

    // <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    // String customLabel3
    test('to test the property `customLabel3`', () async {
      // TODO
    });

    // <p><= 1000 characters</p> <p>Custom grouping of products.</p>
    // String customLabel4
    test('to test the property `customLabel4`', () async {
      // TODO
    });

    // <p><= 10000 characters</p> <p>The description of the product.</p>
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

    // The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.
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

    // <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // <p><= 127 characters</p> <p>The parent ID of the product.</p>
    // String itemGroupId
    test('to test the property `itemGroupId`', () async {
      // TODO
    });

    // The millisecond timestamp when the item was lastly modified by the merchant.
    // int lastUpdatedTime
    test('to test the property `lastUpdatedTime`', () async {
      // TODO
    });

    // <p><= 511 characters</p> <p>The landing page for the product.</p>
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

    // <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
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

    // Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.
    // String sizeSystem
    test('to test the property `sizeSystem`', () async {
      // TODO
    });

    // Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.
    // String sizeType
    test('to test the property `sizeType`', () async {
      // TODO
    });

    // Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
    // String tax
    test('to test the property `tax`', () async {
      // TODO
    });

    // <p><= 500 characters</p> <p>The name of the product.</p>
    // String title
    test('to test the property `title`', () async {
      // TODO
    });

    // Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
    // BuiltList<String> variantNames
    test('to test the property `variantNames`', () async {
      // TODO
    });

    // Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
    // BuiltList<String> variantValues
    test('to test the property `variantValues`', () async {
      // TODO
    });

    // <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
    // BuiltList<String> additionalImageLink
    test('to test the property `additionalImageLink`', () async {
      // TODO
    });

    // <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
    // BuiltList<String> imageLink
    test('to test the property `imageLink`', () async {
      // TODO
    });

    // <p><= 2,000 characters</p> <p>Hosted link to the product video.</p> <p>File types for linked videos must be .mp4, .mov or .m4v.</p> <p>File size cannot exceed 2GB.</p>
    // String videoLink
    test('to test the property `videoLink`', () async {
      // TODO
    });

  });
}
