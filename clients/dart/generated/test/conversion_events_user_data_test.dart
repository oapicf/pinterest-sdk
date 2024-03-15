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

// tests for ConversionEventsUserData
void main() {
  // final instance = ConversionEventsUserData();

  group('test ConversionEventsUserData', () {
    // Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    // List<String> ph (default value: const [])
    test('to test the property `ph`', () async {
      // TODO
    });

    // Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender.
    // List<String> ge (default value: const [])
    test('to test the property `ge`', () async {
      // TODO
    });

    // Sha256 hashes of user's date of birthday, given as year, month, and day.
    // List<String> db (default value: const [])
    test('to test the property `db`', () async {
      // TODO
    });

    // Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    // List<String> ln (default value: const [])
    test('to test the property `ln`', () async {
      // TODO
    });

    // Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    // List<String> fn (default value: const [])
    test('to test the property `fn`', () async {
      // TODO
    });

    // Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing).
    // List<String> ct (default value: const [])
    test('to test the property `ct`', () async {
      // TODO
    });

    // Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing).
    // List<String> st (default value: const [])
    test('to test the property `st`', () async {
      // TODO
    });

    // Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing).
    // List<String> zp (default value: const [])
    test('to test the property `zp`', () async {
      // TODO
    });

    // Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase.
    // List<String> country (default value: const [])
    test('to test the property `country`', () async {
      // TODO
    });

    // Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA.
    // List<String> externalId (default value: const [])
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


  });

}
