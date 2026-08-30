//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupsAnalyticsMetrics {
  /// Returns a new [AdGroupsAnalyticsMetrics] instance.
  AdGroupsAnalyticsMetrics({
    this.AD_GROUP_ID,
    this.DATE,
  });

  /// The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? AD_GROUP_ID;

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? DATE;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupsAnalyticsMetrics &&
    other.AD_GROUP_ID == AD_GROUP_ID &&
    other.DATE == DATE;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (AD_GROUP_ID == null ? 0 : AD_GROUP_ID!.hashCode) +
    (DATE == null ? 0 : DATE!.hashCode);

  @override
  String toString() => 'AdGroupsAnalyticsMetrics[AD_GROUP_ID=$AD_GROUP_ID, DATE=$DATE]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.AD_GROUP_ID != null) {
      json[r'AD_GROUP_ID'] = this.AD_GROUP_ID;
    } else {
      json[r'AD_GROUP_ID'] = null;
    }
    if (this.DATE != null) {
      json[r'DATE'] = _dateFormatter.format(this.DATE!.toUtc());
    } else {
      json[r'DATE'] = null;
    }
    return json;
  }

  /// Returns a new [AdGroupsAnalyticsMetrics] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupsAnalyticsMetrics? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdGroupsAnalyticsMetrics(
        AD_GROUP_ID: mapValueOfType<String>(json, r'AD_GROUP_ID'),
        DATE: mapDateTime(json, r'DATE', r''),
      );
    }
    return null;
  }

  static List<AdGroupsAnalyticsMetrics> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupsAnalyticsMetrics>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupsAnalyticsMetrics.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupsAnalyticsMetrics> mapFromJson(dynamic json) {
    final map = <String, AdGroupsAnalyticsMetrics>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupsAnalyticsMetrics.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupsAnalyticsMetrics-objects as value to a dart map
  static Map<String, List<AdGroupsAnalyticsMetrics>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupsAnalyticsMetrics>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupsAnalyticsMetrics.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

