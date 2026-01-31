import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ProductGroupPromotion
void main() {
  final instance = ProductGroupPromotionBuilder();
  // TODO add properties to the builder and call build()

  group(ProductGroupPromotion, () {
    // ID of the ad group the product group belongs to.
    // String adGroupId
    test('to test the property `adGroupId`', () async {
      // TODO
    });

    // The bid in micro currency.
    // int bidInMicroCurrency
    test('to test the property `bidInMicroCurrency`', () async {
      // TODO
    });

    // ID of the catalogs product group that this product group promotion references
    // String catalogProductGroupId
    test('to test the property `catalogProductGroupId`', () async {
      // TODO
    });

    // Catalogs product group name
    // String catalogProductGroupName
    test('to test the property `catalogProductGroupName`', () async {
      // TODO
    });

    // Collections ad header type
    // String collectionsHeaderType
    test('to test the property `collectionsHeaderType`', () async {
      // TODO
    });

    // Collections Hero Destination Url
    // String collectionsHeroDestinationUrl
    test('to test the property `collectionsHeroDestinationUrl`', () async {
      // TODO
    });

    // Hero Pin ID if this PG is promoted as a Collection
    // String collectionsHeroPinId
    test('to test the property `collectionsHeroPinId`', () async {
      // TODO
    });

    // CreativeType creativeType
    test('to test the property `creativeType`', () async {
      // TODO
    });

    // Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
    // String customizableCtaType
    test('to test the property `customizableCtaType`', () async {
      // TODO
    });

    // The full product group definition path
    // String definition
    test('to test the property `definition`', () async {
      // TODO
    });

    // GridClickType gridClickType
    test('to test the property `gridClickType`', () async {
      // TODO
    });

    // ID of the product group promotion.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
    // bool included
    test('to test the property `included`', () async {
      // TODO
    });

    // Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
    // bool isGenerateBackground
    test('to test the property `isGenerateBackground`', () async {
      // TODO
    });

    // If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
    // bool isMdl
    test('to test the property `isMdl`', () async {
      // TODO
    });

    // The parent Product Group ID of this Product Group
    // String parentId
    test('to test the property `parentId`', () async {
      // TODO
    });

    // Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
    // String preferredMediaType
    test('to test the property `preferredMediaType`', () async {
      // TODO
    });

    // The definition of the product group, relative to its parent - an attribute name/value pair
    // String relativeDefinition
    test('to test the property `relativeDefinition`', () async {
      // TODO
    });

    // The ad image tag selected for the product group promotion.
    // String selectedImageTag
    test('to test the property `selectedImageTag`', () async {
      // TODO
    });

    // The ad video tag selected for the product group promotion.
    // String selectedVideoTag
    test('to test the property `selectedVideoTag`', () async {
      // TODO
    });

    // Slideshow Collections Description
    // String slideshowCollectionsDescription
    test('to test the property `slideshowCollectionsDescription`', () async {
      // TODO
    });

    // Slideshow Collections Title
    // String slideshowCollectionsTitle
    test('to test the property `slideshowCollectionsTitle`', () async {
      // TODO
    });

    // EntityStatus status
    test('to test the property `status`', () async {
      // TODO
    });

    // Tracking template for proudct group promotions. 4000 limit
    // String trackingUrl
    test('to test the property `trackingUrl`', () async {
      // TODO
    });

  });
}
