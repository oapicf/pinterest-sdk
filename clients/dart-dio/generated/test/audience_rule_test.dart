import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AudienceRule
void main() {
  final instance = AudienceRuleBuilder();
  // TODO add properties to the builder and call build()

  group(AudienceRule, () {
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
    // BuiltList<String> engagementDomain
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
    // BuiltList<String> pinId
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
    // BuiltList<String> seedId
    test('to test the property `seedId`', () async {
      // TODO
    });

    // Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains].<br>Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\"<br>Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
    // BuiltList<String> url
    test('to test the property `url`', () async {
      // TODO
    });

    // The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
    // String visitorSourceId
    test('to test the property `visitorSourceId`', () async {
      // TODO
    });

    // Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
    // JsonObject eventSource
    test('to test the property `eventSource`', () async {
      // TODO
    });

    // Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
    // JsonObject ingestionSource
    test('to test the property `ingestionSource`', () async {
      // TODO
    });

    // Optional for ENGAGEMENT. Engager type value should be 1-2.
    // int engagerType
    test('to test the property `engagerType`', () async {
      // TODO
    });

    // Campaign ID for engagement audience filter.
    // BuiltList<String> campaignId
    test('to test the property `campaignId`', () async {
      // TODO
    });

    // Ad ID for engagement audience filter.
    // BuiltList<String> adId
    test('to test the property `adId`', () async {
      // TODO
    });

    // Objective for engagement audience filter.
    // BuiltList<ObjectiveType> objectiveType
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
