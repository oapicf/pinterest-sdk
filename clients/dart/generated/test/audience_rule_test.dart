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

// tests for AudienceRule
void main() {
  // final instance = AudienceRule();

  group('test AudienceRule', () {
    // Valid countries include: \"US\", \"CA\", and \"GB\".
    // String country
    test('to test the property `country`', () async {
      // TODO
    });

    // Customer list ID. For CUSTOMER_LIST `audience_type`.
    // String customerListId
    test('to test the property `customerListId`', () async {
      // TODO
    });

    // The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
    // List<String> engagementDomain (default value: const [])
    test('to test the property `engagementDomain`', () async {
      // TODO
    });

    // Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set. 
    // String engagementType
    test('to test the property `engagementType`', () async {
      // TODO
    });

    // A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
    // String event
    test('to test the property `event`', () async {
      // TODO
    });

    // PinterestTagEventData eventData
    test('to test the property `eventData`', () async {
      // TODO
    });

    // Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
    // int percentage
    test('to test the property `percentage`', () async {
      // TODO
    });

    // IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
    // List<String> pinId (default value: const [])
    test('to test the property `pinId`', () async {
      // TODO
    });

    // Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
    // bool prefill
    test('to test the property `prefill`', () async {
      // TODO
    });

    // Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
    // int retentionDays
    test('to test the property `retentionDays`', () async {
      // TODO
    });

    // Audience ID(s). For ACTALIKE `audience_type`. 
    // List<String> seedId (default value: const [])
    test('to test the property `seedId`', () async {
      // TODO
    });

    // Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
    // List<String> url (default value: const [])
    test('to test the property `url`', () async {
      // TODO
    });

    // The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
    // String visitorSourceId
    test('to test the property `visitorSourceId`', () async {
      // TODO
    });

    // Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
    // Object eventSource
    test('to test the property `eventSource`', () async {
      // TODO
    });

    // Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
    // Object ingestionSource
    test('to test the property `ingestionSource`', () async {
      // TODO
    });

    // Optional for ENGAGEMENT. Engager type value should be 1-2.
    // int engagerType
    test('to test the property `engagerType`', () async {
      // TODO
    });

    // Campaign ID for engagement audience filter.
    // List<String> campaignId (default value: const [])
    test('to test the property `campaignId`', () async {
      // TODO
    });

    // Ad ID for engagement audience filter.
    // List<String> adId (default value: const [])
    test('to test the property `adId`', () async {
      // TODO
    });

    // Objective for engagement audience filter.
    // List<ObjectiveType> objectiveType (default value: const [])
    test('to test the property `objectiveType`', () async {
      // TODO
    });

    // Ad account ID.
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });


  });

}
