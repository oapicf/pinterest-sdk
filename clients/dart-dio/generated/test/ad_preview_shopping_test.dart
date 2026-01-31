import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AdPreviewShopping
void main() {
  final instance = AdPreviewShoppingBuilder();
  // TODO add properties to the builder and call build()

  group(AdPreviewShopping, () {
    // Catalog Product Group Id.
    // String catalogProductGroupId
    test('to test the property `catalogProductGroupId`', () async {
      // TODO
    });

    // Ad format of the shopping ad preview.
    // String creativeType
    test('to test the property `creativeType`', () async {
      // TODO
    });

    // Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
    // CustomizableCTAType customizableCtaType
    test('to test the property `customizableCtaType`', () async {
      // TODO
    });

    // Title displayed below ad.
    // String heroImageTitle
    test('to test the property `heroImageTitle`', () async {
      // TODO
    });

    // Hero image URL.
    // String heroImageUrl
    test('to test the property `heroImageUrl`', () async {
      // TODO
    });

    // Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
    // String heroPinId
    test('to test the property `heroPinId`', () async {
      // TODO
    });

    // Multi image template tag.
    // String imageTag
    test('to test the property `imageTag`', () async {
      // TODO
    });

    // Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

    // Preferred media type.
    // String preferredMediaType
    test('to test the property `preferredMediaType`', () async {
      // TODO
    });

    // Multi video template tag, image_tag and video_tag are mutual exclusive.
    // String videoTag
    test('to test the property `videoTag`', () async {
      // TODO
    });

  });
}
