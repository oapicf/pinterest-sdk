import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Audience
void main() {
  final instance = AudienceBuilder();
  // TODO add properties to the builder and call build()

  group(Audience, () {
    // Ad account ID.
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // Audience ID.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Audience name.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
    // String audienceType
    test('to test the property `audienceType`', () async {
      // TODO
    });

    // Audience description.
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // AudienceRule rule
    test('to test the property `rule`', () async {
      // TODO
    });

    // Audience size.
    // int size
    test('to test the property `size`', () async {
      // TODO
    });

    // Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // Always \"audience\".
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // Creation time. Unix timestamp in seconds.
    // int createdTimestamp
    test('to test the property `createdTimestamp`', () async {
      // TODO
    });

    // Last update time. Unix timestamp in seconds.
    // int updatedTimestamp
    test('to test the property `updatedTimestamp`', () async {
      // TODO
    });

  });
}
