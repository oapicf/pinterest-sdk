import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CustomerListUpdateRequest
void main() {
  final instance = CustomerListUpdateRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CustomerListUpdateRequest, () {
    // Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
    // String records
    test('to test the property `records`', () async {
      // TODO
    });

    // UserListOperationType operationType
    test('to test the property `operationType`', () async {
      // TODO
    });

    // Exception exceptions
    test('to test the property `exceptions`', () async {
      // TODO
    });

  });
}
