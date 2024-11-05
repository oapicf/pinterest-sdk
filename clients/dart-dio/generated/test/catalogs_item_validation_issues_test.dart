import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsItemValidationIssues
void main() {
  final instance = CatalogsItemValidationIssuesBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsItemValidationIssues, () {
    // Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
    // int itemNumber
    test('to test the property `itemNumber`', () async {
      // TODO
    });

    // The merchant-created unique ID that represents the product.
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

    // CatalogsItemValidationErrors errors
    test('to test the property `errors`', () async {
      // TODO
    });

    // CatalogsItemValidationWarnings warnings
    test('to test the property `warnings`', () async {
      // TODO
    });

  });
}
