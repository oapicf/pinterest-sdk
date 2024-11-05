import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Keyword
void main() {
  final instance = KeywordBuilder();
  // TODO add properties to the builder and call build()

  group(Keyword, () {
    // </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
    // int bid
    test('to test the property `bid`', () async {
      // TODO
    });

    // MatchTypeResponse matchType
    test('to test the property `matchType`', () async {
      // TODO
    });

    // Keyword value (120 chars max).
    // String value
    test('to test the property `value`', () async {
      // TODO
    });

    // bool archived
    test('to test the property `archived`', () async {
      // TODO
    });

    // Keyword ID .
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Keyword parent entity ID (advertiser, campaign, ad group).
    // String parentId
    test('to test the property `parentId`', () async {
      // TODO
    });

    // Parent entity type
    // String parentType
    test('to test the property `parentType`', () async {
      // TODO
    });

    // Always keyword
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

  });
}
