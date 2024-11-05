import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TargetingTemplateGetResponseData
void main() {
  final instance = TargetingTemplateGetResponseDataBuilder();
  // TODO add properties to the builder and call build()

  group(TargetingTemplateGetResponseData, () {
    // targeting template name
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    // bool autoTargetingEnabled (default value: true)
    test('to test the property `autoTargetingEnabled`', () async {
      // TODO
    });

    // TargetingSpec targetingAttributes
    test('to test the property `targetingAttributes`', () async {
      // TODO
    });

    // PlacementGroupType placementGroup
    test('to test the property `placementGroup`', () async {
      // TODO
    });

    // BuiltList<TargetingTemplateKeyword> keywords
    test('to test the property `keywords`', () async {
      // TODO
    });

    // TrackingUrls trackingUrls
    test('to test the property `trackingUrls`', () async {
      // TODO
    });

    // Targeting template ID.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Targeting template created time. Unix timestamp in seconds.
    // int createdTime
    test('to test the property `createdTime`', () async {
      // TODO
    });

    // Targeting template updated time.Unix timestamp in seconds.
    // int updatedTime
    test('to test the property `updatedTime`', () async {
      // TODO
    });

    // The ID of the advertiser that this targeting template belongs to.
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // Indicate targeting template is active or Deleted
    // String status (default value: 'ACTIVE')
    test('to test the property `status`', () async {
      // TODO
    });

    // TargetingTemplateAudienceSizing sizing
    test('to test the property `sizing`', () async {
      // TODO
    });

    // Inform if the targeting template is valid (ex. would be false if has revoked audience)
    // bool valid
    test('to test the property `valid`', () async {
      // TODO
    });

  });
}
