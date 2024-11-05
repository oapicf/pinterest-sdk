import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ConversionEventsUserData
void main() {
  final instance = ConversionEventsUserDataBuilder();
  // TODO add properties to the builder and call build()

  group(ConversionEventsUserData, () {
    // Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    // BuiltList<String> ph
    test('to test the property `ph`', () async {
      // TODO
    });

    // Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
    // BuiltList<String> ge
    test('to test the property `ge`', () async {
      // TODO
    });

    // Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
    // BuiltList<String> db
    test('to test the property `db`', () async {
      // TODO
    });

    // Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    // BuiltList<String> ln
    test('to test the property `ln`', () async {
      // TODO
    });

    // Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    // BuiltList<String> fn
    test('to test the property `fn`', () async {
      // TODO
    });

    // Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
    // BuiltList<String> ct
    test('to test the property `ct`', () async {
      // TODO
    });

    // Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
    // BuiltList<String> st
    test('to test the property `st`', () async {
      // TODO
    });

    // Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
    // BuiltList<String> zp
    test('to test the property `zp`', () async {
      // TODO
    });

    // Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
    // BuiltList<String> country
    test('to test the property `country`', () async {
      // TODO
    });

    // Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    // BuiltList<String> externalId
    test('to test the property `externalId`', () async {
      // TODO
    });

    // The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    // String clickId
    test('to test the property `clickId`', () async {
      // TODO
    });

    // A unique identifier of visitors' information defined by third party partners. e.g RampID
    // String partnerId
    test('to test the property `partnerId`', () async {
      // TODO
    });

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
