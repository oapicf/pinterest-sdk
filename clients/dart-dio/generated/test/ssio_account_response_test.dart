import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for SSIOAccountResponse
void main() {
  final instance = SSIOAccountResponseBuilder();
  // TODO add properties to the builder and call build()

  group(SSIOAccountResponse, () {
    // Advertiser eligible to create order lines
    // bool eligible
    test('to test the property `eligible`', () async {
      // TODO
    });

    // Advertiser eligible to update order lines
    // bool canEdit
    test('to test the property `canEdit`', () async {
      // TODO
    });

    // An array of Salesforce account information that includes address, io terms, etc.
    // BuiltList<SSIOAccountItem> billtoInfos
    test('to test the property `billtoInfos`', () async {
      // TODO
    });

    // String currency
    test('to test the property `currency`', () async {
      // TODO
    });

    // BuiltList<SSIOAccountPMPName> pmpNames
    test('to test the property `pmpNames`', () async {
      // TODO
    });

    // Error indicator from Salesforce which could be \"No Error\"
    // String error
    test('to test the property `error`', () async {
      // TODO
    });

  });
}
