import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AdGroupAudienceSizingRequest
void main() {
  final instance = AdGroupAudienceSizingRequestBuilder();
  // TODO add properties to the builder and call build()

  group(AdGroupAudienceSizingRequest, () {
    // Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    // bool autoTargetingEnabled (default value: true)
    test('to test the property `autoTargetingEnabled`', () async {
      // TODO
    });

    // <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
    // PlacementGroupType placementGroup (default value: 'ALL')
    test('to test the property `placementGroup`', () async {
      // TODO
    });

    // Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    // BuiltList<String> creativeTypes
    test('to test the property `creativeTypes`', () async {
      // TODO
    });

    // TargetingSpec targetingSpec
    test('to test the property `targetingSpec`', () async {
      // TODO
    });

    // Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
    // BuiltList<String> productGroupIds
    test('to test the property `productGroupIds`', () async {
      // TODO
    });

    // Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
    // BuiltList<AdGroupAudienceSizingRequestKeywordsInner> keywords
    test('to test the property `keywords`', () async {
      // TODO
    });

  });
}
