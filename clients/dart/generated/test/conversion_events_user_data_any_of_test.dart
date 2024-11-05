//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for ConversionEventsUserDataAnyOf
void main() {
  // final instance = ConversionEventsUserDataAnyOf();

  group('test ConversionEventsUserDataAnyOf', () {
    // Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    // List<String> em (default value: const [])
    test('to test the property `em`', () async {
      // TODO
    });

    // Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    // List<String> hashedMaids (default value: const [])
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
