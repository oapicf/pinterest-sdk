import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ConversionEventsUserDataAnyOf
void main() {
  final instance = ConversionEventsUserDataAnyOfBuilder();
  // TODO add properties to the builder and call build()

  group(ConversionEventsUserDataAnyOf, () {
    // Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    // BuiltList<String> em
    test('to test the property `em`', () async {
      // TODO
    });

    // Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    // BuiltList<String> hashedMaids
    test('to test the property `hashedMaids`', () async {
      // TODO
    });

    // The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    // String clientIpAddress
    test('to test the property `clientIpAddress`', () async {
      // TODO
    });

    // The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    // String clientUserAgent
    test('to test the property `clientUserAgent`', () async {
      // TODO
    });

  });
}
