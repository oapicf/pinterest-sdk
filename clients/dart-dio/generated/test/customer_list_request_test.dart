import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CustomerListRequest
void main() {
  final instance = CustomerListRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CustomerListRequest, () {
    // Customer list name.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
    // String records
    test('to test the property `records`', () async {
      // TODO
    });

    // UserListType listType (default value: 'EMAIL')
    test('to test the property `listType`', () async {
      // TODO
    });

    // Customer list errors.
    // JsonObject exceptions
    test('to test the property `exceptions`', () async {
      // TODO
    });

  });
}
