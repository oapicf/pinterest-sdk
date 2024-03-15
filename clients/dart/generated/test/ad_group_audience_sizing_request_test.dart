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

// tests for AdGroupAudienceSizingRequest
void main() {
  // final instance = AdGroupAudienceSizingRequest();

  group('test AdGroupAudienceSizingRequest', () {
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
    // List<String> creativeTypes (default value: const [])
    test('to test the property `creativeTypes`', () async {
      // TODO
    });

    // TargetingSpec targetingSpec
    test('to test the property `targetingSpec`', () async {
      // TODO
    });

    // Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
    // List<String> productGroupIds (default value: const [])
    test('to test the property `productGroupIds`', () async {
      // TODO
    });

    // Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
    // List<AdGroupAudienceSizingRequestKeywordsInner> keywords (default value: const [])
    test('to test the property `keywords`', () async {
      // TODO
    });


  });

}
