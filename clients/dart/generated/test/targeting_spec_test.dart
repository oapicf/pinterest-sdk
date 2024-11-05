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

// tests for TargetingSpec
void main() {
  // final instance = TargetingSpec();

  group('test TargetingSpec', () {
    // Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
    // List<String> AGE_BUCKET (default value: const [])
    test('to test the property `AGE_BUCKET`', () async {
      // TODO
    });

    // Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
    // List<String> APPTYPE (default value: const [])
    test('to test the property `APPTYPE`', () async {
      // TODO
    });

    // Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
    // List<String> AUDIENCE_EXCLUDE (default value: const [])
    test('to test the property `AUDIENCE_EXCLUDE`', () async {
      // TODO
    });

    // Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
    // List<String> AUDIENCE_INCLUDE (default value: const [])
    test('to test the property `AUDIENCE_INCLUDE`', () async {
      // TODO
    });

    // Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
    // List<String> GENDER (default value: const [])
    test('to test the property `GENDER`', () async {
      // TODO
    });

    // Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
    // List<String> GEO (default value: const [])
    test('to test the property `GEO`', () async {
      // TODO
    });

    // Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
    // List<String> INTEREST (default value: const [])
    test('to test the property `INTEREST`', () async {
      // TODO
    });

    // 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.
    // List<String> LOCALE (default value: const [])
    test('to test the property `LOCALE`', () async {
      // TODO
    });

    // 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
    // List<String> LOCATION (default value: const [])
    test('to test the property `LOCATION`', () async {
      // TODO
    });

    // Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
    // List<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING (default value: const [])
    test('to test the property `SHOPPING_RETARGETING`', () async {
      // TODO
    });

    // 
    // List<String> TARGETING_STRATEGY (default value: const [])
    test('to test the property `TARGETING_STRATEGY`', () async {
      // TODO
    });


  });

}
