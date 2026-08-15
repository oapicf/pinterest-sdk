//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdsAnalyticsResponseInner {
  /// Returns a new [AdsAnalyticsResponseInner] instance.
  AdsAnalyticsResponseInner({
    required this.AD_ID,
    this.DATE,
  });

  /// The ID of the ad that this metrics belongs to.
  String AD_ID;

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? DATE;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsAnalyticsResponseInner &&
    other.AD_ID == AD_ID &&
    other.DATE == DATE;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (AD_ID.hashCode) +
    (DATE == null ? 0 : DATE!.hashCode);

  @override
  String toString() => 'AdsAnalyticsResponseInner[AD_ID=$AD_ID, DATE=$DATE]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'AD_ID'] = this.AD_ID;
    if (this.DATE != null) {
      json[r'DATE'] = _dateFormatter.format(this.DATE!.toUtc());
    } else {
      json[r'DATE'] = null;
    }
    return json;
  }

  /// Returns a new [AdsAnalyticsResponseInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdsAnalyticsResponseInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdsAnalyticsResponseInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdsAnalyticsResponseInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdsAnalyticsResponseInner(
        AD_ID: mapValueOfType<String>(json, r'AD_ID')!,
        DATE: mapDateTime(json, r'DATE', r''),
      );
    }
    return null;
  }

  static List<AdsAnalyticsResponseInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsResponseInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsResponseInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdsAnalyticsResponseInner> mapFromJson(dynamic json) {
    final map = <String, AdsAnalyticsResponseInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdsAnalyticsResponseInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdsAnalyticsResponseInner-objects as value to a dart map
  static Map<String, List<AdsAnalyticsResponseInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdsAnalyticsResponseInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdsAnalyticsResponseInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'AD_ID',
  };
}

