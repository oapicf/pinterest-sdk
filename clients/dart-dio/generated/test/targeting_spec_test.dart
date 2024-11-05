import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TargetingSpec
void main() {
  final instance = TargetingSpecBuilder();
  // TODO add properties to the builder and call build()

  group(TargetingSpec, () {
    // Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
    // BuiltList<String> AGE_BUCKET
    test('to test the property `AGE_BUCKET`', () async {
      // TODO
    });

    // Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
    // BuiltList<String> APPTYPE
    test('to test the property `APPTYPE`', () async {
      // TODO
    });

    // Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
    // BuiltList<String> AUDIENCE_EXCLUDE
    test('to test the property `AUDIENCE_EXCLUDE`', () async {
      // TODO
    });

    // Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
    // BuiltList<String> AUDIENCE_INCLUDE
    test('to test the property `AUDIENCE_INCLUDE`', () async {
      // TODO
    });

    // Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
    // BuiltList<String> GENDER
    test('to test the property `GENDER`', () async {
      // TODO
    });

    // Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
    // BuiltList<String> GEO
    test('to test the property `GEO`', () async {
      // TODO
    });

    // Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
    // BuiltList<String> INTEREST
    test('to test the property `INTEREST`', () async {
      // TODO
    });

    // 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.
    // BuiltList<String> LOCALE
    test('to test the property `LOCALE`', () async {
      // TODO
    });

    // 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
    // BuiltList<String> LOCATION
    test('to test the property `LOCATION`', () async {
      // TODO
    });

    // Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
    // BuiltList<TargetingSpecSHOPPINGRETARGETING> SHOPPING_RETARGETING
    test('to test the property `SHOPPING_RETARGETING`', () async {
      // TODO
    });

    // 
    // BuiltList<String> TARGETING_STRATEGY
    test('to test the property `TARGETING_STRATEGY`', () async {
      // TODO
    });

  });
}
