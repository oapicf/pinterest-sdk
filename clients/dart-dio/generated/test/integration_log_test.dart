import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for IntegrationLog
void main() {
  final instance = IntegrationLogBuilder();
  // TODO add properties to the builder and call build()

  group(IntegrationLog, () {
    // Timestamp in milliseconds of when the log was executed at the client.
    // int clientTimestamp
    test('to test the property `clientTimestamp`', () async {
      // TODO
    });

    // Log event type
    // String eventType
    test('to test the property `eventType`', () async {
      // TODO
    });

    // Log level type
    // String logLevel
    test('to test the property `logLevel`', () async {
      // TODO
    });

    // String externalBusinessId
    test('to test the property `externalBusinessId`', () async {
      // TODO
    });

    // String advertiserId
    test('to test the property `advertiserId`', () async {
      // TODO
    });

    // String merchantId
    test('to test the property `merchantId`', () async {
      // TODO
    });

    // String tagId
    test('to test the property `tagId`', () async {
      // TODO
    });

    // String feedProfileId
    test('to test the property `feedProfileId`', () async {
      // TODO
    });

    // Explanation of the event that occured.
    // String message
    test('to test the property `message`', () async {
      // TODO
    });

    // Version number of the integration application.
    // String appVersionNumber
    test('to test the property `appVersionNumber`', () async {
      // TODO
    });

    // Version number of the platform the integration application is running on.
    // String platformVersionNumber
    test('to test the property `platformVersionNumber`', () async {
      // TODO
    });

    // IntegrationLogClientError error
    test('to test the property `error`', () async {
      // TODO
    });

    // IntegrationLogClientRequest request
    test('to test the property `request`', () async {
      // TODO
    });

  });
}
