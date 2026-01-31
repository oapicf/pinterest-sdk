import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for LeadSubscription
void main() {
  final instance = LeadSubscriptionBuilder();
  // TODO add properties to the builder and call build()

  group(LeadSubscription, () {
    // The Ad Account ID that this lead form belongs to.
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // API version.
    // String apiVersion
    test('to test the property `apiVersion`', () async {
      // TODO
    });

    // Subscription creation time. Unix timestamp in milliseconds.
    // int createdTime
    test('to test the property `createdTime`', () async {
      // TODO
    });

    // Lead data encryption algorithm.
    // String cryptographicAlgorithm
    test('to test the property `cryptographicAlgorithm`', () async {
      // TODO
    });

    // Base64 encoded key for client to decrypt lead data.
    // String cryptographicKey
    test('to test the property `cryptographicKey`', () async {
      // TODO
    });

    // Subscription ID.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Lead form ID.
    // String leadFormId
    test('to test the property `leadFormId`', () async {
      // TODO
    });

    // User account used to subscribe lead data.
    // String userAccountId
    test('to test the property `userAccountId`', () async {
      // TODO
    });

    // Standard HTTPS webhook URL.
    // String webhookUrl
    test('to test the property `webhookUrl`', () async {
      // TODO
    });

  });
}
