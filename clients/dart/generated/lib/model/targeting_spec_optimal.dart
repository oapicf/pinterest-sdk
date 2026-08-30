//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOptimal {
  /// Returns a new [TargetingSpecOptimal] instance.
  TargetingSpecOptimal({
    this.AGE_BUCKET = const [],
    this.APPTYPE = const [],
    this.AUDIENCE_EXCLUDE = const [],
    this.AUDIENCE_INCLUDE = const [],
    this.GENDER = const [],
    this.GEO = const [],
    this.GEO_EXCLUDE = const [],
    this.INTEREST = const [],
    this.LOCALE = const [],
    this.LOCATION = const [],
    this.LOCATION_EXCLUDE = const [],
    this.MAXIMUM_AGE,
    this.MINIMUM_AGE,
    this.SHOPPING_RETARGETING = const [],
    this.TARGETING_STRATEGY = const [],
  });

  /// **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
  List<TargetingSpecAgeBucket>? AGE_BUCKET;

  /// Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
  List<TargetingSpecAppType>? APPTYPE;

  /// Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
  List<String>? AUDIENCE_EXCLUDE;

  /// Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
  List<String>? AUDIENCE_INCLUDE;

  /// Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
  List<TargetingSpecGender>? GENDER;

  /// Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: `US-CA` is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: `94103` is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like `US-CA` or a more granular postal code within that regon, such as `94103`.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the `region_codes` key and a postal code value with the `postal_codes` key. Examples:  ``` \"geo\": {   \"region_codes\": [\"US-CA\"] } ```  ``` \"geo\": {   \"postal_codes\": [\"94103\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION`.  If you do not specifiy a `GEO` code, only `LOCATION` values will be targeted (See `LOCATION` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
  List<String>? GEO;

  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See `GEO` parameter in this targeting spec for rules, syntax, and other information.
  List<String> GEO_EXCLUDE;

  /// Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
  List<String> INTEREST;

  /// 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
  List<String>? LOCALE;

  /// Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the `country_codes` key and metro code values with `metro_codes` key. Example:  ``` \"location\": {   \"country_codes\": [\"US\", \"CA\"],   \"metro_codes\": [\"501\", \"602\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION` code.  If you do not specify a `LOCATION` code, only `GEO` values will be targeted (See `GEO` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
  List<String>? LOCATION;

  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See `LOCATION` parameter in this targeting spec for rules, syntax, and other information.
  List<String> LOCATION_EXCLUDE;

  /// Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? MAXIMUM_AGE;

  /// Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? MINIMUM_AGE;

  /// Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
  List<TargetingSpecShoppingRetargeting>? SHOPPING_RETARGETING;

  List<TargetingStrategy>? TARGETING_STRATEGY;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOptimal &&
    _deepEquality.equals(other.AGE_BUCKET, AGE_BUCKET) &&
    _deepEquality.equals(other.APPTYPE, APPTYPE) &&
    _deepEquality.equals(other.AUDIENCE_EXCLUDE, AUDIENCE_EXCLUDE) &&
    _deepEquality.equals(other.AUDIENCE_INCLUDE, AUDIENCE_INCLUDE) &&
    _deepEquality.equals(other.GENDER, GENDER) &&
    _deepEquality.equals(other.GEO, GEO) &&
    _deepEquality.equals(other.GEO_EXCLUDE, GEO_EXCLUDE) &&
    _deepEquality.equals(other.INTEREST, INTEREST) &&
    _deepEquality.equals(other.LOCALE, LOCALE) &&
    _deepEquality.equals(other.LOCATION, LOCATION) &&
    _deepEquality.equals(other.LOCATION_EXCLUDE, LOCATION_EXCLUDE) &&
    other.MAXIMUM_AGE == MAXIMUM_AGE &&
    other.MINIMUM_AGE == MINIMUM_AGE &&
    _deepEquality.equals(other.SHOPPING_RETARGETING, SHOPPING_RETARGETING) &&
    _deepEquality.equals(other.TARGETING_STRATEGY, TARGETING_STRATEGY);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (AGE_BUCKET == null ? 0 : AGE_BUCKET!.hashCode) +
    (APPTYPE == null ? 0 : APPTYPE!.hashCode) +
    (AUDIENCE_EXCLUDE == null ? 0 : AUDIENCE_EXCLUDE!.hashCode) +
    (AUDIENCE_INCLUDE == null ? 0 : AUDIENCE_INCLUDE!.hashCode) +
    (GENDER == null ? 0 : GENDER!.hashCode) +
    (GEO == null ? 0 : GEO!.hashCode) +
    (GEO_EXCLUDE.hashCode) +
    (INTEREST.hashCode) +
    (LOCALE == null ? 0 : LOCALE!.hashCode) +
    (LOCATION == null ? 0 : LOCATION!.hashCode) +
    (LOCATION_EXCLUDE.hashCode) +
    (MAXIMUM_AGE == null ? 0 : MAXIMUM_AGE!.hashCode) +
    (MINIMUM_AGE == null ? 0 : MINIMUM_AGE!.hashCode) +
    (SHOPPING_RETARGETING == null ? 0 : SHOPPING_RETARGETING!.hashCode) +
    (TARGETING_STRATEGY == null ? 0 : TARGETING_STRATEGY!.hashCode);

  @override
  String toString() => 'TargetingSpecOptimal[AGE_BUCKET=$AGE_BUCKET, APPTYPE=$APPTYPE, AUDIENCE_EXCLUDE=$AUDIENCE_EXCLUDE, AUDIENCE_INCLUDE=$AUDIENCE_INCLUDE, GENDER=$GENDER, GEO=$GEO, GEO_EXCLUDE=$GEO_EXCLUDE, INTEREST=$INTEREST, LOCALE=$LOCALE, LOCATION=$LOCATION, LOCATION_EXCLUDE=$LOCATION_EXCLUDE, MAXIMUM_AGE=$MAXIMUM_AGE, MINIMUM_AGE=$MINIMUM_AGE, SHOPPING_RETARGETING=$SHOPPING_RETARGETING, TARGETING_STRATEGY=$TARGETING_STRATEGY]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.AGE_BUCKET != null) {
      json[r'AGE_BUCKET'] = this.AGE_BUCKET;
    } else {
      json[r'AGE_BUCKET'] = null;
    }
    if (this.APPTYPE != null) {
      json[r'APPTYPE'] = this.APPTYPE;
    } else {
      json[r'APPTYPE'] = null;
    }
    if (this.AUDIENCE_EXCLUDE != null) {
      json[r'AUDIENCE_EXCLUDE'] = this.AUDIENCE_EXCLUDE;
    } else {
      json[r'AUDIENCE_EXCLUDE'] = null;
    }
    if (this.AUDIENCE_INCLUDE != null) {
      json[r'AUDIENCE_INCLUDE'] = this.AUDIENCE_INCLUDE;
    } else {
      json[r'AUDIENCE_INCLUDE'] = null;
    }
    if (this.GENDER != null) {
      json[r'GENDER'] = this.GENDER;
    } else {
      json[r'GENDER'] = null;
    }
    if (this.GEO != null) {
      json[r'GEO'] = this.GEO;
    } else {
      json[r'GEO'] = null;
    }
      json[r'GEO_EXCLUDE'] = this.GEO_EXCLUDE;
      json[r'INTEREST'] = this.INTEREST;
    if (this.LOCALE != null) {
      json[r'LOCALE'] = this.LOCALE;
    } else {
      json[r'LOCALE'] = null;
    }
    if (this.LOCATION != null) {
      json[r'LOCATION'] = this.LOCATION;
    } else {
      json[r'LOCATION'] = null;
    }
      json[r'LOCATION_EXCLUDE'] = this.LOCATION_EXCLUDE;
    if (this.MAXIMUM_AGE != null) {
      json[r'MAXIMUM_AGE'] = this.MAXIMUM_AGE;
    } else {
      json[r'MAXIMUM_AGE'] = null;
    }
    if (this.MINIMUM_AGE != null) {
      json[r'MINIMUM_AGE'] = this.MINIMUM_AGE;
    } else {
      json[r'MINIMUM_AGE'] = null;
    }
    if (this.SHOPPING_RETARGETING != null) {
      json[r'SHOPPING_RETARGETING'] = this.SHOPPING_RETARGETING;
    } else {
      json[r'SHOPPING_RETARGETING'] = null;
    }
    if (this.TARGETING_STRATEGY != null) {
      json[r'TARGETING_STRATEGY'] = this.TARGETING_STRATEGY;
    } else {
      json[r'TARGETING_STRATEGY'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingSpecOptimal] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOptimal? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return TargetingSpecOptimal(
        AGE_BUCKET: TargetingSpecAgeBucket.listFromJson(json[r'AGE_BUCKET']),
        APPTYPE: TargetingSpecAppType.listFromJson(json[r'APPTYPE']),
        AUDIENCE_EXCLUDE: json[r'AUDIENCE_EXCLUDE'] is Iterable
            ? (json[r'AUDIENCE_EXCLUDE'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        AUDIENCE_INCLUDE: json[r'AUDIENCE_INCLUDE'] is Iterable
            ? (json[r'AUDIENCE_INCLUDE'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        GENDER: TargetingSpecGender.listFromJson(json[r'GENDER']),
        GEO: json[r'GEO'] is Iterable
            ? (json[r'GEO'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        GEO_EXCLUDE: json[r'GEO_EXCLUDE'] is Iterable
            ? (json[r'GEO_EXCLUDE'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        INTEREST: json[r'INTEREST'] is Iterable
            ? (json[r'INTEREST'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        LOCALE: json[r'LOCALE'] is Iterable
            ? (json[r'LOCALE'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        LOCATION: json[r'LOCATION'] is Iterable
            ? (json[r'LOCATION'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        LOCATION_EXCLUDE: json[r'LOCATION_EXCLUDE'] is Iterable
            ? (json[r'LOCATION_EXCLUDE'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        MAXIMUM_AGE: mapValueOfType<String>(json, r'MAXIMUM_AGE'),
        MINIMUM_AGE: mapValueOfType<String>(json, r'MINIMUM_AGE'),
        SHOPPING_RETARGETING: TargetingSpecShoppingRetargeting.listFromJson(json[r'SHOPPING_RETARGETING']),
        TARGETING_STRATEGY: TargetingStrategy.listFromJson(json[r'TARGETING_STRATEGY']),
      );
    }
    return null;
  }

  static List<TargetingSpecOptimal> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOptimal>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOptimal.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOptimal> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOptimal>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOptimal.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOptimal-objects as value to a dart map
  static Map<String, List<TargetingSpecOptimal>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOptimal>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOptimal.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

