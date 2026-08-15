//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdPinAnalytics {
  /// Returns a new [AdPinAnalytics] instance.
  AdPinAnalytics({
    this.DATE,
    required this.PIN_ID,
  });

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? DATE;

  /// The ID of the pin that the metric belongs to.
  String PIN_ID;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdPinAnalytics &&
    other.DATE == DATE &&
    other.PIN_ID == PIN_ID;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (DATE == null ? 0 : DATE!.hashCode) +
    (PIN_ID.hashCode);

  @override
  String toString() => 'AdPinAnalytics[DATE=$DATE, PIN_ID=$PIN_ID]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.DATE != null) {
      json[r'DATE'] = _dateFormatter.format(this.DATE!.toUtc());
    } else {
      json[r'DATE'] = null;
    }
      json[r'PIN_ID'] = this.PIN_ID;
    return json;
  }

  /// Returns a new [AdPinAnalytics] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdPinAnalytics? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdPinAnalytics[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdPinAnalytics[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdPinAnalytics(
        DATE: mapDateTime(json, r'DATE', r''),
        PIN_ID: mapValueOfType<String>(json, r'PIN_ID')!,
      );
    }
    return null;
  }

  static List<AdPinAnalytics> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPinAnalytics>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPinAnalytics.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdPinAnalytics> mapFromJson(dynamic json) {
    final map = <String, AdPinAnalytics>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdPinAnalytics.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdPinAnalytics-objects as value to a dart map
  static Map<String, List<AdPinAnalytics>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdPinAnalytics>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdPinAnalytics.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'PIN_ID',
  };
}

