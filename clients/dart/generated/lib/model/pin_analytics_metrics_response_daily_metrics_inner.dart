//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinAnalyticsMetricsResponseDailyMetricsInner {
  /// Returns a new [PinAnalyticsMetricsResponseDailyMetricsInner] instance.
  PinAnalyticsMetricsResponseDailyMetricsInner({
    this.dataStatus,
    this.date,
    this.metrics = const {},
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DataStatus? dataStatus;

  /// Metrics date (UTC): YYYY-MM-DD.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? date;

  /// The metric name and daily value for each requested metric
  Map<String, num> metrics;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinAnalyticsMetricsResponseDailyMetricsInner &&
    other.dataStatus == dataStatus &&
    other.date == date &&
    _deepEquality.equals(other.metrics, metrics);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dataStatus == null ? 0 : dataStatus!.hashCode) +
    (date == null ? 0 : date!.hashCode) +
    (metrics.hashCode);

  @override
  String toString() => 'PinAnalyticsMetricsResponseDailyMetricsInner[dataStatus=$dataStatus, date=$date, metrics=$metrics]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dataStatus != null) {
      json[r'data_status'] = this.dataStatus;
    } else {
      json[r'data_status'] = null;
    }
    if (this.date != null) {
      json[r'date'] = this.date;
    } else {
      json[r'date'] = null;
    }
      json[r'metrics'] = this.metrics;
    return json;
  }

  /// Returns a new [PinAnalyticsMetricsResponseDailyMetricsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinAnalyticsMetricsResponseDailyMetricsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinAnalyticsMetricsResponseDailyMetricsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinAnalyticsMetricsResponseDailyMetricsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinAnalyticsMetricsResponseDailyMetricsInner(
        dataStatus: DataStatus.fromJson(json[r'data_status']),
        date: mapValueOfType<String>(json, r'date'),
        metrics: mapCastOfType<String, num>(json, r'metrics') ?? const {},
      );
    }
    return null;
  }

  static List<PinAnalyticsMetricsResponseDailyMetricsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinAnalyticsMetricsResponseDailyMetricsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinAnalyticsMetricsResponseDailyMetricsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinAnalyticsMetricsResponseDailyMetricsInner> mapFromJson(dynamic json) {
    final map = <String, PinAnalyticsMetricsResponseDailyMetricsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinAnalyticsMetricsResponseDailyMetricsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinAnalyticsMetricsResponseDailyMetricsInner-objects as value to a dart map
  static Map<String, List<PinAnalyticsMetricsResponseDailyMetricsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinAnalyticsMetricsResponseDailyMetricsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinAnalyticsMetricsResponseDailyMetricsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

